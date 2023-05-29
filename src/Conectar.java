/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conectar{

    // Declaramos la conexion a mysql
    private static Connection con;

    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";

    //Entre comillas va la dirección donde este la BD que en este caso se llama prueba
    private static final String url = "jdbc:mysql://localhost:3306/drogueriav2";

    // Funcion que va conectarse a mi bd de mysql
    public Conectar() {

        // Reseteamos la conexion a la bd para que cada vez que nos conectemos se reconecte
        con = null;
        try {
            //Inicializamos el Driver "com.mysql.jdbc.Driver"
            Class.forName(driver);

            // Nos conectamos a la bd asignandole esta conexión al objeto de tipo Connection al cual enviamos los datos: url= dirección de la BD, user= usuario de la BD, pass= clave para la BD
            con = DriverManager.getConnection(url, user, pass);

            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        }catch(Exception e ){
            System.out.println("Error conectar "+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }

    public Connection createStetement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
