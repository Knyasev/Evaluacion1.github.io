/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class IdentificacionHotel {
    private Integer numeroIdeEmpleado;
    private String ocupacion;

    public IdentificacionHotel(Integer numeroIdeEmpleado, String ocupacion) {
        this.numeroIdeEmpleado = numeroIdeEmpleado;
        this.ocupacion = ocupacion;
    }

    public Integer getNumeroIdeEmpleado() {
        return numeroIdeEmpleado;
    }

    public void setNumeroIdeEmpleado(Integer numeroIdeEmpleado) {
        this.numeroIdeEmpleado = numeroIdeEmpleado;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

   
}
