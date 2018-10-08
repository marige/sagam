
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTable;

public class ARTICLE extends CATEGORIE{
   public long idARTICLE;
   public String LIBARTICLE;
   public String SPECIFICATION;
   public int STOCKINIT;
   public int STOCKACTU;
   public int STOCKSECURITE;
   public String DATESTOCKINI;
   public int PRIXUNITAIRE;
   public String UNITEMESURE;
    public String numcompte;
    
   JTable tableArticle;
   
   public int getStockArticle(int codeArticle) throws SQLException{
      return Integer.parseInt(this.getOneResult("select stockactu from article where idarticle="+codeArticle));
   } 
     
   public boolean isAtteintStockSecurite() throws SQLException{
      return Integer.parseInt(this.getOneResult("select count(*) from article where stocksecurite>=stockactu and stocksecurite>0"))>0?true:false;
   } 
  
   
   public HashMap getArticleInfo(int idarticle) throws SQLException{
        HashMap hm=new HashMap();
        ResultSet rs= this.getResultSet("select * from article where idarticle="+idarticle);
        int i= rs.getMetaData().getColumnCount();
        int j=1;
       rs.next();
       while(j<=i){
            hm.put(rs.getMetaData().getColumnLabel(j), rs.getString(j));
            j++;
           }
       rs.close();
        return hm;
   }
   public ARTICLE getObjetArticle(String idArticle) throws SQLException{
       ResultSet rs = this.getResultSet("select * from article");
        return null;
   }

 public void affichelot(JTable Jt, int idArticle) throws SQLException{
      Statement stm= (Statement) getConnection().createStatement();
      //  ResultSet rs=stm.executeQuery("SELECT MAX(detailinventaire.idinventaire),DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      ResultSet rs=stm.executeQuery("SELECT detailinventaire.iddetailinventaire,DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and iddetailinventaire=( select max(iddetailinventaire) from detailinventaire where detailinventaire.idarticle="+idArticle+")");
      //ResultSet rs=stm.executeQuery("SELECT detailinventaire.idinventaire,DATEINVENT FROM detailinventaire,inventaire where detailinventaire.idinventaire=(select max(idinventaire) from detailinventaire) and inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      
       if(rs.next()) { 
            Date InvDeja=rs.getDate(2);
            String sql="SELECT iddetailinventaire as Ligne,Qte_Res_StockInv as Qte, PUM as Pu,'Inv' as Type,DATEINVENT as Dates FROM detailinventaire,inventaire WHERE detailinventaire.idinventaire=(select MAX(idinventaire) from inventaire) and detailinventaire.idinventaire=inventaire.idinventaire and detailinventaire.idarticle="+idArticle +
                        " and Qte_Res_StockInv >0 UNION(select idDETAILBON as Ligne ,DETAILBON.QTESTOCK as Qte,DETAILBON.pu as Pu,'BC'as Type,DATEBON from DETAILBON,BON where DETAILBON.idARTICLE="+idArticle+" AND BON.idbon=detailbon.idbon  and bon.DATEBON>='"+InvDeja+"') order by Dates";    
                   this.setRemplirJtable(Jt, sql); 
          }
     
        else{//l article nes pas encore dans inventaire
            
                 String sql="SELECT idarticle as Ligne,Qte_Res_StockInit as Qte,Prixunitaire as Pu,'StkIni' as Type,DATESTOCKINI as Dates from article where idarticle="+idArticle+" and Qte_Res_StockInit>0 UNION(select idDETAILBON,DETAILBON.QTESTOCK ,DETAILBON.pu ,'BC',DATEBON from DETAILBON,BON where DETAILBON.idARTICLE="+
                 idArticle+" and detailbon.idbon=bon.idbon and detailbon.QTESTOCK >0) ";
                 //String sql="SELECT iddetailinventaire as Ligne,Qte_Res_StockInv as Qte, PUM as Pu,'Inv' as Type,DATEINVENT as Dates FROM detailinventaire,inventaire WHERE detailinventaire.idinventaire=(select MAX(idinventaire) from detailinventaire) and detailinventaire.idarticle="+idArticle;
               this.setRemplirJtable(Jt, sql); 
               } 
     
         rs.close();  
}
 
