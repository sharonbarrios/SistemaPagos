/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sharon
 */

//DATOS PARA LA CONEXIÓN A LA BASE DE DATOS
public class Conexion {
     private final String base="sistemacolegio";
    private final String user="root";
    private final String password=" ";
    private final String url="jdbc:mysql://localhost/"+base+"?useSSL=false&serverTimezone=UTC";
    
    
    //FUNCIÓN PARA CONEXIÓN A BASE DE DATOS
    public Connection getConexion()     
            
    {   Connection con=null;
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con= DriverManager.getConnection(url, user, password);
    
       } catch(SQLException e)
        {
            System.err.println(e);
            
    } catch (ClassNotFoundException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        
    }
       return con;
    }
}
