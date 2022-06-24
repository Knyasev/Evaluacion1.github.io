/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class Usuario extends Persona{
        private IdentificacionHotel identificacionHotel;

    public Usuario(IdentificacionHotel identificacionHotel, String nombre, String Apellido, String identificacion) {
        super(nombre, Apellido, identificacion);
        this.identificacionHotel = identificacionHotel;
    }

      
}
