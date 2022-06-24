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
    
    private Integer fechaEntrada;
    private Integer fechaSalida;
    private Integer numeroHuespedes;
    
    
    private Float precioServicio;
    private Float precioReservacion;
    private String tiempoEstancia;
    private Float tipoDescuento ;
    
    private String metodoPago ;

    
    
    
    private Hotel hotel;
    private List<ReservacionComida> reservacionComidaList;
    private List<Recepcionista> recepcionistaList;
    private List<Habitacion> habitacionList;
    private Cliente cliente;
    private Servicio servicio ;
    

    public Reservacion() {
        reservacionComidaList = new LinkedList<>();
    }


    public Reservacion( Integer fechaEntrada, Integer fechaSalida, Integer numeroHuespedes, Float precioHabitacion, Float precioServicio, Float precioReservacion, String tiempoEstancia, Float tipoDescuento, String tipoHabitacion) {
     

        this.fechaEntrada = 0;
        this.fechaSalida = fechaSalida;
        this.numeroHuespedes = numeroHuespedes;
        this.precioServicio = precioServicio;
        this.precioReservacion = precioReservacion;
        this.tiempoEstancia = tiempoEstancia;
        this.tipoDescuento = tipoDescuento;
        
    }




    
    public void reservarHabitacion (){
        
        for (Habitacion habitacion: habitacionList) {
             
            
            
            
        }
         
    
    
    }
   

    public Integer getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Integer fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Integer getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Integer fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getNumeroHuespedes() {
        return numeroHuespedes;
    }

    public void setNumeroHuespedes(Integer numeroHuespedes) {
        this.numeroHuespedes = numeroHuespedes;
    }

   

    public Float getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Float precioServicio) {
        this.precioServicio = precioServicio;
    }

    public Float getPrecioReservacion() {
        return precioReservacion;
    }

    public void setPrecioReservacion(Float precioReservacion) {
        this.precioReservacion = precioReservacion;
    }

    public String getTiempoEstancia() {
        return tiempoEstancia;
    }

    public void setTiempoEstancia(String tiempoEstancia) {
        this.tiempoEstancia = tiempoEstancia;
    }

    public Float getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(Float tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

   
    

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<ReservacionComida> getReservacionComidaList() {
        return reservacionComidaList;
    }

    public void setReservacionComidaList(List<ReservacionComida> reservacionComidaList) {
        this.reservacionComidaList = reservacionComidaList;
    }

    public List<Recepcionista> getRecepcionistaList() {
        return recepcionistaList;
    }

    public void setRecepcionistaList(List<Recepcionista> recepcionistaList) {
        this.recepcionistaList = recepcionistaList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {

        return "Reservacion{" + ", fechaEntrada=" + fechaEntrada 
                + ", fechaSalida=" + fechaSalida + ", numeroHuespedes=" + numeroHuespedes 
                + ", precioServicio=" + precioServicio + ", precioReservacion=" + precioReservacion + ", tiempoEstancia=" + tiempoEstancia 
                + ", tipoDescuento=" + tipoDescuento + ", tipoHabitacion=" ;

       
    }
    
    
    
}
