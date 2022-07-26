/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Usuario iTC
 */
public class Conserje extends Usuario {
    private int conserje_id;
    
    
    public void limpiarHabitacion(){
        
    
    }

    public Conserje(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
    }

    public int getConserje_id() {
        return conserje_id;
    }

    public void setConserje_id(int conserje_id) {
        this.conserje_id = conserje_id;
    }
    
    
    

    

}
