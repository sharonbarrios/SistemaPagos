/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.IndiceGenero;
import modelo.Hash;
import modelo.SqlUsuarios;
import modelo.Usuarios;
import modelo.IndiceUsuarios;

/**
 *
 * @author Sharon
 */
public class CtrlUsuarios implements ActionListener {
    //MÓDULOS
    private Usuarios mod;
    private SqlUsuarios modC;
    private Inicio ini;

    //BOTONES DEL MÓDULO
    public CtrlUsuarios(Usuarios mod, SqlUsuarios modC, Inicio ini) {
        this.mod = mod;
        this.modC = modC;
        this.ini = ini;
        this.ini.btnRegistrarUsuario.addActionListener(this);
        this.ini.btnModificarUsuario.addActionListener(this);
        this.ini.btnBuscarUsuario.addActionListener(this);
        this.ini.btnCargarUsuarios.addActionListener(this);
        this.ini.btnBackup.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //DATOS PARA REGISTRO DE USUARIO
        if (e.getSource() == ini.btnRegistrarUsuario) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero2.getSelectedItem();
            IndiceUsuarios es = (IndiceUsuarios) ini.cbxUsuario.getSelectedItem();

            SqlUsuarios modSql = new SqlUsuarios();
            Usuarios mod = new Usuarios();

            String pass = new String(ini.txtPassword.getPassword());
            String passcon = new String(ini.txtConfirmarPassword.getPassword());

            if (ini.txtUsuario.getText().equals("") || pass.equals("") || passcon.equals("") || ini.txtNomUsuario.getText().equals("") || ini.txtCorreoUsuario.getText().equals("") || es.getId_tipo_usuario()== 0) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos, debe llenar todos los campos");
            } else {

                if (pass.equals(passcon)) {

                    try {
                        if (modSql.existeUsuario(ini.txtUsuario.getText()) == 0) {
                            
                            if (modSql.esEmail(ini.txtCorreoUsuario.getText())) {
                                
                                String nuevoPass = Hash.sha1(pass);
                                mod.setId_usuario(20);
                                mod.setId_tipo_usuario(es.getId_tipo_usuario());
                                mod.setId_genero(est.getId_genero());
                                mod.setUsuario(ini.txtUsuario.getText());
                                mod.setContrasena(nuevoPass);
                                mod.setNombre_usuario(ini.txtNomUsuario.getText());
                                mod.setApellido_usuario(ini.txtApeUsuario.getText());
                                mod.setCorreo_usuario(ini.txtCorreoUsuario.getText());
                                mod.setEstado_usuario("Activo");
                                
                                
                                if (modSql.registrar(mod)) {
                                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                                    limpiar();
                                    
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El correo eléctronico no es válido");
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario ya existe");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(CtrlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            }
        }
        
        //BUSCAR ALUMNO
         if (e.getSource() == ini.btnBuscarUsuario) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero2.getSelectedItem();
            IndiceUsuarios es = (IndiceUsuarios) ini.cbxUsuario.getSelectedItem();

            mod.setUsuario(ini.txtUsuario.getText());

            try {
                if (modC.buscarUsuario(mod)) {
            ini.txtIdUsuario.setText(String.valueOf(mod.getId_usuario()));
            ini.txtNomUsuario.setText(mod.getNombre_usuario());
            ini.cbxGenero2.setSelectedIndex(mod.getId_genero());
            ini.txtApeUsuario.setText(mod.getApellido_usuario());
            ini.txtCorreoUsuario.setText(mod.getCorreo_usuario());
            ini.txtUsuario.setText(mod.getUsuario());
            ini.txtPassword.setText(mod.getContrasena());
            ini.txtConfirmarPassword.setText(mod.getContrasena());
            ini.cbxUsuario.setSelectedIndex(mod.getId_tipo_usuario());
           
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no Encontrado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
         //MODIFICACIÓN DE USUARIO
          if (e.getSource() == ini.btnModificarUsuario) {
            IndiceGenero est = (IndiceGenero) ini.cbxGenero2.getSelectedItem();
            IndiceUsuarios es = (IndiceUsuarios) ini.cbxUsuario.getSelectedItem();

            mod.setId_usuario(Integer.parseInt(ini.txtIdUsuario.getText()));
            mod.setId_tipo_usuario(es.getId_tipo_usuario());
            mod.setId_genero(est.getId_genero());
            mod.setUsuario(ini.txtUsuario.getText());
            mod.setContrasena(ini.txtPassword.getText());
            mod.setNombre_usuario(ini.txtNomUsuario.getText());
            mod.setApellido_usuario(ini.txtApeUsuario.getText());
            mod.setCorreo_usuario(ini.txtCorreoUsuario.getText());

            try {
                if (modC.modificarUsuario(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
           if (e.getSource() == ini.btnCargarUsuarios) {
            try {
                modC.LlenarTabla(ini.jtUsuarios, ini.txtBusUsuario);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCatedraticos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
           
           //GENERACIÓN DE BACKUP
           if (e.getSource() == ini.btnBackup) {
               
        javax.swing.JFileChooser file = new javax.swing.JFileChooser();
        javax.swing.filechooser.FileNameExtensionFilter filtro;
        filtro = new javax.swing.filechooser.FileNameExtensionFilter("Archivo MySql (.sql)", "sql");
        file.setApproveButtonText("Guardar");
        file.setFileFilter(filtro);
        if (file.showOpenDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION) {
            String ruta = file.getSelectedFile().toString();
         
            try {
                
                //CONEXIÓN A LA BASE DE DATOS
                Process p= Runtime.getRuntime().exec("C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump -uroot -p -B sistemapagos");
              
                InputStream is= p.getInputStream();
                FileOutputStream fos= new FileOutputStream(ruta);
                
                byte[] buffer = new byte[1000];
                
                int leido = is.read(buffer);
                
                while (leido > 0)
                {
                    fos.write(buffer, 0, leido);
                    leido = is.read(buffer);
                }
                
                fos.close();
                       
            } catch (IOException ex) {
                Logger.getLogger(CtrlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
             JOptionPane.showMessageDialog(null, "Backup Generado");
         }
        
    }
           }
    
    //LIMPIEZA DE CAMPOS DE USUARIO
    public void limpiar() {
        ini.txtNomUsuario.setText(null);
        ini.txtApeUsuario.setText(null);
        ini.txtCorreoUsuario.setText(null);
        ini.txtUsuario.setText(null);
        ini.txtPassword.setText(null);
        ini.txtConfirmarPassword.setText(null);
        ini.cbxGenero2.setSelectedIndex(0);
        ini.cbxUsuario.setSelectedIndex(0);

    }

}
