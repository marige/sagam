/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire.Utilisateur;

import comptamatiere.ARTICLE;
import comptamatiere.UTILISATEUR;
import control.Controle;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author OBAM
 */
public class Modifier extends javax.swing.JDialog {
    ARTICLE a= new ARTICLE();
    ArrayList ALSERVICE=null, ALBUREAU=null ; 
    public UTILISATEUR utilisateur=new UTILISATEUR();
  
    public Modifier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        getContentPane().setBackground(Color.white);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUtilisateur = new javax.swing.JTextField();
        cmbService = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        CodeService = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CodeBure = new javax.swing.JTextField();
        cmbBureau = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Sexe = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFonction = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cmbSexe = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 530));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Identité ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUtilisateurActionPerformed(evt);
            }
        });

        cmbService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbServiceActionPerformed(evt);
            }
        });

        jLabel2.setText("Service");

        CodeService.setEditable(false);
        CodeService.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Nom ");

        CodeBure.setEditable(false);
        CodeBure.setForeground(new java.awt.Color(255, 0, 0));

        cmbBureau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBureauActionPerformed(evt);
            }
        });

        jLabel6.setText("Bureau");

        jLabel9.setText("Contact");

        Sexe.setText("Sexe");

        jLabel11.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel12.setText("Fonction");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Enrégistrer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbSexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cmbSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexeActionPerformed(evt);
            }
        });

        jLabel13.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(315, 315, 315))
                            .addComponent(txtFonction)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(txtContact))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtUtilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbService, 0, 397, Short.MAX_VALUE)
                                        .addComponent(cmbBureau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CodeBure, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(CodeService))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeService)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbBureau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeBure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFonction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fiche utilisateur");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(582, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUtilisateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUtilisateurActionPerformed

    private void cmbServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServiceActionPerformed

        try {
            CodeService.setText(ALSERVICE.get(cmbService.getSelectedIndex()).toString());
            ALBUREAU=a.getComboELement("select idbureau,libbur from bureau where idservice="+CodeService.getText()+" order by libbur",cmbBureau);
            CodeBure.setText(ALBUREAU.get(cmbBureau.getSelectedIndex()).toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_cmbServiceActionPerformed

    private void cmbBureauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBureauActionPerformed
        try{
          CodeBure.setText(ALBUREAU.get(cmbBureau.getSelectedIndex()).toString());
        }catch(Exception ex){}
    }//GEN-LAST:event_cmbBureauActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(cmbService.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this,"Choisissez le service");
        else if(cmbBureau.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this,"Choisissez le bureau");
        else if(cmbSexe.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this,"Précisez le sexe");
        else if(txtUtilisateur.getText().trim().isEmpty())
              JOptionPane.showMessageDialog(this,"Saisissez nom et prénom de l\'utilisateur");
        else{
            int reponse= JOptionPane.showConfirmDialog(this,"voulez-vous modifiez les données?","confirmation",JOptionPane.YES_NO_OPTION);
            if(reponse==JOptionPane.YES_OPTION){
                try {
                    String champ[]={"idbureau","utilisateur","sexe","contact","fonction"};
                    String valeur[]={CodeBure.getText(),txtUtilisateur.getText(),cmbSexe.getSelectedItem().toString(),txtContact.getText(),txtFonction.getText()};
                    int i=a.updateTable("utilisateur",champ,valeur,"where idutilisateur="+utilisateur.idUtilisateur);
                    JOptionPane.showMessageDialog(this, i+" utilisateur modifié");
                    if(i==1){
                        // CodeBure.setText(null);
                        txtUtilisateur.setText("");
                        txtUtilisateur.setText("");
                         //cmbSexe.setSelectedIndex(-1);
                        txtContact.setText("");
                        txtFonction.setText("");
                        Controle.modification=true;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       try {
          //  JOptionPane.showMessageDialog(this,"utilisateur est "+utilisateur.utilisateur);
            txtContact.setText(utilisateur.contact);
            txtFonction.setText(utilisateur.fonction);
            txtUtilisateur.setText(utilisateur.utilisateur);
            
           
            ALSERVICE = a.getComboELement("select idservice,LIBSERVICE from service order by LIBSERVICE",cmbService);  
            cmbService.setSelectedItem(utilisateur.getOneResult("select libservice from service,bureau where service.idservice=bureau.idservice and bureau.idbureau="+utilisateur.idBureau));
            CodeService.setText(ALSERVICE.get(cmbService.getSelectedIndex()).toString());
            
            CodeService.isEnabled();
            CodeService.setText(ALSERVICE.get(cmbService.getSelectedIndex()).toString());
            
            
            ALBUREAU=a.getComboELement("select idbureau,libbur from bureau where idservice="+CodeService.getText()+" order by libbur",cmbBureau);
           
            cmbBureau.setSelectedItem(utilisateur.libbureau);
            CodeBure.setText(ALBUREAU.get(cmbBureau.getSelectedIndex()).toString());
            
           
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(this,ex.getMessage());
           }        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void cmbSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modifier dialog = new Modifier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeBure;
    private javax.swing.JTextField CodeService;
    private javax.swing.JLabel Sexe;
    private javax.swing.JComboBox cmbBureau;
    private javax.swing.JComboBox cmbService;
    private javax.swing.JComboBox cmbSexe;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFonction;
    private javax.swing.JTextField txtUtilisateur;
    // End of variables declaration//GEN-END:variables
}
