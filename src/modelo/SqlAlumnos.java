/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sharon
 */
public class SqlAlumnos extends Conexion {

    // REGISTRO DE ALUMNOS EN LA BASE DE DATOS
    public boolean registrarAlumno(Alumnos alu) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO alumno(codigo_alumno, id_genero, "
                + "primer_nombre, segundo_nombre, tercer_nombre, "
                + "primer_apellido, segundo_apellido, fecha_nac, parentezco_encargado,nombre_encargado, apellido_encargado,"
                + "numero_encargado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, alu.getCodigo_alumno());
            ps.setInt(2, alu.getId_genero());
            ps.setString(3, alu.getPrimer_nombre());
            ps.setString(4, alu.getSegundo_nombre());
            ps.setString(5, alu.getTercer_nombre());
            ps.setString(6, alu.getPrimer_apellido());
            ps.setString(7, alu.getSegundo_apellido());
            ps.setString(8, alu.getFecha_nac());
            ps.setString(9, alu.getParentezco_encargado());
            ps.setString(10, alu.getNombre_encargado());
            ps.setString(11, alu.getApellido_encargado());
            ps.setString(12, alu.getNumero_encargado());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //MODIFICACIÓN DE ALUMNOS EN LA BASE DE DATOS
    public boolean modificarAlumno(Alumnos alu) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE alumno SET codigo_alumno=?, id_genero=?, primer_nombre=?, segundo_nombre=?, tercer_nombre=?, "
                + "primer_apellido=?, segundo_apellido=?, fecha_nac=?, parentezco_encargado=?,nombre_encargado=?, "
                + "apellido_encargado=?, numero_encargado=? WHERE id_alumno=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, alu.getCodigo_alumno());
            ps.setInt(2, alu.getId_genero());
            ps.setString(3, alu.getPrimer_nombre());
            ps.setString(4, alu.getSegundo_nombre());
            ps.setString(5, alu.getTercer_nombre());
            ps.setString(6, alu.getPrimer_apellido());
            ps.setString(7, alu.getSegundo_apellido());
            ps.setString(8, alu.getFecha_nac());
            ps.setString(9, alu.getParentezco_encargado());
            ps.setString(10, alu.getNombre_encargado());
            ps.setString(11, alu.getApellido_encargado());
            ps.setString(12, alu.getNumero_encargado());
            ps.setInt(13, alu.getId_alumno());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }


    // BÚSQUEDA DE ALUMNOS EN LA BASE DE DATOS POR CÓDIGO
    public boolean buscarAlumnos(Alumnos alu) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM alumno WHERE codigo_alumno=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, alu.getCodigo_alumno());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                alu.setId_alumno(Integer.parseInt(rs.getString("id_alumno")));
                alu.setCodigo_alumno(rs.getString("codigo_alumno"));
                alu.setId_genero(rs.getInt("id_genero"));
                alu.setPrimer_nombre(rs.getString("primer_nombre"));
                alu.setSegundo_nombre(rs.getString("segundo_nombre"));
                alu.setTercer_nombre(rs.getString("tercer_nombre"));
                alu.setPrimer_apellido(rs.getString("primer_apellido"));
                alu.setSegundo_apellido(rs.getString("segundo_apellido"));
                alu.setFecha_nac(rs.getString("fecha_nac"));
                alu.setParentezco_encargado(rs.getString("parentezco_encargado"));
                alu.setNombre_encargado(rs.getString("nombre_encargado"));
                alu.setApellido_encargado(rs.getString("apellido_encargado"));
                alu.setNumero_encargado(rs.getString("numero_encargado"));
                return true;
            }

            return false;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    // OBTENER DATOS DE ALUMNOS Y MOSTRAR EN TABLA 
      public void LlenarTabla(JTable tablaC, JTextField buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
           String campo= buscar.getText();
           String where="";
           
           if(!"".equals(campo)){
               where= "WHERE a.codigo_alumno= " + campo + "";
           }
           
           
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="Select a.codigo_alumno, concat_ws(' ', a.primer_nombre, a.segundo_nombre,"
               + "a.tercer_nombre), concat_ws(' ', a.primer_apellido, "
               + "a.segundo_apellido), a.fecha_nac, g.genero, concat_ws(' ', a.nombre_encargado, a.apellido_encargado), "
               + "a.parentezco_encargado, a.numero_encargado from Alumno as a inner join genero as g on "
               + "a.id_genero=g.id_genero "+ where;
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("Fecha de Nacimiento");
       modelo.addColumn("Género");
       modelo.addColumn("Encargado");
       modelo.addColumn("Parentezco");
       modelo.addColumn("No. Teléfono");
       
       while(rs.next()){
           Object[] filas=new Object[cantidadColumnas];
           for(int i=0; i<cantidadColumnas; i++)
           {
               filas[i]= rs.getObject(i+1);
           }
           modelo.addRow(filas);
       }
   }   catch(SQLException ex) {
           System.out.println(ex.toString());
}
}
      
      // VERIFICAR EXISTENCIA DE ALUMNO
       public int existeAlumno(String alumno) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id_alumno) FROM alumno WHERE codigo_alumno = ?";
         System.out.println(sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, alumno);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlAlumnos.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }
       
       //ASIGNAR CÓDIGO A ALUMNO AL REGISTRARLO
 public void numeralAlu(JTextField contar){
      
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion(); 
       
        String sql = "select lpad((IFNULL(MAX(codigo_alumno)+1,1)),4,0) as 'numero'\n" +
"        from alumno " ;
        
       try{
   
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
        if (rs!=null){
        while(rs.next()){
        contar.setText(rs.getObject("numero").toString());
        }
}
   }   catch(SQLException ex) {
           System.out.println(ex.toString());
}  finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
      }
     
}
