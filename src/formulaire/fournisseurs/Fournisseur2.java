/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire.fournisseurs;
import comptamatiere.FOURNISSEUR;
import comptamatiere.REPORT;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author PRINCE
 */
public class Fournisseur2 extends javax.swing.JDialog {

    /**
     * Creates new form Fournisseur2
     */
    public Fournisseur2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel2 = new javax.swing.JPanel();
        lblRechercher1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbSearch1 = new javax.swing.JComboBox();
        txtComptePrincipal1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        btnModifier1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableFournisseur = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "RECHERCHE", 1, 2, new java.awt.Font("Wide Latin", 1, 10), java.awt.Color.black)); // NOI18N

        lblRechercher1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRechercher1.setText("FOURNISSEUR");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("PAR");

        cmbSearch1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RAISONSOCIAL", "IFU", "TELEPHONE", "NOMREPRESENTANT" }));
        cmbSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearch1ActionPerformed(evt);
            }
        });

        txtComptePrincipal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        txtComptePrincipal1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtComptePrincipal1CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRechercher1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComptePrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRechercher1)
                    .addComponent(cmbSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtComptePrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VST01620b.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Table des Fournisseurs");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(22, 22, 22))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jButton7.setToolTipText("Nouveau");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnModifier1.setBackground(new java.awt.Color(255, 255, 255));
        btnModifier1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnModifier1.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnModifier1.setToolTipText("Modifier");
        btnModifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifier1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton8.setToolTipText("Supprimer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jButton9.setToolTipText("Imprimer");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnModifier1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnModifier1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableFournisseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableFournisseur.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(TableFournisseur);
        TableFournisseur.getColumnModel().getColumn(0).setResizable(false);
        TableFournisseur.getColumnModel().getColumn(0).setPreferredWidth(0);
        TableFournisseur.getColumnModel().getColumn(1).setResizable(false);
        TableFournisseur.getColumnModel().getColumn(1).setPreferredWidth(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-701)/2, (screenSize.height-435)/2, 701, 435);
    }// </editor-fold>//GEN-END:initComponents
