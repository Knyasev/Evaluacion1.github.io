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

public class Recepcionista extends Usuario{
    private List<Recepcion> recepcionList;

    public Recepcionista( Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
        this.recepcionList = new LinkedList<>();
    }

    public List<Recepcion> getRecepcionList() {
        return recepcionList;
    }

    public void setRecepcionList(List<Recepcion> recepcionList) {
        this.recepcionList = recepcionList;
    }

    @Override
    public String toString() {
        return "Recepcionista{" + "recepcionList=" + recepcionList + '}';
    }
}
        
    


