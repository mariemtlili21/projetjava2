/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Fiche_suivi;
import entity.Patient;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import utils.MyConnection;

/**
 *
 * @author marie
 */
public class Fiche_suiviCRUD {
    
    /*public void ajouterFiche_suivi(){ajouterFiche_suivi
        try {
            String requete = "INSERT INTO fiche_suivi(id_client,bilan_id,diagnostic,consigne_medicale) VALUES (17,5,'une échographie du cœur','un rendez_vous de controle aprés deux semaines')";
            Statement st = new MyConnection().getcnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Fiche_suivi ajoutée avec succés");
                    
                    
                    } catch (SQLException ex) {
                        System.err.println(ex.getMessage());
                        
        }
    
    
    }*/
    
    public void ajouterFiche_suivi2(Fiche_suivi f ){
        try {
            String requete2 = "INSERT INTO fiche_suivi(id_client,bilan_id,diagnostic,consigne_medicale) VALUES(?,?,?,?)";
            PreparedStatement fst = new MyConnection().getcnx().prepareStatement(requete2);
            
            fst.setInt(1,f.getId_client());
            fst.setInt(2,f.getBilan_id());
            fst.setString(3,f.getDiagnostic());
            fst.setString(4,f.getConsigne_medicale());
            fst.executeUpdate();
            System.out.println("La Fiche_suivi est ajoutée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
             
        }
           
    }
    
   /* public void ajouterFiche_suivi1(Fiche_suivi fcd){
       
        String requete="INSERT INTO `fiche_suivi`(`id_client`,`bilan_id`,`diagnostic`,`consigne_medicale`)"
                +"values ('" + fcd.getId_client()+ "','"+ fcd.getBilan_id()+"','"+ fcd.getDiagnostic()+"','"+ fcd.getConsigne_medicale()+"')";
        try {
           
            Statement st= new MyConnection().getcnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Fiche_suivi ajoutée avec succées!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }*/
    
    
    
     /*public List<Fiche_suivi> afficherFiches_suivi(){
         List<Fiche_suivi> mylist = new ArrayList<>();
         
        try {
            String requete3 = "SELECT `id_fiche `,`diagnostic`,`consigne_medicale`,`Nom_patient`,`Prénom_patient`,`Email_patient`,`Adress_patient`,`NumTel_patient`,`Age_patient` FROM `fiche_suivi` join `patient` ON fiche_suivi.id_client=patient.Id_patient" where id_med = "+CurrentData.current_user_id" ;
            
            Statement st = new MyConnection().getcnx().createStatement(); 
            ResultSet rs = st.executeQuery(requete3);
            while(rs.next()){
                
                Fiche_suivi f =  new Fiche_suivi();
                Patient pat = new Patient();
                
                f.setId_fiche(rs.getInt(1));
                f.setId_client(rs.getInt(2));
                f.setDiagnostic(rs.getString("diagnostic"));
                f.setConsigne_medicale(rs.getString("consigne_medicale"));
                 f.setId_med(CurrentData.current_user_id);
                
                pat.setNom_patient(rs.getString("Nom_patient"));
                pat.setPrénom_patient(rs.getString("Prénom_patient"));
                pat.setEmail_patient(rs.getString("Email_patient"));
                pat.setAdress_patient(rs.getString("Adress_patient"));
                pat.setNumTel_patient(rs.getInt(6));
                pat.setAge_patient(rs.getInt(7));
                
                f.setPatient (pat);
                      
            }          
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        return mylist;
     }
     */
     
     public void supprimer(int id) {
        String requete4 = "DELETE FROM `fiche_suivi`  WHERE id_fiche= '" + id + "'";

        try {
            Statement st = new MyConnection().getcnx().createStatement();
            st.executeUpdate(requete4);
                 System.out.println("fiche_suivi est supprimée avec succés");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 
        
    }
    
    private ResultSet rs;
    
    public List<Fiche_suivi> FindAll() {
    List<Fiche_suivi> list =new ArrayList<>();
     String requete4 = "SELECT * From `fiche_suivi`";
         try {
            Statement st = new MyConnection().getcnx().createStatement();
            rs =st.executeQuery(requete4);
            while(rs.next()){ 
            Fiche_suivi f = new Fiche_suivi(rs.getInt(1),rs.getInt(2), rs.getString(3),rs.getString(4));
            list.add(f);                
            }
                 System.out.println("Fiche_suivi supprimée avec succés");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 return list;
    
    }
    
 public void modifierFiche_suivi(Fiche_suivi fcd ,int id)
 {
       String requete4 = "UPDATE `fiche_suivi` SET `diagnostic`='" + fcd.getDiagnostic() + "'," + "`consigne_medicale`='" + fcd.getConsigne_medicale() +  "' WHERE   id_fiche = '" + id + "'  ";
        try {
             
            PreparedStatement fst = new MyConnection().getcnx().prepareStatement(requete4);
            fst.executeUpdate(requete4);
            System.out.println("Fiche_suivi modifiée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } 
       
   }
 
 public List FindById(int id) {
        List<Fiche_suivi> list = new ArrayList<>();
        String requette5 = "SELECT  `id_fiche `, `id_client `, `bilan_id`, `diagnostic`, `consigne_medicale` From `fiche_suivi` WHERE id_fiche= '" + id + "' ";

        try {
            Statement st = new MyConnection().getcnx().createStatement();
            rs = st.executeQuery(requette5);
            while (rs.next()) {
                Fiche_suivi f = new Fiche_suivi(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                list.add(f);
            }
            System.out.println("Fiche_suivi trouvée avec succées !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }  
}
 
        
    
    


