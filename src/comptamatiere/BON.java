/***********************************************************************
 * Module:  BON.java
 * Author:  OBAM
 * Purpose: Defines the Class BON
 ***********************************************************************/
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BON extends BUDGET{
   public int IDBON;
   public String TYPEBON;
   public String NBON;
   public Date DATEBON;
   public String NUMPROFORMA;
   public String CHAPITRE;
   public String ATITRE;
   public String OBJET;
   public String MOTIF;
   public double MONTANT;
   public FOURNISSEUR f= new FOURNISSEUR();
   REPORT r = new REPORT();
   
   public BON(int id,String type,String nbon,Date datebon,String numproforma,String chapitre,String atitre,String objet,String motif,double montant){
       this.IDBON=id;this.TYPEBON=type;this.NBON=nbon;this.DATEBON=datebon;this.NUMPROFORMA=numproforma;this.CHAPITRE=chapitre;this.ATITRE=atitre;this.OBJET=objet;
       this.MOTIF=motif;this.MONTANT=montant;

   }

    public BON() {         
    }
   public BON getObjectBonFromId(String idBon) throws SQLException{
     ResultSet rs=getResultSet("SELECT IDBON, IDBUDGET, idFOURNISSEUR, TYPEBON, NBON, DATEBON, NUMPROFORMA, CHAPITRE, ATITRE, OBJET, MOTIF, MONTANT FROM BON where idbon="+idBon);
        rs.next();
        f.idFOURNISSEUR=rs.getInt("idfournisseur");
        f.RAISONSOCIAL=getOneResult("select raisonsocial from fournisseur where idfournisseur="+f.idFOURNISSEUR);      
        this.IDBUDGET=rs.getInt("idbudget");
        this.LIBBUDGET=getLibBudgetFromID(this.IDBUDGET);
        this.IDBON=rs.getInt("idBon");
        this.TYPEBON=rs.getString("typebon");
        this.NBON=rs.getString("nbon");
        this.DATEBON=rs.getDate("datebon");
        this.NUMPROFORMA=rs.getString("numproforma");
        this.CHAPITRE=rs.getString("chapitre");
        this.ATITRE=rs.getString("atitre");
        this.OBJET=rs.getString("objet");
        this.MOTIF=rs.getString("motif");
        this.MONTANT=rs.getDouble("montant");     
        rs.close();
        return new BON();
     
   }
     public double calcMontant(String qte,String pu){
        Double result=0.00;
        if(!(qte.equals("") && pu.equals(""))){
            result=  Double.parseDouble(pu)*Double.parseDouble(qte);
        }
        return result;
    }
     
     public void printReportBon(String idBon,String idfournisseur) throws Exception{       
        String req="select * from bon,detailbon,article,categorie where bon.idbon=detailbon.idbon and detailbon.idarticle=article.idarticle and categorie.idcategorie= article.idcategorie and bon.idbon="+idBon;
        r.editionReport("Bonentree",req,r.getBonHashMap(idBon,idfournisseur));                                   
     }
     
     public boolean bonExist(String numbon) throws SQLException{
        return this.getOneResult("select count(*) from bon where nbon='"+numbon+"'").equalsIgnoreCase("0")?false:true;
     }
     
}