/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comptamatiere;

import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author OBAM
 */
public class UTILISATEUR extends ModelDb {
      public int idUtilisateur;
      public String libbureau; 
      public String sexe,contact,fonction,utilisateur;
      public String datenais;
      public int idBureau;
    
      public UTILISATEUR(){};
      
      public UTILISATEUR(int id, String libbur, String sexe,String contact,String fonction,String utilisateur,int idbureau){
          this.contact=contact;
          this.fonction=fonction;
          this.idBureau=idbureau;
          this.idUtilisateur=id;
          this.libbureau=libbur;
          this.sexe=sexe;
          this.utilisateur=utilisateur;
      }
    
      public UTILISATEUR getObjetUtilisateurFromId(String idUtili) throws SQLException{
          ResultSet rs=getResultSet("SELECT * from utilisateur where idutilisateur="+idUtili);
          rs.next();
          this.idUtilisateur=rs.getInt("idutilisateur");
          this.libbureau=getOneResult("select libbur from bureau where idbureau="+rs.getInt("idbureau"));      
          this.contact=rs.getString("contact");
          this.idBureau=rs.getInt("idbureau");
          this.fonction=rs.getString("fonction");
          this.sexe=rs.getString("sexe");
          this.utilisateur=rs.getString("utilisateur");
          rs.close();
          return new UTILISATEUR(idUtilisateur,libbureau, sexe,contact,fonction,utilisateur, idBureau);

   }
    
}
