/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import entity.Fiche_suivi;
import service.Fiche_suiviCRUD;

/**
 *
 * @author marie
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //MyConnection mc = new MyConnection();//
        Fiche_suiviCRUD fcd = new Fiche_suiviCRUD();
       Fiche_suivi f = new Fiche_suivi(5,2,"IRM","prise de medicaments pour deux semaines");
        //fcd.ajouterFiche_suivi();
        fcd.ajouterFiche_suivi2(f);
        // System.out.println(fcd.afficherFiches_suivi());//
        //fcd.supprimer(13);
    }
    
}
