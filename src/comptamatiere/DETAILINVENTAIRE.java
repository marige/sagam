package comptamatiere;
import bdd.ModelDb;
import java.sql.SQLException;
import javax.swing.JTable;

public class DETAILINVENTAIRE extends ModelDb{
   public long idDETAILINVENTAIRE;
   public int QTETHEORIQUE;
   public int QTEREELLE;
   public int AVARIE;
   public int SAIN;
   public int PERIME;
   public int PUM;
   
     
   public int saveInventaire(String idInventaire,JTable table) throws SQLException{
       int nbligne=table.getRowCount(),j=0;
       for(int i=0;i<nbligne;i++){
            String champ[]={"idinventaire","idarticle","avarie","sain","perime","qtereelle","qte_res_stockinv"};
            String sain=table.getValueAt(i,this.getColumnByName(table,"sain"))!=null?table.getValueAt(i,this.getColumnByName(table,"sain")).toString():null;
            String code=table.getValueAt(i,this.getColumnByName(table,"code"))!=null?table.getValueAt(i,this.getColumnByName(table,"code")).toString():null;
            String avarie =table.getValueAt(i,this.getColumnByName(table,"avarié"))!=null?table.getValueAt(i,this.getColumnByName(table,"avarié")).toString():null;
            String perime=table.getValueAt(i,this.getColumnByName(table,"perimé"))!=null?table.getValueAt(i,this.getColumnByName(table,"perimé")).toString():null;           
            String qtereelle=String.valueOf(Integer.parseInt(sain)+Integer.parseInt(avarie)+Integer.parseInt(perime));   
              String valeur[]={idInventaire,code,avarie,sain,perime,qtereelle,qtereelle};                                        
                 j+=this.updateTable("detailinventaire", champ, valeur,"where idarticle="+code+" and idinventaire="+idInventaire);          
       }
       return j;
   }
   
   public int validationInventaire(String idInventaire,JTable table) throws SQLException{
       int nbligne=table.getRowCount(),j=0;
      // String verif = null;
       for(int i=0;i<nbligne;i++){
            String champ[]={"stockactu"};
            String total=table.getValueAt(i,this.getColumnByName(table,"total inventorié")).toString();                                                   
            String idArticle=table.getValueAt(i,this.getColumnByName(table,"code")).toString();
            j+=this.insUpdateDel("update article set stockactu="+total+" where idarticle="+idArticle);     
       }
       this.insUpdateDel("update inventaire set valide=1 where idinventaire="+idInventaire); 
       return j;
   }


}