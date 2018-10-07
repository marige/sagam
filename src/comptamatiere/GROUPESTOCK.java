/***********************************************************************
 * Module:  GROUPESTOCK.java
 * Author:  OBAM
 * Purpose: Defines the Class GROUPESTOCK
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.sql.SQLException;
import java.util.*;

public class GROUPESTOCK extends ModelDb{
   public int IDGROUPESTOCK;
   public String LIBGROUPESTOCK;
   
   public void setIDGROUPESTOCK(int id){
    this.IDGROUPESTOCK=id;
   }
   
   public int getIDGROUPESTOCK(){
       return this.IDGROUPESTOCK;
   }
   
   public String getLibGroupFromIdGroup(int idgrps) throws SQLException{
     return  getOneResult("select libgroupestock from groupestock where idgroupestock="+idgrps);
   }
   
 
 

}