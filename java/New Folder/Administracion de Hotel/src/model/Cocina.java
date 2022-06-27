/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class Cocina {
    private String tamanio;
    private Boolean poseeHorno;
    

        private Hotel hotel;
        
        


    public Cocina(String tamanio, Boolean poseeHorno) {
        this.tamanio = tamanio;
        this.poseeHorno = poseeHorno;
    }

    @Override
    public String toString() {
        return "Cocina{" + "tamanio=" + tamanio + ", poseeHorno=" + poseeHorno + '}';
    }
        
        
}
