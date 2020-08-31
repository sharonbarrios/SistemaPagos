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

//OBTENER DATOS PARA EL TIPO DE BECA 
public class IndiceBeca {
    private int id_beca;
    private String tipo_beca;

    public int getId_beca() {
        return id_beca;
    }

    public void setId_beca(int id_beca) {
        this.id_beca = id_beca;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }

    public void setTipo_beca(String tipo_beca) {
        this.tipo_beca = tipo_beca;
    }
 
      public String toString(){
        return this.tipo_beca;
    }
      
      //DATOS DE BECAS DISPONIBLES
      
    public Vector<IndiceBeca> mostrarBeca()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceBeca> datos = new Vector<IndiceBeca>();
    IndiceBeca dat=null;
     
    try{
        String sql = "Select * from becas";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceBeca();
        dat.setId_beca(0);
        dat.setTipo_beca("Seleccione Tipo de Beca");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceBeca();
            dat.setId_beca(rs.getInt("id_beca"));
            dat.setTipo_beca(rs.getString("tipo_beca"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
