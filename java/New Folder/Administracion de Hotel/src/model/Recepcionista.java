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

    public Recepcionista(String nombre, String FechaNacimiento, String Apellido) {
        super(nombre, FechaNacimiento, Apellido);
    }
    


}
