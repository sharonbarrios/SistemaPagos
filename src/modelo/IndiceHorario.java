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

// DATOS DE LOS HORARIOS
public class IndiceHorario {
    private int id_horario;
    private String horario;

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    
      public String toString(){
        return this.horario;
    }
      
      //OBTENER DATOS DE LOS HORARIOS
    public Vector<IndiceHorario> mostrarHorario()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceHorario> datos = new Vector<IndiceHorario>();
    IndiceHorario dat=null;
     
    try{
        String sql = "Select * from horario";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceHorario();
        dat.setId_horario(0);
        dat.setHorario("Seleccione Horario");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceHorario();
            dat.setId_horario(rs.getInt("id_horario"));
            dat.setHorario(rs.getString("horario"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
