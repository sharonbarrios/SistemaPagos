/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.TextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sharon
 */
public class SqlInscripcion extends Conexion{
    // variable de imagen que aparece en el reporte de alumnos inscritos
    private final String logo="/Vista/imagenes/LogoRecibo.png";
    
    //BÚSQUEDA DE ALUMNO POR CÓDIGO
     public boolean buscarAlumnosIns(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "Select id_alumno, codigo_alumno, concat_ws(' ', primer_nombre, segundo_nombre, tercer_nombre, primer_apellido, segundo_apellido) as 'nombre_alumno'" +
        "from alumno WHERE codigo_alumno=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ins.getCodigo_alumno());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                ins.setId_alumno(Integer.parseInt(rs.getString("id_alumno")));
                ins.setCodigo_alumno(rs.getString("codigo_alumno"));
                ins.setNombre_alumno(rs.getString("nombre_alumno"));
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
     
     // BÚSQUEDA DE ALUMNOS INSCRITOS EN EL CICLO SELECCIONADO
     public boolean buscarAlumnosInscritos(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        
        String sql = "Select i.id_inscripcion, i.id_alumno, i.codigo_alumno, i.id_grado, i.cuota_ins,"
                + "cuota_mensual, i.ciclo_escolar, i.fecha_inscripcion, i.id_estado, i.id_beca, "
                + "concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido, a.segundo_apellido) as 'nombre_alumno'"
                + "from inscripciones as i inner join alumno as a on i.codigo_alumno=a.codigo_alumno WHERE i.codigo_alumno=? and i.ciclo_escolar=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ins.getCodigo_alumno());
            ps.setString(2, ins.getCiclo());
            rs = ps.executeQuery();
            System.out.println(sql);

            if (rs.next()) {
                
                ins.setId_inscripcion(Integer.parseInt(rs.getString("id_inscripcion")));
                ins.setId_alumno(Integer.parseInt(rs.getString("id_alumno")));
                ins.setCodigo_alumno(rs.getString("codigo_alumno"));
                ins.setId_grado(rs.getInt("id_grado"));
                ins.setCuota_ins(rs.getString("cuota_ins"));
                ins.setCuota_mensual(rs.getString("cuota_mensual"));
                ins.setCiclo(rs.getString("ciclo_escolar"));
                ins.setFecha_inscripcion(rs.getString("fecha_inscripcion"));
                ins.setId_estado(rs.getInt("id_estado"));
                ins.setId_beca(rs.getInt("id_beca")); 
                ins.setNombre_alumno(rs.getString("nombre_alumno"));
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
     
     // REGISTRO DE INSCRIPCIÓN DE ALUMNO
      public boolean registrarInscripcion(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO inscripciones(id_beca, id_alumno, codigo_alumno, id_grado, "
                + "cuota_ins, cuota_mensual, ciclo_escolar, "
                + "fecha_inscripcion, id_estado)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ins.getId_beca());
            ps.setInt(2, ins.getId_alumno());
            ps.setString(3, ins.getCodigo_alumno());
            ps.setInt(4, ins.getId_grado());
            ps.setString(5, ins.getCuota_ins());
            ps.setString(6, ins.getCuota_mensual());
            ps.setString(7, ins.getCiclo());
            ps.setString(8, ins.getFecha_inscripcion());
            ps.setInt(9, ins.getId_estado());
            ps.execute();
              System.out.println(sql);
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
     
      // MODIFICACIÓN DE INSCRIPCIÓN DE ALUMNO
        public boolean modificarInscripcion(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE inscripciones SET id_alumno=?, codigo_alumno=?, id_grado=?, cuota_ins=?, cuota_mensual=?, ciclo_escolar=?, "
                + "id_estado=?, id_beca=? WHERE id_inscripcion=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ins.getId_alumno());
            ps.setString(2, ins.getCodigo_alumno());
            ps.setInt(3, ins.getId_grado());
            ps.setString(4, ins.getCuota_ins());
            ps.setString(5, ins.getCuota_mensual());
            ps.setString(6, ins.getCiclo());
            ps.setInt(7, ins.getId_estado());
            ps.setInt(8, ins.getId_beca());
            ps.setInt(9, ins.getId_inscripcion());
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
        // MOSTRAR DATOS DE ALUMNOS INSCRITOS EN TABLA
         public void LlenarTabla(JTable tablaC, JTextField buscar, String anio) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
           String where="WHERE i.ciclo_escolar= " + anio + "";
           if(!"".equals(campo)){
               where= "WHERE i.codigo_alumno= '" + campo + "' and i.ciclo_escolar= '" + anio + "'";
           }
           
           
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="Select a.codigo_alumno, concat_ws(' ', a.primer_nombre, a.segundo_nombre,"
               + "a.tercer_nombre), concat_ws(' ', a.primer_apellido, "
               + "a.segundo_apellido), g.grado, i.cuota_ins, i.cuota_mensual, "
               + "b.tipo_beca from Alumno as a inner join inscripciones  "
               + "as i on i.codigo_alumno=a.codigo_alumno "
               + "inner join grado as g on "
               + "i.id_grado=g.id_grado "
               + "inner join becas as b on i.id_beca=b.id_beca "+ where;
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("Grado");
       modelo.addColumn("Cuota Inscripción");
       modelo.addColumn("Cuota Mensual");
       modelo.addColumn("Beca");
     
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
         // MOSTRAR DATOS DE LOS GRADOS 
       public void LlenarGrados(JTable tablaC, JTextField buscar, String anio) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
    
           String where="i.id_grado= '" + campo + "' and i.ciclo_escolar= '" + anio + "'";
           
           
           if("".equals(campo)){
                JOptionPane.showMessageDialog(null, "Seleccione Grado");
           }
           else{     
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="select ROW_NUMBER() OVER (ORDER BY concat_ws(' ', a.primer_apellido, a.segundo_apellido) ASC) AS 'No', a.codigo_alumno,  concat_ws(' ', a.primer_apellido, a.segundo_apellido) as 'Apellido',\n" +
"concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre) as 'Nombre' \n" +
"from alumno as a\n" +
"inner join inscripciones as i\n" +
"on a.codigo_alumno=i.codigo_alumno where "+ where;
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("No.");
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Apellido");
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
}
       
       
       // CONTAR ALUMNOS INSCRITOS
 public void contar(JLabel contar, String anio){
           
       try{
     
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
     
       String where="WHERE ciclo_escolar= " + anio + "";
       
        String sql = "Select count(*) as 'numero' from Inscripciones "+ where;

       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
        if (rs!=null){
        while(rs.next()){
        contar.setText(rs.getObject("numero").toString());
        }
}
   }   catch(SQLException ex) {
           System.out.println(ex.toString());
}
      }
 
 // MOSTRAR NÚMEROS DE GRADOS
  public void contarGrado(JLabel contar, JTextField grado, String anio){
           
       String campo= grado.getText();
    
       String where="WHERE id_grado= '" + campo +  "' and ciclo_escolar= '" + anio + "'";
           
       try{
     
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();

        String sql = "Select count(*) as 'numero' from Inscripciones "+ where;

       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
        if (rs!=null){
        while(rs.next()){
        contar.setText(rs.getObject("numero").toString());
        }
}
   }   catch(SQLException ex) {
           System.out.println(ex.toString());
}
      }
  
  //MOSTRAR DATOS DE LOS ALUMNOS SEGÚN GRADO Y CICLO ESCOLAR SELECCIONADO
  public void Grado(JLabel nombre, JLabel docente, JTextField grado, String anio){
           
       String campo= grado.getText();
    
       String where="WHERE g.id_grado= '" + campo + "' and n.anio= '" + anio + "'";
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       String sql = "select IF(g.id_nivel!=1,concat_ws(' ', g.grado, n.nivel) , g.grado) as 'grado', concat_ws(' ', c.primernombre_catedratico, \n" +
"c.segundonombre_catedratico, c.tercernombre_catedratico, c.primerapellido_catedratico,\n" +
"c.segundoapellido_catedratico) as 'nombre' from grado as g \n" +
"cross join (SELECT DISTINCT anio FROM asignacion_grado) AS n\n" +
"left join asignacion_grado as a on g.id_grado=a.id_grado\n" +
"    and n.anio=a.anio\n" +
"left join catedraticos as c on a.ID_CATEDRATICO=c.ID_CATEDRATICO\n" +
"left join nivel as n on g.ID_NIVEL=n.ID_NIVEL "+ where;
       
       try{
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
        if (rs!=null){
        while(rs.next()){
        nombre.setText(rs.getObject("grado").toString());
        docente.setText(rs.getObject("nombre").toString());
        }
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
  
  // REALIZAR PARSEO DE VARIABLE
  public static boolean isNumeric(String strNum) {
    try {
        double ds = Double.parseDouble(strNum);
    } catch (NumberFormatException | NullPointerException nfe) {
        return false;
    }
    return true;
}
  
  // GENERACIÓN DE INFORME DE ALUMNOS INSCRITOS POR GRADO
  public void InformeGrado(JTextField grado, String anio, JLabel nombre, JLabel cat) throws JRException{
      
      
      Connection con = getConexion();
      int par= Integer.parseInt(grado.getText());
      String nombres=nombre.getText();
      String catedratico=cat.getText();
   
      JasperReport reporte = null;
     
      // DATOS PARA EL REPORTE
      Map parametro= new HashMap();
      parametro.put("id_grado", par);
      parametro.put("ciclo", anio);
      parametro.put("grado", nombres);
      parametro.put("docente", catedratico);
      parametro.put("Image", this.getClass().getResourceAsStream(logo));
    
      //GENERACIÓN DE REPORTE CON JasperReport
      reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/InformeGrado.jasper"));
      JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con);
      JasperViewer view = new JasperViewer(jprint, false);
      view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      view.setVisible(true);
  }
}
