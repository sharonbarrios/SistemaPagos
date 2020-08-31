/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Sharon
 */

// DATOS DEL TIPO DE USUARIO
public class IndiceUsuarios {
    private int id_tipo_usuario;
    private String usuario;

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    
      public String toString(){
        return this.usuario;
    }
      
      //MOSTRAR TIPOS DE USUARIO DISPONIBLES
    public Vector<IndiceUsuarios> mostrarUsuarios()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceUsuarios> datos = new Vector<IndiceUsuarios>();
    IndiceUsuarios dat=null;
     
    try{
        String sql = "Select * from tipo_usuario";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceUsuarios();
        dat.setId_tipo_usuario(0);
        dat.setUsuario(" Seleccione Tipo de Usuario");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceUsuarios();
            dat.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
            dat.setUsuario(rs.getString("tipo_usuario"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
