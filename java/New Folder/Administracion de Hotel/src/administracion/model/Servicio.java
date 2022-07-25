/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;
import java.util.List;
/**
 *
 * @author Gonzalez G
 */
public class Servicio {
    private float internet=0.20f;
    private Reservacion reservacion;
    private Hotel hotel;
    private List<ServicioAdicional> servicioAdicionalList;

    public Servicio() {
        reservacion  = new Reservacion();
    }

    public float getInternet() {
        return internet;
    }

    public void setInternet(float internet) {
        this.internet = internet;
    }

   

    

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<ServicioAdicional> getServicioAdicionalList() {
        return servicioAdicionalList;
    }

    public void setServicioAdicionalList(List<ServicioAdicional> servicioAdicionalList) {
        this.servicioAdicionalList = servicioAdicionalList;
    }
    
    
    
    
}
