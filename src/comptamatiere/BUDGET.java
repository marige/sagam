/***********************************************************************
 * Module:  BUDGET.java
 * Author:  OBAM
 * Purpose: Defines the Class BUDGET
 ***********************************************************************/
package comptamatiere;

import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BUDGET extends ModelDb{
   public int IDBUDGET;
   public String LIBBUDGET=null;
   public String SIGLE=null;
   
   public BUDGET(int id,String lib,String sigle){
    this.IDBUDGET=id;
    this.LIBBUDGET=lib;
    this.SIGLE=sigle;
   }

    public BUDGET() {
       
    } 
    public BUDGET getObjetBudget(String idBudg) throws SQLException{
    ResultSet rs=getResultSet("SELECT IDBUDGET,LIBBUDGET, SIGLE from BUDGET WHERE IDBUDGET="+idBudg);
    rs.next();
    this.IDBUDGET= rs.getInt("IDBUDGET");
    this.LIBBUDGET=rs.getString("LIBBUDGET");
    this.SIGLE=rs.getString("SIGLE");
    rs.close();
    return new BUDGET(this.IDBUDGET,this.LIBBUDGET,this.SIGLE);
    
   }
    
   public String getLibBudgetFromID(int idBudget) throws SQLException{
       return getOneResult("select libbudget from budget where idbudget="+idBudget);
   }
   
 
  
}