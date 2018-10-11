
package comptamatiere;
import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SORTIE extends ModelDb {
   public int idSORTIE;
   public String NUMPJ;
   public java.util.Date DATESORTIE;
   public String ATITRE;
   public String OBJET;
   public String MOTIF;
   public boolean VALIDE;
   public  SERVICE s= new SERVICE();
   public String libbureau;
   public String chapitre;
   public BUREAU bureau= new BUREAU();
   public BUDGET b = new BUDGET();
   public int IdMax;
   
   public int DernierBon() throws SQLException{
       ResultSet rs=getResultSet("select max(idSORTIE) as max from sortie");
       rs.next();
       this.IdMax= rs.getInt("max");

       rs.close();
     
     return this.IdMax ;
       
   
   }
   public void afficheDetailNonValider(JTable Jt, int Id) throws SQLException{
        ResultSet req=getResultSet("SELECT article.idarticle, article.LIBARTICLE, DETAILSORTIE.QTE_SORTIE FROM DETAILSORTIE,article WHERE idSORTIE =" + Id + " AND DETAILSORTIE.idARTICLE = article.idARTICLE  ");
        DefaultTableModel model=(DefaultTableModel) Jt.getModel();
        while  (req.next()) {
           Object[] Obj = {req.getString("idarticle"),req.getString("ligne"),req.getString("LIBARTICLE"),req.getString("QTE_SORTIE"),req.getDouble("PU_SORTIE"),req.getInt("QTE_SORTIE")*req.getDouble("PU_SORTIE"),req.getString("type")};
           model.addRow(Obj);
           Jt.setModel(model); 
          }    
   }  
 /* public void MiseAjour(int qte, int id ) throws SQLException{
      ResultSet req=getResultSet("update detailbon set QTESTOCK=2 where idDETAILBON=4");
  
  }*/
  REPORT etat= new REPORT();
  public void printReport(String idSortie) throws SQLException, Exception{
       HashMap hm= new HashMap();
        String req="select * from sortie,detailsortie, article,categorie,bureau "+
            "where sortie.idsortie=detailsortie.idsortie and sortie.idbureau=bureau.idbureau "+
            " and article.idarticle=detailsortie.idarticle and "+
            "article.idcategorie=categorie.idcategorie and sortie.idSORTIE="+idSortie;
            hm=etat.getHashMap("institution");
            //complement de parametre de num ordre du journal
         //   if(validation(idSortie)){
                ResultSet rs=getResultSet("select idoperation from livrejournal where idbonsortie="+idSortie);
                if(rs.next()){
                hm.put("idoperation", rs.getString("idoperation"));    
                }
                rs.close();
         //   }
            etat.editionReport("ordS",req,hm);
   }
  /*
   public boolean validation(String bon) throws SQLException{
         boolean f=false;
         ResultSet rs=this.getResultSet("select count(*) from livrejournal where idbonsortie="+bon);
         rs.next();
         if (rs.getString(1).equals("0"))
             {
                 f=false;
             }
         else{ 
             f=true;
         }
         rs.close();
         return f;
     }
  */
  public SORTIE getObjetSortieFromIdS(String idsortie) throws SQLException{
  ResultSet rs=getResultSet("SELECT idsortie, idbureau,datesortie from sortie where idsortie="+idsortie);
        rs.next();
        bureau.idBUREAU=rs.getInt("idbureau");    
        this.idSORTIE=rs.getInt("idsortie");   
        this.DATESORTIE=rs.getDate("datesortie");
        this.s.idSERVICE=Integer.parseInt(this.getOneResult("select idservice from bureau where idbureau="+bureau.idBUREAU));
        rs.close();
        return new SORTIE();
  }
        
}