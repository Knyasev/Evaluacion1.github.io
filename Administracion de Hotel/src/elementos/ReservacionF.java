/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;


public class ReservacionF extends Habitacion{
    private Habitacion habitacion;
    private Cliente cliente;
    private ServiciosAdicionales serviciosAdicionales;
    
    private static String Id;
    private static String dias;
    private static String personas;
    private static String Total;
    
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ServiciosAdicionales getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(ServiciosAdicionales serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public static String getId() {
        return Id;
    }

    public static void setId(String Id) {
        ReservacionF.Id = Id;
    }

    public static String getDias() {
        return dias;
    }

    public static void setDias(String dias) {
        ReservacionF.dias = dias;
    }

    public static String getPersonas() {
        return personas;
    }

    public static void setPersonas(String personas) {
        ReservacionF.personas = personas;
    }

    public static String getTotal() {
        return Total;
    }

    public static void setTotal(String Total) {
        ReservacionF.Total = Total;
    } 
}
