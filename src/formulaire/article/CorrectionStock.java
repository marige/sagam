/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire.article;

import comptamatiere.ARTICLE;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PRINCE
 */
public class CorrectionStock extends javax.swing.JDialog {

    /**
     * Creates new form CorrectionStock
     */
    public CorrectionStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.getContentPane().setBackground(Color.white);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablearticle = new javax.swing.JTable();
        Correctionlot = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Correctionstock = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablestock = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableBaseArticle = new javax.swing.JTable();
        Parcour = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Correction Stock");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Tablearticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tablearticle);

        Correctionlot.setText("Correction des Lots");
        Correctionlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrectionlotActionPerformed(evt);
            }
        });

        jLabel2.setText("Etape:1");

        jLabel3.setText("Etape:3");

        Correctionstock.setText("Correction des Stocks");
        Correctionstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrectionstockActionPerformed(evt);
            }
        });

        tablestock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablestock);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Cette fenetre permet de mettre à jour des stocks non justes. Pour le faire suivez les étapes en ordres");

        TableBaseArticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TableBaseArticle);

        Parcour.setText("parcour ");
        Parcour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcourActionPerformed(evt);
            }
        });

        jLabel5.setText("Etape:2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Parcour, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Correctionlot)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(Correctionstock))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correctionlot)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Parcour)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Correctionstock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-783)/2, (screenSize.height-605)/2, 783, 605);
    }// </editor-fold>//GEN-END:initComponents
