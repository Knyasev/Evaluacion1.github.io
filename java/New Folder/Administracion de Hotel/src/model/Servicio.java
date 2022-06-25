/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
/**
 *
 * @author Gonzalez G
 */
public class Servicio {
    private Boolean internet;
    private Reservacion reservacion;
    private Hotel hotel;
    private List<ServicioAdicional> servicioAdicionalList;

    public Servicio() {
        reservacion  = new Reservacion();
    }
    
}
