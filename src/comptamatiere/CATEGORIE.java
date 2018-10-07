/***********************************************************************
 * Module:  CATEGORIE.java
 * Author:  OBAM
 * Purpose: Defines the Class CATEGORIE
 ***********************************************************************/
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CATEGORIE extends COMPTED {
   public int IDCATEGORIE;
   public String LIBCATEGORIE;
   public int DUREEVIE;
   public String codeIcat;
   public int idCOMPTED;
   public int idFamille;
   public String codeicat;
   public String numeroCompte;

    private CATEGORIE(int IDCATEGORIE, String LIBCATEGORIE, int DUREEVIE, String numeroCompte, int idCOMPTED, int idFamille) {
       }

    public CATEGORIE() {
     }

   
   public String getIdDFromC(int idC) throws SQLException{
       return getOneResult("select idcompted from categorie where idcategorie="+idC);
   }
   public String getLibcategorieFromIdC(int idc) throws SQLException{
    return getOneResult("select libcategorie from categorie where idcategorie="+idc);
   }
    public CATEGORIE getObjetCATEGORIE(String idcategorie) throws SQLException{
        ResultSet rs=getResultSet("SELECT IDCATEGORIE,LIBCATEGORIE, DUREEVIE,numeroCompte,idCOMPTED,idFamille,codeicat FROM CATEGORIE WHERE IDCATEGORIE="+idcategorie);
        rs.next();
        this.IDCATEGORIE= rs.getInt("IDCATEGORIE");
        this.LIBCATEGORIE=rs.getString("LIBCATEGORIE");
        this.DUREEVIE=rs.getInt("DUREEVIE");
        this.numeroCompte=rs.getString("numeroCompte");
        this.idCOMPTED=rs.getInt("idCOMPTED");  
        this.idFamille=rs.getInt("idFamille");
        this.codeicat=rs.getString("codeicat");
        
        rs.close();
        return new CATEGORIE(this.IDCATEGORIE,this.LIBCATEGORIE,this.DUREEVIE,this.numeroCompte,this.idCOMPTED, this.idFamille);
   }
   
 

}