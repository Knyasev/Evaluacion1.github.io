/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Usuario iTC
 */
public class Hotel {
    
    private List<Reservacion> reservacionList;
    private Comedor comedor;
    private List<Habitacion> habitacionList;
    private List<Recepcion> recepcionList;
    private Parqueadero parqueadero;
    private Factura factura;
    private List<Servicio> servicioList;

    
    //composicion
    public Hotel() {
        this.parqueadero = new Parqueadero();
        this.recepcionList = new LinkedList<>();
        this.habitacionList = new LinkedList<>();
        this.comedor = new Comedor();
        this.reservacionList = new LinkedList<>();
        this.factura = new Factura();
        this.servicioList = new LinkedList<>();
    }
   
    
    
}
