package bdd;

//jui
import com.toedter.calendar.JDateChooser;
import control.Controle;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;


public class ModelDb{
    
    String url = "jdbc:mysql://"+Controle.bi.getIp()+":"+Controle.bi.getPort()+"/"+Controle.bi.getBddName();   
    String user =Controle.bi.getUser();
    String pswd = Controle.bi.getPass();
    ResultSet rs=null;
    //pour pouvoir verifier controler la disponibilite de la connexion
    Connection cnt = null;     
    
    public ModelDb(){      
    }
    public String parseSqlString(String sql){
        return sql.replace("'","''");
    }
    //cette methode marche pour tout type de checkdoublon mais trop bien pour les injections
    //à utiliser quand pas besoin de injection
    public boolean checkDoublon(String query) throws SQLException{
        return this.getOneResult(query).equalsIgnoreCase("0")?false:true;
     }
    
     public boolean isExist(String table,String champ, String valeur) throws SQLException{
        Connection cn=getConnection();
        PreparedStatement ps = (PreparedStatement)cn.prepareStatement("select count(*) from "+table+" where "+ champ+"=?");
        ps.setString(1,valeur);        
         ResultSet rs=ps.executeQuery();
         rs.next();
         if(rs.getInt(1)==0)
             return false;
         cn.close();
         rs.close();
        return true;
         
     }
    
      public  Double Arrondi(float a) {
        double roundOff = Math.round(a * 100.0) / 100.0;
        return roundOff;
    } 
      
    public boolean isInteger(String str){     
          try  
          {  
            double d = Double.parseDouble(str);  
          }  
          catch(NumberFormatException nfe)  
          {  
            return false;  
          }  
          return true;  
        }
    
    public String formatageMontant(Object montant){
         NumberFormat nf=NumberFormat.getInstance(Locale.FRENCH);
         if(montant instanceof Integer||montant instanceof String)
            return nf.format(Integer.parseInt(montant.toString()));
         else if(montant instanceof Double|| montant instanceof Float||montant instanceof Long)
           return nf.format(Double.parseDouble(montant.toString()));
         else
             return "";           
    }
    public String parseMontantFomatToString(String montantString) throws ParseException{
         NumberFormat nf=NumberFormat.getInstance(Locale.FRENCH);       
         return nf.parse(montantString).toString();
    }
    
