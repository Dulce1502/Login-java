package conexion;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class conexionMysql {
    Connection cn;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_java_mysql","root","");
            System.out.println("CONECTADO");
        }catch (Exception e ){
            System.out.println("ERROR DE CONEXION DB "+e);
        }
        return cn;
    }
}
