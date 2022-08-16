package sql;


import elementos.Cliente;
import elementos.Habitacion;
import elementos.ReservacionF;
import elementos.ServiciosAdicionales;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotel extends ConexionSql {

    java.sql.Statement st;
    ResultSet rs;
    Habitacion var = new Habitacion();
    

 /////Habitacion
    public void insertar(String precio, String tipo,String camas,String banios,String numero) {
        try { 
            Connection conexion = conectar();
            st = conexion.createStatement(); 
            String sql = "insert into habitacion (precio,tipo,camas,banios,numero)values('" + precio + "','"+ tipo +"','"+camas+"','"+banios+"','"+numero+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FAllo el registro, no se guardo", "Message" + e, JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
    public void visualizar(String numero ){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql="select * from habitacion where numero ='"+ numero +"';";
            rs = st.executeQuery(sql);
            if (rs.next()){
                
            var.setIdhabitacion(rs.getString("Idhabitacion"));
            var.setPrecioHabitacion(rs.getString("precio"));
            var.setTipo(rs.getString("tipo"));
            var.setNumCama(rs.getString("camas"));
            var.setNumBanios(rs.getString("banios"));
            var.setNumeroHabitacion(rs.getString("numero"));
            
            }else{
            var.setIdhabitacion("");
            var.setPrecioHabitacion("");
            var.setTipo        ("");
            var.setNumCama     ("");
            var.setNumBanios   ("");
            var.setNumeroHabitacion("");
            
            JOptionPane.showConfirmDialog(null,"No se encontró ningun registro","Sin registro",JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en el sistema de busqueda","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizar(String precio,String tipo, String camas,String banios,String numero,String idhabitacion){
        try {
            Connection conexion = conectar();
            st= conexion.createStatement();
            String sql ="update habitacion set precio='"+precio+"',tipo='"+tipo+"',camas='"+camas+"',banios='"+banios+"',numero='"+numero+"' where idhabitacion='"+idhabitacion+"'; " ;
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"Registro se actualizó correctamente","Correcto",JOptionPane.INFORMATION_MESSAGE);       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void borrar(String idhabitacion){
        try {
            Connection conexion=conectar();
            st= conexion.createStatement();
            String sql="delete from habitacion where idhabitacion='"+idhabitacion+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar registro"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
       }
    }  
    
    java.sql.Statement state;
    ResultSet result;
    Habitacion htacion = new Habitacion();
    ServiciosAdicionales sa= new ServiciosAdicionales();
    
    public void buscarNumero(String numero){
        try {
            Connection conexion = conectar();
            state = conexion.createStatement();
            String sql="select * from habitacion where numero ='"+ numero +"';";
            result = state.executeQuery(sql);
            if (result.next()){
                
            htacion.setIdhabitacion(result.getString("Idhabitacion"));
            htacion.setPrecioHabitacion(result.getString("precio"));
            htacion.setTipo(result.getString("tipo"));
            htacion.setNumCama(result.getString("camas"));
            htacion.setNumBanios(result.getString("banios"));
            htacion.setNumeroHabitacion(result.getString("numero"));

            
            }else{
            htacion.setIdhabitacion("");
            htacion.setPrecioHabitacion("");
            htacion.setTipo        ("");
            htacion.setNumCama     ("");
            htacion.setNumBanios   ("");
            htacion.setNumeroHabitacion("");
            
            JOptionPane.showConfirmDialog(null,"No se encontró ningun registro","Sin registro",JOptionPane.INFORMATION_MESSAGE);
            }
            state.close();
            conexion.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en el sistema de busqueda","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
 //Reservacion
     Cliente cli= new Cliente();
     ReservacionF res= new ReservacionF();
     ServiciosAdicionales ser= new ServiciosAdicionales();
    
    public void mostrarReservacion(String id ){
                try {
            Connection conexion = conectar();
            state = conexion.createStatement();
            String sql="select * from reservacion1 where idreservacion ='"+ id +"';";
            result = state.executeQuery(sql);
            if (result.next()){
                            htacion.setNumeroHabitacion(result.getString("numero"));

                
             htacion.setIdhabitacion(result.getString("habitacion"));
             htacion.setPrecioHabitacion(result.getString("precio"));
             htacion.setTipo(result.getString("tipo"));
             htacion.setNumCama(result.getString("cama"));
             htacion.setNumBanios(result.getString("banio"));
             cli.setNombre(result.getString("nombre"));
             cli.setCedula(result.getString("cedula"));
             cli.setDireccion(result.getString("direccion"));
             cli.setTelefono(result.getString("telefono"));
             res.setDias(result.getString("dias"));
             res.setPersonas(result.getString("persona"));
             ser.setSpa(result.getString("spa"));
             ser.setGimnacio(result.getString("gimnacio"));
             ser.setBar(result.getString("bar"));
             ser.setLimpieza(result.getString("limpieza"));
             sa.setPrecioSpa(result.getString("preciospa"));
             sa.setPrecioGimnacio(result.getString("preciogim"));
             sa.setPrecioBar(result.getString("preciobar"));
             sa.setPrecioLimpieza(result.getString("preciolimpieza"));
             sa.setTotalServicios(result.getString("total"));
            
            }else{
            htacion.setIdhabitacion("");
            htacion.setPrecioHabitacion("");
            htacion.setTipo        ("");
            htacion.setNumCama     ("");
            htacion.setNumBanios   ("");
            htacion.setNumeroHabitacion("");
            
            JOptionPane.showConfirmDialog(null,"No se encontró ningun registro","Sin registro",JOptionPane.INFORMATION_MESSAGE);
            }
            state.close();
            conexion.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en el sistema de busqueda","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarRes(String numero,String precio,String habitacion,String tipo,String cama,String banio,String nombre,String cedula,String telefono,String direccion,String dias,String spa,String gimnacio,String bar,String limpieza,String persona,String total,String precioSpa,String precioBar, String precioGim,String precioLimpieza) {
        try { 
            Connection conexion = conectar();
            st = conexion.createStatement(); 
            String sql = "insert into reservacion1 (numero,precio,habitacion,tipo,cama,banio,nombre,cedula,telefono,direccion,dias,spa,gimnacio,bar,limpieza,persona,total,preciospa,preciogim,preciobar,preciolimpieza)values('" + numero + "','" + precio + "','" + habitacion + "','" + tipo + "','" + cama + "','" + banio + "','" + nombre + "','" + cedula + "','" + telefono + "','" + direccion + "','" + dias + "','" + spa + "','" + gimnacio + "','" + bar + "','" + limpieza + "','" + persona + "','" + total + "','" + precioSpa + "','" + precioGim + "','" + precioBar + "','" + precioLimpieza + "');";     
            st.execute(sql);
            System.out.println("siis");
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "La reservacion se guardo correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La reservacion, no se guardo", "Message" + e, JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public void actualizarRes(String nombre,String cedula,String telefono,String direccion,String dias,String spa,String gimnacio,String bar,String limpieza,String persona,String total,String precioSpa,String precioBar, String precioGim,String precioLimpieza,String idReservacion){
        try {
            Connection conexion = conectar();
            st= conexion.createStatement();
            String sql ="update reservacion1 set nombre='"+nombre+"',cedula='"+cedula+"',telefono='"+telefono+"',direccion='"+direccion+"',dias='"+dias+"',spa='"+spa+"',gimnacio='"+gimnacio+"',bar='"+bar+"',limpieza='"+limpieza+"',persona='"+persona+"',total='"+total+"',preciospa='"+precioSpa+"',preciogim='"+precioGim+"',preciobar='"+precioBar+"',preciolimpieza='"+precioLimpieza+"' where idreservacion='"+idReservacion+"'; " ;
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"Registro se actualizó correctamente","Correcto",JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarRes(String idres){
        try {
            Connection conexion=conectar();
            st= conexion.createStatement();
            String sql="delete from reservacion1 where idreservacion='"+idres+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar registro"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }    
    }    
}