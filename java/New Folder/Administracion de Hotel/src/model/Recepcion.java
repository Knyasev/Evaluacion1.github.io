/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Usuario iTC
 */
public class Recepcion {
    private Integer numeroLlaveHabitacion ;
    private Float precioNoche;
    private String InformacionHabitacion;
    private Integer numeroHabitacionesDisponibles;
    
    private  List<Recepcionista> recepcionList;
    private Hotel hotel;

<<<<<<< Updated upstream
    public Recepcion(Integer numeroLlaveHabitacion, Float precioNoche, String InformacionHabitacion, Integer numeroHabitacionesDisponibles) {
        this.numeroLlaveHabitacion = numeroLlaveHabitacion;
        this.precioNoche = precioNoche;
        this.InformacionHabitacion = InformacionHabitacion;
        this.numeroHabitacionesDisponibles = numeroHabitacionesDisponibles;
    }

=======
    public Recepcion(Integer numeroLlaveHabitacion, Float precioNoche, String InformacionHabitacion, Hotel hotel) {
        this.numeroLlaveHabitacion = numeroLlaveHabitacion;
        this.precioNoche = precioNoche;
        this.InformacionHabitacion = InformacionHabitacion;
        this.hotel = hotel;
        recepcionList = new LinkedList<>();
    }

    
>>>>>>> Stashed changes
    public Integer getNumeroLlaveHabitacion() {
        return numeroLlaveHabitacion;
    }

    public void setNumeroLlaveHabitacion(Integer numeroLlaveHabitacion) {
        this.numeroLlaveHabitacion = numeroLlaveHabitacion;
    }

    public Float getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getInformacionHabitacion() {
        return InformacionHabitacion;
    }

    public void setInformacionHabitacion(String InformacionHabitacion) {
        this.InformacionHabitacion = InformacionHabitacion;
    }

    public Integer getNumeroHabitacionesDisponibles() {
        return numeroHabitacionesDisponibles;
    }

    public void setNumeroHabitacionesDisponibles(Integer numeroHabitacionesDisponibles) {
        this.numeroHabitacionesDisponibles = numeroHabitacionesDisponibles;
    }

    public List<Recepcionista> getRecepcionList() {
        return recepcionList;
    }

    public void setRecepcionList(List<Recepcionista> recepcionList) {
        this.recepcionList = recepcionList;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

<<<<<<< Updated upstream
    
=======
>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "Recepcion{" + "numeroLlaveHabitacion=" + numeroLlaveHabitacion + ", precioNoche=" + precioNoche + ", InformacionHabitacion=" + InformacionHabitacion + ", numeroHabitacionesDisponibles=" + numeroHabitacionesDisponibles + ", recepcionList=" + recepcionList + ", hotel=" + hotel + '}';
    }
<<<<<<< Updated upstream
    
     
=======
>>>>>>> Stashed changes
    
   
}
