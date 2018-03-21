import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args){



        System.out.println("Ejemplo de conexión a MySQL.");
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "prueba";
        String userName = "root";
        String password = "doda";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Conectado a la base de datos");
           // conn.close();
           // System.out.println("Desconectado de la base de datos");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Empleado empleado = new Empleado("Arnau", "Soguero", "100000","1");
        Empleado empleado2 = new Empleado("David", "Barbero", "50000","2");
        Empleado empleado3 = new Empleado("Ruben", "Cobos", "25000","3");
        Session tabla = Factory.createSession();

        tabla.save(empleado);
        tabla.save(empleado2);
        tabla.save(empleado3);
       Departamento departamento = (Departamento)tabla.get(Empleado.class, 5);

        Statement s = null;
        try {
            s = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = s.executeQuery ("select * from Usuarios");
            while (rs.next())
            {
                System.out.println ( rs.getString (1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}