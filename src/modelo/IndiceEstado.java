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

//OBTENER DATOS DE LOS ESTADOS ACTIVO/INACTIVO
public class IndiceEstado {
    private int id_estado;
    private String estado;

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

      public String toString(){
        return this.estado;
    }
      
      //DATOS DE ESTADOS DISPONIBLES
    public Vector<IndiceEstado> mostrarEstado()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceEstado> datos = new Vector<IndiceEstado>();
    IndiceEstado dat=null;
     
    try{
        String sql = "Select * from estado";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceEstado();
        dat.setId_estado(1);
        dat.setEstado("Seleccione Estado");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceEstado();
            dat.setId_estado(rs.getInt("id_estado"));
            dat.setEstado(rs.getString("estado"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
