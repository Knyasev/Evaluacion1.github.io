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
public class Reservacion {
    private Integer numeroDias;
    private String fechaEntrada;
    private String fechaSalida;
    private Integer numeroHuespedes;
    private Float precioHabitacion;
    private Float precioServicio;
    private Float precioReservacion;
    private String tiempoEstancia;
    private Float tipoDescuento ;
    private String tipoHabitacion ; //observacion
    private String metodoPago ;

    
    
    
    private Hotel hotel;
    private List<ReservacionComida> reservacionComidaList;
    private List<Recepcionista> recepcionistaList;
    private Cliente cliente;
    private Servicio servicio ;
    

    public Reservacion() {
        reservacionComidaList = new LinkedList<>();
    }
    
    
}
