/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class Cliente extends Persona{
    private Reservacion reservacion;
    private Chef chef; 

    public Cliente(String nombre, String Apellido, String Identificacion) {
        super(nombre, Apellido, Identificacion);
    }
 
    
}
