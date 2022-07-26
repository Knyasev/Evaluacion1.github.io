/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Usuario iTC
 */
public class Parqueadero {
    private Integer numeroParqueadero;
    private String datosVehiculo;
    private float precioPar=1f; 
    
    private Hotel hotel;

    public Parqueadero() {
    }

    public Parqueadero(Integer numeroParqueadero, String datosVehiculo, Hotel hotel) {
        this();
        this.numeroParqueadero = numeroParqueadero;
        this.datosVehiculo = datosVehiculo;
        this.hotel = hotel;
    }

    public Integer getNumeroParqueadero() {
        return numeroParqueadero;
    }

    public void setNumeroParqueadero(Integer numeroParqueadero) {
        this.numeroParqueadero = numeroParqueadero;
    }

    public String getDatosVehiculo() {
        return datosVehiculo;
    }

    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    public float getPrecioPar() {
        return precioPar;
    }

    public void setPrecioPar(float precioPar) {
        this.precioPar = precioPar;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
}
