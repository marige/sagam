/***********************************************************************
 * Module:  COMPTEP.java
 * Author:  OBAM
 * Purpose: Defines the Class COMPTEP
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.sql.SQLException;

public class COMPTEP extends ModelDb{
   public int idCOMPTEP;
   public String LIBCOMPTE;
  public void setLibCompteP(String p){
      this.LIBCOMPTE=p;
  }
  
  public void setIdCOmpteP(int id){
      this.idCOMPTEP=id;
  }
  
  public String getLibCompteP(){
      return this.LIBCOMPTE;
  }
  
  public int getIdCompteP(){
      return this.idCOMPTEP;
  }
 
   
  public String getLibPFromID(int idCOMPTEP) throws SQLException{
   return getOneResult("select libcomptep from comptep where idcomptep="+idCOMPTEP);     
  }
}