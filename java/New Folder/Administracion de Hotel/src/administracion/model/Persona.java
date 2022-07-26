/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Usuario iTC
 */
public class Persona {
    private String nombre ;
    private String apellido;
    private Hotel  hotel ;
    private String identificacion;
    private int persona_id;

    public Persona(String nombre, String Apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = Apellido;
        this.identificacion = identificacion;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    
    

    @Override
    public String toString() {
        return "nombre=" + nombre + "  Apellido=" + apellido + "  identificacion=" + identificacion;
    }
    
    //evaluacion 14 //!=condicion13?//if14*12://else14*15;
    
}
