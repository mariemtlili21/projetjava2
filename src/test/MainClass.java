/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Fiche_suivi;
import service.Fiche_suiviCRUD;
import utils.MyConnection;

/**
 *
 * @author marie
 */
public class MainClass { 
    public static void main(String[] args) {
        //MyConnection mc = new MyConnection();
        Fiche_suiviCRUD fcd = new Fiche_suiviCRUD();
       Fiche_suivi f = new Fiche_suivi(1,1,"ANALYSE","prise de medicaments pour 3 semaines");
        //fcd.ajouterFiche_suivi();
        //fcd.ajouterFiche_suivi2(f);
        //f.ajouterFiche_suivi1(fcd);
        // System.out.println(fcd.afficherFiches_suivi());//
        //fcd.supprimer(25);
        //fcd.modifierFiche_suivi(f,26);
        
        
        
        
        
        
        
    }
    
}
