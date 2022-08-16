
package elementos;

public class Habitacion {
    private static String idhabitacion;
    private static String precioHabitacion;
    private static String Tipo;
    private static String numCama;
    private static String numBanios;
    private static String numeroHabitacion;

    public static String getIdhabitacion() {
        return idhabitacion;
    }

    public static void setIdhabitacion(String idhabitacion) {
        Habitacion.idhabitacion = idhabitacion;
    }



    public static String getPrecioHabitacion() {
        return precioHabitacion;
    }

    public static void setPrecioHabitacion(String precioHabitacion) {
        Habitacion.precioHabitacion = precioHabitacion;
    }

    public static String getTipo() {
        return Tipo;
    }

    public static void setTipo(String tipo) {
       Habitacion.Tipo = tipo;
    }

    public static String getNumCama() {
        return numCama;
    }

    public static void setNumCama(String numCama) {
        Habitacion.numCama = numCama;
    }

    public static String getNumBanios() {
        return numBanios;
    }

    public static void setNumBanios(String numBanios) {
        Habitacion.numBanios = numBanios;
    }

    public static String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public static void setNumeroHabitacion(String numeroHabitacion) {
        Habitacion.numeroHabitacion = numeroHabitacion;
    }
     
}
