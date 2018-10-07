/***********************************************************************
 * Module:  REPARATION.java
 * Author:  OBAM
 * Purpose: Defines the Class REPARATION
 ***********************************************************************/
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class REPARATION extends PRESTATAIRE{
   public int idREPARATION;
   public String LIBREPARATION;
   public Double MONTANT;
   public java.util.Date DATEREPARATION;
   public String IDPRESTATAIRE;
   public String IDIMMOBLISATIIONMATERIEL;
   
  // DETAILSORTIE d= new DETAILSORTIE();
   
   public  REPARATION(int idreparation,String idPrestat,String idimmo,String librepa,Double montant,Date daterepa){
       this.idREPARATION=idreparation;
       this.LIBREPARATION=librepa;
       this.MONTANT=montant;
       this.DATEREPARATION=daterepa; 
       this.IDIMMOBLISATIIONMATERIEL=idimmo;    
       this.IDPRESTATAIRE=idPrestat;
   }
   
   public REPARATION(){
   }
   
    public REPARATION getObjetREPARATION(String idreparation) throws SQLException{
        ResultSet rs=getResultSet("SELECT idREPARATION,idimmobilisationmateriel, idPRESTATAIRE, LIBREPARATION, MONTANT, DATEREPARATION FROM REPARATION WHERE idREPARATION="+idreparation);
        rs.next();
        this.idREPARATION= rs.getInt("idREPARATION");
        this.LIBREPARATION=rs.getString("LIBREPARATION");
        this.MONTANT=rs.getDouble("MONTANT");
        this.DATEREPARATION=rs.getDate("DATEREPARATION");
        this.IDPRESTATAIRE=rs.getString("idPRESTATAIRE");  
        this.IDIMMOBLISATIIONMATERIEL=rs.getString("idimmobilisationmateriel");
        rs.close();
        return new REPARATION(this.idREPARATION,this.IDPRESTATAIRE,this.IDIMMOBLISATIIONMATERIEL,this.LIBREPARATION,this.MONTANT, this.DATEREPARATION);
   }
   
 

}