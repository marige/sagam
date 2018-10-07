package comptamatiere;
import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ENTREE extends ModelDb{
   public long idENTREE;
   public String REFFACTURE;
   public java.util.Date DATEFACTURE;
   public String REFBORDEREAU;
   public java.util.Date DATEBORD;
   public boolean VALIDE;
   
   public ENTREE getObjetEntree(String idBon) throws SQLException{
      ResultSet rs= getResultSet("select idENTREE,IDBON, REFFACTURE, DATEFACTURE, REFBORDEREAU, DATEBORD from entree where idbon="+idBon);
      rs.next();
      this.idENTREE=rs.getInt("identree");
      this.DATEBORD=rs.getDate("datebord");
      this.REFBORDEREAU=rs.getString("REFBORDEREAU");
      this.REFFACTURE=rs.getString("reffacture");
      this.DATEFACTURE=rs.getDate("datefacture");
      rs.close();
      return new ENTREE();
   }
   

}