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
    private Float precioHabitacion;
    
    
    private Hotel hotel;
    private List<Reservacion> reservacionList;
    private List<Banio> bañoList;

    public Habitacion(Boolean poseeMirador, Integer numeroBaños, Integer numeroCamas, Float tamanio, Integer numeroHuespedes, String tipoHabitacion, Float precioHabitacion) {
        this.poseeMirador = poseeMirador;
        this.numeroBaños = numeroBaños;
        this.numeroCamas = numeroCamas;
        this.tamanio = tamanio;
        this.numeroHuespedes = numeroHuespedes;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        bañoList = new LinkedList<>();
    }

    
    public Habitacion() {
        bañoList = new LinkedList<>();
    }
    
    public void CalcularPrecio(){
        Banio banio = new Banio();
        Float auxPrecioBaño =0f;
      
        if (numeroBaños ==1) {
            auxPrecioBaño= (banio.CalcularPrecio()+1) * 1;
            System.out.println(auxPrecioBaño);
        }else if (numeroBaños==2) {
            auxPrecioBaño= (banio.CalcularPrecio()+1) * 2;
            System.out.println(auxPrecioBaño);
        }
         auxPrecioBaño = 0f;
         System.out.println(auxPrecioBaño);
         
         
    }
    public Boolean getPoseeMirador() {
        return poseeMirador;
    }

    public void setPoseeMirador(Boolean poseeMirador) {
        this.poseeMirador = poseeMirador;
    }

    public Integer getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(Integer numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getNumeroHuespedes() {
        return numeroHuespedes;
    }

    public void setNumeroHuespedes(Integer numeroHuespedes) {
        this.numeroHuespedes = numeroHuespedes;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    public List<Banio> getBañoList() {
        return bañoList;
    }

    public void setBañoList(List<Banio> bañoList) {
        this.bañoList = bañoList;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "poseeMirador=" + poseeMirador + ", numeroBa\u00f1os=" + numeroBaños + ", numeroCamas=" + numeroCamas + ", tamanio=" + tamanio + ", numeroHuespedes=" + numeroHuespedes + ", tipoHabitacion=" + tipoHabitacion + ", precioHabitacion=" + precioHabitacion + ", hotel=" + hotel + ", reservacionList=" + reservacionList + ", ba\u00f1oList=" + bañoList + '}';
    }
    
    
}
