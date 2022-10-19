/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author marie
 */
public class Medecin {
    
    private int id_med  ;

    public Medecin() {
    }

    public Medecin(int id_med) {
        this.id_med = id_med;
    }

    public int getId_med() {
        return id_med;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    @Override
    public String toString() {
        return "Medecin{" + "id_med=" + id_med + '}';
    }
    
}

