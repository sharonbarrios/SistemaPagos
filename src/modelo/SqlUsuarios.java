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
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sharon
 */
public class SqlUsuarios extends Conexion {
    
    // REGISTRO DE USUARIO EN LA BASE DE DATOS
      public boolean registrar(Usuarios usr) throws SQLException{

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios(id_usuario, id_tipo_usuario, id_genero, usuario, contrasena, nombre_usuario,"
                + "apellido_usuario, correo_usuario, estado_usuario) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId_usuario());
            ps.setInt(2, usr.getId_tipo_usuario());
            ps.setInt(3, usr.getId_genero());
            ps.setString(4, usr.getUsuario());
            ps.setString(5, usr.getContrasena());
            ps.setString(6, usr.getNombre_usuario());
            ps.setString(7, usr.getApellido_usuario());
            ps.setString(8, usr.getCorreo_usuario());
            ps.setString(9, usr.getEstado_usuario());
           
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

      //INICIO DE SESIÓN Y ACTUALIZACIÓN DE ÚLTIMA SESIÓN DE USUARIO
    public boolean login(Sesion usr) throws SQLException{

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql;
          sql = "SELECT u.id_usuario, u.usuario, u.contrasena, u.nombre_usuario, u.id_tipo_usuario, t.tipo_usuario FROM usuarios As u INNER JOIN tipo_usuario As t ON u.id_tipo_usuario=t.id_tipo_usuario WHERE usuario= ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(3))) {

                    String sqlUpdate = "UPDATE usuarios SET ultima_sesion = ? WHERE id_usuario=?";

                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_sessions());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setNombre_tipo(rs.getString(6));
                    

                    return true;
                } else {
                    return false;
                }
            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // VERIFICACIÓN DE EXISTENCIA DE USUARIO
    public int existeUsuario(String usuario) throws SQLException{

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id_usuario) FROM usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // VERIFICACIÓN DE EMAIL
    public boolean esEmail(String correo) {

        //patron para validar correo
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }
    
     public boolean modificarUsuario(Usuarios usr) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE usuarios SET  id_tipo_usuario=?,"
                + "id_genero=?, usuario=?, contrasena=?,"
                + "nombre_usuario=?, apellido_usuario=?, correo_usuario=? "
                + "WHERE id_usuario=?";
         System.out.println(sql);

        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1, usr.getId_tipo_usuario());
            ps.setInt(2, usr.getId_genero());
            ps.setString(3, usr.getUsuario());
            ps.setString(4, usr.getContrasena());
            ps.setString(5, usr.getNombre_usuario());
            ps.setString(6, usr.getApellido_usuario());
            ps.setString(7, usr.getCorreo_usuario());
            ps.setInt(8, usr.getId_usuario());
       
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
    
     // BÚSQUEDA DE USUARIO EN LA BASE DE DATOS
     public boolean buscarUsuario(Usuarios usr) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuarios WHERE usuario=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                usr.setId_usuario(Integer.parseInt(rs.getString("id_usuario")));
                usr.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
                usr.setId_genero(rs.getInt("id_genero"));
                usr.setUsuario(rs.getString("usuario"));
                usr.setContrasena(rs.getString("contrasena"));
                usr.setNombre_usuario(rs.getString("nombre_usuario"));
                usr.setApellido_usuario(rs.getString("apellido_usuario"));
                usr.setCorreo_usuario(rs.getString("correo_usuario"));
                usr.setEstado_usuario(rs.getString("estado_usuario"));
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
    
     //MOSTRAR DATOS DE LOS USUARIOS EN TABLA
     public void LlenarTabla(JTable tablaC, JTextField buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
           String where="";
           
           if(!"".equals(campo)){
               where= "WHERE usuario= '" + campo + "'";
           }
           
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       String sql="Select u.usuario, t.tipo_usuario, concat_ws(' ', u.nombre_usuario, u.apellido_usuario),"
               + "u.ultima_sesion, u.estado_usuario from usuarios as u inner join tipo_usuario as t "
               + "on u.id_tipo_usuario=t.id_tipo_usuario "+ where;
       
       System.out.println(sql);
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Usuario");
       modelo.addColumn("Tipo de Usuario");
       modelo.addColumn("Nombre");
       modelo.addColumn("Última sesión");
       //modelo.addColumn("Estado");
       
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
       finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
}
}
