package comptamatiere;

import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class INVENTAIRE  extends ModelDb{
   public int idINVENTAIRE;
   public String DATEINVENT;
   public String UTILISATEUR;
   public String OBSERVATION;
   public java.util.Date DATECREATION;
   public boolean VALIDE;
   
   public INVENTAIRE(int idInventaire,String dateInvent,String observation,String utilisateur){
       this.UTILISATEUR=utilisateur;
       this.DATEINVENT=dateInvent;
       this.OBSERVATION=observation;  
       this.idINVENTAIRE=idInventaire;
   }

    public INVENTAIRE() {
        
    }
   
   public void rensDetailInventaire() throws SQLException{
       String lastnum=this.getOneResult("select max(idinventaire) from inventaire");
       ResultSet rs=this.getResultSet("select idarticle,libarticle,stockactu,pum from article");
       while(rs.next()){
            String valeur[]={rs.getString("idarticle"),rs.getString("stockactu"),rs.getString("pum"),lastnum};  
            this.Insertion("detailinventaire(idarticle,qtetheorique,pum,idinventaire)",valeur);
       }
       rs.close();
   }
   
   public int modification(int idInventaire,String dateInvent,String observation,String utilisateur) throws SQLException{
          String champ[]={"dateinvent","utilisateur","observation"};
          String valeur[]={dateInvent,utilisateur,observation};
          return this.updateTable("inventaire", champ, valeur,"where idinventaire="+idInventaire);
   }
   
   public INVENTAIRE getObjetInventaire(int idInventaire) throws SQLException{
       ResultSet rs=this.getResultSet("select * from inventaire where idinventaire="+idInventaire);
       rs.next();
       this.DATEINVENT=rs.getString("dateinvent");
       this.OBSERVATION=rs.getString("observation");
       this.UTILISATEUR=rs.getString("utilisateur");
       rs.close();
       return new INVENTAIRE(idInventaire,DATEINVENT,OBSERVATION,UTILISATEUR);      
   }
   
   public Boolean isInventaireNonValide() throws SQLException{
      String nbnonvalid=this.getOneResult("select count(*) from inventaire where valide=0");
       return nbnonvalid.equalsIgnoreCase("0")?false:true;
     //  return nbnonvalid=="0"?false:true;
      
   }
   
  
   

}