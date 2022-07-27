/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Usuario iTC
 */
public class Gerente  extends Usuario  {
    private int gerenteId;
    public Gerente(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
    }

    public int getGerenteId() {
        return gerenteId;
    }

    public void setGerenteId(int gerenteId) {
        this.gerenteId = gerenteId;
    }

     

    

   

    
    
    
}
