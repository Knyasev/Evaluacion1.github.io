/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.model;

/**
 *
 * @author Gonzalez G
 */
public class ReservacionComida {
    private int numeroReservacion;
    private float precioAlmuerzo;
    private float precioDesayuno;
    private float precioCena;
    
    private String Almuerzo;
    private String Desayuno;
    private String Cena;
    
    private boolean quiereAlmuerzo;
    private boolean quiereDesayuno;
    private boolean quiereCena;
    
    private Float precio;
    private Float totalComida;
    private Integer numDias=0;
    
    private float num1;
    private float num2;
    private float num3;
    
    private Comedor comedor;
    private Habitacion habitacion;
    private Chef chef;
    private Reservacion reservacion;

    public ReservacionComida(float precioAlmuerzo, float precioDesayuno, float precioCena, String Almuerzo, String Desayuno, String Cena, boolean quiereAlmuerzo, boolean quiereDesayuno, boolean quiereCena) {
        this.precioAlmuerzo = precioAlmuerzo;
        this.precioDesayuno = precioDesayuno;
        this.precioCena = precioCena;
        this.Almuerzo = Almuerzo;
        this.Desayuno = Desayuno;
        this.Cena = Cena;
        this.quiereAlmuerzo = quiereAlmuerzo;
        this.quiereDesayuno = quiereDesayuno;
        this.quiereCena = quiereCena;
    }

    



    public float precioComidaPorHuesped(Reservacion reservacion){
         numDias=reservacion.getTiempoEstancia();
         if(quiereAlmuerzo==true){
             num1=precioAlmuerzo*reservacion.getNumeroHuespedes();
             num1=num1*reservacion.getTiempoEstancia();
             //System.out.println(num1);
         }
         if(quiereDesayuno==true){
             num2=precioDesayuno*reservacion.getNumeroHuespedes();
             num2=num2*reservacion.getTiempoEstancia();
             //System.out.println(num2);
         }
         if(quiereCena==true){
             num3=precioCena*reservacion.getNumeroHuespedes();
             num3=num3*reservacion.getTiempoEstancia();
             //System.out.println(num3);
         }
          totalComida=num1+num2+num3;
          
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

    public int getNumeroReservacion() {
        return numeroReservacion;
    }

    public void setNumeroReservacion(int numeroReservacion) {
        this.numeroReservacion = numeroReservacion;
    }

    public String getAlmuerzo() {
        return Almuerzo;
    }

    public void setAlmuerzo(String Almuerzo) {
        this.Almuerzo = Almuerzo;
    }

    public String getDesayuno() {
        return Desayuno;
    }

    public void setDesayuno(String Desayuno) {
        this.Desayuno = Desayuno;
    }

    public String getCena() {
        return Cena;
    }

    public void setCena(String Cena) {
        this.Cena = Cena;
    }

    public boolean isQuiereAlmuerzo() {
        return quiereAlmuerzo;
    }

    public void setQuiereAlmuerzo(boolean quiereAlmuerzo) {
        this.quiereAlmuerzo = quiereAlmuerzo;
    }

    public boolean isQuiereDesayuno() {
        return quiereDesayuno;
    }

    public void setQuiereDesayuno(boolean quiereDesayuno) {
        this.quiereDesayuno = quiereDesayuno;
    }

    public boolean isQuiereCena() {
        return quiereCena;
    }

    public void setQuiereCena(boolean quiereCena) {
        this.quiereCena = quiereCena;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum3() {
        return num3;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }
    
    



    


    
    
    
}
