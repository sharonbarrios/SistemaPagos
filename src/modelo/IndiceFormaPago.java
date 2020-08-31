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

// OBTENCIÓN DE DATOS DE LAS FORMAS DE PAGO
public class IndiceFormaPago {
    private int id_forma_pago;
    private String forma_pago;

    public int getId_forma_pago() {
        return id_forma_pago;
    }

    public void setId_forma_pago(int id_forma_pago) {
        this.id_forma_pago = id_forma_pago;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

   
      public String toString(){
        return this.forma_pago;
    }
      
      //DATOS DE FORMAS DE PAGO DISPONIBLES
    public Vector<IndiceFormaPago> mostrarFormaPago()
    {
    PreparedStatement ps = null;
    ResultSet rs=null;
    Conexion con= new Conexion();
    Connection conn= con.getConexion();
    
    Vector<IndiceFormaPago> datos = new Vector<IndiceFormaPago>();
    IndiceFormaPago dat=null;
     
    try{
        String sql = "Select * from forma_pago";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        
        dat = new IndiceFormaPago();
        dat.setId_forma_pago(0);
        dat.setForma_pago("Seleccione Forma de Pago");
        datos.add(dat);
        
        while(rs.next()){
            dat = new IndiceFormaPago();
            dat.setId_forma_pago(rs.getInt("id_forma_pago"));
            dat.setForma_pago(rs.getString("forma_pago"));
            datos.add(dat);
        }
        rs.close();
    } catch (SQLException ex){
        System.err.println(ex.toString());
    }
    
    return datos;
    }
    
}