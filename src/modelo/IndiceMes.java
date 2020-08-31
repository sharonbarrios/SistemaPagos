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

//DATOS DE LOS MESES
public class IndiceMes {
    private int id_mes;
    private String mes;

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
      public String toString(){
        return this.mes;
    }
      
      //MOSTRAR LOS MESES DEL CICLO ESCOLAR
    public Vector<IndiceMes> mostrarMes()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceMes> datos = new Vector<IndiceMes>();
    IndiceMes dat=null;
     
    try{
        String sql = "Select * from meses_pago";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceMes();
        dat.setId_mes(0);
        dat.setMes("Seleccione Mes a Pagar");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceMes();
            dat.setId_mes(rs.getInt("id_mes_pago"));
            dat.setMes(rs.getString("mes_pago"));
            datos.add(dat);
        
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}
