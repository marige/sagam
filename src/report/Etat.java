/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import bdd.ModelDb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author OBAM
 */
public class Etat  extends ModelDb{
    public Etat(){
      
    }
    public static String reportPath=System.getProperty("user.dir");
     //public static String reportPath=System.getProperty("user.dir")+"\\src\\report\\";
    
    public void editionReport(String reportName,String query, HashMap hm) throws Exception{
            Connection conn=getConnection();
            String reportSource=reportPath+reportName+".jrxml";
            JasperDesign jd=JRXmlLoader.load(reportSource);   
            JRDesignQuery qd=new JRDesignQuery();
            qd.setText(query);
            jd.setQuery(qd);
            JasperReport jsp=JasperCompileManager.compileReport(jd);
            JasperPrint jp= JasperFillManager.fillReport(jsp, hm,conn);
            JasperViewer.viewReport(jp,false);
            conn.close();
    }
    
    public HashMap getHashMap(String tableName) throws SQLException{
         HashMap hm= new HashMap();
            ResultSet rs=getResultSet("select * from"+tableName);
            rs.next();
            int nbcolumn=rs.getMetaData().getColumnCount();
            for(int i=1;i<=nbcolumn;i++){
                hm.put(rs.getMetaData().getColumnName(i), rs.getString(i));
            }
            return hm;
    }
        
}
