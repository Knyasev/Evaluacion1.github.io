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

    public Chef(String nombre, String FechaNacimiento, String Apellido) {
        super(nombre, FechaNacimiento, Apellido);
    }
    
    
}
