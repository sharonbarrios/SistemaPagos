/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.IndiceBeca;
import modelo.IndiceEstado;
import modelo.IndiceGrado;
import modelo.IndiceNivel;
import modelo.Inscripcion;
import modelo.SqlInscripcion;
import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Sharon
 */
public class CtrlInscripcion implements ActionListener {
    //MÓDULOS
    private Inscripcion mod;
    private SqlInscripcion modC;
    private Inicio ini;

    //BOTONES
    public CtrlInscripcion(Inscripcion mod, SqlInscripcion modC, Inicio ini) {
        this.mod = mod;
        this.modC = modC;
        this.ini = ini;
        this.ini.btnInscribir.addActionListener(this);
        this.ini.btnBusAluIns.addActionListener(this);
        this.ini.btnModificarIns.addActionListener(this);
        this.ini.btnCargarInscritos.addActionListener(this);
        this.ini.btnCargarGrado.addActionListener(this);
        this.ini.btnImprimirGrado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        //DATOS PARA INSCRIPCIÓN DE ALUMNO
        if (e.getSource() == ini.btnInscribir) {
            IndiceGrado est = (IndiceGrado) ini.cbxGradoIns.getSelectedItem();
            IndiceBeca esst = (IndiceBeca) ini.cbxBeca.getSelectedItem();
            Date date = new Date();
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = ini.txtCuotaIns.getText();
            String v = ini.txtCuotaMen.getText();
            String ciclo= String.valueOf(ini.cicloIns.getYear());
        
            mod.setId_alumno(Integer.parseInt(ini.txtId_Ins.getText()));
            mod.setCodigo_alumno(ini.txtCodAlum.getText());
            mod.setId_grado(est.getId_grado());
            mod.setCuota_ins(ini.txtCuotaIns.getText());
            mod.setCuota_mensual(ini.txtCuotaMen.getText());
            mod.setCiclo(ciclo);
            mod.setFecha_inscripcion(fechaHora.format(date));
            mod.setId_estado(1);
            mod.setId_beca(esst.getId_beca());
            //VALIDACIÓN DE CUOTA
          if (modC.isNumeric(s)==false)
           {   
                JOptionPane.showMessageDialog(null, "Cuota de Inscripcion No Válida");
           }
           else {
                 if (modC.isNumeric(v)==false)
           {   
                JOptionPane.showMessageDialog(null, "Cuota Mensual No Válida");
           }
           else {
        if (ini.txtCodAlum.getText().equals("") || ini.txtCuotaIns.getText().equals("") || ini.txtCuotaMen.getText().equals("") || esst.getId_beca()== 0) {
                JOptionPane.showMessageDialog(null, "Campos Requeridos vacíos, debe llenar todos los campos que contienen *");
            } else {
            
            try {
                if (modC.registrarInscripcion(mod)) {
                    JOptionPane.showMessageDialog(null, "Alumno Inscrito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Inscribir");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        }
          }
           }
         
        //DATOS DE MODIFICACIÓN DE INSCRIPCIÓN
        if (e.getSource() == ini.btnModificarIns) {
            IndiceGrado est = (IndiceGrado) ini.cbxGradoIns.getSelectedItem();
            IndiceBeca esst = (IndiceBeca) ini.cbxBeca.getSelectedItem();
            IndiceEstado et = (IndiceEstado) ini.cbxEstadoAlum.getSelectedItem();
            String s = ini.txtCuotaIns.getText();
            String v = ini.txtCuotaMen.getText();
            String ciclo= String.valueOf(ini.cicloIns.getYear());
            
            if (modC.isNumeric(s)==false)
           {   
                JOptionPane.showMessageDialog(null, "Cuota de Inscripcion No Válida");
           }
           else {
                 if (modC.isNumeric(v)==false)
           {   
                JOptionPane.showMessageDialog(null, "Cuota Mensual No Válida");
           }
           else {
        if (ini.txtCodAlum.getText().equals("") || ini.txtCuotaIns.getText().equals("") || ini.txtCuotaMen.getText().equals("") || esst.getId_beca()== 0|| et.getId_estado()== 0) {
                JOptionPane.showMessageDialog(null, "Campos Requeridos vacíos, debe llenar todos los campos que contienen *");
            } else {
            
            mod.setId_inscripcion(Integer.parseInt(ini.txtId_Ins1.getText()));
           // mod.setId_alumno(Integer.parseInt(ini.txtId_Ins.getText()));
            mod.setCodigo_alumno(ini.txtCodAlum.getText());
            mod.setId_grado(est.getId_grado());
            mod.setCuota_ins(ini.txtCuotaIns.getText());
            mod.setCuota_mensual(ini.txtCuotaMen.getText());
            mod.setCiclo(ciclo);
            mod.setId_estado(et.getId_estado());
            mod.setId_beca(esst.getId_beca());

            try {
                if (modC.modificarInscripcion(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
          }
                   }
            
        }
       
        //BÚSQUEDA DE ALUMNO POR CÓDIGO
        if (e.getSource() == ini.btnBusAluIns) {
          IndiceGrado est = (IndiceGrado) ini.cbxGradoIns.getSelectedItem();
          IndiceBeca esst = (IndiceBeca) ini.cbxBeca.getSelectedItem();
          IndiceEstado et = (IndiceEstado) ini.cbxEstadoAlum.getSelectedItem();
          String ciclo= String.valueOf(ini.cicloIns.getYear());
            
            mod.setCodigo_alumno(ini.txtCodAlum.getText());
            mod.setCiclo(ciclo);
            if (ini.txtCodAlum.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Código de Alumno");
            } else {
            try {
                if (modC.buscarAlumnosInscritos(mod)){
                ini.txtId_Ins1.setText(String.valueOf(mod.getId_inscripcion()));
                ini.txtId_Ins.setText(String.valueOf(mod.getId_alumno()));
                ini.txtNombreAlum.setText(mod.getNombre_alumno());
                ini.txtCuotaIns.setText(mod.getCuota_ins());
                ini.txtCuotaMen.setText(mod.getCuota_mensual());
                ini.cbxGradoIns.setSelectedIndex(mod.getId_grado());
                ini.cbxBeca.setSelectedIndex(mod.getId_beca());
                ini.cbxEstadoAlum.setSelectedIndex(mod.getId_estado());
                ini.btnInscribir.setEnabled(false);
                ini.btnModificarIns.setEnabled(true);
                ini.labelEstado.setVisible(true);
                ini.cbxEstadoAlum.setVisible(true);
                
                }
                else if (modC.buscarAlumnosIns(mod)) {
                    limpiar2();
                    ini.txtId_Ins.setText(String.valueOf(mod.getId_alumno()));
                    ini.txtCodAlum.setText(mod.getCodigo_alumno());
                    ini.txtNombreAlum.setText(mod.getNombre_alumno());
                    ini.btnInscribir.setEnabled(true);
                    ini.btnModificarIns.setEnabled(false);
                    ini.labelEstado.setVisible(false);
                    ini.cbxEstadoAlum.setVisible(false);
                    
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Alumno no Registrado");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
        
        }
        
        
        //CARGAR DATOS EN TABLA DE ALUMNOS INSCRITOS
        if (e.getSource() == ini.btnCargarInscritos) {
            String anio= String.valueOf(ini.yearGrado3.getYear());
            try {
                modC.LlenarTabla(ini.jtInscritos, ini.txtBusInscrito, anio);
                modC.contar(ini.labelInscritos, anio);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
       
        //CARGAR DATOS DE ALUMNO POR GRADO
        if (e.getSource() == ini.btnCargarGrado) {
            String anio= String.valueOf(ini.yearGrado.getYear());
            try {
                modC.LlenarGrados(ini.jtGrados, ini.txtGradoId, anio);
                modC.contarGrado(ini.labelInscritos1, ini.txtGradoId, anio);
                modC.Grado(ini.labelMostrarGrado, ini.labelMostrarDocente, ini.txtGradoId, anio);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        
        //CARGAR INFORME DE DATOS DE LOS ALUMNOS POR GRADO
        
         if (e.getSource() == ini.btnImprimirGrado) {
             String anio= String.valueOf(ini.yearGrado.getYear());
            try {
                modC.InformeGrado(ini.txtGradoId, anio, ini.labelMostrarGrado, ini.labelMostrarDocente);
            } catch (JRException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }

    //LIMPIAR DATOS DEL MÓDULO DE INSCRIPCIÓN
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
