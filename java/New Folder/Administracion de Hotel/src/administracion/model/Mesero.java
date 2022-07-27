/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

import java.util.List;
/**
 *
 * @author Usuario iTC
 */
public class Mesero extends Usuario {
    private int meseroId;
     private Comedor comedor;
     
    
    public Mesero( Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
        
    } 
     
    public Mesero(Comedor comedor, Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
        this.comedor = comedor;
        
        
    }

    public Comedor getComedor() {
        return comedor;
    }

    public void setComedor(Comedor comedor) {
        this.comedor = comedor;
    }

    public int getMeseroId() {
        return meseroId;
    }

    public void setMeseroId(int meseroId) {
        this.meseroId = meseroId;
    }

   


    

   

    

     
     
   
     
}
