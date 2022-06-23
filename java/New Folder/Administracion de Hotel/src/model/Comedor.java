/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Usuario iTC
 */
public class Comedor {
        private Hotel hotel;
        private List<ReservacionComida> reservacionComidaList;
        private List<Carta> cartaList;
        private List<Mesero> meseroList;

    public Comedor() {
        cartaList = new LinkedList <>();
        meseroList = new LinkedList<>();
    }
        
    
}
