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
    

    private Integer numeroHuespedes;
    
    
    private Float precioServicio;
    private Float precioReservacion;
    private Float precioReservacionComida= 0f;
    private Integer tiempoEstancia;
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

   
    
   public Reservacion( Integer numeroHuespedes, Float precioHabitacion, Float precioReservacion, Integer tiempoEstancia, Float tipoDescuento, String tipoHabitacion) {
        this();
        this.numeroHuespedes = numeroHuespedes;
        this.precioReservacion = precioReservacion;
        this.tiempoEstancia = tiempoEstancia;
        this.tipoDescuento = tipoDescuento;



    }

    
    


    public float costosServicios(ServicioAdicional servicioAdicional,Servicio servicio,Reservacion reservacion){
      precioServicio=servicioAdicional.getPrecioServiciosAdd()+ servicio.getInternet()*reservacion.tiempoEstancia;
   
      return precioServicio;
      
    }

    public Float costoReservacionComida(Reservacion reservacion,ReservacionComida reservacionComida){
           precioReservacionComida = 0f;
            precioReservacionComida = reservacionComida.getTotalComida();
        return precioReservacionComida;
           
    }
  
    
    public Float reservarHabitacion (Habitacion habitacion){
        
        habitacion.calcularPrecioHabitacion();
        precioReservacion= ((habitacion.calcularPrecioHabitacion()  * numeroHuespedes)* tiempoEstancia);
        
     return precioReservacion;
    }
    


    public Float valorSubtotal(){
        Float subtotal = precioReservacion + precioReservacionComida + precioServicio ;
        System.out.println("servicio"+precioServicio);
        System.out.println("comida"+precioReservacionComida);
        System.out.println("reservacion"+precioReservacion);
        System.out.println(subtotal);
        return subtotal;
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

    public Integer getTiempoEstancia() {
        return tiempoEstancia;
    }

    public void setTiempoEstancia(Integer tiempoEstancia) {
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


    public Float getPrecioReservacionComida() {
        return precioReservacionComida;
    }

    public void setPrecioReservacionComida(Float precioReservacionComida) {
        this.precioReservacionComida = precioReservacionComida;
    }
    
    
    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }


    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }
    

//    @Override
//    public String toString() {
//
//        return "Reservacion{" + ", fechaEntrada=" + fechaEntrada 
//                + ", fechaSalida=" + fechaSalida + ", numeroHuespedes=" + numeroHuespedes 
//                + ", precioServicio=" + precioServicio + ", precioReservacion=" + precioReservacion + ", tiempoEstancia=" + tiempoEstancia 
//                + ", tipoDescuento=" + tipoDescuento + ", tipoHabitacion=" ;
//
//       
//    }
//    
    
    
}
