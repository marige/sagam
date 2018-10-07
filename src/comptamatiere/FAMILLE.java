package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;

/***********************************************************************
 * Module:  FAMILLE.java
 * Author:  OBAM
 * Purpose: Defines the Class FAMILLE
 ***********************************************************************/

public class FAMILLE extends GROUPESTOCK{
   public int idFAMILLE;
   public String LIBFAMILLE;
   public COMPTEP p= new COMPTEP();

   
   public FAMILLE(int id, String libfam){
       this.idFAMILLE=id;
       this.LIBFAMILLE=libfam;
       
   }

    public FAMILLE() {
        
    }
   
   public FAMILLE getObjectFamille(String idfam) throws SQLException{
    ResultSet rs=getResultSet("SELECT idFAMILLE,idcomptep,IDGROUPESTOCK,LIBFAMILLE from FAMILLE WHERE idFAMILLE="+idfam);
    rs.next();
    this.idFAMILLE= rs.getInt("idFAMILLE");
    this.LIBFAMILLE=rs.getString("LIBFAMILLE");
    this.IDGROUPESTOCK=rs.getInt("IDGROUPESTOCK");
    this.LIBGROUPESTOCK=this.getLibGroupFromIdGroup(this.IDGROUPESTOCK);
    this.p.idCOMPTEP=rs.getInt("idcomptep");
    this.p.LIBCOMPTE=p.getLibPFromID(p.idCOMPTEP);
    rs.close();  
    return this;
   }
   
   public String getLibFamilleFromIDf(int idfam) throws SQLException{
       return getOneResult("select libfamille from famille where idfamille="+idfam);
   }
   
 
}