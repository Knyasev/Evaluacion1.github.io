/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Gonzalez G
 */
public class Cocina {
    private String tamanio;
    private Boolean poseeHorno;
    private int cocina_id;
    

        private Hotel hotel;
        
        


    public Cocina(String tamanio, Boolean poseeHorno) {
        this.tamanio = tamanio;
        this.poseeHorno = poseeHorno;
    }

    public int getCocina_id() {
        return cocina_id;
    }

    public void setCocina_id(int cocina_id) {
        this.cocina_id = cocina_id;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getPoseeHorno() {
        return poseeHorno;
    }

    public void setPoseeHorno(Boolean poseeHorno) {
        this.poseeHorno = poseeHorno;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
    

    @Override
    public String toString() {
        return "Cocina{" + "tamanio=" + tamanio + ", poseeHorno=" + poseeHorno + '}';
    }
        
        
}
