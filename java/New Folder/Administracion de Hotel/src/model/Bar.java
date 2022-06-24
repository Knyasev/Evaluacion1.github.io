/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class Bar {
        private Integer numBebidasNoAlcoholicas;
        private Integer numBebidasAlcoholicas;
        
        
      
        private ServicioAdicional servicioAdd;
        private Hotel hotel;

    public Bar(Integer numBebidasNoAlcoholicas, Integer numBebidasAlcoholicas) {
        this.numBebidasNoAlcoholicas = numBebidasNoAlcoholicas;
        this.numBebidasAlcoholicas = numBebidasAlcoholicas;  
    }

    public Integer getNumBebidasNoAlcoholicas() {
        return numBebidasNoAlcoholicas;
    }

    public void setNumBebidasNoAlcoholicas(Integer numBebidasNoAlcoholicas) {
        this.numBebidasNoAlcoholicas = numBebidasNoAlcoholicas;
    }

    public Integer getNumBebidasAlcoholicas() {
        return numBebidasAlcoholicas;
    }

    public void setNumBebidasAlcoholicas(Integer numBebidasAlcoholicas) {
        this.numBebidasAlcoholicas = numBebidasAlcoholicas;
    }
    
    public ServicioAdicional getServicioAdd() {
        return servicioAdd;
    }

    @Override
    public String toString() {
        return "Bar{" + "numBebidasNoAlcoholicas=" + numBebidasNoAlcoholicas + ", numBebidasAlcoholicas=" + numBebidasAlcoholicas + '}';
    }

    

   

  
        
        
}
