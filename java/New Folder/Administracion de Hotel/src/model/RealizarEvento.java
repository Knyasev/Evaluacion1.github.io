/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gonzalez G
 */
public class RealizarEvento {
    private String tipoEvento;
    private String fecha;
    private String Duracion;
    
    
    private ServicioAdicional servicioAdicional ;

    public RealizarEvento(String tipoEvento, String fecha, String Duracion) {
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.Duracion = Duracion;
    }
    
    
    
    public RealizarEvento() {
        servicioAdicional = new ServicioAdicional();
        
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public ServicioAdicional getServicioAdicional() {
        return servicioAdicional;
    }

    public void setServicioAdicional(ServicioAdicional servicioAdicional) {
        this.servicioAdicional = servicioAdicional;
    }

    @Override
    public String toString() {
        return "RealizarEvento{" + "tipoEvento=" + tipoEvento + ", fecha=" + fecha + ", Duracion=" + Duracion + '}';
    }
    
    
    
}