    public void viderJtable(JTable jt){
       ((DefaultTableModel) jt.getModel()).setRowCount(0);
    }
    public int getQteSortiNonValide(int idArticle) throws SQLException{
    return Integer.parseInt("0"+this.getOneResult("select qte_sortie from detailsortie where idarticle="+idArticle+" and idsortie in (select idsortie from sortie where valide=0)"));
    }
    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
  }
    
    
    public int getColumnByName(JTable table, String name) {
    for (int i = 0; i < table.getColumnCount(); ++i)
        if (table.getColumnName(i).equalsIgnoreCase(name))
            return i;
    return -1;
}
    public int getRowByCode(JTable table,int indexColonne,int cod){
        for(int j=0; j<table.getRowCount();j++)  
            if((Integer.parseInt(table.getValueAt(j,indexColonne).toString()))==cod)
                return j;
        return 0;
    }
 
  public String getTabValSel(JTable table, String fieldName) {
    for (int i = 0; i < table.getColumnCount(); ++i)
        if (table.getColumnName(i).equalsIgnoreCase(fieldName))
            return table.getValueAt(table.getSelectedRow(), i).toString();
    return null;
}
    
    public void setAfficherDate(JDateChooser jDt,String dt) throws ParseException{
        if(!dt.isEmpty()&&dt!=null)
        jDt.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(dt));
        
    }
    /*public String getDateChoisie(JDateChooser dt){
        return String.format("%1$ty-%1$tm-%1$td",dt.getDate());   
    }*/
     public String getDateChoisie(JDateChooser dt){
         SimpleDateFormat df= new SimpleDateFormat("yyyy/MM/dd");
         return dt.getDate()!=null?df.format(dt.getDate()):null;
    }
    public  int Insertion(String champ,String valeur[]) throws SQLException{
           int j=0;   
              String pointInterro ="?";
               int tabLon=valeur.length;
               int i=1;
             //fabrication des points d'interrogation
             while(i<tabLon)
             {
                 pointInterro+=",?";   
                 i++;
             }          
             Connection cn=getConnection();
             PreparedStatement ps= (PreparedStatement)cn.prepareStatement("INSERT INTO "+champ+"VALUES("+pointInterro+")");
               //fabrication des set.
             i=0;
              while(i<tabLon)
             {  
                 //i+1 pour gerer l'index du tableau et la position du champ
                 ps.setString(i+1, valeur[i]);
                   i++;          
             };
             j= ps.executeUpdate();
            // ps.close();
             cn.close();
        return j;
      }

     public int updateTable(String table,String champ[],String valeur[],String clause)throws SQLException{
     
       String clausePart="";
      int i=champ.length;
        while(i>=1){
           if(i==1)
               clausePart+=champ[0]+"=?";
           else
           clausePart+=champ[i-1]+"=?,";
           i--;
        }        
        Connection cn=getConnection();
        PreparedStatement ps = (PreparedStatement)cn.prepareStatement("UPDATE "+table+" SET "+clausePart+" "+ clause);
        
        i=valeur.length;
        int j=0;
         while(i>0)
             {  
                 //i+1 pour gerer l'index du tableau et la position du champ
                 ps.setString(i, valeur[j]);
                  i--; 
                  j++;
             };
         int k=ps.executeUpdate();
            cn.close();
        return k ;
            // return clausePart;
    }
     
     private  DefaultTableModel dataModel;
 
  public void setRemplirJtable(JTable table,String sql) throws SQLException{
      getDefaulTableModel(sql);
      table.setModel(dataModel);
  }
  public DefaultTableModel getDefaulTableModel(String req)
                       throws SQLException{
    dataModel = new DefaultTableModel(){
        @Override
          public boolean isCellEditable(int row,int col){
              return false;
          }             
      } ;
    try {
      //create an array of column names
      com.mysql.jdbc.Statement stm=(com.mysql.jdbc.Statement)getConnection().createStatement();
      rs=stm.executeQuery(req);
      ResultSetMetaData mdata = rs.getMetaData();
      int colCount = mdata.getColumnCount();
      String[] colNames = new String[colCount];
      for (int i = 1; i <= colCount; i++) {
        colNames[i - 1] = mdata.getColumnLabel(i);
      }
      dataModel.setColumnIdentifiers(colNames);
 
      //now populate the data
      while (rs.next()) {
        String[] rowData = new String[colCount];
        for (int i = 1; i <= colCount; i++) {
          rowData[i - 1] = rs.getString(i);
           //class<?>col_class=
        }
        dataModel.addRow(rowData);
      }
    }
    finally{
      try {
        rs.close();
      }
      catch (SQLException ignore) {
      }
    }

    return dataModel;
  }
 
  
  
  public ArrayList getComboELement(String req,JComboBox cmb) throws SQLException
  {
   ArrayList al = new ArrayList();
   DefaultComboBoxModel element=new DefaultComboBoxModel();
    Statement stm=(Statement)getConnection().createStatement();
    rs=stm.executeQuery(req);
    String[] tab=null;
  //  int i=0;
    //regler le cas ou les resultats de requete sont null
    if(rs.next()){
        element.addElement(rs.getString(2));
        al.add(rs.getString(1));
    while(rs.next()){
        element.addElement(rs.getString(2));
        al.add(rs.getString(1));
       // i++;      
    }
    }
    else{
       element.addElement("");
       al.add("");
    }
    rs.close();
    cmb.setModel(element);
    //cmb.setSelectedItem(null);
        return al;
  }
  
  
  
     
   public int insUpdateDel(String sql) throws SQLException
    {
        int nb=0;
        try{
        com.mysql.jdbc.Statement stm=null;
        stm =(com.mysql.jdbc.Statement) getConnection().createStatement();
         nb= stm.executeUpdate(sql);
        }catch(Exception ex){
        }  
        return nb;
    }
   
   public ResultSet getResultSet(String sql) throws SQLException{
        Statement stm= (Statement) getConnection().createStatement();
        return stm.executeQuery(sql);     
   }
    
  /* public String getOneResult(String requete) throws SQLException{
        Statement stm= (Statement) getConnection().createStatement();
        ResultSet rs=stm.executeQuery(requete);
        rs.next();
        String str=rs.getString(1);
        rs.close();
        return str;
}*/
   public String getOneResult(String requete) throws SQLException{
       String str="";
       Statement stm= (Statement) getConnection().createStatement();
        ResultSet rs=stm.executeQuery(requete);
        if(rs.next())
        str=rs.getString(1);
        rs.close();
        return str;
}
    public Connection getConnection() throws SQLException{   
             //if(cnt==null){
                 com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
                 DriverManager.registerDriver(driver);
                 cnt = DriverManager.getConnection(url,user,pswd);
             //}
             return cnt;
    }
    
    
    public void enregistrerProcedure(String NomProcedure){
         Connection conn = null;
        int nbrow = 0;
         try {
            com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(url,user,pswd);
            CallableStatement cStmt = conn.prepareCall("{call enregistrer_ouvrage(?,?,?,?)}");
             String titre = null,auteur = null;
             int reference = 0,quantite = 0;
            cStmt.setString(2, titre);
            cStmt.setString(3, auteur);
            cStmt.setInt(1, reference);
            cStmt.setInt(4,quantite);
            nbrow =cStmt.executeUpdate();
            System.out.println(nbrow+" ouvrage ajoute");
             
         } catch (SQLException ex) {
          System.err.println(ex.getMessage());
         }
         finally{
            try {
                conn.close();
            } catch (SQLException ex) {
             
            }
         }
    }
    
     public  void savePreparedQ() throws SQLException{
             //requete preparé ou paramétré
           String nom=null,prenom=null,email=null,phone=null,dateNaissance=null;
             PreparedStatement ps= (PreparedStatement)getConnection().prepareStatement("INSERT INTO ENSEIGNANT (nom, prenom, email, phone,dateNais) VALUES(?,?,?,?,?)");
             ps.setString(1, nom);
             ps.setString(2,prenom);
             ps.setString(3, email);           
             ps.setString(4, phone);
             ps.setString(5, dateNaissance);
             ps.executeUpdate();        
     }
     
     
  // essaie methode pour calculer entre les enregistrements du livrejournal
    public DefaultTableModel getDefaulTableModelSpecial(String req)
                       throws SQLException{
    dataModel = new DefaultTableModel(); 
    try {
      //create an abarray of column names
      com.mysql.jdbc.Statement stm=(com.mysql.jdbc.Statement)getConnection().createStatement();
      rs=stm.executeQuery(req);
      ResultSetMetaData mdata = rs.getMetaData();
      int colCount = mdata.getColumnCount();
      String[] colNames = new String[colCount];
      for (int i = 1; i <= colCount; i++) {
        colNames[i - 1] = mdata.getColumnLabel(i);
      }
      dataModel.setColumnIdentifiers(colNames);
 
      //now populate the data
      int QtePrecedent=0;
      while (rs.next()) {
        String[] rowData = new String[colCount];
        for (int i = 1; i <= colCount; i++) {
            if(i==16){
                switch(rs.getString("source")){
                   case  "Stockinitial":
                         QtePrecedent= rs.getInt(i);
                         rowData[i - 1] =formatageMontant(rs.getString(i));
                       break;
                    case  "Inventaire":
                         QtePrecedent= rs.getInt(i);
                         rowData[i - 1] =formatageMontant(rs.getString(i));
                       break;
                    default:
                       QtePrecedent= QtePrecedent+rs.getInt("qteEntree") - rs.getInt("qteSortie");
                       rowData[i - 1] =Integer.toString(QtePrecedent);  
                
                   }
                    if ( rs.getString("idbonEntree")==null){
                         rowData[i - 10] =null;
                    }else{
                        rowData[i - 5] =null;
                    }
                  
             }else if(i==18){
                 Double Mont=0.00;
                 Mont= QtePrecedent* rs.getDouble("pustock");
            //   rowData[i - 1] = Double.toString(Mont);
                 rowData[i - 1] =formatageMontant(Mont.longValue());
                 rowData[i - 2]=formatageMontant(rs.getLong("pustock"));
                 rowData[13]=formatageMontant(rs.getLong(14));
                 rowData[12]=formatageMontant(rs.getLong(13));
                 rowData[8]=formatageMontant(rs.getLong(9));
                 rowData[7]=formatageMontant(rs.getLong(8));
                 
             }//else if(i==14)
             
            else{
            rowData[i - 1] = rs.getString(i);
            }
          
        }
        dataModel.addRow(rowData);
      }
    }
    finally{
      try {
        rs.close();
      }
      catch (SQLException ignore) {
      }
    }
    return dataModel;
  }
     
  public DefaultTableModel getTableInventaire(String req)
                       throws SQLException{
    dataModel = new DefaultTableModel(){
                     
      } ;
    try {
      //create an array of column names
      com.mysql.jdbc.Statement stm=(com.mysql.jdbc.Statement)getConnection().createStatement();
      rs=stm.executeQuery(req);
      ResultSetMetaData mdata = rs.getMetaData();
      int colCount = mdata.getColumnCount();
      String[] colNames = new String[colCount];
      for (int i = 1; i <= colCount; i++) {
        colNames[i - 1] = mdata.getColumnLabel(i);
      }
      dataModel.setColumnIdentifiers(colNames);
 
      //now populate the data
      while (rs.next()) {
        String[] rowData = new String[colCount];
        for (int i = 1; i <= colCount; i++) {
          rowData[i - 1] = rs.getString(i);
           //class<?>col_class=
        }
        dataModel.addRow(rowData);
      }
    }
    finally{
      try {
        rs.close();
      }
      catch (SQLException ignore) {
      }
    }

    return dataModel;
  }     
     
     
}
