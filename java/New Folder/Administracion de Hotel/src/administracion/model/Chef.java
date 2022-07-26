/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

import java.util.List;

/**
 *
 * @author Usuario iTC
 */
public class Chef extends Usuario{
   
    private List<Cliente> clienteList;
    private int chef_id;
    
    
    public void prepararPlato(){
        // espero si prearar plato de cocina es boolean
    
    }

    public Chef(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
    }

    

   
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public int getChef_id() {
        return chef_id;
    }

    public void setChef_id(int chef_id) {
        this.chef_id = chef_id;
    }
    

    @Override
    public String toString() {
        return "Nombre: " +getNombre()+" Apellido "+getApellido()+" Identificacion: " +getIdentificacion()+"   Ocupacion "
                +getOcupacion()+"    Numero Empleado "+ getNumeroIdeEmpleado() ;
    }


   
  

    
    
}
