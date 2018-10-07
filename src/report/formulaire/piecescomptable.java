
package report.formulaire;

import comptamatiere.REPORT;
import javax.swing.JOptionPane;

/**
 *
 * @author ADEBO
 */
public class piecescomptable extends javax.swing.JFrame {
 REPORT e = new REPORT();
    public piecescomptable() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntree8 = new javax.swing.JButton();
        btnEntree9 = new javax.swing.JButton();
        btnEntree10 = new javax.swing.JButton();
        btnEntree11 = new javax.swing.JButton();
        btnEntree12 = new javax.swing.JButton();
        btnEntree13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEntree8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree8.setText("Compte de Gestion");
        btnEntree8.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree8.setContentAreaFilled(false);
        btnEntree8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree8MouseEntered(evt);
            }
        });
        btnEntree8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree8ActionPerformed(evt);
            }
        });

        btnEntree9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree9.setText("Facturier");
        btnEntree9.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree9.setContentAreaFilled(false);
        btnEntree9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree9MouseEntered(evt);
            }
        });
        btnEntree9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree9ActionPerformed(evt);
            }
        });

        btnEntree10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree10.setText("Livre Journal");
        btnEntree10.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree10.setContentAreaFilled(false);
        btnEntree10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree10MouseEntered(evt);
            }
        });
        btnEntree10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree10ActionPerformed(evt);
            }
        });

        btnEntree11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree11.setText("Fiche De Stock");
        btnEntree11.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree11.setContentAreaFilled(false);
        btnEntree11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree11MouseEntered(evt);
            }
        });
        btnEntree11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree11ActionPerformed(evt);
            }
        });

        btnEntree12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree12.setText("Ordres de Sorties");
        btnEntree12.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree12.setContentAreaFilled(false);
        btnEntree12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree12MouseEntered(evt);
            }
        });
        btnEntree12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree12ActionPerformed(evt);
            }
        });

        btnEntree13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree13.setText("Ordres Entrees");
        btnEntree13.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree13.setContentAreaFilled(false);
        btnEntree13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree13MouseEntered(evt);
            }
        });
        btnEntree13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntree13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEntree10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntree11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntree8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntree12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntree9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntree11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntree9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntree10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntree8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntree13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntree12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-526)/2, (screenSize.height-307)/2, 526, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntree8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree8MouseEntered

    private void btnEntree8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree8ActionPerformed

    private void btnEntree9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree9MouseEntered
    
    private void btnEntree9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree9ActionPerformed
      String req="SELECT * FROM entree,bon,fournisseur where entree.idbon=bon.idbon and bon.idfournisseur=fournisseur.idfournisseur";
        try{
           e.editionReport("facturier", req, e.getInstitutionMap());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree9ActionPerformed

    private void btnEntree10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree10MouseEntered

    private void btnEntree10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree10ActionPerformed
       String req="SELECT idoperation, dateoperation,article.libarticle,idbonEntree, qteEntree, natureuniteEntree, idbonsortie, qteSortie, natureuniteSortie,"
               + " pusortie, observation, puentree, pustock, qtestock,numeroCompte FROM livrejournal,article,categorie where livrejournal.idarticle=article.idarticle and article.idcategorie=categorie.idcategorie order by idoperation";
        try{
           e.editionReport("livrejournal", req, e.getInstitutionMap());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_btnEntree10ActionPerformed

    private void btnEntree11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree11MouseEntered

    private void btnEntree11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree11ActionPerformed

    private void btnEntree12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree12MouseEntered

    private void btnEntree12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree12ActionPerformed

    private void btnEntree13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree13MouseEntered

    private void btnEntree13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree13ActionPerformed

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
            java.util.logging.Logger.getLogger(piecescomptable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piecescomptable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piecescomptable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piecescomptable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piecescomptable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntree10;
    private javax.swing.JButton btnEntree11;
    private javax.swing.JButton btnEntree12;
    private javax.swing.JButton btnEntree13;
    private javax.swing.JButton btnEntree8;
    private javax.swing.JButton btnEntree9;
    // End of variables declaration//GEN-END:variables
}
