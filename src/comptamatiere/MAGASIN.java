/***********************************************************************
 * Module:  MAGASIN.java
 * Author:  OBAM
 * Purpose: Defines the Class MAGASIN
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.util.*;

public class MAGASIN extends ModelDb  {
   public int IDMAGASIN;
   public String LIBMAGASIN;
   public String MAGASINIER;
   public String CONTACT;
   
   
  public void setIDMAGASIN( int idmag){
    this.IDMAGASIN=idmag;
  }
  public int getIDMAGASIN(){
      return this.IDMAGASIN;
  
  
  }
}
