/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comptamatiere;

import bdd.ModelDb;


public class INSTITUTION extends ModelDb implements PRINCIPAL {
   public int modificationUpdateInstitution(){
    return 0;
   }
    @Override
    public int insertion() {
        throw new UnsupportedOperationException("Not supported yet.");
        //developper la methode insertion
    }

    @Override
    public int modification(int clePrimaire) {
        throw new UnsupportedOperationException("Not supported yet.");
        //implementer la methode de mofication
    }
   
}
