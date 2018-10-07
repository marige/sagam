
package comptamatiere;

import bdd.ModelDb;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JTable;


public class AMORTISSEMENT extends ModelDb{
   public void calculAmort(JTable table){

   }
   
   public String getTaux(String duree,String moi){
      //  return this.Arrondi((1/Integer.parseInt(duree))*100,2);   
      return String.format("%.2f", 100/(Float.valueOf(duree)+Float.valueOf(moi)/12));     
   }
   SimpleDateFormat df= new SimpleDateFormat("yyyy/MM/dd");
   
   public double getDotationPremier(double dotationAnnuel,JDateChooser dateMs,int anneMs) throws ParseException{  
      long diff = df.parse(anneMs+"/12/31").getTime() -  df.parse(this.getDateChoisie(dateMs)).getTime();
      long nbJour= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
     // return (int) nbJour;
      return nbJour*dotationAnnuel/365;  
   }
   
    public double getDotationFin(double dotation,Date dateFin,int anneFin,int nbAnne) throws ParseException{  
      long diff = dateFin.getTime()-df.parse(anneFin+"/01/01").getTime();
      long nbJour= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
     // return (int) nbJour;
      return nbJour*dotation/365;  
   }
    
   public Date addYear(Date dateMs,int nbanne) throws ParseException{
        Calendar cal = Calendar.getInstance();
       // Date f=df.parse(this.getDateChoisie(dateMs));       
        cal.setTime(dateMs);
        cal.add(Calendar.YEAR, nbanne); // Where n is int
        return cal.getTime();     
   }
   
   public Date getDateFin(JDateChooser dateMs,int nbMonth,int nbanne) throws ParseException{
        Calendar cal = Calendar.getInstance();
        Date f=df.parse(this.getDateChoisie(dateMs));       
        cal.setTime(f);
        cal.add(Calendar.MONTH, nbMonth); // Where n is int
        cal.add(Calendar.YEAR, nbanne); // Where n is int
        return cal.getTime();
   }
   
   public double arrondi2(double nombre){
       double d = (double) Math.round(nombre * 100) / 100; 
       return d;
   }
   
   public String getTempDebut(JDateChooser dateMs) throws ParseException{
       Date date=df.parse(getDateChoisie(dateMs));
       Calendar cal = Calendar.getInstance();
       cal.setTime(date);
       int moi=11-cal.get(Calendar.MONTH);
              // 11-Integer.parseInt(date.substring(5,7));
       int jour=cal.getActualMaximum(Calendar.DAY_OF_MONTH)-cal.get(Calendar.DAY_OF_MONTH);
       String str;
       if (moi==0)
           str=jour+" jour";
       else if(jour==0)
           str=moi+" mois";
       else
           str=moi+" mois et "+jour+" jour"; 
       return str;
   }
   
     public String getTempFin(Date dateFin){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFin);
        int month = cal.get(Calendar.MONTH);
          int day=cal.get(Calendar.DAY_OF_MONTH);
       String str;
       if (month==0)
           str=day+" jour";
       else if(day==0)
            str=month+" mois";
       else
           str=month+" mois et "+day+" jour";   
          return str;
   }
   public String getValeurBienN(int dureeVie,int dureeActu,float montantacqui){
     //calcul en considerant le taux journalier
    return String.format("%.0f",montantacqui-Float.valueOf(dureeActu)*montantacqui/(dureeVie*365));
   // return String.format("%.0f",montantacqui-Float.valueOf(dureeActu/365)*montantacqui* Float.valueOf(getTauxA(String.valueOf(dureeVie),"0")));
   }
   public int getNombreJour(Date d1,Date d2){
     long diff = d2.getTime()-d1.getTime();
     long nbJour= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
     return (int)nbJour;
   }
   public int getYearDate(Date dt){
    Calendar cal = Calendar.getInstance();
    cal.setTime(dt);
   return cal.get(Calendar.YEAR);
   /* int month = cal.get(Calendar.MONTH);
    int day = cal.get(Calendar.DAY_OF_MONTH);*/
   }
  
   
   
}
