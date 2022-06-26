/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class ReservacionComida {
    private float precioAlmuerzo;
    private float precioDesayuno;
    private float precioCena;
    private String nombrePlatillo;
    private String descripcion;
    private Float precio;
    private Float totalComida;
    private Integer numDias=0;
    
    
    private Comedor comedor;
    private Habitacion habitacion;
    private Chef chef;
    private Reservacion reservacion;

    public ReservacionComida(String nombrePlatillo, String descripcion, Float precio) {
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float precioComidaPorHuesped(Reservacion reservacion){
         numDias=reservacion.getTiempoEstancia();
         for (int i = 0; i <= reservacion.getNumeroHuespedes(); i++) {
             totalComida= 0f;
             totalComida=precio*i;
             totalComida=totalComida*numDias;
             
         }
         System.out.println(totalComida);
         return totalComida;
    }
    
    
    
    

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Comedor getComedor() {
        return comedor;
    }

    public void setComedor(Comedor comedor) {
        this.comedor = comedor;
    }

    public float getPrecioAlmuerzo() {
        return precioAlmuerzo;
    }

    public void setPrecioAlmuerzo(float precioAlmuerzo) {
        this.precioAlmuerzo = precioAlmuerzo;
    }

    public float getPrecioDesayuno() {
        return precioDesayuno;
    }

    public void setPrecioDesayuno(float precioDesayuno) {
        this.precioDesayuno = precioDesayuno;
    }

    public float getPrecioCena() {
        return precioCena;
    }

    public void setPrecioCena(float precioCena) {
        this.precioCena = precioCena;
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

    public Float getTotalComida() {
        return totalComida;
    }

    public void setTotalComida(Float totalComida) {
        this.totalComida = totalComida;
    }

    public Integer getNumDias() {
        return numDias;
    }

    public void setNumDias(Integer numDias) {
        this.numDias = numDias;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
    

    @Override
    public String toString() {
        return "ReservacionComida{" + "nombrePlatillo=" + nombrePlatillo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    

    


    
    
    
}
