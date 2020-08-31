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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Catedraticos;
import modelo.IndiceEstado;
import modelo.IndiceGenero;
import modelo.SqlCatedraticos;

/**
 *
 * @author Sharon
 */
public class CtrlCatedraticos implements ActionListener {

    private Catedraticos mod;
    private SqlCatedraticos modC;
    private Inicio ini;

    //MODULOS Y BOTONES
    public CtrlCatedraticos(Catedraticos mod, SqlCatedraticos modC, Inicio ini) {
        this.mod = mod;
        this.modC = modC;
        this.ini = ini;
        this.ini.btnRegistrarCat.addActionListener(this);
        this.ini.btnBuscarCat.addActionListener(this);
        this.ini.btnModificarCat.addActionListener(this);
        this.ini.btnCargarCatedraticos.addActionListener(this);
        this.ini.btnCargarCatedraticos1.addActionListener(this);
        this.ini.btnCargarCatedraticosA.addActionListener(this);
        this.ini.btnAsistencia.addActionListener(this);
        this.ini.btnAsignarGrado.addActionListener(this);
         this.ini.btnCargarAsignados.addActionListener(this);
    }

    @Override
    
    //DATOS PARA REGISTRO DE CATEDRÁTICOS
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ini.btnRegistrarCat) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero1.getSelectedItem();
            DateFormat formatofecha;
        formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String pasofecha = (formatofecha.format(ini.fechaAlumno1.getDate()));

            SqlCatedraticos modSql = new SqlCatedraticos();
                Catedraticos mod = new Catedraticos();
            
            if (modSql.existeCatedratico(ini.txtCodCat.getText()) == 0) {
              //  if (modSql.esEmail(ini.txtCorreoCat.getText())) {
                    
            modC.numeralCat(ini.txtCodCat);        
            mod.setCod_catedratico(ini.txtCodCat.getText());
            mod.setId_genero(est.getId_genero());
            mod.setId_estado(1);
            mod.setPrimerNombre_cat(ini.txtPriNomCat.getText());
            mod.setSegundoNombre_cat(ini.txtSegNomCat.getText());
            mod.setTercerNombre_cat(ini.txtTerNomCat.getText());
            mod.setPrimerApellido_cat(ini.txtPriApeCat.getText());
            mod.setSegundoApellido_cat(ini.txtSegApeCat.getText());
            mod.setNumero_catedratico(ini.txtNumCat.getText());
            mod.setCorreo_catedratico(ini.txtCorreoCat.getText());
            mod.setFecha(pasofecha);

            try {
                if (modC.registrarCatedratico(mod)) {
                    JOptionPane.showMessageDialog(null, "Catedrático Registrado el Código es:  "+ini.txtCodCat.getText());
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
             //} else {
                //            JOptionPane.showMessageDialog(null, "El correo eléctronico no es válido");
                  //      }
             } 
                else {
                        JOptionPane.showMessageDialog(null, "Código de Catedrático existente");
                    }

        }
        
        //DATOS PARA MODIFICACIÓN DE CATEDRÁTICOS
        if (e.getSource() == ini.btnModificarCat) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero1.getSelectedItem();
            IndiceEstado et = (IndiceEstado) ini.cbxEstadoAlum1.getSelectedItem();
            DateFormat formatofecha;
            formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(ini.fechaAlumno1.getDate()));

            mod.setId_catedratico(Integer.parseInt(ini.txtIdCat.getText()));
            mod.setCod_catedratico(ini.txtCodCat.getText());
            mod.setId_genero(est.getId_genero());
            mod.setId_estado(et.getId_estado());
            mod.setPrimerNombre_cat(ini.txtPriNomCat.getText());
            mod.setSegundoNombre_cat(ini.txtSegNomCat.getText());
            mod.setTercerNombre_cat(ini.txtTerNomCat.getText());
            mod.setPrimerApellido_cat(ini.txtPriApeCat.getText());
            mod.setSegundoApellido_cat(ini.txtSegApeCat.getText());
            mod.setNumero_catedratico(ini.txtNumCat.getText());
            mod.setCorreo_catedratico(ini.txtCorreoCat.getText());
            mod.setFecha(pasofecha);

            try {
                if (modC.modificarCatedratico(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                     ini.cbxEstadoAlum1.setVisible(false);
                     ini.labelEstado1.setVisible(false);
                     ini.btnModificarCat.setEnabled(false);
                     ini.btnRegistrarCat.setEnabled(true);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
          //DATOS PARA ASIGNACIÓN DE GRADO
        if (e.getSource() == ini.btnAsignarGrado) {
            
            SqlCatedraticos modSql = new SqlCatedraticos();
            Catedraticos mod = new Catedraticos();
            
            String anio= String.valueOf(ini.yearAsignar.getYear());
             if (ini.txtBusCat4.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Código de Alumno");
            } else {
            if (modSql.existeAsignacion(anio, ini.txtGradoId1.getText()) == 0) {
             
            mod.setId_grado(Integer.parseInt(ini.txtGradoId1.getText()));
            mod.setId_catedratico(Integer.parseInt(ini.txtId_cat1.getText()));    
            mod.setCod_catedratico(ini.txtBusCat4.getText());
            mod.setAnio(ini.yearAsignar.getYear());

            try {
                if (modC.registrarAsignacion(mod)) {
                    JOptionPane.showMessageDialog(null, "Grado Asignado");
                    modC.LlenarAsignacion(ini.jtAsignacion, anio);
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
             } 
                else {
                mod.setId_grado(Integer.parseInt(ini.txtGradoId1.getText()));
                mod.setId_catedratico(Integer.parseInt(ini.txtId_cat1.getText()));  
                mod.setCod_catedratico(ini.txtBusCat4.getText());
                mod.setAnio(ini.yearAsignar.getYear());
         
                 try {
                if (modC.actualizarAsignacion(mod)) {
                    JOptionPane.showMessageDialog(null, "Asignación Actualizada");
                    modC.LlenarAsignacion(ini.jtAsignacion, anio);
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }

        }
               }
        
        
        // DATOS PARA REGISTRO DE ASISTENCIA
        if (e.getSource() == ini.btnAsistencia) {
            
            SqlCatedraticos modSql = new SqlCatedraticos();
            Catedraticos mod = new Catedraticos();
                
            Date date = new Date();
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd");
             LocalTime time = LocalTime.now();
             
             String hora;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        hora=(time.format(formatter));
            
            if (modSql.existeEntrada(ini.txtBusCat1.getText()) == 0) {
             
            mod.setId_catedratico(Integer.parseInt(ini.txtId_cat.getText()));    
            mod.setCod_catedratico(ini.txtBusCat1.getText());
            mod.setFecha_asistencia(fechaHora.format(date));
            mod.setHora_entrada(hora);
            mod.setObservacion_asistencia(ini.txtObserAsis.getText());

            try {
                if (modC.registrarAsistencia(mod)) {
                    JOptionPane.showMessageDialog(null, "Hora de entrada Registrada");
                    ini.labelAsistencia.setText(" ");
                     modC.LlenarAsistencia(ini.jtAsistencia);
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
             } 
                else {
                mod.setId_catedratico(Integer.parseInt(ini.txtId_cat.getText()));  
                mod.setHora_salida(hora);
                mod.setObservacion_asistencia(ini.txtObserAsis.getText());
                 try {
                if (modC.actualizarAsistencia(mod)) {
                    JOptionPane.showMessageDialog(null, "Hora de salida Registrada");
                    ini.labelAsistencia.setText(" ");
                     modC.LlenarAsistencia(ini.jtAsistencia);
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }

        }
        
        //DATOS PARA BÚSQUEDA DE CATEDRÁTICO
        if (e.getSource() == ini.btnBuscarCat) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero1.getSelectedItem();

            mod.setCod_catedratico(ini.txtCodCat.getText());
             if (ini.txtCodCat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Código de Catedrático");
            } else {
            
            try {
                if (modC.buscarCatedratico(mod)) {
        DateFormat formatofecha;
        formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = mod.getFecha();
        Date pasofecha = formatofecha.parse(fecha);
                    
            ini.txtIdCat.setText(String.valueOf(mod.getId_catedratico()));
            ini.txtCodCat.setText(mod.getCod_catedratico());
            ini.cbxGenero1.setSelectedIndex(mod.getId_genero());
            ini.txtPriNomCat.setText(mod.getPrimerNombre_cat());
            ini.txtSegNomCat.setText(mod.getSegundoNombre_cat());
            ini.txtTerNomCat.setText(mod.getTercerNombre_cat());
            ini.txtPriApeCat.setText(mod.getPrimerApellido_cat());
            ini.txtSegApeCat.setText(mod.getSegundoApellido_cat());
            ini.txtNumCat.setText(mod.getNumero_catedratico());
            ini.txtCorreoCat.setText( mod.getCorreo_catedratico());
            ini.fechaAlumno1.setDate(pasofecha);
            ini.cbxEstadoAlum1.setVisible(true);
            ini.labelEstado1.setVisible(true);
            ini.btnModificarCat.setEnabled(true);
            ini.btnRegistrarCat.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Catedrático no Encontrado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }   catch (ParseException ex) {
                    Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
                }
  }
        }
        
        //OBTENER DATOS DE CATEDRÁTICO
         if (e.getSource() == ini.btnCargarCatedraticos) {
            try {
                modC.LlenarTabla(ini.jtCatedraticos, ini.txtBusCat);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
           if (e.getSource() == ini.btnCargarAsignados) {
               
               String anios= String.valueOf(ini.yearBuscar.getYear());
               
            try {
                modC.LlenarAsignacion(ini.jtAsignacion, anios);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
         
         //OBTENER DATOS DE ASISTENCIA DE CATEDRÁTICOS
          if (e.getSource() == ini.btnCargarCatedraticos1) {
              
               SqlCatedraticos modSql = new SqlCatedraticos();
               Catedraticos mod = new Catedraticos();
            
            mod.setCod_catedratico(ini.txtBusCat1.getText());

            try {
                if (modC.buscarCatedraticos(mod)){
                    ini.txtId_cat.setText(String.valueOf(mod.getId_catedratico()));
                    ini.txtBusCat1.setText(mod.getCod_catedratico());
                    ini.txtNombreCat.setText(mod.getNombre_catedratico());
                    
                    if (modSql.existeEntrada(ini.txtBusCat1.getText()) == 0) {
                        ini.labelAsistencia.setText("Hora Entrada");
                    }
                    else{
                        ini.labelAsistencia.setText("Hora Salida");
                    }
                    
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Catedratico no Encontrado");
                //    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
            //BÚSQUEDA DE CATEDRÁTICO
                    if (e.getSource() == ini.btnCargarCatedraticosA) {
              
               SqlCatedraticos modSql = new SqlCatedraticos();
               Catedraticos mod = new Catedraticos();
            
            mod.setCod_catedratico(ini.txtBusCat4.getText());

            try {
                if (modC.buscarCatedraticos(mod)){
                    ini.txtId_cat1.setText(String.valueOf(mod.getId_catedratico()));
                    ini.txtBusCat4.setText(mod.getCod_catedratico());
                    ini.txtNombreCat1.setText(mod.getNombre_catedratico());       
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Catedratico no Encontrado");
                //    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlPagos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    //LIMPIAR CAMPOS
    public void limpiar() {
        ini.txtCodCat.setText(null);
        ini.txtPriNomCat.setText(null);
        ini.txtSegNomCat.setText(null);
        ini.txtTerNomCat.setText(null);
        ini.txtPriApeCat.setText(null);
        ini.txtSegApeCat.setText(null);
        ini.txtNumCat.setText(null);
        ini.txtCorreoCat.setText(null);
        ini.cbxGenero1.setSelectedIndex(0);
        ini.fechaAlumno1.setDate(null);
    }

}
