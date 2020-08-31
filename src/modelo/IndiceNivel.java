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


//DATOS DE LOS NIVELES PRE-PRIMARIA/PRIMARIA/BASICOS
public class IndiceNivel {
    private int id_nivel;
    private String nivel;
    

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
      public String toString(){
        return this.nivel;
    }
      
      //MOSTRAR LOS NIVELES DISPONIBLES
    public Vector<IndiceNivel> mostrarNivel()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceNivel> datos = new Vector<IndiceNivel>();
    IndiceNivel dat=null;
     
    try{
        String sql = "Select * from nivel";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceNivel();
        dat.setId_nivel(0);
        dat.setNivel("Seleccione Nivel");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceNivel();
            dat.setId_nivel(rs.getInt("id_nivel"));
            dat.setNivel(rs.getString("nivel"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
