/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Usuario iTC
 */
public class Usuario extends Persona{
            private int empleadoId;
            private String ocupacion;

    public Usuario(int numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(nombre, Apellido, identificacion);
        this.empleadoId = numeroIdeEmpleado;
        this.ocupacion = ocupacion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

   

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    

   

      
}