 //methode correction du stock
  public void updatestock( JTable Jt, String idArticle) throws SQLException{
    Statement stm= (Statement) getConnection().createStatement();
      //  ResultSet rs=stm.executeQuery("SELECT MAX(detailinventaire.idinventaire),DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      ResultSet rs=stm.executeQuery("SELECT detailinventaire.iddetailinventaire,DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and iddetailinventaire=( select max(iddetailinventaire) from detailinventaire where detailinventaire.idarticle="+idArticle+")");
      //ResultSet rs=stm.executeQuery("SELECT detailinventaire.idinventaire,DATEINVENT FROM detailinventaire,inventaire where detailinventaire.idinventaire=(select max(idinventaire) from detailinventaire) and inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      
       if(rs.next()) { 
            Date InvDeja=rs.getDate(2);
           String sql="select libarticle as Articles,QTE as Aquit, SUM(QTE_SORTIE) as QteSortie,(QTE-SUM(QTE_SORTIE)) as QteRelle,(QTESTOCK) as StocktTHEORIQUE,detailbon.iddetailbon as ligne,detailsortie.type "+       
                             "from" +
                                 " article,detailbon,detailsortie,sortie,bon,entree " +
                                "where   article.idarticle=detailbon.idarticle and detailbon.iddetailbon=detailsortie.iddetailbon and detailsortie.idsortie=sortie.idsortie" +
                                 " and sortie.valide=1 and type='BC' and detailbon.idbon=bon.idbon and bon.idbon=entree.idbon and DATEBORD >="+InvDeja+
                                " and DATESORTIE>= "+ InvDeja+ " group by detailsortie.iddetailbon,detailsortie.type " +
                             " UNION (select libarticle,QTEREELLE,SUM(QTE_SORTIE),(QTEREELLE-SUM(QTE_SORTIE)),Qte_Res_StockInv,iddetailinventaire,detailsortie.type "+
                                 " from article,detailsortie,sortie,detailinventaire,inventaire where  article.idarticle=detailsortie.idarticle and detailsortie.idsortie=sortie.idsortie and sortie.valide=1 AND detailsortie.TYPE='Inv' and detailinventaire.idinventaire=inventaire.idinventaire and detailinventaire.idarticle=article.idarticle"+
                                " and DATESORTIE>="+InvDeja+" group by detailsortie.iddetailbon,detailsortie.type )"+
                                " order by Articles" ;      
            this.setRemplirJtable(Jt, sql); 
          }
     
        else{//l article nes pas encore dans inventaire
            
                 String sql="select libarticle as Articles,QTE as Aquit, SUM(QTE_SORTIE) as QteSortie,(QTE-SUM(QTE_SORTIE)) as QteRelle,(QTESTOCK) as StocktTHEORIQUE,detailbon.iddetailbon as ligne,detailsortie.type "+
                       
                             "from" +
                                 " article,detailbon,detailsortie,sortie where article.idarticle="+idArticle+" and  article.idarticle=detailbon.idarticle and detailbon.iddetailbon=detailsortie.iddetailbon and detailsortie.idsortie=sortie.idsortie" +
                                 " and valide=1 and type='BC' group by detailsortie.iddetailbon,detailsortie.type" +
                             " UNION (select libarticle,STOCKINIT,SUM(QTE_SORTIE),(STOCKINIT-SUM(QTE_SORTIE)),Qte_Res_StockInit,article.idarticle,detailsortie.type "+
                                 " from article,detailsortie,sortie where article.idarticle="+idArticle+" and article.idarticle=detailsortie.idarticle and detailsortie.idsortie=sortie.idsortie and sortie.valide=1 AND detailsortie.TYPE='StkIni'group by detailsortie.iddetailbon,detailsortie.type )"+
                                   " order by Articles" ;  
                 this.setRemplirJtable(Jt, sql); 
               } 
     
         rs.close();  
}
  
  public void correctionStockArticle(String idArticle) throws SQLException, ParseException{
       //verification si deja inventaire
      int stock=0;
      ResultSet resinventaire= this.getResultSet("select inventaire.dateinvent,detailinventaire.qtereelle from detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle+" and detailinventaire.idinventaire=(select max(idinventaire) from inventaire)");
      //en cas de présence dans le dernier inventaire
      if(resinventaire.next()){
          int qte_inventaire=resinventaire.getInt("qtereelle");
          String dateinventaire=resinventaire.getString("dateinvent");
          resinventaire.close();
         //total des entrees après inventaire - sortie après inventaire          
         stock=qte_inventaire+getTotalEntreApresDate(idArticle,dateinventaire)- getTotalSortieApresDate(idArticle,dateinventaire);         
         this.insUpdateDel("update article set stockactu="+stock+" where idarticle="+idArticle);
      }
      //cas ou pas inventaire
      else
      {
        stock=getTotalEntreApresDate(idArticle,"0000-00-00")- getTotalSortieApresDate(idArticle,"0000-00-00");
         this.insUpdateDel("update article set stockactu=stockinit+"+stock+" where idarticle="+idArticle);
      }               
  }
  
  public int getTotalEntreApresDate(String idarticle,String dateentree) throws SQLException, ParseException{
      String str=this.getOneResult("select sum(qte) from detailbon where idarticle="+idarticle+
             "  and detailbon.idbon in (select entree.idbon from entree,bon where bon.idbon=detailbon.idbon and bon.datebon>='"+dateentree+
             "' and valide=true)");
      return str==null?0:Integer.parseInt(str);
  }
  
   public int getTotalSortieApresDate(String idarticle,String datesortie) throws SQLException, ParseException{
        String qte=this.getOneResult("select sum(qte_sortie) from detailsortie where idarticle="+idarticle
                +" and detailsortie.idsortie in (select sortie.idsortie from sortie where valide=true and sortie.datesortie>='"+datesortie+"')"); 
       return qte==null?0:Integer.parseInt(qte);  
  }


   
}
