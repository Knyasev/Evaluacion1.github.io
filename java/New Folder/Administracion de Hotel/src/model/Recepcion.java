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
    private String InformacionHabitacion;
    private Integer numeroHabitacionesDisponibles;
    
   private  List<Recepcionista> recepcionList;
   private Hotel hotel;

    public Recepcion(String InformacionHabitacion, Integer numeroHabitacionesDisponibles, List<Recepcionista> recepcionList, Hotel hotel) {
        this.InformacionHabitacion = InformacionHabitacion;
        this.numeroHabitacionesDisponibles = numeroHabitacionesDisponibles;
        this.recepcionList = recepcionList;
        this.hotel = hotel;
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





}
