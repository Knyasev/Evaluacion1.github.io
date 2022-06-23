/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Gonzalez G
 */
public class Habitacion {
    private Boolean poseeMirador;
    private Integer numeroBaños;
    private Integer numeroCamas;
    private Float tamanio;
    private Integer numeroHuespedes;
    private String tipoHabitacion;
    
    
    private Hotel hotel;
    private List<Reservacion> reservacionList;
    private List<Baño> bañoList;

    public Habitacion() {
        bañoList = new LinkedList<>();
    }
    
}
