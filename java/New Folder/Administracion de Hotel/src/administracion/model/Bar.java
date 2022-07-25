/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Gonzalez G
 */
public class Bar {
        private Integer numBebidasNoAlcoholicas;
        private Integer numBebidasAlcoholicas;
        private float precioBar=4.00f;
        
      
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

    public float getPrecioBar() {
        return precioBar;
    }

    public void setPrecioBar(float precioBar) {
        this.precioBar = precioBar;
    }

    @Override
    public String toString() {
        return "Bar{" + "numBebidasNoAlcoholicas=" + numBebidasNoAlcoholicas + ", numBebidasAlcoholicas=" + numBebidasAlcoholicas + ", precioBar=" + precioBar + '}';
    }
    

   

    

   

  
        
        
}
