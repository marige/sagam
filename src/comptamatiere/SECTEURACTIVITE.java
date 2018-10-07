/***********************************************************************
 * Module:  SECTEURACTIVITE.java
 * Author:  OBAM
 * Purpose: Defines the Class SECTEURACTIVITE
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;
import java.util.*;

public class SECTEURACTIVITE extends ModelDb{
   public int IDSECTEUR;
   public String LIBSECTEUR;
   
  public int getIDSECTEUR(){
      return this.IDSECTEUR ;
  }
  public String getLIBSECTEUR(){
      return this.LIBSECTEUR;
  
  }
  public void setIDSECTEUR( int id){
      this.IDSECTEUR=id;
  
  }
  public void setLIBSECTEUR( String lib){
  this.LIBSECTEUR=lib;
  }
}