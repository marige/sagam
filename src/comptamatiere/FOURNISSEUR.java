/***********************************************************************
 * Module:  FOURNISSEUR.java
 * Author:  OBAM
 * Purpose: Defines the Class FOURNISSEUR
 ***********************************************************************/
package comptamatiere;
import bdd.ModelDb;

public class FOURNISSEUR  extends ModelDb {
   public int idFOURNISSEUR;
   public String TYPEFOURNISSEUR;
   public String IFU;
   public String RAISONSOCIAL;
   public String NOMREPRESENTANT;
   public String ADRESSE;
   public String TELEPHONE;
   public String FAX;
   public String EMAIL;
   public String VILLE;
   public String PAYS;
   public int SECTEURACTIVITE;
   public String ACTIVITES;
   
    public void setidFOURNISSEUR(int id){
    this.idFOURNISSEUR=id;
   }
     public int getidFOURNISSEUR(){
    return this.idFOURNISSEUR;
   }
    public void setTYPEFOURNISSEUR(String typ){
    this.TYPEFOURNISSEUR=typ;
   }
    public String getTYPEFOURNISSEUR(){
    return this.TYPEFOURNISSEUR;
   }
    public void setIFU( String ifu){
        this.IFU= ifu;
    }
    public String getIFU( ){
        return this.IFU;
    }
    
    public void setRAISONSOCIAL(String rais){
    this.RAISONSOCIAL=rais;
   }
    public String getRAISONSOCIAL(){
    return this.RAISONSOCIAL;
   }
    public void setNOMREPRESENTANT( String nomrepr){
        this.NOMREPRESENTANT= nomrepr;
    }
     public String getNOMREPRESENTANT(){
        return this.NOMREPRESENTANT;
    }
    public void setADRESSE(String adress){
    this.ADRESSE=adress;
   }
    public String getADRESSE(){
    return this.ADRESSE;
   }
    public void setTELEPHONE( String tel){
        this.TELEPHONE= tel;
    }
    public String getTELEPHONE(){
        return this.TELEPHONE;
    }
    
    public void setFAX(String fax){
    this.FAX=fax;
   }
    public String getFAX(){
    return this.FAX;
   }
    public void  setEMAIL(String email){
        this.EMAIL=email;
    }
    public String getEMAIL(){
       return this.EMAIL;
    }
     public void setVILLE( String vil){
        this.VILLE= vil;
    }
     public String getVILLE(){
        return this.VILLE;
    }
    
    public void setPAYS(String pays){
    this.PAYS=pays;
   }
     public String getPAYS(){
    return this.PAYS;
   }
    public void setSECTEURACTIVITE(int secteact){
        this.SECTEURACTIVITE= secteact;
    }
    public int getSECTEURACTIVITE(){
        return this.SECTEURACTIVITE;
    }
    public void setACTIVITES( String act){
        this.ACTIVITES=act;
    }
    public String getACTIVITES(){
       return this.ACTIVITES;
    }
}