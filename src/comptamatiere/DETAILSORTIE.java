
package comptamatiere;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DETAILSORTIE extends SORTIE {
   public long idDETAILSORTIE;
   public int QTE;
   public int PU;
   //SORTIE Sortie= new SORTIE(); 
   
    public void afficheDetail(JTable Jt, int Idetail) throws SQLException{
            ResultSet req=getResultSet("select idSortie,detailsortie.QTE,detailsortie.pu, detailsortie.idDETAILBON,article.idARTICLE,LIBARTICLE from detailsortie,detailbon,article where idSORTIE= 16 and detailsortie.idDETAILBON=detailbon.idDETAILBON and detailbon.idARTICLE=article.idARTICLE ");
            DefaultTableModel model=(DefaultTableModel) Jt.getModel();
            while  (req.next()) {
               Object[] Obj = {req.getInt("article.idARTICLE"),req.getString("LIBARTICLE"),req.getInt("detailsortie.QTE"),req.getDouble("detailsortie.pu"),req.getInt("detailsortie.idDETAILBON"),req.getInt("detailsortie.idDETAILBON")};
               model.addRow(Obj);
               Jt.setModel(model); 
               }
            //return (ResultSet) Jt;
     }
    
    ARTICLE a = new ARTICLE();
    
    public void saveJournalSortie(JTable jt,String date,String numBon) throws SQLException{
       String champ="livrejournal(dateoperation,idarticle,idbonsortie,qtesortie,pusortie,qtestock,pustock)";
       //comptage du nombre de ligne de la jtable
       int nrow=jt.getRowCount();
       int i=0; 
       String valeur[]= new String[7];
       //hmap juste pour obtenir les information d'un article de la table article
       HashMap hma=null;
       while(i<nrow){
          valeur[0]=date;
          valeur[1]=jt.getValueAt(i,getColumnByName(jt,"code")).toString();
          valeur[2]=numBon;
          valeur[3]=jt.getValueAt(i,getColumnByName(jt,"qte")).toString();
          valeur[4]=jt.getValueAt(i,getColumnByName(jt,"pu")).toString();
          //methode qui renvoie les info de l'article
          hma=a.getArticleInfo(Integer.parseInt(valeur[1]));
          //addition du stock actu et du nouveau chiffre
               
          //valeur[5]=String.valueOf(Integer.parseInt(hma.get("STOCKACTU").toString())-Integer.parseInt(valeur[3].toString()));
          valeur[5]=   jt.getValueAt(i,getColumnByName(jt,"qte")).toString();
          valeur[6]=jt.getValueAt(i,getColumnByName(jt,"pu")).toString();  //hma.get("PRIXUNITAIRE").toString();       
          this.Insertion(champ, valeur);
          //update du stock
          insUpdateDel("update article set stockactu=stockactu-"+valeur[5]+" where idarticle="+valeur[1]);
          i++;       
       }
    }
    
    public void miseJourDesStock(String code,String ligne,String qte,String type) throws SQLException{
        if(type.equalsIgnoreCase("inv"))       
            this.insUpdateDel("update detailinventaire set qte_res_stockinv=qte_res_stockinv-("+qte+") where iddetailinventaire="+ligne);      
        else if(type.equalsIgnoreCase("bc"))
            this.insUpdateDel("update detailbon set qtestock=qtestock-("+qte+") where iddetailbon="+ligne);
        else if(type.equalsIgnoreCase("StkIni"))
            this.insUpdateDel("update article set Qte_Res_StockInit=Qte_Res_StockInit-("+qte+") where idarticle="+ligne);
        //mise à jour du stock dans la table article
        insUpdateDel("update article set stockactu=stockactu-"+qte+" where idarticle="+code);
    }
    
    public void remiseDansStock(String idSortie) throws SQLException{
        ResultSet rs=this.getResultSet("select iddetailbon,idarticle,qte_sortie,type from detailsortie where idsortie="+idSortie);
        while(rs.next()){
          //  return "detail bon "+rs.getString("iddetailbon")+"qte:-"+rs.getString("qte_sortie")+"type: "+rs.getString("type");
           miseJourDesStock(rs.getString("idarticle"),rs.getString("iddetailbon"),"-"+rs.getString("qte_sortie"),rs.getString("type"));
         //  this.insUpdateDel("update article set stockactu=stockactu+"+rs.getString("qte_sortie")+" where idarticle="+rs.getString("idarticle"));        
        }
        rs.close();
     
    }
    
    public void sortieParLot(JTable tableLot,JTable tableArticle,String txtQteArticle,String codeArticle,String libArticle){      
        int sous1=0;
            DefaultTableModel model=(DefaultTableModel)tableArticle.getModel();
            int rest=Integer.parseInt(txtQteArticle);;
            int test=Integer.parseInt(txtQteArticle);  
            for(int i=0; i<tableLot.getRowCount();i++){
              int qteLigne=Integer.parseInt(tableLot.getValueAt(i,getColumnByName(tableLot,"qtestock")).toString());
              int puLigne=Integer.parseInt(tableLot.getValueAt(i,getColumnByName(tableLot,"PU")).toString());
              int idDetailBonLigne=Integer.parseInt(tableLot.getValueAt(i,getColumnByName(tableLot,"iddetailbon")).toString());
              rest=rest-qteLigne;//je prend la quantite demande -qte dune signe       
                if(rest>0){//si rest est > 0 donc ce que je demande est plus grand que cette ligne donc je la prend integralement et je vais sur la seconde ligne               
                    Object[] Obj = {codeArticle, libArticle,qteLigne,puLigne,idDetailBonLigne};
                    model.addRow(Obj);
                    tableArticle.setModel(model);
                    //quantité article dejà sortie
                    sous1=sous1+qteLigne;
                }else{//si rest <0 alors cette ligne est grand que le quantite voulu
                    //la quatité restante a sortir est -rest
                    int rest2=test-sous1;
                    Object[] Obj = {codeArticle, libArticle,rest2,Integer.parseInt(tableLot.getValueAt(i,getColumnByName(tableLot,"pu")).toString()),idDetailBonLigne};
                    model.addRow(Obj);
                    tableArticle.setModel(model);
                    break;
                }
        }   
    }
   
}