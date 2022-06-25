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
       
        private Boolean tvCable;
        private Boolean servicioHabitacion;
        private Boolean servicioLimpieza;
        private Boolean bare;
        private Boolean spa;
        private Boolean Gim;
        
        private float precioTvCable=0.60f;
        private float precioServicioHabitacion=1.00f;
        private float precioServicioLimpieza=0.50f;
        private float preBare=6.00f;
        private float preSpa=2.00f;
        private float preGim=1.00f;
        
        
        private float precioTv;
        private float precioSer;
        private float precioServicioLi;
        private float precioBare;
        private float precioSpa;
        private float precioGim;
        
        private float precioServiciosAdd=0f;
    
        private Servicio servicio;
        private Bar bar;
        private List<RealizarEvento> realizarEventoList;
        private Reservacion reservacion;

    public ServicioAdicional(Boolean tvCable, Boolean servicioHabitacion, Boolean servicioLimpieza, Boolean bare, Boolean spa, Boolean Gim) {
        this.tvCable = tvCable;
        this.servicioHabitacion = servicioHabitacion;
        this.servicioLimpieza = servicioLimpieza;
        this.bare = bare;
        this.spa = spa;
        this.Gim = Gim;
    }
        
        

    
    
    public float precioAddServicio(Reservacion reservacion){
         float aux=0f;
        if (tvCable == true) {
           precioTv=reservacion.getTiempoEstancia()*precioTvCable;}
        if(servicioHabitacion== true){
           precioSer=reservacion.getTiempoEstancia()*precioServicioHabitacion; }         
        if(servicioLimpieza==true){
           precioServicioLi=reservacion.getTiempoEstancia()*precioServicioLimpieza;          
        }
        if(Gim==true){
           precioGim=reservacion.getTiempoEstancia()*preGim;          
        }
        if(bare==true){
           precioBare=reservacion.getTiempoEstancia()*preBare;          
        }
        if(spa==true){
           precioSpa=reservacion.getTiempoEstancia()*preSpa;          
        }
         precioServiciosAdd=precioSer+precioServicioLi+precioTv+ precioGim+precioBare+precioSpa;
        
        return precioServiciosAdd;
    }
    
    

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

        
        
   
    public Boolean getTvCable() {
        return tvCable;
    }

    public void setTvCable(Boolean tvCable) {
        this.tvCable = tvCable;
    }

    public Boolean getServicioHabitacion() {
        return servicioHabitacion;
    }

    public void setServicioHabitacion(Boolean servicioHabitacion) {
        this.servicioHabitacion = servicioHabitacion;
    }

    public Boolean getServicioLimpieza() {
        return servicioLimpieza;
    }

    public void setServicioLimpieza(Boolean servicioLimpieza) {
        this.servicioLimpieza = servicioLimpieza;
    }

    public float getPrecioTvCable() {
        return precioTvCable;
    }

    public void setPrecioTvCable(float precioTvCable) {
        this.precioTvCable = precioTvCable;
    }

    public float getPrecioServicioHabitacion() {
        return precioServicioHabitacion;
    }

    public void setPrecioServicioHabitacion(float precioServicioHabitacion) {
        this.precioServicioHabitacion = precioServicioHabitacion;
    }

    public float getPrecioServicioLimpieza() {
        return precioServicioLimpieza;
    }

    public void setPrecioServicioLimpieza(float precioServicioLimpieza) {
        this.precioServicioLimpieza = precioServicioLimpieza;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public List<RealizarEvento> getRealizarEventoList() {
        return realizarEventoList;
    }

    public void setRealizarEventoList(List<RealizarEvento> realizarEventoList) {
        this.realizarEventoList = realizarEventoList;
    }

    public Boolean getBare() {
        return bare;
    }

    public void setBare(Boolean bare) {
        this.bare = bare;
    }

    public Boolean getSpa() {
        return spa;
    }

    public void setSpa(Boolean spa) {
        this.spa = spa;
    }

    public Boolean getGim() {
        return Gim;
    }

    public void setGim(Boolean Gim) {
        this.Gim = Gim;
    }

    public float getPreBare() {
        return preBare;
    }

    public void setPreBare(float preBare) {
        this.preBare = preBare;
    }

    public float getPreSpa() {
        return preSpa;
    }

    public void setPreSpa(float preSpa) {
        this.preSpa = preSpa;
    }

    public float getPreGim() {
        return preGim;
    }

    public void setPreGim(float preGim) {
        this.preGim = preGim;
    }

    public float getPrecioTv() {
        return precioTv;
    }

    public void setPrecioTv(float precioTv) {
        this.precioTv = precioTv;
    }

    public float getPrecioSer() {
        return precioSer;
    }

    public void setPrecioSer(float precioSer) {
        this.precioSer = precioSer;
    }

    public float getPrecioServicioLi() {
        return precioServicioLi;
    }

    public void setPrecioServicioLi(float precioServicioLi) {
        this.precioServicioLi = precioServicioLi;
    }

    public float getPrecioBare() {
        return precioBare;
    }

    public void setPrecioBare(float precioBare) {
        this.precioBare = precioBare;
    }

    public float getPrecioSpa() {
        return precioSpa;
    }

    public void setPrecioSpa(float precioSpa) {
        this.precioSpa = precioSpa;
    }

    public float getPrecioGim() {
        return precioGim;
    }

    public void setPrecioGim(float precioGim) {
        this.precioGim = precioGim;
    }

    public float getPrecioServiciosAdd() {
        return precioServiciosAdd;
    }

    public void setPrecioServiciosAdd(float precioServiciosAdd) {
        this.precioServiciosAdd = precioServiciosAdd;
    }
     


    @Override
    public String toString() {
        return "ServicioAdicional{" + "tvCable=" + tvCable + ", servicioHabitacion=" + servicioHabitacion + ", servicioLimpieza=" + servicioLimpieza + ", precioTvCable=" + precioTvCable + ", precioServicioHabitacion=" + precioServicioHabitacion + ", precioServicioLimpieza=" + precioServicioLimpieza ;
    }
    
    
        
        
}
