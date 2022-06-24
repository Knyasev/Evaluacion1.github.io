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
    private String tipoAlmuerzo;
    private String tipoDesayuno;
    private String tipoCena ;
    
    private Reservacion reservacion;
    private Comedor comedor;

    public ReservacionComida(String tipoAlmuerzo, String tipoDesayuno, String tipoCena) {
        this.tipoAlmuerzo = tipoAlmuerzo;
        this.tipoDesayuno = tipoDesayuno;
        this.tipoCena = tipoCena;
    }

    public String getTipoAlmuerzo() {
        return tipoAlmuerzo;
    }

    public void setTipoAlmuerzo(String tipoAlmuerzo) {
        this.tipoAlmuerzo = tipoAlmuerzo;
    }

    public String getTipoDesayuno() {
        return tipoDesayuno;
    }

    public void setTipoDesayuno(String tipoDesayuno) {
        this.tipoDesayuno = tipoDesayuno;
    }

    public String getTipoCena() {
        return tipoCena;
    }

    public void setTipoCena(String tipoCena) {
        this.tipoCena = tipoCena;
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

    @Override
    public String toString() {
        return "ReservacionComida{" + "tipoAlmuerzo=" + tipoAlmuerzo + ", tipoDesayuno=" + tipoDesayuno + ", tipoCena=" + tipoCena + '}';
    }
    
    
}
