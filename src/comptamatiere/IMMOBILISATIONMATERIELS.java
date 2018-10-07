
package comptamatiere;
import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author ADEBO
 */
public class IMMOBILISATIONMATERIELS extends ModelDb{
  public String id;
  public String article;
  public String utilisateur;
  public String codemate;
  public String etat;
  public String bureau;
  public Date dms;
  public Date dateaqi;
  public String pu;
  public String budget;
  public String idService;
  public String idArticle;
  public String observation;
   
   public IMMOBILISATIONMATERIELS(){};
   public IMMOBILISATIONMATERIELS(String id,String idArticle,String article,String utilisateur,String codemate,String etat,String idService,String bureau,Date dms,Date dateaqi,String pu,String budget){
       this.id=id; this.article=article;this.utilisateur=utilisateur;this.codemate=codemate;this.etat=etat;this.idService=idService;
       this.bureau=bureau;this.dms=dms;this.dateaqi=dateaqi;
       this.pu=pu;this.budget=budget;this.idArticle=idArticle;
   }
   
  // public IMMOBILISATIONMATERIELS getObjetImmo()
   public String getCodeImmo(String numMax,String codei,String codebureau,String budget) throws SQLException{
      String codification,anneeService,service;
      service=this.getOneResult("select CODESERVICE from service where idservice=(select idservice from bureau where idbureau="+codebureau+")");
      String structure=this.getOneResult("select sigle from institution").toUpperCase();
      //a revoir pour programmation automatique date acquisition//anneeService =this.getOneResult("select annee from exercice").substring(0, 4);      
      anneeService="2017";//temporaire
      codification=codei.toUpperCase()+"/"+anneeService+"/"+formatageNum(numMax)+"/"+structure+"/"+service.toUpperCase()+"/"+budget.toUpperCase();
      return codification;
   }
   public IMMOBILISATIONMATERIELS getObjetImmo(String idimo) throws SQLException{
        String sql="select idIMMOBILISATIONMATERIEL,immobilisationmateriel.idarticle,immobilisationmateriel.observation,LIBARTICLE,utilisateur,CODEMATERIEL,libetat,libbur,idservice,DMS,DATACQ,immobilisationmateriel.puacq,budget from etat,immobilisationmateriel,article,categorie,bureau,utilisateur "
            + "where BUREAU.idbureau=IMMOBILISATIONMATERIEL.idbureau AND immobilisationmateriel.idarticle=article.idarticle and article.idcategorie=categorie.idcategorie and immobilisationmateriel.etat=etat.idetat"
            + " and immobilisationmateriel.idutilisateur=utilisateur.idutilisateur and immobilisationmateriel.idIMMOBILISATIONMATERIEL="+idimo;
      ResultSet rs= this.getResultSet(sql);
      rs.next();
          this.id=rs.getString("idIMMOBILISATIONMATERIEL");
          this.article=rs.getString("libarticle");
          this.budget=rs.getString("budget");
          this.utilisateur=rs.getString("utilisateur");
          this.codemate=rs.getString("codemateriel");
          this.etat=rs.getString("libetat");          
          this.bureau=rs.getString("libbur");
          this.dms=rs.getDate("dms");
          this.dateaqi=rs.getDate("datacq");
          this.pu=rs.getString("puacq");
          this.idService=rs.getString("idservice");
          this.idArticle=rs.getString("idarticle");
          this.observation=rs.getString("observation");
          rs.close();
       return new IMMOBILISATIONMATERIELS(id,idArticle,article, utilisateur, codemate, etat,idService, bureau, dms, dateaqi, pu, budget);      
   }
   
   String formatageNum(String num){
       String nbformat=null;
       if(num.length()==1)
           nbformat="000"+num;
       else if(num.length()==2)
           nbformat="00"+num;
       else if(num.length()==3)
           nbformat="0"+num;
       else if(num.length()==4)
           nbformat=num;
       return nbformat;    
   }
   
   public String getMaxNumSuivant(String idcat) throws SQLException{
         ResultSet rs=this.getResultSet("select max(numero) from IMMOBILISATIONMATERIEL where IDCATEGORIE="+idcat);
         int num=0;
         rs.next();
         //quand la cat n'est pas encore enregistre
         if(!rs.wasNull()){
             num=rs.getInt(1);
             rs.close();
            }
         num++ ;
         rs.close();
         return String.valueOf(num);
   }
   
   public String getDateAqui(String idDetailSortie,String idarticle,String type) throws SQLException{
      String date=null;
       if(type.equalsIgnoreCase("stkini"))
         date=this.getOneResult("select datestockini from article where idarticle="+idarticle); 
      /* if(type.equalsIgnoreCase("inv"))
         date=this.getOneResult("select dateinvent from inventaire where idarticle="+idarticle); */
       else
       date=this.getOneResult("select datebord from entree where IDBON=(select idbon from detailbon where iddetailbon=(select iddetailbon from detailsortie where iddetailsortie="+idDetailSortie+"))");            
       return date;
   }     
      
   
 //  public getObject
   
    
}

