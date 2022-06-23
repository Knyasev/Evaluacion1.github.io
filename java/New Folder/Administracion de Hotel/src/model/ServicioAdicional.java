/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Gonzalez G
 */
public class ServicioAdicional {
        private Boolean internet;
        private Boolean tvCable;
        private Boolean servicioHabitacion;
        private Boolean servicioLimpieza;
    
        private Servicio servicio;
        private Bar bar;
        private List<RealizarEvento> realizarEventoList;
        private Spa spa;
        private Gimnasio gimnasio;

    public ServicioAdicional() {
        realizarEventoList = new LinkedList<>();
        spa = new Spa();
        gimnasio = new Gimnasio();
    }
        
        
}
