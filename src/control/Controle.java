package control;

import bdd.BddInfo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OBAM
 */
public class Controle {
    public static boolean modification=false;
    public static  BddInfo bi;
    public static String utilisateur;
    
    public Controle(){
          bi=new BddInfo().getObjet();
      
    }
 /*   public static void miseEnforme(){
           Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
           this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }*/
}
