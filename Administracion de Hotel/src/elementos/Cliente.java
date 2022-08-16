
package elementos;

public class Cliente {
    private static String nombre;
    private static String cedula;
    private static String telefono;
    private static String direccion;   

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Cliente.nombre = nombre;
    }

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        Cliente.cedula = cedula;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Cliente.telefono = telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Cliente.direccion = direccion;
    }
    
}
