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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Alumnos;
import modelo.Catedraticos;
import modelo.IndiceGenero;
import modelo.SqlAlumnos;
import modelo.SqlCatedraticos;

/**
 *
 * @author Sharon
 */
public class CtrlAlumnos implements ActionListener {

    private Alumnos mod;
    private SqlAlumnos modC;
    private Inicio ini;

    //MODULOS Y BOTONES
        public CtrlAlumnos(Alumnos mod, SqlAlumnos modC, Inicio ini) {
        this.mod = mod;
        this.modC = modC;
        this.ini = ini;
        this.ini.btnRegistrarAlumno.addActionListener(this);
        this.ini.btnBuscarAlu.addActionListener(this);
        this.ini.btnModificarAlumno.addActionListener(this);
        this.ini.btnCargarAlumnos.addActionListener(this);
    }

    @Override
    
    //ENVIO DE DATOS PARA REGISTRO DE ALUMNO
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ini.btnRegistrarAlumno) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero.getSelectedItem();

                SqlAlumnos modSql = new SqlAlumnos();
                Alumnos mod = new Alumnos();
                
                DateFormat formatofecha;
        formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String pasofecha = (formatofecha.format(ini.fechaAlumno.getDate()));
        
           // modC.numeralAlu(ini.txtCodAlu);  
            if (ini.txtPriNomAlu.getText().equals("") || ini.txtPriApeAlu.getText().equals("")|| pasofecha.equals("")|| est.getId_genero()== 0) {
                JOptionPane.showMessageDialog(null, "Campos Requeridos vacíos, debe llenar todos los campos que contienen *");
            } else {
            
            if (modSql.existeAlumno(ini.txtCodAlu.getText()) == 0) {
                
            modC.numeralAlu(ini.txtCodAlu);    
            mod.setCodigo_alumno(ini.txtCodAlu.getText());
            mod.setId_genero(est.getId_genero());
            mod.setPrimer_nombre(ini.txtPriNomAlu.getText());
            mod.setSegundo_nombre(ini.txtSegNomAlu.getText());
            mod.setTercer_nombre(ini.txtTerNomAlu.getText());
            mod.setPrimer_apellido(ini.txtPriApeAlu.getText());
            mod.setSegundo_apellido(ini.txtSegApeAlu.getText());
          //  mod.setFecha_nac(ini.txtFecha_nac.getText());
             mod.setFecha_nac(pasofecha);
            mod.setParentezco_encargado(ini.txtNumEnc.getText());
            mod.setNombre_encargado(ini.txtNomEnc.getText());
            mod.setApellido_encargado(ini.txtApeEnc.getText());
            mod.setNumero_encargado(ini.txtNumEnc.getText());

            try {
                if (modC.registrarAlumno(mod)) {
                    JOptionPane.showMessageDialog(null, "Alumno Registrado el Código es:  "+ini.txtCodAlu.getText());
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CtrlAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
                } else {
                        JOptionPane.showMessageDialog(null, "Código de Alumno existente");
                    }
        }
             }
        
        //ENVIO DE DATOS PARA MODIFICACIÓN DE ALUMNO
        if (e.getSource() == ini.btnModificarAlumno) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero.getSelectedItem();
             DateFormat formatofecha;
        formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String pasofecha = (formatofecha.format(ini.fechaAlumno.getDate()));

            mod.setId_alumno(Integer.parseInt(ini.txtId_alumno.getText()));
            mod.setCodigo_alumno(ini.txtCodAlu.getText());
            mod.setId_genero(est.getId_genero());
            mod.setPrimer_nombre(ini.txtPriNomAlu.getText());
            mod.setSegundo_nombre(ini.txtSegNomAlu.getText());
            mod.setTercer_nombre(ini.txtTerNomAlu.getText());
            mod.setPrimer_apellido(ini.txtPriApeAlu.getText());
            mod.setSegundo_apellido(ini.txtSegApeAlu.getText());
            mod.setFecha_nac(pasofecha);
            mod.setParentezco_encargado(ini.txtNumEnc.getText());
            mod.setNombre_encargado(ini.txtNomEnc.getText());
            mod.setApellido_encargado(ini.txtApeEnc.getText());
            mod.setNumero_encargado(ini.txtNumEnc.getText());

            try {
                if (modC.modificarAlumno(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        //ENVIÓ DE DATOS PARA BÚSQUEDA DE ALUMNO
        if (e.getSource() == ini.btnBuscarAlu) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero.getSelectedItem();
            String num=ini.txtCodAlu.getText();
            String codigo;
            codigo = String.format("%03d", Integer.parseInt(num));

            mod.setCodigo_alumno(codigo);
           
             if (ini.txtCodAlu.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Código de Alumno");
            } else {
            try {
                if (modC.buscarAlumnos(mod)) {
                    DateFormat formatofecha;
        formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = mod.getFecha_nac();
        Date pasofecha = formatofecha.parse(fecha);
        
                    ini.txtId_alumno.setText(String.valueOf(mod.getId_alumno()));
                    ini.txtCodAlu.setText(mod.getCodigo_alumno());
                    ini.cbxGenero.setSelectedIndex(mod.getId_genero());
                    ini.txtPriNomAlu.setText(mod.getPrimer_nombre());
                    ini.txtSegNomAlu.setText(mod.getSegundo_nombre());
                    ini.txtTerNomAlu.setText(mod.getTercer_nombre());
                    ini.txtPriApeAlu.setText(mod.getPrimer_apellido());
                    ini.txtSegApeAlu.setText(mod.getSegundo_apellido());
                    ini.fechaAlumno.setDate(pasofecha);
                    ini.txtNumEnc.setText(mod.getParentezco_encargado());
                    ini.txtNomEnc.setText(mod.getNombre_encargado());
                    ini.txtApeEnc.setText(mod.getApellido_encargado());
                    ini.txtNumEnc.setText(mod.getNumero_encargado());
                    ini.btnModificarAlumno.setEnabled(true);
                    ini.btnRegistrarAlumno.setEnabled(false);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CtrlAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        }
        
        //DATOS PARA OBTENER ALUMNOS
        if (e.getSource() == ini.btnCargarAlumnos) {
            
            try {
                modC.LlenarTabla(ini.jtAlumnos, ini.txtBusAlumno);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }

    
    // LIMPIAR LOS CAMPOS
    public void limpiar() {
        ini.txtCodAlu.setText(null);
        ini.txtPriNomAlu.setText(null);
        ini.txtSegNomAlu.setText(null);
        ini.txtTerNomAlu.setText(null);
        ini.txtPriApeAlu.setText(null);
        ini.txtSegApeAlu.setText(null);
        ini.fechaAlumno.setDate(null);
        ini.txtNumEnc.setText(null);
        ini.txtNomEnc.setText(null);
        ini.txtApeEnc.setText(null);
        ini.txtNumEnc.setText(null);
        ini.cbxGenero.setSelectedIndex(0);

    }

}
