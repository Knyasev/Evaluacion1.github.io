package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSql {
    Connection con = null;
    String  url="jdbc:postgresql://localhost/camerum";
    String  usuario="postgres";
    String  clave="jhonel.2004";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectar"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
