/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario iTC
 */
public class Factura {
        private Integer numero;
        private String fecha;
        private String Ruc  ;
        private Float valorSubtotal;
        private Float valorTotal;
        private Float valorIva;

    public Factura() {
    }

    public Factura(Integer numero, String fecha, String Ruc) {
        this.numero = numero;
        this.fecha = fecha;
        this.Ruc = Ruc;
    }
    
    public void calcularTotal (Reservacion reservacion ,ReservacionComida reservacionComida,Servicio servicio,ServicioAdicional servicioAdicional,Habitacion habitacion){
        calcularValorSubtotal(reservacion, reservacionComida, servicio, servicioAdicional, habitacion);
        calcularIva();
    valorTotal = valorSubtotal + valorIva;
       
    }
     public void calcularValorSubtotal(Reservacion reservacion ,ReservacionComida reservacionComida,Servicio servicio,ServicioAdicional servicioAdicional,Habitacion habitacion){
      valorSubtotal = reservacion.valorSubtotal(reservacion, reservacionComida, habitacion, servicioAdicional, servicio);
         
    }
     public void calcularIva(){
      valorIva = valorSubtotal * 0.12f;  
         
    } 
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public Float getValorSubtotal() {
        return valorSubtotal;
    }

    public void setValorSubtotal(Float valorSubtotal) {
        this.valorSubtotal = valorSubtotal;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public void setValorIva(Float valorIva) {
        this.valorIva = valorIva;
    }

    @Override
    public String toString() {
        return "    Subtotal:   " + valorSubtotal + "\n    Iva(12%):   " + valorIva + "\n    Total:      " + valorTotal ;
    }


        
    
        
        
}
