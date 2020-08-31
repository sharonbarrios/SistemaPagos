/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.IndiceFormaPago;
import modelo.IndiceMes;
import modelo.Pagos;
import modelo.SqlPagos;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Sharon
 */
public class CtrlPagos implements ActionListener {

    private Pagos mod;
    private SqlPagos modC;
    private Inicio ini;

    //Botones del módulo de Pagos
    public CtrlPagos(Pagos mod, SqlPagos modC, Inicio ini) {
        this.mod = mod;
        this.modC = modC;
        this.ini = ini;
        this.ini.btnPagoAlumno.addActionListener(this);
        this.ini.btnRegistrarPago.addActionListener(this);
        this.ini.btnRecibo.addActionListener(this);
        this.ini.btnBuscarAluPago.addActionListener(this);
        this.ini.btnModificarIns.addActionListener(this);
        this.ini.btnCargarAlumnos.addActionListener(this);
        this.ini.btnCargarInforme.addActionListener(this);
        this.ini.btnCargarDetalle.addActionListener(this);
        this.ini.btnBuscarAluPago1.addActionListener(this);
        this.ini.btnRecibo1.addActionListener(this);
        this.ini.btnEliminar.addActionListener(this);
        this.ini.btnCargarDetalle1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
 
        //Búscar alumno por código
        if (e.getSource() == ini.btnBuscarAluPago) {
            
            String num=ini.txtCodAlumno.getText();
            String codigo;
            codigo = String.format("%04d", Integer.parseInt(num));
            
           mod.setCodigo_alumno(codigo);

            try {
                if (modC.buscarAlumnosPago(mod)){
                    ini.txtIdCodAlumno.setText(String.valueOf(mod.getId_alumno()));
                    ini.txtCodAlumno.setText(mod.getCodigo_alumno());
                    ini.txtNombreAlumno.setText(mod.getNombre_alumno());
                    ini.txtGradoPago.setText(mod.getGrado());
                    ini.btnPagoAlumno.setEnabled(true);
                    modC.mora(ini.labelMora);
                    ini.labelMora.setVisible(false);
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Alumno no Registrado");
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        //Buscar pago alumno
         if (e.getSource() == ini.btnBuscarAluPago) {
            
            String num=ini.txtCodAlumno.getText();
            String codigo;
            codigo = String.format("%04d", Integer.parseInt(num));
            
           mod.setCodigo_alumno(codigo);

            try {
                if (modC.buscarAlumnosPago(mod)){
                    ini.txtIdCodAlumno.setText(String.valueOf(mod.getId_alumno()));
                    ini.txtCodAlumno.setText(mod.getCodigo_alumno());
                    ini.txtNombreAlumno.setText(mod.getNombre_alumno());
                    ini.txtGradoPago.setText(mod.getGrado());
                    ini.btnPagoAlumno.setEnabled(true);
                    modC.mora(ini.labelMora);
                    ini.labelMora.setVisible(false);
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Alumno no Registrado");
                //    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         
        //Buscar pagos por número de recibo
         if (e.getSource() == ini.btnBuscarAluPago1) {
             String num=ini.txtNoRecibo1.getText();
            String codigo;
            codigo = String.format("%05d", Integer.parseInt(num));
            mod.setNo_recibo(codigo);
           
             if (ini.txtNoRecibo1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Número de Recibo");
            } else {
            try {
                if (modC.buscarRecibos(mod)) {
                    
                    ini.txtTotal1.setText(String.valueOf(mod.getTotal()));
                    ini.txtCodAlumno1.setText(mod.getCodigo_alumno());
                    ini.txtFechaRecibo1.setText(mod.getFecha_recibo());
                    ini.txtNombreAlumno1.setText(mod.getNombre_alumno());
                    ini.txtGradoPago1.setText(mod.getGrado());
                    ini.txtObservacionesPago1.setText(mod.getObservaciones());
                     ini.txtTotal1.setText(String.valueOf(mod.getTotal())); 
                    ini.btnRecibo1.setEnabled(true);
                    
                      try {
                modC.LlenarPagos1(ini.jtPagos1, codigo);
                
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Recibo no encontrado");
                }
            }  catch (SQLException ex) {
                    Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        }
        
         //Registrar pago realizado a la base de datos
          if (e.getSource() == ini.btnRegistrarPago) {
           
             double cargo;
             double subtotal;
             IndiceMes est = (IndiceMes) ini.cbxMes.getSelectedItem();
             IndiceFormaPago esst = (IndiceFormaPago) ini.cbxFormaPago.getSelectedItem();
             String ciclo= String.valueOf(ini.cicloIns.getYear());
             
            if(ini.cbxMora.getSelectedIndex()==2){  
            cargo=(Double.parseDouble(ini.labelMora.getText()))*(Double.parseDouble(ini.txtImporte.getText()));
            } else {
                cargo=0;
            }
            
            subtotal=(Double.parseDouble(ini.txtImporte.getText()))+cargo;
            String concepto, pago;
            concepto=(String.valueOf(est.getId_mes()));
            
            if(concepto.equals("0")){
                 pago = "Inscripción"; 
            } else {
                pago = "Colegiatura";
            }
            
            mod.setNo_recibo(ini.txtNoRecibo.getText());
            mod.setId_forma_pago(esst.getId_forma_pago());
            mod.setId_mora(ini.cbxMora.getSelectedIndex());
            mod.setMora(cargo);
            mod.setId_mes_pago(est.getId_mes());
            mod.setConcepto(pago);
            mod.setImporte(Double.parseDouble(ini.txtImporte.getText()));
            mod.setSubtotal(subtotal);
            mod.setCiclo(ciclo);
            

             if (ini.txtImporte.getText().equals("") || est.getMes().equals("Seleccione Mes a Pagar") || esst.getId_forma_pago()== 0) {
                JOptionPane.showMessageDialog(null, "Campos Requeridos vacíos, debe llenar todos los campos que contienen *");
            } else {
            try {
                if (modC.ingresarPago(mod)) {
                    JOptionPane.showMessageDialog(null, "Agregado");
                    ini.cbxMes.setSelectedIndex(0);
                    ini.btnRecibo.setEnabled(true);
                    ini.jtPagos.setEnabled(true);
                  try {
                modC.LlenarPagos(ini.jtPagos, ini.txtNoRecibo);
                modC.Totalizar(ini.jtPagos, ini.txtTotal);
                
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
                  //  limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
               }
        
          //Generar recibo de pago
          if (e.getSource() == ini.btnRecibo) {
           Date date = new Date();
           DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String estado= "Generado";
               DefaultTableModel modelo= new DefaultTableModel();
                 ini.jtPagos.setModel(modelo);
            
            mod.setNo_recibo(ini.txtNoRecibo.getText());
            mod.setTotal(Double.parseDouble(ini.txtTotal.getText()));
            mod.setFecha_recibo(fechaHora.format(date));
            mod.setObservaciones(ini.txtObservacionesPago.getText());
            mod.setEstado_recibo(estado);

            try {
                if (modC.generarPago(mod)) {
                    JOptionPane.showMessageDialog(null, "Recibo Generado");
                     ini.setPanelEnabled(ini.jPanel22, false);
                      ini.jtPagos.setEnabled(false);
                      modelo.setRowCount(0);
                      ini.cbxFormaPago.setSelectedIndex(0);
                      ini.txtImporte.setText(null);
                      ini.txtTotal.setText(null);
                    try {
                modC.Recibo(ini.txtNoRecibo, ini.txtGradoPago, ini.txtObservacionesPago, ini.txtFechaRecibo, ini.txtTotal, ini.txtNombreAlumno);
            } catch (JRException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
                  //  limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
          //Realizar anulación de pago por número de recibo
           if (e.getSource() == ini.btnRecibo1) {
         
           String estado= "Anulado";
            
            mod.setNo_recibo(ini.txtNoRecibo1.getText());     
            mod.setEstado_recibo(estado);

            try {
                if (modC.anularPago(mod)) {
                    JOptionPane.showMessageDialog(null, "Recibo Anulado");
                  //  limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
           
           //Generar encabezado de recibo
          if (e.getSource() == ini.btnPagoAlumno) {
           
            modC.numeral(ini.txtNoRecibo);
            mod.setNo_recibo(ini.txtNoRecibo.getText());
            mod.setId_user(Integer.parseInt(ini.txtIdUser.getText()));
            mod.setId_alumno(Integer.parseInt(ini.txtIdCodAlumno.getText()));
            mod.setCodigo_alumno(ini.txtCodAlumno.getText());

            try {
                if (modC.realizarPago(mod)) {
                    
                    JOptionPane.showMessageDialog(null, "Ingrese Pago");
                     ini.setPanelEnabled(ini.jPanel22, true);
                     ini.jtPagos.setEnabled(false);
                     ini.btnRecibo.setEnabled(false);
                     ini.txtNoRecibo.setEnabled(false);
        
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
          if (e.getSource() == ini.btnCargarInforme) {
                String ciclo= String.valueOf(ini.yearBuscar1.getYear());
                   String mes= String.valueOf(ini.jComboBox4.getSelectedIndex());
                   if(ini.jComboBox4.getSelectedIndex()==0)
                   {
                     JOptionPane.showMessageDialog(null, "Seleccione Mes");  
                   }
                   else{
            try {
                modC.LlenarRec(ini.jtPagoAlu, ciclo, mes);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
                     }
       
          //Almacenar detalle de recibo
          if (e.getSource() == ini.btnCargarDetalle) {
              
            try {
                modC.LlenarInforme(ini.jtPagoAlu1, ini.txtBusAlumno1);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }

          
               if (e.getSource() == ini.btnCargarDetalle1) {
                   
                   String ciclo= String.valueOf(ini.cicloIns2.getYear());
                   String mes= String.valueOf(ini.jComboBox3.getSelectedIndex());
                   if(ini.jComboBox3.getSelectedIndex()==0)
                   {
                     JOptionPane.showMessageDialog(null, "Seleccione Mes");  
                   }
                   else{
            try {
                modC.LlenarInsolventes(ini.jtPagoAlu2, ciclo, mes);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
            }
          
           if (e.getSource() == ini.jtPagos) {
               DefaultTableModel model= (DefaultTableModel)ini.jtPagos.getModel();
               int selectedRowIndex = ini.jtPagos.getSelectedRow();
               ini.jTextField1.setText(model.getValueAt(selectedRowIndex,0).toString());
         }
          
            if (e.getSource() == ini.btnEliminar) {
            if (ini.jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione pago a eliminar");
            } else {
                 mod.setId_detalle_recibo(Integer.parseInt(ini.jTextField1.getText()));
       int res= JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Pago Seleccionado?", "Eliminar Pago", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
       if( res==JOptionPane.OK_OPTION){
            try {
                if (modC.eliminardetalle(mod)) {
                    JOptionPane.showMessageDialog(null, "Pago Eliminado");
                    try {
                modC.LlenarPagos(ini.jtPagos, ini.txtNoRecibo);
                modC.Totalizar(ini.jtPagos, ini.txtTotal);
                
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
                  //  limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }
  }
        }
            }
      
    }

    //Limpiar campos del módulo pagos
    public void limpiar() {
        ini.txtId_Ins1.setText(null);
        ini.txtId_Ins.setText(null);
        ini.txtCodAlum.setText(null);
        ini.txtNombreAlum.setText(null);
        ini.txtCuotaIns.setText(null);
        ini.txtCuotaMen.setText(null);
        ini.cbxNivel.setSelectedIndex(0);
        ini.cbxGradoIns.setSelectedIndex(0);
        ini.cbxEstadoAlum.setSelectedIndex(0);
        ini.cbxBeca.setSelectedIndex(0);
    }
    
        public void limpiar2() {
        ini.txtCuotaIns.setText(null);
        ini.txtCuotaMen.setText(null);
        ini.cbxNivel.setSelectedIndex(0);
        ini.cbxGradoIns.setSelectedIndex(0);
        ini.cbxEstadoAlum.setSelectedIndex(0);
        ini.cbxBeca.setSelectedIndex(0);
    }

}
