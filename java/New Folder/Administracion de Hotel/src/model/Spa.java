/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class Spa {
     private Boolean Vapor ;
     private Boolean masajes ;

    public Spa(Boolean Vapor, Boolean masajes) {
        this.Vapor = Vapor;
        this.masajes = masajes;
    }

     
    
    
    private ServicioAdicional servicioAdicional;

   
    public Spa() {
        servicioAdicional = new ServicioAdicional();
    }

    public Boolean getVapor() {
        return Vapor;
    }

    public void setVapor(Boolean Vapor) {
        this.Vapor = Vapor;
    }

    public Boolean getMasajes() {
        return masajes;
    }

    public void setMasajes(Boolean masajes) {
        this.masajes = masajes;
    }

    public ServicioAdicional getServicioAdicional() {
        return servicioAdicional;
    }

    public void setServicioAdicional(ServicioAdicional servicioAdicional) {
        this.servicioAdicional = servicioAdicional;
    }

    @Override
    public String toString() {
        return "Spa{" + "Vapor=" + Vapor + ", masajes=" + masajes + '}';
    }

    
    
     

}
