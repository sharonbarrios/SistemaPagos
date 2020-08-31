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

//DATOS DE LOS GRADOS 
public class IndiceGrado {
    private int id_grado;
    private String grado;


    public int getId_grado() {
        return id_grado;
    }

    public void setId_grado(int id_grado) {
        this.id_grado = id_grado;
    }
    

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
      public String toString(){
        return this.grado;
    }
      
      //MOSTRAR GRADOS DISPONIBLES
    public Vector<IndiceGrado> mostrarGrado()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceGrado> datos = new Vector<IndiceGrado>();
    IndiceGrado dat=null;
     
    try{
        String sql = "Select * from grado";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceGrado();
        dat.setId_grado(0);
        dat.setGrado("Seleccione Grado");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceGrado();
            dat.setId_grado(rs.getInt("id_grado"));
            dat.setGrado(rs.getString("grado"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
     public Vector<IndiceGrado> mostrarGrados(Integer idNivel)
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceGrado> datos = new Vector<IndiceGrado>();
    IndiceGrado dat=null;
     
    try{
        String sql = "Select * from grado WHERE id_nivel=" + idNivel;
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceGrado();
        dat.setId_grado(0);
        dat.setGrado("Seleccione Grado");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceGrado();
            dat.setId_grado(rs.getInt("id_grado"));
            dat.setGrado(rs.getString("grado"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
