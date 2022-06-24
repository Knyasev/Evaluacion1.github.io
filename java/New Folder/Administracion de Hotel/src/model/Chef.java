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
public class Chef extends Usuario{
    private List<Carta> cartaList;
    private List<Cliente> clienteList;
    
    
    public void prepararPlato(){
        // espero si prearar plato de cocina es boolean
    
    }

    public Chef(Integer numeroIdeEmpleado, String ocupacion, String nombre, String Apellido, String identificacion) {
        super(numeroIdeEmpleado, ocupacion, nombre, Apellido, identificacion);
    }

    

   

    public List<Carta> getCartaList() {
        return cartaList;
    }

    public void setCartaList(List<Carta> cartaList) {
        this.cartaList = cartaList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public String toString() {
        return "Nombre: " +getNombre()+" Apellido "+getApellido()+" Identificacion: " +getIdentificacion()+"   Ocupacion "
                +getOcupacion()+"    Numero Empleado "+ getNumeroIdeEmpleado() ;
    }


   
  

    
    
}
