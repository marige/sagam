/***********************************************************************
 * Module:  PRESTATAIRE.java
 * Author:  OBAM
 * Purpose: Defines the Class PRESTATAIRE
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.sql.SQLException;

public class PRESTATAIRE extends ModelDb{
   public int idPRESTATAIRE;
   public String LIBPRESTATAIRE;
   
   public String getLibPrestataireFromIdP(int idprestataire) throws SQLException{
    return getOneResult("select libprestataire from prestataire where idprestataire="+idprestataire);
   }
  

}