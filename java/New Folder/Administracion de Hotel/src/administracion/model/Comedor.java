/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Usuario iTC
 */
public class Comedor {
    private Integer numeroMesas;
    private Integer numeroSillas; 
    private  String numeroCubiertos;   
    
    
        private Hotel hotel;
        private List<ReservacionComida> reservacionComidaList;
        
        private List<Mesero> meseroList;

    public Comedor() {
         
        meseroList = new LinkedList<>();
    }

    public Comedor(Integer numeroMesas, Integer numeroSillas, String numeroCubiertos) {
        this();
        this.numeroMesas = numeroMesas;
        this.numeroSillas = numeroSillas;
        this.numeroCubiertos = numeroCubiertos;
        
    }

    public Integer getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(Integer numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public Integer getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(Integer numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public String getNumeroCubiertos() {
        return numeroCubiertos;
    }

    public void setNumeroCubiertos(String numeroCubiertos) {
        this.numeroCubiertos = numeroCubiertos;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<ReservacionComida> getReservacionComidaList() {
        return reservacionComidaList;
    }

    public void setReservacionComidaList(List<ReservacionComida> reservacionComidaList) {
        this.reservacionComidaList = reservacionComidaList;
    }

    
    public List<Mesero> getMeseroList() {
        return meseroList;
    }

    public void setMeseroList(List<Mesero> meseroList) {
        this.meseroList = meseroList;
    }

    @Override
    public String toString() {
        return "Comedor{" + "numeroMesas=" + numeroMesas + ", numeroSillas=" + numeroSillas + ", numeroCubiertos=" + numeroCubiertos + ", hotel=" + hotel + ", reservacionComidaList=" + reservacionComidaList  + ", meseroList=" + meseroList + '}';
    }
        
    
}
