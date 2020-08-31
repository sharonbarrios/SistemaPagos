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

//OBTENER DATOS DE GÉNERO
public class IndiceGenero {
    private int id_genero;
    private String genero;

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    
      public String toString(){
        return this.genero;
    }
      
      //MOSTRAR DATOS DE GÉNERO
      
    public Vector<IndiceGenero> mostrarGenero()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceGenero> datos = new Vector<IndiceGenero>();
    IndiceGenero dat=null;
     
    try{
        String sql = "Select * from genero";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceGenero();
        dat.setId_genero(0);
        dat.setGenero("Seleccione Género");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceGenero();
            dat.setId_genero(rs.getInt("id_genero"));
            dat.setGenero(rs.getString("genero"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
