/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//CLASE QUE SE CONECTE A ORACLE

//importamos el paquete javas.ql para usar oracle y su conector
import java.sql.*;
public class ModeloConexion {
    
    public static Connection conectarse (String login, String password) throws Exception {
        
        //URL De conexion
        // Conector jbdc = coneccion a base de datos, oracle el servicio (programa), thing (cliente ligero) 
        String url= "jdbc:oracle:thin@localhost:1521:orcl";
        Class.forName("oracle.jdbc.OracleDriver");
       Connection con= DriverManager.getConnection(url, login, password);
       return con;
    }
    
}