FOURNISSEUR Fournisseur = new FOURNISSEUR();     
private void chargement(){
             try {
                 JScrollPane  jscroll1 = new JScrollPane();
            TableFournisseur.setModel(Fournisseur.getDefaulTableModel("select iDFOURNISSEUR as Numero,TYPEFOURNISSEUR,IFU as IFU, RAISONSOCIAL as 'RAISON SOCIAL',NOMREPRESENTANT as 'NOM DU REPRESENTANT',ADRESSE,TELEPHONE,FAX,EMAIL,VILLE, PAYS,SECTEURACTIVITE as 'SECTEUR ACTIVITE' from fournisseur "));
            TableColumn column=null;
             TableFournisseur.getColumn("RAISON SOCIAL").setPreferredWidth(250);
             TableFournisseur.getColumn("IFU").setPreferredWidth(200);
             TableFournisseur.getColumn("NOM DU REPRESENTANT").setPreferredWidth(230);
             TableFournisseur.getColumn("TYPEFOURNISSEUR").setPreferredWidth(200);
            
            jScrollPane2.setViewportView(TableFournisseur);
        } catch (SQLException ex) {JOptionPane.showMessageDialog(this, ex.getMessage());
             }
     }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmbSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearch1ActionPerformed
        lblRechercher1.setText(cmbSearch1.getSelectedItem().toString());
    }//GEN-LAST:event_cmbSearch1ActionPerformed

    private void txtComptePrincipal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtComptePrincipal1CaretUpdate
        if(txtComptePrincipal1.getText()!=""){
            try {
                TableFournisseur.setModel(Fournisseur.getDefaulTableModel("select * from fournisseur WHERE "+cmbSearch1.getSelectedItem().toString() +" like '%"+txtComptePrincipal1.getText()+"%'"));
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_txtComptePrincipal1CaretUpdate

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Nouveau2 n = new Nouveau2(new JFrame(),true);
        n.typeFournisseur="Fournisseur";
        n.setVisible(true);
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnModifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifier1ActionPerformed
        // TODO add your handling code here:
      /*  try{
        Modification2  Ms = new Modification2(new JFrame(),true);
        Fournisseur.setidFOURNISSEUR(Integer.parseInt(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),0).toString()));
        Fournisseur.setTYPEFOURNISSEUR(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),1).toString());
        Fournisseur.setIFU(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),2).toString());
        Fournisseur.setRAISONSOCIAL((TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),3).toString()));
        Fournisseur.setNOMREPRESENTANT(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),4).toString());
        Fournisseur.setADRESSE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),5).toString());
        Fournisseur.setTELEPHONE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),6).toString());
        Fournisseur.setFAX(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),7).toString());
        Fournisseur.setEMAIL((TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),8).toString()));
        Fournisseur.setVILLE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),9).toString());
        Fournisseur.setPAYS(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),10).toString());
        Fournisseur.setSECTEURACTIVITE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),11).toString());
        ///Fournisseur.setACTIVITES(Table.getValueAt(Table.getSelectedRow(),12).toString());
        Ms.Mf=Fournisseur;/*
       
        */
          try{
        Modification2  Ms = new Modification2(new JFrame(),true);
         //JOptionPane.showMessageDialog(this, TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),0).toString());
        Fournisseur.setidFOURNISSEUR(Integer.parseInt(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),0).toString()));
        Fournisseur.setTYPEFOURNISSEUR(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),1).toString());
        Fournisseur.setIFU(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),2).toString());
        Fournisseur.setRAISONSOCIAL((TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),3).toString()));
        Fournisseur.setNOMREPRESENTANT(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),4).toString());
        Fournisseur.setADRESSE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),5).toString());
        Fournisseur.setTELEPHONE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),6).toString());
        Fournisseur.setFAX(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),7).toString());
        Fournisseur.setEMAIL((TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),8).toString()));
        Fournisseur.setVILLE(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),9).toString());
        Fournisseur.setPAYS(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),10).toString());
       
        if(!TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),11).toString().trim().isEmpty())
             Fournisseur.setSECTEURACTIVITE(Integer.parseInt(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),11).toString()));
        else
            Fournisseur.setSECTEURACTIVITE(0);
        
        Ms.f=Fournisseur;
         
        Ms.setVisible(true);
        } catch(IndexOutOfBoundsException ex){
          JOptionPane.showMessageDialog(this,"Choisissez le Fournisseur à modifier,SVP");
       }
    }//GEN-LAST:event_btnModifier1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        REPORT r= new REPORT();
        try{
            r.editionReport("fournisseur_liste", "select * from fournisseur,secteuractivite where fournisseur.secteuractivite=secteuractivite.idsecteur order by raisonsocial", r.getInstitutionMap());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:?
       // chargement();
        
    }//GEN-LAST:event_formComponentShown

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        chargement();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try{
            if(Fournisseur.isExist("bon","idfournisseur",TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),0).toString()))
                    JOptionPane.showMessageDialog(this,"Suppression impossible, fournisseur utilisé déjà");
            else
            {
                    int reponse=JOptionPane.showConfirmDialog(this,"voulez-vous Supprimer ce fournisseur ?","confirmation",JOptionPane.YES_NO_OPTION);
                if(reponse==JOptionPane.YES_OPTION){
                   int idfournisseur=(Integer.parseInt(TableFournisseur.getValueAt(TableFournisseur.getSelectedRow(),0).toString()));

                  int i=  Fournisseur.insUpdateDel("DELETE from FOURNISSEUR WHERE IDFOURNISSEUR="+idfournisseur);
                    JOptionPane.showMessageDialog(this, i+" FOURNISSEUR SUPPRIME");

                    }
            } } catch (SQLException ex) {
                    Logger.getLogger(Fournisseur2.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Fournisseur2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseur2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseur2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseur2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fournisseur2 dialog = new Fournisseur2(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TableFournisseur;
    private javax.swing.JButton btnModifier1;
    private javax.swing.JComboBox cmbSearch1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRechercher1;
    private javax.swing.JTextField txtComptePrincipal1;
    // End of variables declaration//GEN-END:variables
}
