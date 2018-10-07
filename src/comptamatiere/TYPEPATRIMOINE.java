/***********************************************************************
 * Module:  TYPEPATRIMOINE.java
 * Author:  OBAM
 * Purpose: Defines the Class TYPEPATRIMOINE
 ***********************************************************************/
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TYPEPATRIMOINE extends FAMILLE{
   public long idTYPEPATRIMOINE;
   public String LIBTYPEPATRIMOINE;
   public String TYPEETAT;
   
   public TYPEPATRIMOINE getObjectTypePatrimoine(String idtype) throws SQLException{
       ResultSet rs=getResultSet("select idTYPEPATRIMOINE, idFAMILLE, LIBTYPEPATRIMOINE, TYPEETAT from typepatrimoine where idtypepatrimoine="+idtype);
       rs.next();
       this.idTYPEPATRIMOINE=rs.getInt("idTYPEPATRIMOINE");
       this.idFAMILLE=rs.getInt("idfamille");
       this.LIBFAMILLE=this.getLibFamilleFromIDf(this.idFAMILLE);
       this.LIBTYPEPATRIMOINE=rs.getString("LIBTYPEPATRIMOINE");
       this.TYPEETAT=rs.getString("typeetat");
      
       rs.close();
       
       
       return this;
   }
   
   
   
   

   
  

}