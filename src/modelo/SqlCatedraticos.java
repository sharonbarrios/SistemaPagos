/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.toedter.calendar.JYearChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sharon
 */
public class SqlCatedraticos extends Conexion {

    //REGISTRO DE CATEDRATICO EN LA BASE DE DATOS
    public boolean registrarCatedratico(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO catedraticos(codigo_catedratico, id_genero, id_estado, "
                + "primernombre_catedratico, segundonombre_catedratico, tercernombre_catedratico, "
                + "primerapellido_catedratico, segundoapellido_catedratico, numero_catedratico,"
                + "correo_catedratico, fecha_nac_cat) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Cat.getCod_catedratico());
            ps.setInt(2, Cat.getId_genero());
            ps.setInt(3, Cat.getId_estado());
            ps.setString(4, Cat.getPrimerNombre_cat());
            ps.setString(5, Cat.getSegundoNombre_cat());
            ps.setString(6, Cat.getTercerNombre_cat());
            ps.setString(7, Cat.getPrimerApellido_cat());
            ps.setString(8, Cat.getSegundoApellido_cat());
            ps.setString(9, Cat.getNumero_catedratico());
            ps.setString(10, Cat.getCorreo_catedratico());
            ps.setString(11, Cat.getFecha());
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

    // MODIFICACIÓN DE CATEDRÁTICO EN LA BASE DE DATOS
    public boolean modificarCatedratico(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE catedraticos SET codigo_catedratico=?, id_genero=?, id_estado=?, primernombre_catedratico=?,"
                + "segundonombre_catedratico=?, tercernombre_catedratico=?, primerapellido_catedratico=?,"
                + "segundoapellido_catedratico=?, numero_catedratico=?, correo_catedratico=?, fecha_nac_cat=? "
                + "WHERE id_catedratico=?";
         System.out.println(sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Cat.getCod_catedratico());
            ps.setInt(2, Cat.getId_genero());
            ps.setInt(3, Cat.getId_estado());
            ps.setString(4, Cat.getPrimerNombre_cat());
            ps.setString(5, Cat.getSegundoNombre_cat());
            ps.setString(6, Cat.getTercerNombre_cat());
            ps.setString(7, Cat.getPrimerApellido_cat());
            ps.setString(8, Cat.getSegundoApellido_cat());
            ps.setString(9, Cat.getNumero_catedratico());
            ps.setString(10, Cat.getCorreo_catedratico());
            ps.setString(11, Cat.getFecha());
            ps.setInt(12, Cat.getId_catedratico());
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

    // REGISTRO DE HORA DE ENTRADA DE CATEDRÁTICOS EN LA BASE DE DATOS
      public boolean registrarAsistencia(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO asistencia( id_catedratico, codigo_catedratico, fecha, "
                + "hora_entrada, observacion_asistencia) "
                + " VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Cat.getId_catedratico());
            ps.setString(2, Cat.getCod_catedratico());    
            ps.setString(3, Cat.getFecha_asistencia());
            ps.setString(4, Cat.getHora_entrada());
            ps.setString(5, Cat.getObservacion_asistencia());
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
      
      // REGISTRO DE HORA DE SALIDA DE LOS CATEDRÁTICOS EN LA BASE DE DATOS
       public boolean actualizarAsistencia(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE asistencia SET hora_salida=?, observacion_asistencia=? "
                + "WHERE fecha=CURDATE() AND id_catedratico=?";
         System.out.println(sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Cat.getHora_salida());
            ps.setString(2, Cat.getObservacion_asistencia());
            ps.setInt(3, Cat.getId_catedratico());
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

       // REGISTRO DE ASIGNACIÓN DE GRADO A CATEDRÁTICOS
       public boolean registrarAsignacion(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO asignacion_grado( id_grado, id_catedratico, codigo_catedratico, anio ) "
                + " VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Cat.getId_grado());
            ps.setInt(2, Cat.getId_catedratico());
            ps.setString(3, Cat.getCod_catedratico()); 
            ps.setInt(4, Cat.getAnio());
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
       // MODIFICAR ASIGNACIÓN DE CATEDRÁTICO EN LA BASE DE DATOS
        public boolean actualizarAsignacion(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE asignacion_grado SET id_catedratico=?, codigo_catedratico=? "
                + "WHERE id_grado=? and anio=?";
         System.out.println(sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Cat.getId_catedratico());
            ps.setString(2, Cat.getCod_catedratico()); 
            ps.setInt(3, Cat.getId_grado());
            ps.setInt(4, Cat.getAnio());
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

        // ELIMINACIÓN DE CURSO 
    public boolean eliminarCurso(CursosHorario Curso) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM Curso WHERE id_curso=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Curso.getCurso());
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

    // BÚSQUEDA DE CATEDRÁTICO EN LA BASE DE DATOS POR CÓDIGO
    public boolean buscarCatedratico(Catedraticos Cat) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM catedraticos WHERE codigo_catedratico=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Cat.getCod_catedratico());
            rs = ps.executeQuery();

            if (rs.next()) {
                Cat.setId_catedratico(Integer.parseInt(rs.getString("id_catedratico")));
                Cat.setCod_catedratico(rs.getString("codigo_catedratico"));
                Cat.setId_genero(rs.getInt("id_genero"));
                Cat.setPrimerNombre_cat(rs.getString("primernombre_catedratico"));
                Cat.setSegundoNombre_cat(rs.getString("segundonombre_catedratico"));
                Cat.setTercerNombre_cat(rs.getString("tercernombre_catedratico"));
                Cat.setPrimerApellido_cat(rs.getString("primerapellido_catedratico"));
                Cat.setSegundoApellido_cat(rs.getString("segundoapellido_catedratico"));
                Cat.setNumero_catedratico(rs.getString("numero_catedratico"));
                Cat.setCorreo_catedratico(rs.getString("correo_catedratico"));
                Cat.setFecha(rs.getString("fecha_nac_cat"));
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
    
    // OBTENER DATOS DE CATEDRÁTICOS Y MOSTRARLOS EN TABLA
   public void LlenarTabla(JTable tablaC, JTextField buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
           String where=" order by e.estado asc";
           
           if(!"".equals(campo)){
               where= "WHERE c.codigo_catedratico= '" + campo + "' order by e.estado asc";
           }
           
           
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="Select c.codigo_catedratico, concat_ws(' ', c.primernombre_catedratico, c.segundonombre_catedratico,"
               + "c.tercernombre_catedratico), concat_ws(' ', c.primerapellido_catedratico, "
               + "c.segundoapellido_catedratico), c.numero_catedratico, "
               + "c.correo_catedratico, e.estado from Catedraticos as c inner join estado as e on c.id_estado=e.id_estado "+ where;
       
           System.out.println(sql);
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Catedrático");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("Número");
       modelo.addColumn("Correo Electrónico");
       modelo.addColumn("Estado");
       
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
   // OBTENER DATOS DE ASISTENCIA DE CATEDRÁTICOS Y MOSTRAR EN TABLA
   public void LlenarAsistencia(JTable tablaC) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
           
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="Select s.codigo_catedratico, concat_ws(' ', c.primernombre_catedratico, c.segundonombre_catedratico,\n" +
"               c.tercernombre_catedratico, c.primerapellido_catedratico,\n" +
"               c.segundoapellido_catedratico), s.fecha, s.hora_entrada, s.hora_salida, s.observacion_asistencia\n" +
"				from Catedraticos as c inner join asistencia as s on c.CODIGO_CATEDRATICO=s.CODIGO_CATEDRATICO\n" +
"                where s.fecha=CURDATE()";
       
       System.out.println(sql);
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Catedrático");
       modelo.addColumn("Nombre Catedrático");
       modelo.addColumn("Fecha");
       modelo.addColumn("Hora Entrada");
       modelo.addColumn("Hora Salida");
       modelo.addColumn("Observaciones");
       
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
   
   //MOSTRAR DATOS DE ASIGNACIÓN DE GRADO A CATEDRÁTICOS
    public void LlenarAsignacion(JTable tablaC, String anio) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);  
       
       String where;
       where= " n.anio= '" + anio + "' order by g.id_grado";
           
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="select \n" +
"IF(g.id_nivel!=1,concat_ws(' ', g.grado, n.nivel) , g.grado) as 'Grado', IFNULL(a.CODIGO_CATEDRATICO,\" \") as 'codigo', concat_ws(' ', c.primernombre_catedratico, \n" +
"c.segundonombre_catedratico, c.tercernombre_catedratico, c.primerapellido_catedratico,\n" +
"c.segundoapellido_catedratico) as 'Nombre' from grado as g \n" +
"cross join (SELECT DISTINCT anio FROM asignacion_grado) AS n\n" +
"left join asignacion_grado as a on g.id_grado=a.id_grado\n" +
"    and n.anio=a.anio\n" +
"left join catedraticos as c on a.ID_CATEDRATICO=c.ID_CATEDRATICO\n" +
"left join nivel as n on g.ID_NIVEL=n.ID_NIVEL\n" +
"where " + where ;
       
       System.out.println(sql);
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Grado");
       modelo.addColumn("Código Catedrático");
       modelo.addColumn("Nombre");
       
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
    // BÚSQUEDA DE CATEDRÁTICOS EN LA BASE DE DATOS
   public boolean buscarCatedraticos(Catedraticos cat) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "Select id_catedratico, codigo_catedratico, concat_ws(' ', primernombre_catedratico, segundonombre_catedratico, "
                + "tercernombre_catedratico, primerapellido_catedratico, segundoapellido_catedratico) as 'nombre_catedratico'" +
        "from catedraticos WHERE id_estado=1 and codigo_catedratico=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getCod_catedratico());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                cat.setId_catedratico(Integer.parseInt(rs.getString("id_catedratico")));
                cat.setCod_catedratico(rs.getString("codigo_catedratico"));
                cat.setNombre_catedratico(rs.getString("nombre_catedratico"));
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
   
   // VERIFICACIÓN DE EXISTENCIA DE CATEDRÁTICOS EN LA BASE DE DATOS
    public int existeCatedratico(String catedratico) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id_catedratico) FROM catedraticos WHERE codigo_catedratico = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, catedratico);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }
    
        // VERIFICACIÓN DE EMAIL VÁLIDO
        public boolean esEmail(String correo) {

        //patron para validar correo
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }
        // ASIGNACIÓN DE CÓDIGO A CATEDRÁTICO AL REGISTRAR
         public void numeralCat(JTextField contar){
      
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion(); 
       
        String sql = "select lpad((IFNULL(MAX(codigo_catedratico)+1,1)),3,0) as 'numero'\n" +
        "from catedraticos";
        
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
         
         
         // VERIFICACIÓN SI EXISTE HORA DE ENTRADA DEL DIA ACTUAL
         public int existeEntrada(String catedratico) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id_catedratico) FROM asistencia WHERE FECHA=CURDATE() AND \n" +
        "CODIGO_CATEDRATICO = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, catedratico);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }
    
         // VERIFICACIÓN DE EXISTENCIA DE ASIGNACIÓN DE CATEDRÁTICO
        public int existeAsignacion(String anio, String grado) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id_catedratico) FROM asignacion_grado WHERE " +
        "anio = ? and id_grado= ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, anio);
             ps.setString(2, grado);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }
     
}