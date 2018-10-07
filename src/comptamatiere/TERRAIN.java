package comptamatiere;

import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TERRAIN extends ModelDb{
   public long idTERRAIN;
   public String LOCALISATION;
   public String SUPERFICIE;
   public String TITREFONCIER;
   public String REFERENCEACTE;
   public String OBSERVATION;
   
   public TERRAIN(){}
   
   public TERRAIN(String superficie,String localisation,String refActe,String titrefoncier,String observation){
       this.SUPERFICIE=superficie;
       this.LOCALISATION=localisation;
       this.REFERENCEACTE=refActe;
       this.OBSERVATION=observation;
       this.TITREFONCIER=titrefoncier;
   }
   public TERRAIN getObjetTerrain(String idTerrain) throws SQLException{
       ResultSet rs=this.getResultSet("select * from terrain where idterrain="+idTerrain);
       rs.next();
       this.TITREFONCIER=rs.getString("titrefoncier");
       this.REFERENCEACTE=rs.getString("referenceacte");
       this.LOCALISATION=rs.getString("localisation");
       this.OBSERVATION=rs.getString("observation");
       this.SUPERFICIE=rs.getString("superficie");
       rs.close();
       return new TERRAIN(SUPERFICIE,LOCALISATION,REFERENCEACTE,TITREFONCIER,OBSERVATION);
   }
}