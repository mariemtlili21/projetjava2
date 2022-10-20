/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Bilan;
import entity.Fiche_suivi;
import java.sql.Timestamp;
import java.util.List;
import service.BilanCRUD;
import service.Fiche_suiviCRUD;
import utils.Mail;
import utils.MyConnection;

/**
 *
 * @author marie
 */
public class MainClass { 
    public static Timestamp createdate(int y,int m,int j) {
         
        Timestamp date2 = new Timestamp(y - 1900, m - 1, j, 4, 0, 0, 0);
      
        return date2;
    }
    public static void main(String[] args) {
        //MyConnection mc = new MyConnection();
        Fiche_suiviCRUD fcd = new Fiche_suiviCRUD();
       Fiche_suivi f = new Fiche_suivi(2,4,"Analyse sanguine","effectuer un bilan SANGUIN global");
        BilanCRUD bcd = new BilanCRUD();
        Bilan b = new Bilan("SCANNER",createdate(2020,10,10),"hérnie discale ");
        //bcd.ajouterBilan(b);
        //bcd.supprimerbilan(5);
        //bcd.modifierBilan(b,5);
        //System.out.println(bcd.afficherBilan());
        //List list = bcd.FindBilanById(2);
        List list1 = bcd.FindBilanByType("IRM");
        System.out.println(list1);
        //System.out.println(list);
        //fcd.ajouterFiche_suivi();
        //fcd.ajouterFiche_suivi2(f);
        //f.ajouterFiche_suivi1(fcd);
         //System.out.println(fcd.afficherFiches_suivi());
        //fcd.supprimer(32);
        //fcd.modifierFiche_suivi(f,32);
        //List list =  fcd.FindById(8);
        //System.out.println(list);
        //Mail send = new Mail();
        //send.mail("cat","test","takwa.lassoued@esprit.tn");
            
    }
    
}
