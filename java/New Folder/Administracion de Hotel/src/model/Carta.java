/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class Carta {
    private String nombrePlatillo;
    private String descripcion;
    private Float precio;
    private Float totalComida;
    private Integer numDias=0;
    
    
    public void hacerPedido(){
    //botton para hacer pedido si o no 
    }

    public Carta(String nombrePlatillo, String descripcion, Float precio) {
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
   
    
    
    private Comedor comedor;
    private Habitacion habitacion;
    private Chef chef;
    private Reservacion reservacion;

    public Carta(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    
    
            
     public float precioComidaPorHuesped(Reservacion reservacion){
         numDias=reservacion.getTiempoEstancia();
         for (int i = 0; i <= reservacion.getNumeroHuespedes(); i++) {
             totalComida= 0f;
             totalComida=precio*i;
            totalComida=totalComida*numDias;
         }
         //System.out.println(totalComida);
         return totalComida;
    }
     

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    

    @Override
    public String toString() {
        return "nombrePlatillo=" + nombrePlatillo + ", descripcion=" + descripcion + ", precio=" + precio ;
    }

   
    
    
    
        
        
}
