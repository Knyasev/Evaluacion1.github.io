/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Gonzalez G
 */
public class Reservacion {
    

    private Integer numeroHuespedes;
    private Float precioServicio;
    private Float precioReservacionHabitacion= 0f;
    private Float precioReservacionComida= 0f;
    private Integer tiempoEstancia;
    private Float descuento ;
    private String metodoPago ;
    private Float precioReservacion;

    
    
    
    private Hotel hotel;
    private List<ReservacionComida> reservacionComidaList;
    private List<Recepcionista> recepcionistaList;
    private List<Habitacion> habitacionList;
    private Cliente cliente;
    private Servicio servicio ;
    

    public Reservacion() {
        reservacionComidaList = new LinkedList<>();

    }

   
    
   public Reservacion( Integer numeroHuespedes, Integer tiempoEstancia, Float descuento, String tipoHabitacion) {
        this();
        this.numeroHuespedes = numeroHuespedes;
        this.precioReservacion = precioReservacion;
        this.tiempoEstancia = tiempoEstancia;
        this.descuento = descuento/100;

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
        
        Float auxPrecio= ((((habitacion.calcularPrecioHabitacion()  * numeroHuespedes)* tiempoEstancia )));
        Float auxDescuento = precioReservacionHabitacion * descuento;
        precioReservacionHabitacion = auxPrecio - auxDescuento;
     return precioReservacionHabitacion;
    }
    
   

    public Float valorSubtotal(Reservacion reservacion,ReservacionComida reservacionComida,Habitacion habitacion, ServicioAdicional servicioAdicional ,Servicio servicio){
        costoReservacionComida(reservacion, reservacionComida);
        costosServicios(servicioAdicional, servicio, reservacion);
        reservarHabitacion(habitacion);
        
        precioReservacion = precioReservacionHabitacion + precioReservacionComida + precioServicio ;
        
        return precioReservacion;
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
        return precioReservacionHabitacion;
    }

    public void setPrecioReservacion(Float precioReservacion) {
        this.precioReservacionHabitacion = precioReservacion;
    }

    public Integer getTiempoEstancia() {
        return tiempoEstancia;
    }

    public void setTiempoEstancia(Integer tiempoEstancia) {
        this.tiempoEstancia = tiempoEstancia;
    }

  

    public Float getTipoDescuento() {
        return descuento;
    }

    public void setTipoDescuento(Float tipoDescuento) {
        this.descuento = tipoDescuento;
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

    public Float getPrecioReservacionHabitacion() {
        return precioReservacionHabitacion;
    }

    public void setPrecioReservacionHabitacion(Float precioReservacionHabitacion) {
        this.precioReservacionHabitacion = precioReservacionHabitacion;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    
    
}