ARTICLE art= new ARTICLE();
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            TableBaseArticle.setModel(art.getDefaulTableModel("select idARTICLE from article"));//selection de tous les article
          } catch (SQLException ex) {
            Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
        
        //Ce code en commentaire n est pas encore bon ceci prenant en compte  l inventaire 
       /* try {
            TableBaseArticle.setModel(art.getDefaulTableModel("select idARTICLE from article"));//selection de tous les article
             int nbrow=TableBaseArticle.getRowCount();
                int k=0;
                for( k=0;k<nbrow;k++){
                    String idarticle=TableBaseArticle.getValueAt(k,art.getColumnByName(TableBaseArticle, "idARTICLE")).toString();
                    String idin=art.getOneResult("select max(iddetailinventaire) from detailinventaire where detailinventaire.idarticle="+idarticle+"");//je prend le dernier inventaire de l article
                    ResultSet rs=art.getResultSet("SELECT detailinventaire.iddetailinventaire,DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and iddetailinventaire="+idin+"");
                    //str=rs.getString(1);
                  //  String dat=rs.getString(1);
                    if(rs.next()){// l article fais parti d un inventaire deja
                       // if(rs.next()) { 
                                 Date InvDeja=rs.getDate(2);
                          String req="select libarticle as Article,QTE as Aquit, SUM(QTE_SORTIE) as QteSortie,(QTE-SUM(QTE_SORTIE)) as QteRelle,(QTESTOCK) as StocktTHEORIQUE,detailbon.iddetailbon as ligne,detailsortie.type "+       
                             "from" +
                                 " article,detailbon,detailsortie,sortie,bon,entree"+
                                "where article.idarticle=detailbon.idarticle and detailbon.iddetailbon=detailsortie.iddetailbon and detailsortie.idsortie=sortie.idsortie" +
                                 " and sortie.valide=1 and type='BC' and detailbon.idbon=bon.idbon and bon.idbon=entree.idbon and DATEBORD >"+InvDeja+
                                " and DATESORTIE> "+InvDeja+" group by detailsortie.iddetailbon,detailsortie.type" +
                             " UNION (select libarticle,QTEREELLE,SUM(QTE_SORTIE),(QTEREELLE-SUM(QTE_SORTIE)),Qte_Res_StockInv,detailinventaire.iddetailinventaire,detailsortie.type "+
                                 " from article,detailsortie,sortie,detailinventaire,inventaire where article.idarticle=detailsortie.idarticle and detailsortie.idsortie=sortie.idsortie and sortie.valide=1 AND detailsortie.TYPE='Inv' and detailinventaire.idinventaire=inventaire.idinventaire"+
                                "and sortie.datesortie group by detailsortie.iddetailbon,detailsortie.type )"+
                                   " order by Article" ;
                                 Tablearticle.setModel(art.getDefaulTableModel(req));   
                    }
                    else{//l article n est pas dans l inventaire 
                        String req="select libarticle as Article,QTE as Aquit, SUM(QTE_SORTIE) as QteSortie,(QTE-SUM(QTE_SORTIE)) as QteRelle,(QTESTOCK) as StocktTHEORIQUE,detailbon.iddetailbon as ligne,detailsortie.type "+
                       
                             "from" +
                                 " article,detailbon,detailsortie,sortie where article.idarticle=detailbon.idarticle and detailbon.iddetailbon=detailsortie.iddetailbon and detailsortie.idsortie=sortie.idsortie" +
                                 " and valide=1 and type='BC' group by detailsortie.iddetailbon,detailsortie.type" +
                             " UNION (select libarticle,STOCKINIT,SUM(QTE_SORTIE),(STOCKINIT-SUM(QTE_SORTIE)),Qte_Res_StockInit,article.idarticle,detailsortie.type "+
                                 " from article,detailsortie,sortie where article.idarticle=detailsortie.idarticle and detailsortie.idsortie=sortie.idsortie and sortie.valide=1 AND detailsortie.TYPE='StkIni'group by detailsortie.iddetailbon,detailsortie.type )"+
                                   " order by Article" ;
                                 Tablearticle.setModel(art.getDefaulTableModel(req));    
                   }
                }
           
          

                   } catch (SQLException ex) {
            Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
        } //le code ci dessous fais mise a jour du stock sans prise en compte de l inventaire
        /* String req="select libarticle as Article,QTE as Aquit, SUM(QTE_SORTIE) as QteSortie,(QTE-SUM(QTE_SORTIE)) as QteRelle,(QTESTOCK) as StocktTHEORIQUE,detailbon.iddetailbon as ligne,detailsortie.type "+
                       
                             "from" +
                                 " article,detailbon,detailsortie,sortie where article.idarticle=detailbon.idarticle and detailbon.iddetailbon=detailsortie.iddetailbon and detailsortie.idsortie=sortie.idsortie" +
                                 " and valide=1 and type='BC' group by detailsortie.iddetailbon,detailsortie.type" +
                             " UNION (select libarticle,STOCKINIT,SUM(QTE_SORTIE),(STOCKINIT-SUM(QTE_SORTIE)),Qte_Res_StockInit,article.idarticle,detailsortie.type "+
                        
                                 " from article,detailsortie,sortie where article.idarticle=detailsortie.idarticle and detailsortie.idsortie=sortie.idsortie and sortie.valide=1 AND detailsortie.TYPE='StkIni'group by detailsortie.iddetailbon,detailsortie.type )"+
                                   " order by Article" ;
        try {    
            Tablearticle.setModel(art.getDefaulTableModel(req));
        } catch (SQLException ex) {
            Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void CorrectionlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrectionlotActionPerformed
        // TODO add your handling code here:
          int reponse= JOptionPane.showConfirmDialog(this,"voulez-vous Appliquez la Correction des lots?","confirmation",JOptionPane.YES_NO_OPTION);
        if(reponse==JOptionPane.YES_OPTION){
            try {
               
                String valeurDetail[]=new String[2];
                int nbrow=Tablearticle.getRowCount();
                int k=0;
                for( k=0;k<nbrow;k++){
                    if(Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "type")).toString().equalsIgnoreCase("BC")){
                     art.insUpdateDel("update detailbon set QTESTOCK="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString() +" where iddetailbon="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "ligne")).toString());//Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString()+"where iddetailbon="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "iddetailbon")).toString());
                    }else if(Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "type")).toString().equalsIgnoreCase("StkIni"))
                            {
                    art.insUpdateDel("update article set Qte_Res_StockInit="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString() +" where idarticle="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "ligne")).toString());//Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString()+"where iddetailbon="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "iddetailbon")).toString());
                    }else{
                    
                    art.insUpdateDel("update detailinventaire set Qte_Res_StockInv="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString() +" where iddetailinventaire="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "ligne")).toString());//Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString()+"where iddetailbon="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "iddetailbon")).toString());
                
                    }
                }
                JOptionPane.showMessageDialog(this,k +" Article Corrigé avec succes");
                Correctionlot.setEnabled(false);
                Correctionstock.setEnabled(true);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_CorrectionlotActionPerformed

    private void CorrectionstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrectionstockActionPerformed

          int nbrow=TableBaseArticle.getRowCount();
                int k=0;
             for( k=0;k<nbrow;k++){
                       String idarticle=TableBaseArticle.getValueAt(k,art.getColumnByName(TableBaseArticle, "idARTICLE")).toString();
                        ResultSet rs=null;
                             ResultSet rs2=null;
                          try {
                                    rs = art.getResultSet("SELECT detailinventaire.iddetailinventaire,qtereelle,DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and iddetailinventaire=( select max(iddetailinventaire) from detailinventaire where detailinventaire.idarticle="+idarticle+")");
                         } catch (SQLException ex) {
                           Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
                         }
                try {
                if(rs.next()) { //l article est dans l inventaire
                   Date InvDeja=rs.getDate(3);
                   // recuperation de sa quantite a l inventaire
                   int qteinventaire=rs.getInt(2);
                   
                   // recuperation de la somme des quantite achetes restants apres inventaire
                        rs.close();
                        String qt=art.getOneResult("select SUM(QTESTOCK) As quantite,article.idarticle as idart from detailbon,article,bon,entree where article.idarticle= "+ idarticle+ " and article.idarticle=detailbon.idarticle and detailbon.idbon=bon.idbon and bon.idbon=entree.idbon and DATEBORD >"+ InvDeja +" group by detailbon.idarticle ");
                       int qteachat=Integer.parseInt(qt);
                        // rs2=art.getResultSet("select SUM(QTESTOCK) As quantite,article.idarticle as idart from detailbon,article,bon,entree where article.idarticle= "+ idarticle+ " and article.idarticle=detailbon.idarticle and detailbon.idbon=bon.idbon and bon.idbon=entree.idbon and DATEBORD >"+ InvDeja +" group by detailbon.idarticle ");
                       //int qteachat=rs2.getInt(1) ;
                    art.insUpdateDel("update article set STOCKACTU="+ (qteinventaire+qteachat));                   
                   
                    }else{ //article pas dans l inventaire donc somme des qte achtes restant apres son stock intial
                     //somme des qte achtes restant apres son stock intial
                   int qteachat=Integer.parseInt(art.getOneResult("select libarticle,SUM(QTESTOCK) As quantite,article.idarticle as idart from detailbon,article where article.idarticle=detailbon.idarticle group by detailbon.idarticle "));
                   
                        art.insUpdateDel("update article set STOCKACTU=Qte_Res_StockInit + "+qteachat);                   
              
                       }
               
            
      
      //rs2.close();
      
      
      
      
      
      
      
      
      
      
      
      /* try { code anterieur fonctionnel
          // TODO add your handling code here:            
         /* //bon code 
          tablestock.setModel(art.getDefaulTableModel("select libarticle,SUM(QTESTOCK) As quantite,article.idarticle as idart from detailbon,article where article.idarticle=detailbon.idarticle group by detailbon.idarticle "));
           int nbrow=tablestock.getRowCount();
              int k=0;
              for( k=0;k<nbrow;k++){
                 
                  art.insUpdateDel("update article set STOCKACTU=Qte_Res_StockInit + "+tablestock.getValueAt(k,art.getColumnByName(tablestock, "quantite")).toString() +" where idarticle="+tablestock.getValueAt(k,art.getColumnByName(tablestock, "idart")).toString());//Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "QteRelle")).toString()+"where iddetailbon="+Tablearticle.getValueAt(k,art.getColumnByName(Tablearticle, "iddetailbon")).toString());                   
                 
                    }
              JOptionPane.showMessageDialog(this,k +" Stock mise à jour  avec succes");
      } catch (SQLException ex) {
          Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
      }*/   
            } catch (SQLException ex) {
                Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
    }//GEN-LAST:event_CorrectionstockActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Correctionstock.setEnabled(false);
        jLabel1.setBackground(Color.white);
        Correctionlot.setEnabled(false);
        TableBaseArticle.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void ParcourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcourActionPerformed
        // TODO add your handling code here:
         int nbrow=TableBaseArticle.getRowCount();
                int k=0;
         for( k=0;k<nbrow;k++){
                   String idarticle=TableBaseArticle.getValueAt(k,art.getColumnByName(TableBaseArticle, "idARTICLE")).toString();
                          try {
                art.updatestock(Tablearticle, idarticle);
                 } catch (SQLException ex) {
                Logger.getLogger(CorrectionStock.class.getName()).log(Level.SEVERE, null, ex);
                  }
                 
          }
          Correctionlot.setEnabled(true);           
    }//GEN-LAST:event_ParcourActionPerformed

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
            java.util.logging.Logger.getLogger(CorrectionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorrectionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorrectionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorrectionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CorrectionStock dialog = new CorrectionStock(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Correctionlot;
    private javax.swing.JButton Correctionstock;
    private javax.swing.JButton Parcour;
    private javax.swing.JTable TableBaseArticle;
    private javax.swing.JTable Tablearticle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablestock;
    // End of variables declaration//GEN-END:variables
}
