/***********************************************************************
 * Module:  BUREAU.java
 * Author:  OBAM
 * Purpose: Defines the Class BUREAU
 ***********************************************************************/
package comptamatiere;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BUREAU extends SERVICE {
   public int idBUREAU;
   public String LIBBUR;
   public int INTERPHONE;
   public int idSERVICE; 
   public String CODEBUR ;
  
   
   public BATIMENT Batiment= new BATIMENT();
 

    private BUREAU(int idBUREAU, String LIBBUR, int INTERPHONE, int idSERVICE) {
        //throw new UnsupportedOperationException("Not yet implemented");
        this.idBUREAU=idBUREAU;
        this.INTERPHONE=INTERPHONE;
        this.LIBBUR=LIBBUR;
        this.idSERVICE=idSERVICE;
        this.CODEBUR=CODEBUR;
    }

    public BUREAU() {
//        throw new UnsupportedOperationException("Not yet implemented");
    }

 public BUREAU getElementObjet(String idbu) throws SQLException{
       ResultSet rs=getResultSet("SELECT * from BUREAU WHERE IDBUREAU="+idbu);
       rs.next();
       this.idBUREAU= rs.getInt("idBUREAU");
       this.LIBBUR=rs.getString("LIBBUR");
       this.INTERPHONE=rs.getInt("INTERPHONE");
       this.idSERVICE=rs.getInt("IdSERVICE");
       this.CODEBUR=rs.getString("CODEBUR");
       ///this.Batiment.idBATIMENT=rs.getInt("idBATIMENT");
      
       rs.close();
     
     return new BUREAU( this.idBUREAU,this.LIBBUR,this.INTERPHONE,this.idSERVICE);
       
   
   }
   
  

}