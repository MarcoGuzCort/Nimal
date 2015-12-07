package servicios;
import java.sql.*;

public class Conexion {
   public Statement statement;
   private static Connection cnx = null;
   public Connection obtenerConexion() {
         try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Class. forName ("com.mysql.jdbc.Driver");
            cnx= DriverManager.getConnection("jdbc:mysql://db4free.net:3306/bodega","nimal","changos12");
            statement = cnx.createStatement();
         } catch (ClassNotFoundException |SQLException e) {
             System.out.printf("error de conexion");
      }
      return cnx;
   }
 
}