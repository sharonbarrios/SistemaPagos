/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacolegio;


import Vista.Inicio;
import Vista.Login;
import modelo.Conexion;
/**
 *
 * @author Sharon
 */
public class SistemaColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //DISEÑO 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // TODO code application logic here
        
        
        //CONEXIÓN A LA BASE DE DATOS
        Conexion c = new Conexion();
        if (c.getConexion() != null) {
            System.out.println("Conexion correcta");
        } else {
            System.out.println("Conexion incorrecta");
        }

        //INSTANCIA DE LAS VISTAS
        Inicio ini = new Inicio();
        
        Login log = new Login();
   
        log.setVisible(true);
    }

}
