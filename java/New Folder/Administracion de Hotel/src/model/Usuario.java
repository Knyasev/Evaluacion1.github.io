/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class Usuario extends Persona{
            private Integer numeroIdeEmpleado;
            private String ocupacion;

    public Usuario(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(nombre, Apellido, identificacion);
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
