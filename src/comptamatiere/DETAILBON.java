
package comptamatiere;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DETAILBON extends BON{
   public long idDETAILBON;
   public int PU;
   public int QTE;
   public BON bON;
   public MAGASIN mAGASIN;
   ARTICLE a= new ARTICLE();
   
   
   public void afficherDetailBon(JTable jt,int idBon) throws SQLException{
       ResultSet rs=getResultSet("select iddetailbon,detailbon.idarticle,libarticle,detailbon.qte,detailbon.idmagasin from detailbon,article where detailbon.idarticle=article.idarticle and idbon="+idBon);
       DefaultTableModel model=(DefaultTableModel) jt.getModel();
       model.setRowCount(0);
       while(rs.next()){
         model.addRow(new Object[]{rs.getInt("iddetailbon"),rs.getInt("idarticle"),rs.getString("libarticle"),rs.getString("qte"),rs.getString("pu"),rs.getString("montant"),rs.getString("idmagasin"),rs.getString("tva")});
       }
       jt.setModel(model);
   }
   
     
   public void afficherDetailBonM(JTable jt,int idBon) throws SQLException{
       ResultSet rs=getResultSet("select detailbon.qte*detailbon.pu as Montantttc,detailbon.idarticle,libarticle,detailbon.qte,detailbon.pu,detailbon.idmagasin,tva from detailbon,article where detailbon.idarticle=article.idarticle and idbon="+idBon);
       DefaultTableModel model=(DefaultTableModel) jt.getModel();
       model.setRowCount(0);
       while(rs.next()){
         model.addRow(new Object[]{rs.getInt("idarticle"),rs.getString("libarticle"),rs.getString("qte"),rs.getString("pu"),rs.getString("montantTTC"),rs.getString("idmagasin"),rs.getString("tva")});
       }
       jt.setModel(model);
       
   }
   
     
     public void saveJournal(JTable jt,String date,String numBon) throws SQLException{
       String champ="livrejournal(dateoperation,idarticle,idbonentree,qteentree,puentree,pustock)";
       int nrow=jt.getRowCount();
       int i=0; 
       String valeur[]= new String[6];
       HashMap hma=null;
       while(i<nrow){
          valeur[0]=date;
          valeur[1]=jt.getValueAt(i,getColumnByName(jt,"code article")).toString();
          valeur[2]=numBon;
          valeur[3]=jt.getValueAt(i,getColumnByName(jt,"qte")).toString();
          valeur[4]=jt.getValueAt(i,getColumnByName(jt,"pu")).toString();
          hma=a.getArticleInfo(Integer.parseInt(valeur[1]));
         // valeur[5]=String.valueOf(Integer.parseInt(hma.get("STOCKACTU").toString())+Integer.parseInt(valeur[3].toString()));
          //valeur[5]=hma.get("PRIXUNITAIRE").toString();// A REVOIR 
           valeur[5]=valeur[4];
         // valeur[5]=jt.getValueAt(i,getColumnByName(jt,"pu")).toString();
          this.Insertion(champ, valeur);
          //insUpdateDel("update article set stockactu="+valeur[5]+" where idarticle="+valeur[1]);
          i++;       
       }
    }
    
     public void escalierLivreJournal() throws SQLException{     
       //  majStockIn();
         ResultSet rs= this.getResultSet("select idoperation,qteentree,qtesortie,idarticle from livrejournal order by idoperation");
         int i=0,stockP=0,qteentre=0,qteSortie=0,stockLigne=0,idoperation;
        
         while(rs.next()){             
                qteentre=rs.getInt("qteentree");                
                qteSortie=rs.getInt("qtesortie");
                idoperation=rs.getInt("idoperation");
                stockP=stockLignePre(idoperation,rs.getInt("idarticle"));
                //en cas de ligne d'entrée
                if(qteentre>0){
                    stockLigne=qteentre+stockP;
                    this.insUpdateDel("update livrejournal set qtestock="+stockLigne+" where idoperation="+idoperation);
                }
                //en cas de ligne de sortie
                else if(qteSortie>0){
                    stockLigne=stockP-qteSortie;
                     this.insUpdateDel("update livrejournal set qtestock="+stockLigne+" where idoperation="+idoperation);
                }                    
         }
         rs.close();
       //  return stockP;
     }
     
     private void majStockIn() throws SQLException{
        ResultSet rsj=this.getResultSet("select idarticle from livrejournal");
        String idarticle;
          ResultSet rs,rsa;
        while(rsj.next()){
            idarticle=rsj.getString("idartcle");
             //verif si stock init dans livre journal
            rs=this.getResultSet("select * from livrejournal where idarcticle="+idarticle+" and idbonentree=0");
            //get stock ini de article
            rsa=this.getResultSet("select * from article where idarcticle="+idarticle);
            rsa.next();
            //cas absence de stockini dan livre journal
            if(!rs.next()){                
                this.insUpdateDel("insert into livrejournal(idbonentree,qteentre,dateoperation)values(0"+","+rsa.getString("stockinit")+",'"+rsa.getDate("datestockini")+"'");         
            }
            else  
            this.insUpdateDel("update livrejournal set qteentre="+rsa.getString("stockinit")+" where idarticle="+idarticle+" and idbonentree=0");
            rsa.close();
            rs.close();      
        }
        rsj.close();
     }
     private int stockLignePre(int idlivrejournal,int idarticle) throws SQLException{
         ResultSet rs=this.getResultSet("select qtestock from livrejournal where idoperation=(select max(idoperation) from livrejournal where idarticle="+idarticle+" and idoperation<"+idlivrejournal+")");  
         int qte=0;
         if(rs.next()){
           qte=rs.getInt("qtestock");        
         }
         else
             qte=0;
         return qte;
       
     }
     
     public String getPUmArticle(String idArticle) throws SQLException{
       return  getOneResult("select sum(pu*qte)/sum(qte) from detailbon where idarticle="+
                idArticle+" and detailbon.idbon in (select idbon from entree where valide=true)");  
     }
     
     
   
   
  

}