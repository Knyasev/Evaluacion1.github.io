/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Usuario iTC
 */
public class Hotel {
    private String nombre ;
    private Integer numeroPisos;
    private Integer numeroHabitaciones;
    private String ruc;
    private Integer numeroEstrella;
    private Boolean poseePiscina ;
    private String ubicacion;
    private String fechaInaguracion;
     
    
    private List<Reservacion> reservacionList;
    private Comedor comedor;
    private List<Habitacion> habitacionList;
    private List<Recepcion> recepcionList;
    private Parqueadero parqueadero;
    private Factura factura;
    private List<Servicio> servicioList;
    private List<Persona> personaList;

    
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

    public Hotel(String nombre, Integer numeroPisos, Integer numeroHabitaciones, 
            String ruc, Integer numeroEstrella, Boolean poseePiscina, String ubicacion, 
            String fechaInaguracion) {
        this();
        this.nombre = nombre;
        this.numeroPisos = numeroPisos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ruc = ruc;
        this.numeroEstrella = numeroEstrella;
        this.poseePiscina = poseePiscina;
        this.ubicacion = ubicacion;
        this.fechaInaguracion = fechaInaguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Integer getNumeroEstrella() {
        return numeroEstrella;
    }

    public void setNumeroEstrella(Integer numeroEstrella) {
        this.numeroEstrella = numeroEstrella;
    }

 

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaInaguracion() {
        return fechaInaguracion;
    }

    public void setFechaInaguracion(String fechaInaguracion) {
        this.fechaInaguracion = fechaInaguracion;
    }

    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    public Comedor getComedor() {
        return comedor;
    }

    public void setComedor(Comedor comedor) {
        this.comedor = comedor;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }

    public List<Recepcion> getRecepcionList() {
        return recepcionList;
    }

    public void setRecepcionList(List<Recepcion> recepcionList) {
        this.recepcionList = recepcionList;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Servicio> getServicioList() {
        return servicioList;
    }

    public void setServicioList(List<Servicio> servicioList) {
        this.servicioList = servicioList;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public Boolean getPoseePiscina() {
        return poseePiscina;
    }

    public void setPoseePiscina(Boolean poseePiscina) {
        this.poseePiscina = poseePiscina;
    }
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", ruc=" + ruc + ", numeroEstrella=" + numeroEstrella + ", poseePiscina=" + poseePiscina + ", ubicacion=" + ubicacion + ", fechaInaguracion=" + fechaInaguracion + '}';
    }
   
    
    
}
