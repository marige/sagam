
package formulaire.Immobilisation;



public class gestionImmo extends javax.swing.JFrame {


    public gestionImmo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntree20 = new javax.swing.JButton();
        btnEntree21 = new javax.swing.JButton();
        btnEntree24 = new javax.swing.JButton();
        btnEntree25 = new javax.swing.JButton();
        btnEntree27 = new javax.swing.JButton();
        btnEntree28 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEntree22 = new javax.swing.JButton();

        btnEntree20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree20.setText("Validation");
        btnEntree20.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree20.setContentAreaFilled(false);
        btnEntree20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree20ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion des Immobilisations");
        setBackground(new java.awt.Color(255, 255, 255));

        btnEntree21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree21.setText("Materiel En Service");
        btnEntree21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree21.setContentAreaFilled(false);
        btnEntree21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree21ActionPerformed(evt);
            }
        });

        btnEntree24.setBackground(new java.awt.Color(0, 102, 255));
        btnEntree24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree24.setText("Materriel en Reforme");
        btnEntree24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree24.setContentAreaFilled(false);
        btnEntree24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree24ActionPerformed(evt);
            }
        });

        btnEntree25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree25.setText("Tabl Ammort");
        btnEntree25.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree25.setContentAreaFilled(false);
        btnEntree25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree25ActionPerformed(evt);
            }
        });

        btnEntree27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree27.setText("Sommier Terrain");
        btnEntree27.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree27.setContentAreaFilled(false);
        btnEntree27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree27ActionPerformed(evt);
            }
        });

        btnEntree28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree28.setText("Sommier Batiment");
        btnEntree28.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree28.setContentAreaFilled(false);
        btnEntree28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree28ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion d immobilisation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEntree22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/val.png"))); // NOI18N
        btnEntree22.setText("Affectation aux utilisateurs");
        btnEntree22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree22.setContentAreaFilled(false);
        btnEntree22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntree21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntree22, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(btnEntree27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntree25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntree24, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(btnEntree28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntree21)
                    .addComponent(btnEntree24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntree22, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntree27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntree25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEntree28, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-821)/2, (screenSize.height-424)/2, 821, 424);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnEntree20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree20ActionPerformed

    }//GEN-LAST:event_btnEntree20ActionPerformed

    private void btnEntree21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree21ActionPerformed
     MaterielEnservice m= new MaterielEnservice(this,true);
     m.setVisible(true);

    }//GEN-LAST:event_btnEntree21ActionPerformed

    private void btnEntree24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree24ActionPerformed

    private void btnEntree25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree25ActionPerformed

    private void btnEntree27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree27ActionPerformed

    private void btnEntree28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntree28ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        gestionImmo immo = new gestionImmo();
        immo.setUndecorated(true);
    }//GEN-LAST:event_jPanel1ComponentShown

    private void btnEntree22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree22ActionPerformed
     //  Nouveau n = new Nouveau();
      // n.setVisible(true);
    }//GEN-LAST:event_btnEntree22ActionPerformed

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
            java.util.logging.Logger.getLogger(gestionImmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionImmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionImmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionImmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionImmo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntree20;
    private javax.swing.JButton btnEntree21;
    private javax.swing.JButton btnEntree22;
    private javax.swing.JButton btnEntree24;
    private javax.swing.JButton btnEntree25;
    private javax.swing.JButton btnEntree27;
    private javax.swing.JButton btnEntree28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
