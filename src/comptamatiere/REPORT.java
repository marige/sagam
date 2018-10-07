package comptamatiere;
import bdd.ModelDb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class REPORT extends ModelDb {
   
    public HashMap getInstitutionMap() throws SQLException{
          HashMap hm= new HashMap();
                        ResultSet rs=getResultSet("select * from institution");
                        int nbcolumn=rs.getMetaData().getColumnCount();
                        //tester si la requete nenvoi pas null
                        if(rs.next()){                      
                        for(int i=1;i<=nbcolumn;i++){
                            hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                        }
                        }
                        rs.close();
                        return hm;     
    }
    public static String reportPath=System.getProperty("user.dir")+"\\src\\report\\";//pour programmation
   // public static String reportPath=System.getProperty("user.dir")+"\\";//pour deploiement
    
    public void reportWithJtable(JTable jt,HashMap hm,String reportName) throws JRException{
      /*  JasperReport jas=JasperCompileManager.compileReport(reportPath+"\\"+reportName+".jrxml");
        JasperPrint jp=JasperFillManager.fillReport(jas, hm,new JRTableModelDataSource((DefaultTableModel)jt.getModel()));
        JasperViewer.viewReport(jp,false);*/
         
         JasperReport jas=JasperCompileManager.compileReport(reportPath+reportName+".jrxml");
         JasperPrint jp=JasperFillManager.fillReport(jas, hm,new JRTableModelDataSource((DefaultTableModel)jt.getModel()));
         JasperViewer jv=new JasperViewer(jp,false);
         JDialog jd= new JDialog(new JFrame(),true);
         jd.setContentPane(jv.getContentPane());
         jd.setSize(jv.getSize());
         jd.setVisible(true);
    //     JasperViewer.viewReport(jp,false);
         
       
    }
    public void editionReport(String reportName,String query, HashMap hm) throws Exception{
            Connection conn=getConnection();
            String reportSource=reportPath+reportName+".jrxml";
            JasperDesign jd=JRXmlLoader.load(reportSource);   
            JRDesignQuery qd=new JRDesignQuery();
            qd.setText(query);
            jd.setQuery(qd);
            JasperReport jsp=JasperCompileManager.compileReport(jd);
            JasperPrint jp= JasperFillManager.fillReport(jsp, hm,conn);
            JasperViewer jv=new JasperViewer(jp,false);
            JDialog dialog= new JDialog(new JFrame(),true);
            dialog.setContentPane(jv.getContentPane());
            dialog.setSize(jv.getSize());
            dialog.setVisible(true);    
            conn.close();
    }
    
    public HashMap getHashMap(String tableName) throws SQLException{
         HashMap hm= new HashMap();
            ResultSet rs=getResultSet("select * from "+tableName);
            if(rs.next()){
            int nbcolumn=rs.getMetaData().getColumnCount();
            for(int i=1;i<=nbcolumn;i++){
                hm.put(rs.getMetaData().getColumnName(i), rs.getString(i));
            }
            }
            rs.close();
            return hm;
    }
    
     public HashMap getBonHashMap(String idBon,String idBudget,String idFournisseur) throws SQLException{
         HashMap hm= new HashMap();
                        ResultSet rs=getResultSet("select * from institution");
                        rs.next();
                        int nbcolumn=rs.getMetaData().getColumnCount();
                        for(int i=1;i<=nbcolumn;i++){
                            hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                        }
                        rs.close();
                        
                        rs=getResultSet("select * from bon where idbon="+idBon);
                        if(rs.next()){
                        nbcolumn=rs.getMetaData().getColumnCount();
                        for(int i=1;i<=nbcolumn;i++){
                            hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                        }
                        }
                         rs.close();
                        //budget
                        rs=getResultSet("select * from budget where idbudget="+idBudget);
                        if(rs.next()){
                        nbcolumn=rs.getMetaData().getColumnCount();
                        for(int i=1;i<=nbcolumn;i++){
                            hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                        }
                        }
                        rs.close();
                          //fournisseur
                        rs=getResultSet("select raisonsocial from fournisseur where idfournisseur="+idFournisseur);
                        if(rs.next())
                        {nbcolumn=rs.getMetaData().getColumnCount();
                        for(int i=1;i<=nbcolumn;i++){
                            hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                        }
                        }
                        rs.close();                        
                        
                         //entree
                        rs=getResultSet("select datebord from entree where idbon="+idBon);
                        if(rs.next()){
                            nbcolumn=rs.getMetaData().getColumnCount();
                            for(int i=1;i<=nbcolumn;i++){
                                hm.put(rs.getMetaData().getColumnName(i).toLowerCase(), rs.getString(i));
                            }
                        }
                        rs.close();   
                        
                          //num livre journal
                        
                            rs=getResultSet("select idoperation from livrejournal where idbonentree="+idBon);
                          if(rs.next()){                
                                hm.put("idoperation", rs.getString(1));
                                 }  
                         rs.close();     
                                    
            return hm;
    }
   /*  
     public boolean validation(String bon) throws SQLException{
         boolean f=false;
         ResultSet rs=this.getResultSet("select count(*) from livrejournal where idbonentree="+bon);
         rs.next();
         if (rs.getString(1).equals("0"))
             {
                 f=false;
             }
         else{ 
             f=true;
         }
         rs.close();
         return f;
     }*/
}
