/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sharon
 */
public class SqlPagos extends Conexion{
    
    //variables de imagenes utilizadas en la generación del recibo
    private final String logorecibo="/Vista/imagenes/LogoRecibo.jpg";
    private final String fondorecibo="/Vista/imagenes/BackgroundImage.jpg";
    
    // BÚSQUEDA DE ALUMNOS REGISTRADOS EN LA BASE DE DATOS
     public boolean buscarAlumnosPago(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "Select a.id_alumno, a.codigo_alumno, concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido,\n" +
" a.segundo_apellido) as 'nombre_alumno', IF(g.id_nivel!=1, concat_ws(' ', g.grado,\n" +
"n.nivel), g.grado) as 'grado'  from alumno as a inner join inscripciones as i on a.CODIGO_ALUMNO=i.CODIGO_ALUMNO\n" +
"inner join grado as g on i.ID_GRADO=g.ID_GRADO inner join nivel as n on g.ID_NIVEL=n.ID_NIVEL WHERE i.codigo_alumno = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pag.getCodigo_alumno());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                pag.setId_alumno(Integer.parseInt(rs.getString("id_alumno")));
                pag.setCodigo_alumno(rs.getString("codigo_alumno"));
                pag.setNombre_alumno(rs.getString("nombre_alumno"));
                pag.setGrado(rs.getString("grado"));
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
     
     // BÚSQUEDA DE ALUMNOS INSCRITOS EN LA BASE DE DATOS
     public boolean buscarAlumnosInscritos(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "Select i.id_inscripcion, i.id_alumno, i.codigo_alumno, i.id_grado, i.cuota_ins,"
                + "cuota_mensual, i.ciclo_escolar, i.fecha_inscripcion, i.id_estado, i.id_beca, "
                + "concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido, a.segundo_apellido) as 'nombre_alumno'"
                + "from inscripciones as i inner join alumno as a on i.codigo_alumno=a.codigo_alumno WHERE i.codigo_alumno=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ins.getCodigo_alumno());
            rs = ps.executeQuery();

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
     
     //BÚSQUEDA DE RECIBOS POR NÚMERO EN LA BASE DE DATOS
     public boolean buscarRecibos(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "select r.codigo_alumno, r.fecha_recibo, concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido, a.segundo_apellido) as 'nombre_alumno',\n" +
"               IF(g.id_nivel!=1, concat_ws(' ', g.grado,n.nivel), g.grado) as 'grado', r.observaciones, r.total \n" +
"               from recibo as r inner join  alumno as a on r.codigo_alumno=a.codigo_alumno\n" +
"                inner join inscripciones as i on a.codigo_alumno=i.codigo_Alumno\n" +
"                inner join grado as g on i.id_grado=g.id_grado\n" +
"                inner join nivel as n on g.ID_NIVEL=n.ID_NIVEL WHERE r.no_recibo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pag.getNo_recibo());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                pag.setCodigo_alumno(rs.getString("codigo_alumno"));
                pag.setFecha_recibo(rs.getString("fecha_recibo"));
                pag.setNombre_alumno(rs.getString("nombre_alumno"));
                pag.setGrado(rs.getString("grado"));
                pag.setObservaciones(rs.getString("observaciones"));
                pag.setTotal(rs.getDouble("total"));
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
     
     //GENERACIÓN DE RECIBO 
      public boolean realizarPago(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO recibo(no_recibo,id_usuario, id_alumno, codigo_alumno)"
                + " VALUES(?,?,?,?)";
               
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pag.getNo_recibo());
            ps.setInt(2, pag.getId_user());
            ps.setInt(3, pag.getId_alumno());
            ps.setString(4, pag.getCodigo_alumno());
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
      
      // INSERCIÓN DE DETALLES DE RECIBO EN LA BASE DE DATOS
       public boolean ingresarPago(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO detalle_recibo(no_recibo, id_forma_pago, id_mora, mora,"
                + "id_mes_pago, concepto_pago, importe, subtotal, ciclo)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";
               
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pag.getNo_recibo());
            ps.setInt(2, pag.getId_forma_pago());
            ps.setInt(3, pag.getId_mora());
            ps.setDouble(4, pag.getMora());
            ps.setInt(5, pag.getId_mes_pago());
            ps.setString(6, pag.getConcepto());
            ps.setDouble(7, pag.getImporte());
            ps.setDouble(8, pag.getSubtotal());
            ps.setString(9, pag.getCiclo());
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
       
       // GENERACIÓN DE RECIBO CON LOS DATOS DEL PAGO
       public boolean generarPago(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE recibo SET fecha_recibo=?, total=?, observaciones=?, estado_recibo=? WHERE no_recibo=?";
               
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pag.getFecha_recibo());
            ps.setDouble(2, pag.getTotal());
            ps.setString(3, pag.getObservaciones());
             ps.setString(4, pag.getEstado_recibo());
            ps.setString(5, pag.getNo_recibo());
           
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
       
       // ANULACIÓN DE RECIBO POR NÚMERO
        public boolean anularPago(Pagos pag) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE recibo SET estado_recibo=? WHERE no_recibo=?";
               
        try {
            ps = con.prepareStatement(sql);   
            ps.setString(1, pag.getEstado_recibo());
            ps.setString(2, pag.getNo_recibo());
           
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
       
       
     
        public boolean modificarInscripcion(Inscripcion ins) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE inscripcion SET id_alumno=?, codigo_alumno=?, id_grado=?, cuota_ins=?, cuota_mensual=?, ciclo_escolar=?, "
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
        
        //GENERACIÓN DE MORA EN EL RECIBO
public void mora(JLabel mora)throws SQLException{
           
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();

       String sql = "Select valor as 'mora' from mora where id_mora=2";
        
       try{
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        if (rs!=null){
        while(rs.next()){
        mora.setText(rs.getObject("mora").toString());
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


// OBTENER INFORMACIÓN DE LOS PAGOS REALIZADOS
 public void LlenarPagos(JTable tablaC, JTextField buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
    
           String where="WHERE no_recibo= '" + campo + "'";
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="SELECT r.id_detalle_recibo, ROW_NUMBER() OVER (ORDER BY r.id_detalle_recibo) as 'No', if(r.id_mes_pago=0,p.mes_pago,concat_ws(' ', r.concepto_pago, \n" +
"p.mes_pago )) as 'Concepto', r.importe, r.mora, f.forma_pago ,r.subtotal from detalle_recibo as r inner join meses_pago as p\n" +
"on r.id_mes_pago=p.id_mes_pago inner join forma_pago as f on r.id_forma_pago=f.id_forma_pago "+ where;
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Id");
       modelo.addColumn("No.");
       modelo.addColumn("Concepto");
       modelo.addColumn("Importe");
       modelo.addColumn("Mora");
       modelo.addColumn("Forma Pago");
       modelo.addColumn("Subtotal");
       
          tablaC.getColumnModel().getColumn(0).setMaxWidth(0);
          tablaC.getColumnModel().getColumn(0).setMinWidth(0);
          tablaC.getColumnModel().getColumn(0).setPreferredWidth(0);
     
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
 
 // OBTENER INFORMACIÓN DEL RECIBO POR NÚMERO
  public void LlenarPagos1(JTable tablaC, String buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
    
           String where="WHERE no_recibo= '" + buscar + "'";
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="SELECT ROW_NUMBER() OVER (ORDER BY r.id_detalle_recibo) as 'No', if(r.id_mes_pago=0,p.mes_pago,concat_ws(' ', r.concepto_pago, \n" +
"p.mes_pago )) as 'Concepto', r.importe, r.mora, f.forma_pago ,r.subtotal from detalle_recibo as r inner join meses_pago as p\n" +
"on r.id_mes_pago=p.id_mes_pago inner join forma_pago as f on r.id_forma_pago=f.id_forma_pago "+ where;
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       modelo.addColumn("No.");
       modelo.addColumn("Concepto");
       modelo.addColumn("Importe");
       modelo.addColumn("Mora");
       modelo.addColumn("Forma Pago");
       modelo.addColumn("Subtotal");
     
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
 
  // OBTENER DATOS DE ALUMNOS INSOLVENTES Y MOSTRARLOS EN TABLA
   public void LlenarInsolventes(JTable tablaC, String anio, String mes) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="select i.codigo_alumno, concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido, a.segundo_apellido) as 'nombre_alumno', IF(g.id_nivel!=1, concat_ws(' ', g.grado,s.nivel), g.grado) as 'grado', \n" +
"if(i.id_mes_pago=0,p.mes_pago,concat_ws(' ', 'Colegiatura',\n" +
"p.mes_pago )) as 'Concepto', i.saldo, ' ' as 'Total',\n" +
"i.id_grado, i.id_mes_pago from insolvente as i\n" +
"inner join inscripciones as n on i.codigo_alumno=n.codigo_alumno and i.id_grado=n.id_grado\n" +
"inner join meses_pago as p on i.id_mes_pago=p.id_mes_pago\n" +
"inner join alumno as a on  n.codigo_alumno=a.codigo_alumno\n" +
"inner join grado as g on n.id_grado=g.id_grado\n" +
"inner join nivel as s on g.id_nivel=s.id_nivel\n" +
"where i.ciclo_escolar=" + anio + " and n.id_estado=1 and i.id_mes_pago between 0 and " + mes + "\n" +
"union\n" +
"select i.codigo_alumno, '' as 'primer_nombre', '' as 'grado', 'Total' as 'Concepto', '' as 'Saldo', \n" +
"CONVERT(sum(i.saldo)USING utf8) as 'Total', i.id_grado, '11' as 'id_mes_pago'\n" +
"from insolvente as i\n" +
"inner join inscripciones as n on i.codigo_alumno=n.codigo_alumno and i.id_grado=n.id_grado\n" +
"where i.ciclo_escolar=" + anio + " and n.id_estado=1 and i.id_mes_pago between 0 and " + mes + "\n" +
"group by i.codigo_alumno\n" +
"order by  id_grado asc, codigo_alumno, cast(id_mes_pago as unsigned integer); ";
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre Alumno");
       modelo.addColumn("Grado");
       modelo.addColumn("Concepto");
       modelo.addColumn("Saldo");
       modelo.addColumn("Total");
       modelo.addColumn("id");
       
          tablaC.getColumnModel().getColumn(6).setMaxWidth(0);
          tablaC.getColumnModel().getColumn(6).setMinWidth(0);
          tablaC.getColumnModel().getColumn(6).setPreferredWidth(0);
     
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
   
   //OBTENER DATOS DE LOS RECIBOS GENERADOS
 public void LlenarInforme(JTable tablaC, JTextField buscar) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       String campo= buscar.getText();
       String where="order by d.no_recibo";
       
        if(!"".equals(campo)){
              where="WHERE d.no_recibo= '" + campo + "'order by d.no_recibo";
           }
           
          
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql=" select  if(a.codigo_alumno>999,lpad(a.codigo_alumno,3,0),a.codigo_alumno) as 'codigo', concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido,\n" +
" a.segundo_apellido) as 'nombre_alumno', DATE_FORMAT(r.fecha_recibo,'%d/%m/%Y') as 'fecha', lpad(d.no_recibo,5,0) as 'no_recibo', if(d.id_mes_pago=0,m.mes_pago,concat_ws(' ', 'Colegiatura',\n" +
"m.mes_pago )) as 'Concepto', d.IMPORTE, d.MORA, d.SUBTOTAL\n" +
"  from recibo as r \n" +
"  inner join detalle_recibo as d on r.no_recibo=d.no_recibo\n" +
 "  inner join meses_pago as m on d.id_mes_pago=m.id_mes_pago\n" +
"  inner join alumno as a  on r.codigo_alumno=a.codigo_alumno\n" +where;
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre");
       modelo.addColumn("Fecha");
       modelo.addColumn("No. Recibo");
       modelo.addColumn("Concepto Pago");
       modelo.addColumn("Importe");
       modelo.addColumn("Mora");
       modelo.addColumn("Subtotal");
     
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
 // OBTENER DATOS DE RECIBO 
  public void LlenarRecibo(JTable tablaC) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       //String campo= buscar.getText();
    
        //   String where="WHERE no_recibo= '" + campo + "'";
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql="   select  if(a.codigo_alumno>999,lpad(a.codigo_alumno,3,0),a.codigo_alumno) as 'codigo', concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido,\n" +
" a.segundo_apellido) as 'nombre_alumno', DATE_FORMAT(r.fecha_recibo,'%d/%m/%Y') as 'fecha', lpad(r.no_recibo,5,0) as 'no_recibo', r.TOTAL\n" +
"  from recibo as r \n" +
"  inner join detalle_recibo as d on r.no_recibo=d.no_recibo\n" +
"  inner join alumno as a  on r.codigo_alumno=a.codigo_alumno\n" +
"  order by d.no_recibo";
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre");
       modelo.addColumn("Fecha");
       modelo.addColumn("No. Recibo");
       modelo.addColumn("Total");
       
     
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
 
   public void LlenarRec(JTable tablaC, String anio, String mes) throws SQLException{
       tablaC.setDefaultEditor(Object.class, null);
       
       //String campo= buscar.getText();
    
        //   String where="WHERE no_recibo= '" + campo + "'";
              
       try{
          
       DefaultTableModel modelo= new DefaultTableModel();
       tablaC.setModel(modelo);
       
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion();
       
       String sql=" select if(a.codigo_alumno>999,lpad(a.codigo_alumno,3,0),a.codigo_alumno) as 'codigo', concat_ws(' ', a.primer_nombre, a.segundo_nombre, a.tercer_nombre, a.primer_apellido,\n" +
" a.segundo_apellido) as 'nombre_alumno', DATE_FORMAT(r.fecha_recibo,'%d/%m/%Y') as 'fecha', lpad(r.no_recibo,5,0) as 'no_recibo', r.TOTAL, r.ESTADO_RECIBO\n" +
"  from recibo as r \n" +
"  inner join detalle_recibo as d on r.no_recibo=d.no_recibo\n" +
"  inner join alumno as a  on r.codigo_alumno=a.codigo_alumno\n" +
"  where year(r.fecha_recibo)= " + anio + "  and month(r.fecha_recibo)=" + mes + "  and (r.estado_recibo='Generado' or r.estado_recibo='Anulado')\n" +
"  order by d.no_recibo";
       
        System.out.println(sql);
         
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       
       ResultSetMetaData rsMd= rs.getMetaData();
       int cantidadColumnas= rsMd.getColumnCount();
       
       modelo.addColumn("Código Alumno");
       modelo.addColumn("Nombre");
       modelo.addColumn("Fecha");
       modelo.addColumn("No. Recibo");
       modelo.addColumn("Total");
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
 
 
 // FUNCIÓN PARA MOSTRAR TOTAL EN EL RECIBO
 public void Totalizar(JTable tablaD, JTextField total){
     double num1=0;
     double num2=0;
     
     if(tablaD.getRowCount()>0){
         for (int i=0; i<tablaD.getRowCount(); i++){
             num2=Double.parseDouble(tablaD.getValueAt(i,6).toString());
             num1 += num2;
         }
         total.setText(String.format("%.2f",(num1)));
     }else{
         //
     }
 }
 
 // GENERAR NÚMERO DE RECIBO
  public void numeral(JTextField contar){
      
       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection con = getConexion(); 
       
        String sql = "select lpad((IFNULL(MAX(no_recibo)+1,1)),5,0) as 'numero'\n" +
        "from recibo where estado_recibo='Generado'";
        
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
 
  // ELIMINAR DETALLE DE RECIBO EN LA BASE DE DATOS
   public boolean eliminardetalle(Pagos pag) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="DELETE FROM detalle_recibo WHERE id_detalle_recibo=? ";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, pag.getId_detalle_recibo());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
  
   // GENERACIÓN DE RECIBO CON COPIA EN JasperReport
 public void Recibo(JTextField id_recibo,JTextField grados,JTextField observaciones, JTextField fecha,JTextField total,JTextField nombre) throws JRException{
      Connection con = getConexion();
      String recibo= id_recibo.getText();
      String grado=grados.getText();
      String observacion=observaciones.getText();
      String fechas=fecha.getText();
      String totales=total.getText();
      String nombres=nombre.getText();
      
      JasperReport reporte = null;
      JasperReport reportes= null;
      
      Map parametro= new HashMap();
      
      //DATOS PARA EL RECIBO
      parametro.put("id_recibo", recibo);
      parametro.put("grados", grado);
      parametro.put("observaciones", observacion);
      parametro.put("fecha", fechas);
      parametro.put("total", totales);
      parametro.put("nombre", nombres);
      parametro.put("Imagen", this.getClass().getResourceAsStream(logorecibo));
      parametro.put("fondo", this.getClass().getResourceAsStream(fondorecibo));
      
       Map parametros= new HashMap();
      parametros.put("id_recibo", recibo);
      parametros.put("grados", grado);
      parametros.put("observaciones", observacion);
      parametros.put("fecha", fechas);
      parametros.put("total", totales);
      parametros.put("nombre", nombres);
      parametros.put("Imagen", this.getClass().getResourceAsStream(logorecibo));
      parametros.put("fondo", this.getClass().getResourceAsStream(fondorecibo));
      
    
      reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/ReciboPago.jasper"));
      reportes = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/ReciboPagoCopia.jasper"));
     
      JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con);
      JasperPrint jprint2 = JasperFillManager.fillReport(reportes, parametros, con);
      for (int j = 0; j < jprint2.getPages().size(); j++) {  
    //Add First report to second report
    jprint.addPage((JRPrintPage) jprint2.getPages().get(j));  
} 
      JasperViewer view = new JasperViewer(jprint, false);
      view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      view.setVisible(true);
  }
}
