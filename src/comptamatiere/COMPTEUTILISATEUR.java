/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comptamatiere;

import bdd.ModelDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class COMPTEUTILISATEUR extends ModelDb{
    public void upCombo(JComboBox cmb) throws SQLException{
        ResultSet rs=this.getResultSet("select login from compteutilisateur");
        DefaultComboBoxModel df=new DefaultComboBoxModel();
        while(rs.next()){
            df.addElement(rs.getString(1));    
        }
        cmb.setModel(df);
        rs.close();
    }
}
