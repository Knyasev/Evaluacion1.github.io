/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Usuario iTC
 */
public class Recepcionista extends Usuario{
    private List<Recepcion> recepcionList;

<<<<<<< HEAD
    public Recepcionista(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
=======
   
    public Recepcionista(List<Recepcion> recepcionList, IdentificacionHotel identificacionHotel, String nombre, String Apellido, String identificacion) {
        super(identificacionHotel, nombre, Apellido, identificacion);
        this.recepcionList = recepcionList;
>>>>>>> 3fbef475f83f1ed50eb772fe6fc9aa71d559667e
    }

public Recepcionista(IdentificacionHotel identificacionHotel, String nombre, String Apellido, String identificacion) {
        super(identificacionHotel, nombre, Apellido, identificacion);
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
