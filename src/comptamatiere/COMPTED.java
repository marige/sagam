/***********************************************************************
 * Module:  COMPTED.java
 * Author:  OBAM
 * Purpose: Defines the Class COMPTED
 ***********************************************************************/
package comptamatiere;
import java.sql.SQLException;

public class COMPTED extends COMPTEP {
    
   public int idCOMPTED;
   public String LIBCOMPTED;
  
   
   public COMPTED(){
       super();
   }
   public void setidCompteD(int id){
       this.idCOMPTED=id;
   }
   
   public int getIdCompteD(){
       return this.idCOMPTED;
   }
   
   public void setLibcompteD(String libcompte){
       this.LIBCOMPTED=libcompte;      
   }
   public String getLibcompteD(){
       return this.LIBCOMPTED;
   }
   
   public String getIdPFromD(String idD) throws SQLException{
       return getOneResult("select idcomptep from compted where idcompted="+idD);
   }
   
   public String getLibDFromIdD(int idD) throws SQLException{
       return getOneResult("select libcompteD from compted where idcompted="+idD);
   }
   
    public String getIdDFromC(int idC) throws SQLException{
       return getOneResult("select idcompted from categorie where idcategorie="+idC);
   }
   
  
   

}