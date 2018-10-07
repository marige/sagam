/***********************************************************************
 * Module:  BATIMENT.java
 * Author:  OBAM
 * Purpose: Defines the Class BATIMENT
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class BATIMENT extends ModelDb {
   public int idBATIMENT; 
   public String LIBBATIMENT;
   public String LOCALISATION;
   public String REFERENCEACTE;
   public String OBSERVATION;
   
   public BATIMENT(){}
   public BATIMENT(String libBat,String localisation,String refActe,String observation){
       this.LIBBATIMENT=libBat;
       this.LOCALISATION=localisation;
       this.REFERENCEACTE=refActe;
       this.OBSERVATION=observation;
   }
   public BATIMENT getObjetBatiment(String idBatiment) throws SQLException{
       ResultSet rs=this.getResultSet("select * from batiment where idbatiment="+idBatiment);
       rs.next();
       this.LIBBATIMENT=rs.getString("libbatiment");
       this.REFERENCEACTE=rs.getString("referenceacte");
       this.LOCALISATION=rs.getString("localisation");
       this.OBSERVATION=rs.getString("observation");
       rs.close();
       return new BATIMENT(LIBBATIMENT,LOCALISATION,REFERENCEACTE,OBSERVATION);
   }
 

}