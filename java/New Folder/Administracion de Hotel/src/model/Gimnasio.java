/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class Gimnasio {
    private String horario;
    private Boolean adquirirMaquinaria;
    private float precioGim=3.50f;
    
    private ServicioAdicional servicioAdicional;

    public Gimnasio() {
        servicioAdicional= new ServicioAdicional();
    }
    
    
    
}
