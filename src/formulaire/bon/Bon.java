
package formulaire.bon;

import comptamatiere.BON;
import comptamatiere.DETAILBON;
import formulaire.Sortie.ValidationSorti;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


        
public class Bon extends javax.swing.JDialog {

  BON b=new BON();
  DETAILBON d =new DETAILBON();
    public Bon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //setUndecorated(true);
        initComponents();
    }
  
 
    /**rue
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblRechercher = new javax.swing.JLabel();
        txtComptePrincipal = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnModifier1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableDetail = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setName("FBon"); // NOI18N
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 102)));
        jPanel3.setToolTipText("Entrée de Bien");
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "RECHERCHE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Wide Latin", 1, 10))); // NOI18N

        lblRechercher.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRechercher.setText("Article");

        txtComptePrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        txtComptePrincipal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtComptePrincipalCaretUpdate(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDBON", "TYPEBON", "NBON", "DATEBON", "NUMPROFORMA", "CHAPITRE", " " }));
        cmbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("PAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(lblRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComptePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRechercher)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtComptePrincipal)
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ordre Entree");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(255, 255, 255)));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jButton3.setToolTipText("Nouveau");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton6.setToolTipText("Supprimer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jButton7.setToolTipText("Imprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModifier1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnModifier1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Titre 1"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setName("table"); // NOI18N
        table.setSelectionForeground(new java.awt.Color(204, 0, 0));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Detail des Ordres d'Entrée");

        TableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "ligne", "Designation", "Qte", "Pu", "Montant", "type"
            }
        ));
        TableDetail.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(TableDetail);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Rechercher un article");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(808, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       /* try {
            table.getTableHeader().setForeground(Color.BLACK);
            

             table.setModel(b.getDefaulTableModel("select idbon,typebon,nbon,datebon,numproforma,chapitre,raisonsocial as Fournisseur from bon,fournisseur where bon.idfournisseur=fournisseur.idfournisseur"));
             //b.resizeColumnWidth(table);
             table.getTableHeader().setFont(new Font("wide Latin", Font.BOLD,10));
              table.getColumnModel().getColumn(0).setPreferredWidth(5);
             
        } catch (SQLException ex) {

        }  */           
    }//GEN-LAST:event_formComponentShown

    private void txtComptePrincipalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtComptePrincipalCaretUpdate
     if(txtComptePrincipal.getText()!=""){
        try {
             table.setModel(b.getDefaulTableModel("select idbon,nbon,datebon,numproforma,chapitre,raisonsocial as Fournisseur,valide from bon,entree,fournisseur where bon.idbon=entree.idbon and "+
                     "bon.idfournisseur=fournisseur.idfournisseur and "+cmbSearch.getSelectedItem().toString() +" like '%"+txtComptePrincipal.getText()+"%'"));
            } catch (SQLException ex) {
        } 
    }
    }//GEN-LAST:event_txtComptePrincipalCaretUpdate

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        ((DefaultTableModel) TableDetail.getModel()).setRowCount(0);
     String   idBon=table.getValueAt(table.getSelectedRow(),b.getColumnByName(table, "idBon")).toString();
        try {
            d.afficherDetailBon(TableDetail,Integer.parseInt(idBon));
        } catch (SQLException ex) { 
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             TableDetail.getColumn("Code").setPreferredWidth(100);
             
             
             TableDetail.getColumn("ligne").setMinWidth(0);
             TableDetail.getColumn("ligne").setPreferredWidth(0);
             TableDetail.getColumn("ligne").setMaxWidth(0);
             
              TableDetail.getColumn("type").setMinWidth(0);
             TableDetail.getColumn("type").setPreferredWidth(0);
             TableDetail.getColumn("type").setMaxWidth(0);
       
             TableDetail.getColumn("Qte").setPreferredWidth(100); 
             TableDetail.getColumn("Pu").setPreferredWidth(100);
             TableDetail.getColumn("Montant").setPreferredWidth(200);
             TableDetail.getColumn("Designation").setPreferredWidth(300);
           
    }//GEN-LAST:event_tableMouseClicked

    private void cmbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchActionPerformed
        lblRechercher.setText(cmbSearch.getSelectedItem().toString());
    }//GEN-LAST:event_cmbSearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          Nouveau d= new Nouveau(new JFrame(),true);    
          d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifier1ActionPerformed
        try {         
          String val=b.getOneResult("select valide from entree where idbon="+table.getValueAt(table.getSelectedRow(),b.getColumnByName(table,"idbon")).toString());        
            if(val.equalsIgnoreCase("1"))
             {
                 JOptionPane.showMessageDialog(this,val+" Ordre d\'entree deja validé,la modification est impossible");
            }else{
            Modification m= new Modification(new JFrame(),true);            
            String bonSelect=table.getValueAt(table.getSelectedRow(),b.getColumnByName(table,"idbon")).toString();
            m.idBon= bonSelect;
            m.setVisible(true); 
           } 
            } catch (SQLException ex) {
                Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, ex);
            } catch(IndexOutOfBoundsException ex){
              JOptionPane.showMessageDialog(this,"Choisissez le Bon à modifier,SVP");
           }
    }//GEN-LAST:event_btnModifier1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try {
             String bonSelect=table.getValueAt(table.getSelectedRow(),b.getColumnByName(table,"idbon")).toString();
            String codeF=b.getOneResult("select idFournisseur from bon where idbon="+bonSelect);    
                b.printReportBon(bonSelect,codeF);    
        } catch(IndexOutOfBoundsException ex){
          JOptionPane.showMessageDialog(this,"Choisissez le bon à imprimer");
       }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"section 1"+ ex.getMessage());
        }  catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"section 2: "+ ex.getMessage());
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {   
           String bonSelect=table.getValueAt(table.getSelectedRow(),b.getColumnByName(table,"idbon")).toString();
           String val=b.getOneResult("select valide from entree where idbon="+bonSelect);        
        if(val.equalsIgnoreCase("1"))
         {
             JOptionPane.showMessageDialog(this," Ordre d\'entree deja validé,la supression impossible");
        }else{ 
            int reponse= JOptionPane.showConfirmDialog(this,"voulez-vous supprimer le bon "+bonSelect+"?","confirmation",JOptionPane.YES_NO_OPTION);
            if(reponse==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this,b.insUpdateDel("delete from bon where idbon="+bonSelect)+" suppression réussie");
                b.insUpdateDel("delete from detailbon where idbon="+bonSelect);
                b.insUpdateDel("delete from entree where idbon="+bonSelect);
            }
       } 
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,ex.getMessage());
        } catch(IndexOutOfBoundsException ex){
          JOptionPane.showMessageDialog(this,"Choisissez le Bon à modifier,SVP");
       }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        try {
            table.getTableHeader().setForeground(Color.BLACK);
            

             table.setModel(b.getDefaulTableModel("select bon.idbon,nbon as 'Bon de Commande',raisonsocial as Fournisseur,datebon as 'Date Bon de Cde' from bon,fournisseur where bon.idfournisseur=fournisseur.idfournisseur"));
             //b.resizeColumnWidth(table);
             table.getTableHeader().setFont(new Font("Times New Roman",Font.CENTER_BASELINE,14));
              table.getColumnModel().getColumn(0).setPreferredWidth(5);
              jScrollPane1.setViewportView(table);
              jScrollPane4.setViewportView(TableDetail);
              
         TableDetail.getColumn("Code").setPreferredWidth(100);
             
             
             TableDetail.getColumn("ligne").setMinWidth(0);
             TableDetail.getColumn("ligne").setPreferredWidth(0);
             TableDetail.getColumn("ligne").setMaxWidth(0);
          
             TableDetail.getColumn("Qte").setPreferredWidth(100); 
             TableDetail.getColumn("Pu").setPreferredWidth(100);
             TableDetail.getColumn("Montant").setPreferredWidth(200);
             TableDetail.getColumn("Designation").setPreferredWidth(300);
             
             table.getColumn("idbon").setPreferredWidth(80);
             table.getColumn("Bon de Commande").setPreferredWidth(150);
             table.getColumn("Date Bon de Cde").setPreferredWidth(100);
             table.getColumn("Fournisseur").setPreferredWidth(200);
             
        } catch (SQLException ex) {

        }    
    }//GEN-LAST:event_formWindowGainedFocus
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
            java.util.logging.Logger.getLogger(ValidationSorti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidationSorti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidationSorti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidationSorti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bon dialog = new Bon (new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TableDetail;
    private javax.swing.JButton btnModifier1;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblRechercher;
    public javax.swing.JTable table;
    private javax.swing.JTextField txtComptePrincipal;
    // End of variables declaration//GEN-END:variables
}
