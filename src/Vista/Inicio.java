/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlPagos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;
import modelo.IndiceGenero;
import modelo.IndiceGrado;
import modelo.Hash;
import modelo.IndiceBeca;
import modelo.IndiceEstado;
import modelo.IndiceFormaPago;
import modelo.IndiceHorario;
import modelo.IndiceMes;
import modelo.IndiceNivel;
import modelo.Sesion;
import modelo.SqlUsuarios;
import modelo.Usuarios;
import modelo.IndiceUsuarios;
import modelo.Pagos;
import modelo.SqlPagos;

/**
 *
 * @author Sharon
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    private int timeRun = 0;
    
    Sesion mod;


    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png")).getImage());
        txtId_alumno.setVisible(false);
        txtIdUser.setVisible(false);
       // txtId_Ins.setVisible(false);
      //  txtIdCodAlumno.setVisible(false);
    }

    public Inicio(Sesion mod) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png")).getImage());
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.now();
        
        this.mod = mod;
        lblNombre.setText(mod.getNombre());
        lblRol.setText(mod.getNombre_tipo());
        txtIdUser.setText(String.valueOf(mod.getId()));
        //txtNoRecibo.setEditable(false);
        jTextField1.setVisible(false);
        txtIdUser.setVisible(false);
    
        //
        txtIdUsuario.setVisible(false);
        txtGrad.setVisible(false);
        txtId_Ins.setVisible(false);
        txtId_Ins1.setVisible(false);
        txtIdCodAlumno.setVisible(false);
        txtIdCodAlumno1.setVisible(false);
        txtId_pago.setVisible(false);
        txtId_pago1.setVisible(false);
        txtIdRecibo.setVisible(false);
        txtIdRecibo1.setVisible(false);
        txtIdCat.setVisible(false);
        jpBackup.setVisible(false);
        txtId_cat.setVisible(false);
        txtGradoId.setVisible(false);
        txtId_alumno.setVisible(false);
        txtId_cat1.setVisible(false);
        txtGradoId1.setVisible(false);
        btnRecibo.setEnabled(false);
        jtPagos.setEnabled(false);
        txtNoRecibo.setEnabled(false);
        txtNombreAlumno.setEnabled(false);
        txtFechaRecibo.setEnabled(false);
        txtGradoPago.setEnabled(false);
        setPanelEnabled(jPanel24, false);
        
        //VERIFICACIÓN DE TIPO DE USUARIO
        switch (mod.getId_tipo()) {
            case 1:
               // jpInscripcion.setVisible(false);
                //jpPagos.setVisible(false);
                jpBackup.setVisible(true);
                break;
            case 2:
                jpUsuarios.setVisible(false);
                jpBackup.setVisible(true);
                pUsuarios.setVisible(false);
             
                break;
            case 3:
                pCatedraticos.setVisible(false);
                 pBackup.setVisible(false);
                  pAlumnos.setVisible(false);
                   pPagos.setVisible(false);
                    pInscripciones.setVisible(false);
                    pUsuarios.setVisible(false);
                jpInicio.setVisible(false);
                jpInscripcion.setVisible(false);
                jpPagos.setVisible(false);
                jpAlumnos.setVisible(false);
                jpAlumnos.setVisible(false);
                jpBackup.setVisible(false);
                jpCatedraticos.setVisible(false);
                jpUsuarios.setVisible(false);
                lbDetalle1.setVisible(false);
                break;
            default:
                break;
        }

        new Thread(){
            public void run(){
            while (timeRun==0){
        
        LocalTime time = LocalTime.now();
        //MOSTRAR HORA EN TIEMPO REAL
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        txtHoraAsis.setText(time.format(formatter));
       
            }
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        jpPagos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpInformes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpBackup = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpAlumnos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpUsuarios = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpCatedraticos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jpInscripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpCerrar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pInscripciones = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pPagos = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        pAlumnos = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        pInformes = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        pUsuarios = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        pBackup = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        pCatedraticos = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        panelAlumnos = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        mainAlumnos = new javax.swing.JPanel();
        panelAgregarAlumnos = new javax.swing.JPanel();
        btnRegistrarAlumno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtNomEnc = new javax.swing.JTextField();
        txtParentezco = new javax.swing.JTextField();
        txtApeEnc = new javax.swing.JTextField();
        txtNumEnc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        btnBuscarAlu = new javax.swing.JButton();
        txtId_alumno = new javax.swing.JTextField();
        txtCodAlu = new javax.swing.JTextField();
        txtPriNomAlu = new javax.swing.JTextField();
        txtSegNomAlu = new javax.swing.JTextField();
        txtTerNomAlu = new javax.swing.JTextField();
        txtPriApeAlu = new javax.swing.JTextField();
        txtSegApeAlu = new javax.swing.JTextField();
        fechaAlumno = new com.toedter.calendar.JDateChooser();
        btnModificarAlumno = new javax.swing.JButton();
        panelVerAlumnos = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtBusAlumno = new javax.swing.JTextField();
        btnCargarAlumnos = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        lbAgregarAlumno = new javax.swing.JLabel();
        lbVerAlumno = new javax.swing.JLabel();
        panelInformes = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        mainInformes = new javax.swing.JPanel();
        panelVerRecibos = new javax.swing.JPanel();
        btnCargarInforme = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagoAlu = new javax.swing.JTable();
        yearBuscar1 = new com.toedter.calendar.JYearChooser();
        jComboBox4 = new javax.swing.JComboBox<>();
        panelVerDetalles = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        btnCargarDetalle = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtPagoAlu1 = new javax.swing.JTable();
        txtBusAlumno1 = new javax.swing.JTextField();
        panelVerDetalles1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        btnCargarDetalle1 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtPagoAlu2 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        cicloIns2 = new com.toedter.calendar.JYearChooser();
        jPanel25 = new javax.swing.JPanel();
        lbPago = new javax.swing.JLabel();
        lbDetalle = new javax.swing.JLabel();
        lbDetalle1 = new javax.swing.JLabel();
        panelBackup = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        mainBackup = new javax.swing.JPanel();
        panelGenerarBackup = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnBackup = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbGenerarBackup = new javax.swing.JLabel();
        panelCatedraticos = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        mainCatedraticos = new javax.swing.JPanel();
        panelAgregarCatedratico = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cbxGenero1 = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtIdCat = new javax.swing.JTextField();
        btnBuscarCat = new javax.swing.JButton();
        txtPriApeCat = new javax.swing.JTextField();
        txtSegNomCat = new javax.swing.JTextField();
        txtSegApeCat = new javax.swing.JTextField();
        txtPriNomCat = new javax.swing.JTextField();
        txtTerNomCat = new javax.swing.JTextField();
        txtCodCat = new javax.swing.JTextField();
        txtNumCat = new javax.swing.JTextField();
        txtCorreoCat = new javax.swing.JTextField();
        labelEstado1 = new javax.swing.JLabel();
        cbxEstadoAlum1 = new javax.swing.JComboBox<>();
        fechaAlumno1 = new com.toedter.calendar.JDateChooser();
        btnRegistrarCat = new javax.swing.JButton();
        btnModificarCat = new javax.swing.JButton();
        panelAsignarCurso = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        txtBusCat4 = new javax.swing.JTextField();
        txtNombreCat1 = new javax.swing.JTextField();
        txtId_cat1 = new javax.swing.JTextField();
        btnCargarCatedraticosA = new javax.swing.JButton();
        labelNivel1 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        cbxNivelAlu1 = new javax.swing.JComboBox<>();
        yearAsignar = new com.toedter.calendar.JYearChooser();
        labelGrado2 = new javax.swing.JLabel();
        cbxGradoAlu1 = new javax.swing.JComboBox<>();
        txtGradoId1 = new javax.swing.JTextField();
        btnAsignarGrado = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        btnCargarAsignados = new javax.swing.JButton();
        yearBuscar = new com.toedter.calendar.JYearChooser();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtAsignacion = new javax.swing.JTable();
        panelVerCatedratico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCatedraticos = new javax.swing.JTable();
        btnCargarCatedraticos = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtBusCat = new javax.swing.JTextField();
        panelAsistencia = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtAsistencia = new javax.swing.JTable();
        jLabel100 = new javax.swing.JLabel();
        txtBusCat1 = new javax.swing.JTextField();
        txtNombreCat = new javax.swing.JTextField();
        btnAsistencia = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        txtId_cat = new javax.swing.JTextField();
        txtHoraAsis = new javax.swing.JTextField();
        btnCargarCatedraticos1 = new javax.swing.JButton();
        txtFechaAsis = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        labelAsisten = new javax.swing.JLabel();
        labelAsistencia = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtObserAsis = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        lbAgregarCatedraticos = new javax.swing.JLabel();
        lbVerCatedraticos = new javax.swing.JLabel();
        lbAsistencia = new javax.swing.JLabel();
        lbAsignar = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        mainUsuarios = new javax.swing.JPanel();
        panelAgregarUsuario = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        cbxGenero2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cbxUsuario = new javax.swing.JComboBox<>();
        btnBuscarUsuario = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        txtIdUsuario = new javax.swing.JTextField();
        txtNomUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        txtApeUsuario = new javax.swing.JTextField();
        panelVerUsuarios = new javax.swing.JPanel();
        txtBusUsuario = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jLabel98 = new javax.swing.JLabel();
        btnCargarUsuarios = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbAgregarUsuario = new javax.swing.JLabel();
        lbVerUsuario = new javax.swing.JLabel();
        panelInscripcion = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        mainInscripcion = new javax.swing.JPanel();
        panelAgregarInscripcion = new javax.swing.JPanel();
        btnInscribir = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        cbxNivel = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtId_Ins = new javax.swing.JTextField();
        btnBusAluIns = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        cbxGradoIns = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        cbxEstadoAlum = new javax.swing.JComboBox<>();
        txtId_Ins1 = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        cbxBeca = new javax.swing.JComboBox<>();
        txtCodAlum = new javax.swing.JTextField();
        txtNombreAlum = new javax.swing.JTextField();
        txtCuotaIns = new javax.swing.JTextField();
        txtCuotaMen = new javax.swing.JTextField();
        cicloIns = new com.toedter.calendar.JYearChooser();
        txtGrad = new javax.swing.JTextField();
        btnModificarIns = new javax.swing.JButton();
        panelVerInscripcion = new javax.swing.JPanel();
        labelGradoIns = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtInscritos = new javax.swing.JTable();
        btnCargarInscritos = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtBusInscrito = new javax.swing.JTextField();
        labelInscritos = new javax.swing.JLabel();
        yearGrado3 = new com.toedter.calendar.JYearChooser();
        panelVerGrados = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtGrados = new javax.swing.JTable();
        btnCargarGrado = new javax.swing.JButton();
        labelGrado = new javax.swing.JLabel();
        labelInscritos1 = new javax.swing.JLabel();
        cbxGradoAlu = new javax.swing.JComboBox<>();
        labelNivel = new javax.swing.JLabel();
        cbxNivelAlu = new javax.swing.JComboBox<>();
        txtGradoId = new javax.swing.JTextField();
        btnImprimirGrado = new javax.swing.JButton();
        labelGrado1 = new javax.swing.JLabel();
        labelMostrarGrado = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        yearGrado = new com.toedter.calendar.JYearChooser();
        labelGrado3 = new javax.swing.JLabel();
        labelMostrarDocente = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lbInscribir = new javax.swing.JLabel();
        lbVerInscritos = new javax.swing.JLabel();
        lbVerGrado = new javax.swing.JLabel();
        panelPagos = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        mainCursos3 = new javax.swing.JPanel();
        panelAgregarPago = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        btnBuscarAluPago = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        cbxFormaPago = new javax.swing.JComboBox<>();
        btnRegistrarPago = new javax.swing.JButton();
        cbxMes = new javax.swing.JComboBox<>();
        btnRecibo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtPagos = new javax.swing.JTable();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        cbxMora = new javax.swing.JComboBox<>();
        labelMora = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtObservacionesPago = new javax.swing.JTextField();
        txtNoRecibo = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        txtIdCodAlumno = new javax.swing.JTextField();
        txtId_pago = new javax.swing.JTextField();
        txtIdRecibo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnPagoAlumno = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        txtGradoPago = new javax.swing.JTextField();
        txtFechaRecibo = new javax.swing.JTextField();
        txtCodAlumno = new javax.swing.JTextField();
        txtNombreAlumno = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        cicloIns1 = new com.toedter.calendar.JYearChooser();
        jLabel111 = new javax.swing.JLabel();
        panelVerPagos = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtPagos1 = new javax.swing.JTable();
        jLabel115 = new javax.swing.JLabel();
        labelMora1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtObservacionesPago1 = new javax.swing.JTextField();
        txtIdCodAlumno1 = new javax.swing.JTextField();
        txtId_pago1 = new javax.swing.JTextField();
        txtIdRecibo1 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        txtCodAlumno1 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        txtNombreAlumno1 = new javax.swing.JTextField();
        txtFechaRecibo1 = new javax.swing.JTextField();
        txtGradoPago1 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtNoRecibo1 = new javax.swing.JTextField();
        btnBuscarAluPago1 = new javax.swing.JButton();
        btnRecibo1 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        lbAgregarPago = new javax.swing.JLabel();
        lbVerPago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio Liceo Mixto");
        setIconImages(null);
        setLocationByPlatform(true);

        Mainpanel.setBackground(new java.awt.Color(255, 255, 51));

        panelLateral.setBackground(new java.awt.Color(70, 130, 180));

        jpPagos.setBackground(new java.awt.Color(70, 130, 180));
        jpPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPagosMouseExited(evt);
            }
        });
        jpPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_receive_cash_24px.png"))); // NOI18N
        jpPagos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Pagos");
        jpPagos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpInformes.setBackground(new java.awt.Color(70, 130, 180));
        jpInformes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInformesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpInformesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpInformesMouseExited(evt);
            }
        });
        jpInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_bullish_26px.png"))); // NOI18N
        jpInformes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Informes Pagos");
        jpInformes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpBackup.setBackground(new java.awt.Color(70, 130, 180));
        jpBackup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBackupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBackupMouseExited(evt);
            }
        });
        jpBackup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_data_backup_26px.png"))); // NOI18N
        jpBackup.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Backup");
        jpBackup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpAlumnos.setBackground(new java.awt.Color(70, 130, 180));
        jpAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpAlumnosMouseExited(evt);
            }
        });
        jpAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_groups_filled_26px.png"))); // NOI18N
        jpAlumnos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Alumnos");
        jpAlumnos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpUsuarios.setBackground(new java.awt.Color(70, 130, 180));
        jpUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseExited(evt);
            }
        });
        jpUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_add_user_26px.png"))); // NOI18N
        jpUsuarios.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Usuarios");
        jpUsuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpCatedraticos.setBackground(new java.awt.Color(70, 130, 180));
        jpCatedraticos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpCatedraticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCatedraticosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCatedraticosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCatedraticosMouseExited(evt);
            }
        });
        jpCatedraticos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_classroom_24px.png"))); // NOI18N
        jpCatedraticos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Catedráticos");
        jpCatedraticos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_user_shield_100px.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        lblRol.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRol.setForeground(new java.awt.Color(51, 51, 51));

        jpInscripcion.setBackground(new java.awt.Color(70, 130, 180));
        jpInscripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpInscripcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpInscripcionMouseDragged(evt);
            }
        });
        jpInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInscripcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpInscripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpInscripcionMouseExited(evt);
            }
        });
        jpInscripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_student_registration_24px.png"))); // NOI18N
        jpInscripcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Inscripciones");
        jpInscripcion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        jpInicio.setBackground(new java.awt.Color(60, 113, 158));
        jpInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpInicioMouseDragged(evt);
            }
        });
        jpInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpInicioMouseExited(evt);
            }
        });
        jpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_home_24px.png"))); // NOI18N
        jpInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Menú");
        jpInicio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, 50));

        jpCerrar.setBackground(new java.awt.Color(70, 130, 180));
        jpCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 145, 190)));
        jpCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCerrarMouseExited(evt);
            }
        });
        jpCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_logout_rounded_left_24px.png"))); // NOI18N
        jpCerrar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setText("Cerrar Sesión");
        jpCerrar.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCatedraticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addComponent(jpCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLateralLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jpInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelPrincipal.setLayout(new java.awt.CardLayout());

        panelInicio.setBackground(new java.awt.Color(242, 243, 244));
        panelInicio.setPreferredSize(new java.awt.Dimension(1058, 829));

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel19.setText("Menú");

        pInscripciones.setBackground(new java.awt.Color(70, 130, 180));

        jPanel26.setBackground(new java.awt.Color(60, 113, 158));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_student_registration_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("Inscripciones");

        javax.swing.GroupLayout pInscripcionesLayout = new javax.swing.GroupLayout(pInscripciones);
        pInscripciones.setLayout(pInscripcionesLayout);
        pInscripcionesLayout.setHorizontalGroup(
            pInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInscripcionesLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(18, 18, 18))
        );
        pInscripcionesLayout.setVerticalGroup(
            pInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pInscripcionesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pPagos.setBackground(new java.awt.Color(70, 130, 180));

        jPanel27.setBackground(new java.awt.Color(60, 113, 158));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_receive_cash_filled_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setText("Pagos");

        javax.swing.GroupLayout pPagosLayout = new javax.swing.GroupLayout(pPagos);
        pPagos.setLayout(pPagosLayout);
        pPagosLayout.setHorizontalGroup(
            pPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPagosLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(39, 39, 39))
        );
        pPagosLayout.setVerticalGroup(
            pPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pPagosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pAlumnos.setBackground(new java.awt.Color(70, 130, 180));

        jPanel28.setBackground(new java.awt.Color(60, 113, 158));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_groups_filled_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jLabel39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel39.setText("Alumnos");

        javax.swing.GroupLayout pAlumnosLayout = new javax.swing.GroupLayout(pAlumnos);
        pAlumnos.setLayout(pAlumnosLayout);
        pAlumnosLayout.setHorizontalGroup(
            pAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlumnosLayout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(34, 34, 34))
        );
        pAlumnosLayout.setVerticalGroup(
            pAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pAlumnosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pInformes.setBackground(new java.awt.Color(70, 130, 180));

        jPanel30.setBackground(new java.awt.Color(60, 113, 158));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_bullish_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addGap(39, 39, 39))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addGap(47, 47, 47))
        );

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("Informes");

        javax.swing.GroupLayout pInformesLayout = new javax.swing.GroupLayout(pInformes);
        pInformes.setLayout(pInformesLayout);
        pInformesLayout.setHorizontalGroup(
            pInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformesLayout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(20, 20, 20))
        );
        pInformesLayout.setVerticalGroup(
            pInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pInformesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pUsuarios.setBackground(new java.awt.Color(70, 130, 180));

        jPanel32.setBackground(new java.awt.Color(60, 113, 158));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_add_user_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel77.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel77.setText("Usuarios");

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBackup.setBackground(new java.awt.Color(70, 130, 180));

        jPanel34.setBackground(new java.awt.Color(60, 113, 158));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_data_backup_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel78.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel78.setText("Backup");

        javax.swing.GroupLayout pBackupLayout = new javax.swing.GroupLayout(pBackup);
        pBackup.setLayout(pBackupLayout);
        pBackupLayout.setHorizontalGroup(
            pBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBackupLayout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel78)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pBackupLayout.setVerticalGroup(
            pBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pBackupLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel78)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCatedraticos.setBackground(new java.awt.Color(70, 130, 180));

        jPanel36.setBackground(new java.awt.Color(60, 113, 158));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_classroom_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jLabel79.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel79.setText("Catedráticos");

        javax.swing.GroupLayout pCatedraticosLayout = new javax.swing.GroupLayout(pCatedraticos);
        pCatedraticos.setLayout(pCatedraticosLayout);
        pCatedraticosLayout.setHorizontalGroup(
            pCatedraticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCatedraticosLayout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel79)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pCatedraticosLayout.setVerticalGroup(
            pCatedraticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCatedraticosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addGap(56, 56, 56))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 51));
        jPanel37.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelInicioLayout.createSequentialGroup()
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pInscripciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pAlumnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pCatedraticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel19)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pCatedraticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelInicio, "card9");

        jPanel10.setBackground(new java.awt.Color(70, 130, 180));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel50.setText("Alumnos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addContainerGap())
        );

        mainAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        mainAlumnos.setLayout(new java.awt.CardLayout());

        panelAgregarAlumnos.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarAlumno.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnRegistrarAlumno.setText("Registrar");
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Encargado"));

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel55.setText("Nombre:");

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel57.setText("Apellido:");

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel58.setText("Parentezco:");

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel59.setText("Número de Teléfono:");

        txtNomEnc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNomEnc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Un Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtNomEnc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomEncFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomEncFocusLost(evt);
            }
        });

        txtParentezco.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Un Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtParentezco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtParentezcoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParentezcoFocusLost(evt);
            }
        });

        txtApeEnc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtApeEnc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Un Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtApeEnc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApeEncFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApeEncFocusLost(evt);
            }
        });

        txtNumEnc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNumEnc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Un Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomEnc, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtParentezco))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApeEnc, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txtNumEnc))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomEnc)
                        .addComponent(jLabel55)
                        .addComponent(jLabel57))
                    .addComponent(txtApeEnc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtParentezco)
                        .addComponent(jLabel58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Alumno"));

        jLabel51.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel51.setText("Nombre:");

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel52.setText("Apellido:");

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel53.setText("*Fecha de Nacimiento:");

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel54.setText("*Género:");

        cbxGenero.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel60.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel60.setText("Código Alumno:");

        btnBuscarAlu.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        txtId_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_alumnoActionPerformed(evt);
            }
        });

        txtCodAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCodAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Código Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCodAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodAluFocusLost(evt);
            }
        });

        txtPriNomAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPriNomAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ingrese Primer Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtPriNomAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriNomAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriNomAluFocusLost(evt);
            }
        });

        txtSegNomAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSegNomAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtSegNomAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSegNomAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSegNomAluFocusLost(evt);
            }
        });

        txtTerNomAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTerNomAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtTerNomAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTerNomAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTerNomAluFocusLost(evt);
            }
        });

        txtPriApeAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPriApeAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ingrese Primer Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtPriApeAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriApeAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriApeAluFocusLost(evt);
            }
        });

        txtSegApeAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSegApeAlu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtSegApeAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSegApeAluFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSegApeAluFocusLost(evt);
            }
        });

        fechaAlumno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPriNomAlu, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtCodAlu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSegNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTerNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarAlu)
                                .addGap(177, 177, 177)
                                .addComponent(txtId_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPriApeAlu, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(fechaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSegApeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtId_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBuscarAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSegNomAlu)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPriNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTerNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtPriApeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegApeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        btnModificarAlumno.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnModificarAlumno.setText("Modificar");
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarAlumnosLayout = new javax.swing.GroupLayout(panelAgregarAlumnos);
        panelAgregarAlumnos.setLayout(panelAgregarAlumnosLayout);
        panelAgregarAlumnosLayout.setHorizontalGroup(
            panelAgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarAlumnosLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelAgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAgregarAlumnosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarAlumno)
                        .addGap(41, 41, 41)
                        .addComponent(btnModificarAlumno))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        panelAgregarAlumnosLayout.setVerticalGroup(
            panelAgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(panelAgregarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarAlumno)
                    .addComponent(btnModificarAlumno))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        mainAlumnos.add(panelAgregarAlumnos, "card3");

        panelVerAlumnos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setText("Código de Alumno:");

        txtBusAlumno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        btnCargarAlumnos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnCargarAlumnos.setText("Cargar");

        jtAlumnos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre ", "Apellido", "Fecha_nacimiento", "Género", "Encargado", "Parentezco ", "No. Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnos.setFillsViewportHeight(true);
        jtAlumnos.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane8.setViewportView(jtAlumnos);

        javax.swing.GroupLayout panelVerAlumnosLayout = new javax.swing.GroupLayout(panelVerAlumnos);
        panelVerAlumnos.setLayout(panelVerAlumnosLayout);
        panelVerAlumnosLayout.setHorizontalGroup(
            panelVerAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerAlumnosLayout.createSequentialGroup()
                .addGroup(panelVerAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerAlumnosLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerAlumnosLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel30)
                        .addGap(35, 35, 35)
                        .addComponent(txtBusAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnCargarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelVerAlumnosLayout.setVerticalGroup(
            panelVerAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerAlumnosLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelVerAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtBusAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        mainAlumnos.add(panelVerAlumnos, "card2");

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        lbAgregarAlumno.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAgregarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgregarAlumno.setText("+ Agregar Alumno");
        lbAgregarAlumno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAgregarAlumno.setOpaque(true);
        lbAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarAlumnoMouseClicked(evt);
            }
        });

        lbVerAlumno.setBackground(new java.awt.Color(204, 204, 204));
        lbVerAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerAlumno.setText("Ver Alumnos");
        lbVerAlumno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerAlumno.setOpaque(true);
        lbVerAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
        panelAlumnos.setLayout(panelAlumnosLayout);
        panelAlumnosLayout.setHorizontalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainAlumnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelAlumnosLayout.setVerticalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelAlumnos, "card2");

        panelInformes.setBackground(new java.awt.Color(255, 255, 255));
        panelInformes.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel13.setBackground(new java.awt.Color(70, 130, 180));

        jLabel101.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel101.setText("Informe Pagos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel101)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addContainerGap())
        );

        mainInformes.setBackground(new java.awt.Color(255, 255, 255));
        mainInformes.setLayout(new java.awt.CardLayout());

        panelVerRecibos.setBackground(new java.awt.Color(255, 255, 255));

        btnCargarInforme.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnCargarInforme.setText("Cargar");
        btnCargarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarInformeActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel46.setText("Pagos Realizados En El Mes De:");

        jtPagoAlu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtPagoAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre", "Fecha", "No. Recibo", "Total", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPagoAlu.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jtPagoAlu);

        jComboBox4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones Mes:", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        javax.swing.GroupLayout panelVerRecibosLayout = new javax.swing.GroupLayout(panelVerRecibos);
        panelVerRecibos.setLayout(panelVerRecibosLayout);
        panelVerRecibosLayout.setHorizontalGroup(
            panelVerRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerRecibosLayout.createSequentialGroup()
                .addGroup(panelVerRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerRecibosLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerRecibosLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(yearBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarInforme)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panelVerRecibosLayout.setVerticalGroup(
            panelVerRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerRecibosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panelVerRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarInforme)
                    .addComponent(yearBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        mainInformes.add(panelVerRecibos, "card3");

        panelVerDetalles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel45.setText("Ingrese No. de Recibo");

        btnCargarDetalle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnCargarDetalle.setText("Cargar");

        jtPagoAlu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtPagoAlu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre", "Fecha", "No. Recibo", "Concepto Pago", "Importe", "Mora", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPagoAlu1.setFillsViewportHeight(true);
        jScrollPane6.setViewportView(jtPagoAlu1);

        txtBusAlumno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelVerDetallesLayout = new javax.swing.GroupLayout(panelVerDetalles);
        panelVerDetalles.setLayout(panelVerDetallesLayout);
        panelVerDetallesLayout.setHorizontalGroup(
            panelVerDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerDetallesLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerDetallesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        panelVerDetallesLayout.setVerticalGroup(
            panelVerDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerDetallesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(panelVerDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(btnCargarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        mainInformes.add(panelVerDetalles, "card2");

        panelVerDetalles1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel49.setText("Verificar solvencia hasta:");

        btnCargarDetalle1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCargarDetalle1.setText("Cargar");

        jtPagoAlu2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtPagoAlu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre", "Grado", "Concepto", "Saldo", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPagoAlu2.setFillsViewportHeight(true);
        jScrollPane13.setViewportView(jtPagoAlu2);

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones Mes:", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre" }));

        javax.swing.GroupLayout panelVerDetalles1Layout = new javax.swing.GroupLayout(panelVerDetalles1);
        panelVerDetalles1.setLayout(panelVerDetalles1Layout);
        panelVerDetalles1Layout.setHorizontalGroup(
            panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerDetalles1Layout.createSequentialGroup()
                .addGroup(panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerDetalles1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerDetalles1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cicloIns2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarDetalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        panelVerDetalles1Layout.setVerticalGroup(
            panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerDetalles1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerDetalles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCargarDetalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cicloIns2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        mainInformes.add(panelVerDetalles1, "card2");

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));

        lbPago.setBackground(new java.awt.Color(255, 255, 255));
        lbPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPago.setText("Pagos Realizados");
        lbPago.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbPago.setOpaque(true);
        lbPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPagoMouseClicked(evt);
            }
        });

        lbDetalle.setBackground(new java.awt.Color(204, 204, 204));
        lbDetalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDetalle.setText("Detalle Pagos");
        lbDetalle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbDetalle.setOpaque(true);
        lbDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDetalleMouseClicked(evt);
            }
        });

        lbDetalle1.setBackground(new java.awt.Color(204, 204, 204));
        lbDetalle1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDetalle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDetalle1.setText("Alumnos Insolventes");
        lbDetalle1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbDetalle1.setOpaque(true);
        lbDetalle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDetalle1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(lbPago, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbDetalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbDetalle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelInformesLayout = new javax.swing.GroupLayout(panelInformes);
        panelInformes.setLayout(panelInformesLayout);
        panelInformesLayout.setHorizontalGroup(
            panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformesLayout.createSequentialGroup()
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainInformes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelInformesLayout.setVerticalGroup(
            panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelInformes, "card5");

        panelBackup.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel6.setBackground(new java.awt.Color(70, 130, 180));

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel36.setText("Backup");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        mainBackup.setBackground(new java.awt.Color(255, 255, 255));
        mainBackup.setPreferredSize(new java.awt.Dimension(1052, 695));
        mainBackup.setLayout(new java.awt.CardLayout());

        panelGenerarBackup.setBackground(new java.awt.Color(255, 255, 255));
        panelGenerarBackup.setPreferredSize(new java.awt.Dimension(943, 695));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Copia de Seguridad de Datos"));

        btnBackup.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBackup.setText("Generar Backup");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/backup.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("<html>La copia de seguridad servirá para restaurar los datos ante cualquier incidente</html>");

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("*El archivo debe ser guardado con la extensión .sql");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGenerarBackupLayout = new javax.swing.GroupLayout(panelGenerarBackup);
        panelGenerarBackup.setLayout(panelGenerarBackupLayout);
        panelGenerarBackupLayout.setHorizontalGroup(
            panelGenerarBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenerarBackupLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelGenerarBackupLayout.setVerticalGroup(
            panelGenerarBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenerarBackupLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        mainBackup.add(panelGenerarBackup, "card3");

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        lbGenerarBackup.setBackground(new java.awt.Color(255, 255, 255));
        lbGenerarBackup.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbGenerarBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenerarBackup.setText("+ Generar Backup");
        lbGenerarBackup.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbGenerarBackup.setOpaque(true);
        lbGenerarBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGenerarBackupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbGenerarBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbGenerarBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackupLayout = new javax.swing.GroupLayout(panelBackup);
        panelBackup.setLayout(panelBackupLayout);
        panelBackupLayout.setHorizontalGroup(
            panelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackupLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)))
        );
        panelBackupLayout.setVerticalGroup(
            panelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackupLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBackup, "card2");

        panelCatedraticos.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel8.setBackground(new java.awt.Color(70, 130, 180));

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel43.setText("Catedráticos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        mainCatedraticos.setBackground(new java.awt.Color(255, 255, 255));
        mainCatedraticos.setPreferredSize(new java.awt.Dimension(1052, 695));
        mainCatedraticos.setLayout(new java.awt.CardLayout());

        panelAgregarCatedratico.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Catedrático"));

        jLabel61.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel61.setText("Nombre:");

        jLabel62.setBackground(new java.awt.Color(0, 0, 0));
        jLabel62.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel62.setText("Apellido:");

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel63.setText("Fecha de Nacimiento:");

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel64.setText("Género:");

        cbxGenero1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Género:" }));
        cbxGenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGenero1ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel65.setText("Código Catedrático:");

        jLabel66.setBackground(new java.awt.Color(0, 0, 0));
        jLabel66.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel66.setText("Correo Eléctronico:");

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel67.setText("Número de Teléfono:");

        btnBuscarCat.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        txtPriApeCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPriApeCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtSegNomCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSegNomCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtSegApeCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSegApeCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtPriNomCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPriNomCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtTerNomCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTerNomCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtCodCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtNumCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtCorreoCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreoCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        labelEstado1.setBackground(new java.awt.Color(0, 0, 0));
        labelEstado1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelEstado1.setText("Estado:");

        cbxEstadoAlum1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxEstadoAlum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado:" }));
        cbxEstadoAlum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoAlum1ActionPerformed(evt);
            }
        });

        fechaAlumno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel66))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel67)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodCat)
                                    .addComponent(txtPriNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCat)
                                .addGap(41, 41, 41)
                                .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreoCat, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumCat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(txtPriApeCat, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaAlumno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSegNomCat)
                                    .addComponent(txtSegApeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTerNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(labelEstado1)
                                .addGap(27, 27, 27)
                                .addComponent(cbxEstadoAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarCat)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(txtCodCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSegNomCat)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(txtPriNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTerNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtPriApeCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegApeCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEstado1)
                                .addComponent(cbxEstadoAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(fechaAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63)))
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txtNumCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(txtCorreoCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(cbxGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        btnRegistrarCat.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnRegistrarCat.setText("Agregar");
        btnRegistrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCatActionPerformed(evt);
            }
        });

        btnModificarCat.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnModificarCat.setText("Modificar");
        btnModificarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarCatedraticoLayout = new javax.swing.GroupLayout(panelAgregarCatedratico);
        panelAgregarCatedratico.setLayout(panelAgregarCatedraticoLayout);
        panelAgregarCatedraticoLayout.setHorizontalGroup(
            panelAgregarCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarCatedraticoLayout.createSequentialGroup()
                .addGroup(panelAgregarCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarCatedraticoLayout.createSequentialGroup()
                        .addGap(734, 734, 734)
                        .addComponent(btnRegistrarCat)
                        .addGap(36, 36, 36)
                        .addComponent(btnModificarCat))
                    .addGroup(panelAgregarCatedraticoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelAgregarCatedraticoLayout.setVerticalGroup(
            panelAgregarCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarCatedraticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelAgregarCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCat)
                    .addComponent(btnModificarCat))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        mainCatedraticos.add(panelAgregarCatedratico, "card3");

        panelAsignarCurso.setBackground(new java.awt.Color(255, 255, 255));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignación de Grado"));

        jLabel105.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel105.setText("Código:");

        jLabel106.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel106.setText("Catedrático:");

        btnCargarCatedraticosA.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarCatedraticosA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        labelNivel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNivel1.setText("Nivel:");

        jLabel107.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel107.setText("Año:");

        cbxNivelAlu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Nivel:" }));
        cbxNivelAlu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNivelAlu1ItemStateChanged(evt);
            }
        });

        labelGrado2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGrado2.setText("Grado:");

        cbxGradoAlu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Grado:" }));
        cbxGradoAlu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGradoAlu1ItemStateChanged(evt);
            }
        });

        btnAsignarGrado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAsignarGrado.setText("Asignar");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addGap(50, 50, 50)
                        .addComponent(txtBusCat4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarCatedraticosA))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtId_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNivel1)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxNivelAlu1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrado2)
                .addGap(6, 6, 6)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGradoId1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(cbxGradoAlu1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAsignarGrado)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBusCat4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel105))
                                    .addComponent(btnCargarCatedraticosA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(txtNombreCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtGradoId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxGradoAlu1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAsignarGrado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNivelAlu1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107)))))
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Asignaciones"));

        jLabel108.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel108.setText("Año:");

        btnCargarAsignados.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarAsignados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel108)
                .addGap(29, 29, 29)
                .addComponent(yearBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarAsignados)
                .addGap(616, 616, 616))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108)
                    .addComponent(btnCargarAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAsignacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtAsignacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Grado", "Código Catedrático", "Nombre Catedrático"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAsignacion.setFillsViewportHeight(true);
        jScrollPane11.setViewportView(jtAsignacion);

        javax.swing.GroupLayout panelAsignarCursoLayout = new javax.swing.GroupLayout(panelAsignarCurso);
        panelAsignarCurso.setLayout(panelAsignarCursoLayout);
        panelAsignarCursoLayout.setHorizontalGroup(
            panelAsignarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignarCursoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelAsignarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAsignarCursoLayout.setVerticalGroup(
            panelAsignarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        mainCatedraticos.add(panelAsignarCurso, "card2");

        panelVerCatedratico.setBackground(new java.awt.Color(255, 255, 255));

        jtCatedraticos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtCatedraticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Catedrático", "Nombre ", "Apellido", "Número", "Correo Electrónico", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCatedraticos.setFillsViewportHeight(true);
        jtCatedraticos.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(jtCatedraticos);

        btnCargarCatedraticos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCargarCatedraticos.setText("Cargar");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Código:");

        javax.swing.GroupLayout panelVerCatedraticoLayout = new javax.swing.GroupLayout(panelVerCatedratico);
        panelVerCatedratico.setLayout(panelVerCatedraticoLayout);
        panelVerCatedraticoLayout.setHorizontalGroup(
            panelVerCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerCatedraticoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panelVerCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerCatedraticoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(138, 138, 138)
                        .addComponent(txtBusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnCargarCatedraticos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerCatedraticoLayout.setVerticalGroup(
            panelVerCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerCatedraticoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelVerCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarCatedraticos)
                    .addComponent(jLabel23)
                    .addComponent(txtBusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        mainCatedraticos.add(panelVerCatedratico, "card2");

        panelAsistencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel99.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel99.setText("Catedrático:");

        jtAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Catedrático", "Nombre ", "Fecha", "Entrada", "Salida", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAsistencia.setGridColor(new java.awt.Color(51, 51, 51));
        jtAsistencia.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(jtAsistencia);

        jLabel100.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel100.setText("Código:");

        btnAsistencia.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAsistencia.setText("Aceptar");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel102.setText("Fecha:");

        txtHoraAsis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnCargarCatedraticos1.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarCatedraticos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        txtFechaAsis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel56.setText("Hora:");

        labelAsisten.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAsisten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAsisten.setText("Registrar:");

        labelAsistencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel84.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel84.setText("Observación:");

        javax.swing.GroupLayout panelAsistenciaLayout = new javax.swing.GroupLayout(panelAsistencia);
        panelAsistencia.setLayout(panelAsistenciaLayout);
        panelAsistenciaLayout.setHorizontalGroup(
            panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addGap(50, 50, 50)
                                .addComponent(txtBusCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCargarCatedraticos1))
                            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtId_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102)
                            .addComponent(jLabel56)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                .addComponent(txtFechaAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(labelAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelAsisten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                .addComponent(txtHoraAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtObserAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panelAsistenciaLayout.setVerticalGroup(
            panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAsistenciaLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(txtFechaAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAsistenciaLayout.createSequentialGroup()
                                .addComponent(labelAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labelAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoraAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel56))))
                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBusCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel100))
                            .addComponent(btnCargarCatedraticos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAsistenciaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(txtObserAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        mainCatedraticos.add(panelAsistencia, "card2");

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        lbAgregarCatedraticos.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarCatedraticos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAgregarCatedraticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgregarCatedraticos.setText("+ Agregar Catedráticos");
        lbAgregarCatedraticos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAgregarCatedraticos.setOpaque(true);
        lbAgregarCatedraticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarCatedraticosMouseClicked(evt);
            }
        });

        lbVerCatedraticos.setBackground(new java.awt.Color(204, 204, 204));
        lbVerCatedraticos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerCatedraticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerCatedraticos.setText("Ver Catedráticos");
        lbVerCatedraticos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerCatedraticos.setOpaque(true);
        lbVerCatedraticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerCatedraticosMouseClicked(evt);
            }
        });

        lbAsistencia.setBackground(new java.awt.Color(204, 204, 204));
        lbAsistencia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAsistencia.setText("+Asistencia");
        lbAsistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAsistencia.setOpaque(true);
        lbAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAsistenciaMouseClicked(evt);
            }
        });

        lbAsignar.setBackground(new java.awt.Color(204, 204, 204));
        lbAsignar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAsignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAsignar.setText("+Asignar Curso");
        lbAsignar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAsignar.setOpaque(true);
        lbAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAsignarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lbAgregarCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgregarCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelCatedraticosLayout = new javax.swing.GroupLayout(panelCatedraticos);
        panelCatedraticos.setLayout(panelCatedraticosLayout);
        panelCatedraticosLayout.setHorizontalGroup(
            panelCatedraticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatedraticosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelCatedraticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainCatedraticos, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)))
        );
        panelCatedraticosLayout.setVerticalGroup(
            panelCatedraticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatedraticosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelCatedraticos, "card2");

        panelUsuarios.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel5.setBackground(new java.awt.Color(70, 130, 180));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setText("Usuarios");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        mainUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        mainUsuarios.setLayout(new java.awt.CardLayout());

        panelAgregarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario"));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setText("Correo:");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Apellido:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setText("Nombre:");

        cbxGenero2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxGenero2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Género:" }));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Género:");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inicio de Sesión"));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Usuario:");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setText("Contraseña:");

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setText("Confirmar Contraseña:");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setText("Tipo de Usuario:");

        cbxUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Tipo de Usuario:" }));

        btnBuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtConfirmarPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel29)
                    .addComponent(jLabel18)
                    .addComponent(jLabel31))
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(cbxUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtConfirmarPassword))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarUsuario)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel31))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel29))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnRegistrarUsuario.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnRegistrarUsuario.setText("Agregar");

        btnModificarUsuario.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnModificarUsuario.setText("Modificar");

        txtNomUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNomUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Correo Electrónico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtNomUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomUsuarioFocusLost(evt);
            }
        });

        txtCorreoUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCorreoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Correo Electrónico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCorreoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoUsuarioFocusLost(evt);
            }
        });

        txtApeUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtApeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Correo Electrónico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        txtApeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApeUsuarioFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(jLabel33))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtCorreoUsuario))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarUsuario))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApeUsuario)
                                    .addComponent(cbxGenero2, 0, 188, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel22)
                    .addComponent(txtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel25))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33)))))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout panelAgregarUsuarioLayout = new javax.swing.GroupLayout(panelAgregarUsuario);
        panelAgregarUsuario.setLayout(panelAgregarUsuarioLayout);
        panelAgregarUsuarioLayout.setHorizontalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelAgregarUsuarioLayout.setVerticalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        mainUsuarios.add(panelAgregarUsuario, "card3");

        panelVerUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        txtBusUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jtUsuarios.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Tipo de usuario", "Nombre", "Última sesión", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuarios.setFillsViewportHeight(true);
        jtUsuarios.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(jtUsuarios);

        jLabel98.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel98.setText("Usuario:");

        btnCargarUsuarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCargarUsuarios.setText("Cargar");

        javax.swing.GroupLayout panelVerUsuariosLayout = new javax.swing.GroupLayout(panelVerUsuarios);
        panelVerUsuarios.setLayout(panelVerUsuariosLayout);
        panelVerUsuariosLayout.setHorizontalGroup(
            panelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerUsuariosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerUsuariosLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel98)
                        .addGap(43, 43, 43)
                        .addComponent(txtBusUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarUsuarios))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelVerUsuariosLayout.setVerticalGroup(
            panelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerUsuariosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(txtBusUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarUsuarios))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        mainUsuarios.add(panelVerUsuarios, "card2");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lbAgregarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAgregarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgregarUsuario.setText("+ Agregar Usuario");
        lbAgregarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAgregarUsuario.setOpaque(true);
        lbAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarUsuarioMouseClicked(evt);
            }
        });

        lbVerUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lbVerUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerUsuario.setText("Ver Usuarios");
        lbVerUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerUsuario.setOpaque(true);
        lbVerUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lbAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelUsuarios, "card2");

        panelInscripcion.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel16.setBackground(new java.awt.Color(70, 130, 180));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel48.setText("Inscripción");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );

        mainInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        mainInscripcion.setPreferredSize(new java.awt.Dimension(1052, 695));
        mainInscripcion.setLayout(new java.awt.CardLayout());

        panelAgregarInscripcion.setBackground(new java.awt.Color(255, 255, 255));

        btnInscribir.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Alumno"));

        jLabel68.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel68.setText("Alumno:");

        jLabel70.setBackground(new java.awt.Color(0, 0, 0));
        jLabel70.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel70.setText("*Nivel:");

        jLabel71.setBackground(new java.awt.Color(0, 0, 0));
        jLabel71.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel71.setText("Cuota Mensual:     Q.");

        cbxNivel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones Nivel" }));
        cbxNivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNivelItemStateChanged(evt);
            }
        });
        cbxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNivelActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel72.setText("Código Alumno:");

        jLabel73.setBackground(new java.awt.Color(0, 0, 0));
        jLabel73.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel73.setText("Cuota Inscripción: Q.");

        jLabel74.setBackground(new java.awt.Color(0, 0, 0));
        jLabel74.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel74.setText("*Ciclo:");

        btnBusAluIns.setBackground(new java.awt.Color(255, 255, 255));
        btnBusAluIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        jLabel85.setBackground(new java.awt.Color(0, 0, 0));
        jLabel85.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel85.setText("*Grado:");

        cbxGradoIns.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxGradoIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Grado:" }));
        cbxGradoIns.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGradoInsItemStateChanged(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel96.setText("Beca:");

        cbxEstadoAlum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxEstadoAlum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado del Alumno:" }));
        cbxEstadoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoAlumActionPerformed(evt);
            }
        });

        labelEstado.setBackground(new java.awt.Color(0, 0, 0));
        labelEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelEstado.setText("*Estado:");

        cbxBeca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo de Beca" }));

        txtCodAlum.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCodAlum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ingrese Código del Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCodAlum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodAlumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodAlumFocusLost(evt);
            }
        });
        txtCodAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAlumActionPerformed(evt);
            }
        });

        txtNombreAlum.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNombreAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumActionPerformed(evt);
            }
        });

        txtCuotaIns.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCuotaIns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ingrese Cuota de Inscripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCuotaIns.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuotaInsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCuotaInsFocusLost(evt);
            }
        });
        txtCuotaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuotaInsActionPerformed(evt);
            }
        });
        txtCuotaIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCuotaInsKeyPressed(evt);
            }
        });

        txtCuotaMen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCuotaMen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Ingrese Cuota Mensual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCuotaMen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuotaMenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCuotaMenFocusLost(evt);
            }
        });
        txtCuotaMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuotaMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel70)
                            .addComponent(jLabel68)
                            .addComponent(jLabel73))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                        .addComponent(txtCodAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel74)
                        .addGap(29, 29, 29)
                        .addComponent(cicloIns, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusAluIns))
                    .addComponent(txtNombreAlum, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxNivel, 0, 214, Short.MAX_VALUE)
                            .addComponent(txtCuotaIns, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtCuotaMen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addGap(27, 27, 27)
                                .addComponent(cbxGradoIns, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(labelEstado)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxEstadoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(jLabel96)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId_Ins1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId_Ins, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 87, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(jLabel74))
                        .addComponent(txtId_Ins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBusAluIns, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cicloIns, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId_Ins1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGradoIns, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(cbxBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstado)
                            .addComponent(txtCuotaMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuotaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73))
                        .addGap(13, 13, 13)
                        .addComponent(cbxEstadoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))))
        );

        btnModificarIns.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnModificarIns.setText("Modificar");
        btnModificarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarInscripcionLayout = new javax.swing.GroupLayout(panelAgregarInscripcion);
        panelAgregarInscripcion.setLayout(panelAgregarInscripcionLayout);
        panelAgregarInscripcionLayout.setHorizontalGroup(
            panelAgregarInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarInscripcionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnModificarIns)
                .addContainerGap(625, Short.MAX_VALUE))
            .addGroup(panelAgregarInscripcionLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelAgregarInscripcionLayout.setVerticalGroup(
            panelAgregarInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarInscripcionLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelAgregarInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnModificarIns))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        mainInscripcion.add(panelAgregarInscripcion, "card3");

        panelVerInscripcion.setBackground(new java.awt.Color(255, 255, 255));

        labelGradoIns.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGradoIns.setText("Alumnos Inscritos:");

        jtInscritos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtInscritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre ", "Apellido", "Grado", "Cuota Inscripción", "Cuota Mensual", "Beca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtInscritos.setFillsViewportHeight(true);
        jtInscritos.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(jtInscritos);

        btnCargarInscritos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCargarInscritos.setText("Cargar");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("Código:");

        txtBusInscrito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelInscritos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelVerInscripcionLayout = new javax.swing.GroupLayout(panelVerInscripcion);
        panelVerInscripcion.setLayout(panelVerInscripcionLayout);
        panelVerInscripcionLayout.setHorizontalGroup(
            panelVerInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerInscripcionLayout.createSequentialGroup()
                .addGroup(panelVerInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerInscripcionLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerInscripcionLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCargarInscritos)
                        .addGap(64, 64, 64)
                        .addComponent(labelGradoIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelVerInscripcionLayout.setVerticalGroup(
            panelVerInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerInscripcionLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panelVerInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVerInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargarInscritos)
                        .addComponent(jLabel27)
                        .addComponent(txtBusInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGradoIns))
                    .addComponent(labelInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        mainInscripcion.add(panelVerInscripcion, "card2");

        panelVerGrados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel103.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel103.setText("Total Alumnos:");

        jtGrados.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtGrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Alumno", "Nombre ", "Apellido", "Grado", "Cuota Inscripción", "Cuota Mensual", "Beca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGrados.setFillsViewportHeight(true);
        jtGrados.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane10.setViewportView(jtGrados);

        btnCargarGrado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCargarGrado.setText("Cargar");
        btnCargarGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarGradoActionPerformed(evt);
            }
        });

        labelGrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelGrado.setText("Grado:");

        labelInscritos1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cbxGradoAlu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxGradoAlu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Grado:" }));
        cbxGradoAlu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGradoAluItemStateChanged(evt);
            }
        });

        labelNivel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNivel.setText("Nivel:");

        cbxNivelAlu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxNivelAlu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Nivel:" }));
        cbxNivelAlu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNivelAluItemStateChanged(evt);
            }
        });

        btnImprimirGrado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnImprimirGrado.setText("Imprimir Listado");

        labelGrado1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGrado1.setText("Grado:");

        labelMostrarGrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel109.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel109.setText("Año:");

        labelGrado3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelGrado3.setText("Docente:");

        labelMostrarDocente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelVerGradosLayout = new javax.swing.GroupLayout(panelVerGrados);
        panelVerGrados.setLayout(panelVerGradosLayout);
        panelVerGradosLayout.setHorizontalGroup(
            panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerGradosLayout.createSequentialGroup()
                .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelVerGradosLayout.createSequentialGroup()
                                .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                                        .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelGrado)
                                            .addComponent(labelGrado3))
                                        .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelVerGradosLayout.createSequentialGroup()
                                                .addGap(178, 178, 178)
                                                .addComponent(labelGrado1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbxGradoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelVerGradosLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(labelMostrarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelVerGradosLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(labelMostrarGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerGradosLayout.createSequentialGroup()
                                                .addComponent(jLabel109)
                                                .addGap(18, 18, 18)
                                                .addComponent(yearGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelVerGradosLayout.createSequentialGroup()
                                                .addComponent(jLabel103)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelInscritos1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                                        .addComponent(labelNivel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxNivelAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addComponent(btnCargarGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(btnImprimirGrado))
                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(txtGradoId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelVerGradosLayout.setVerticalGroup(
            panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerGradosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtGradoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxGradoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxNivelAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCargarGrado)
                        .addComponent(yearGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelVerGradosLayout.createSequentialGroup()
                        .addComponent(labelGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelGrado3))
                    .addGroup(panelVerGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelInscritos1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerGradosLayout.createSequentialGroup()
                        .addComponent(labelMostrarGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMostrarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnImprimirGrado)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        mainInscripcion.add(panelVerGrados, "card2");

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        lbInscribir.setBackground(new java.awt.Color(255, 255, 255));
        lbInscribir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbInscribir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInscribir.setText("+Inscribir Alumno");
        lbInscribir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbInscribir.setOpaque(true);
        lbInscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInscribirMouseClicked(evt);
            }
        });

        lbVerInscritos.setBackground(new java.awt.Color(204, 204, 204));
        lbVerInscritos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerInscritos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerInscritos.setText("Ver Alumnos Inscritos");
        lbVerInscritos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerInscritos.setOpaque(true);
        lbVerInscritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerInscritosMouseClicked(evt);
            }
        });

        lbVerGrado.setBackground(new java.awt.Color(204, 204, 204));
        lbVerGrado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerGrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerGrado.setText("Ver Alumnos Por Grado");
        lbVerGrado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerGrado.setOpaque(true);
        lbVerGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerGradoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(lbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelInscripcionLayout = new javax.swing.GroupLayout(panelInscripcion);
        panelInscripcion.setLayout(panelInscripcionLayout);
        panelInscripcionLayout.setHorizontalGroup(
            panelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInscripcionLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelInscripcionLayout.setVerticalGroup(
            panelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscripcionLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelInscripcion, "card2");

        panelPagos.setPreferredSize(new java.awt.Dimension(1058, 829));

        jPanel19.setBackground(new java.awt.Color(70, 130, 180));

        jLabel76.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel76.setText("Pagos");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel76)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addContainerGap())
        );

        mainCursos3.setBackground(new java.awt.Color(255, 255, 255));
        mainCursos3.setPreferredSize(new java.awt.Dimension(1052, 695));
        mainCursos3.setLayout(new java.awt.CardLayout());

        panelAgregarPago.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago Alumno"));

        jLabel81.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel81.setText("Ciclo Escolar:");

        btnBuscarAluPago.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAluPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        jLabel69.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel69.setText("Alumno:");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago"));

        jLabel82.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel82.setText("No. Recibo:");

        jLabel83.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel83.setText("*Forma de Pago:");

        jLabel86.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel86.setText("*Mes a pagar:");

        jLabel87.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel87.setText("Mora:");

        cbxFormaPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Forma de Pago" }));

        btnRegistrarPago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRegistrarPago.setText("Agregar");
        btnRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagoActionPerformed(evt);
            }
        });

        cbxMes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Mes a Pagar" }));

        btnRecibo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnRecibo.setText("Generar Recibo");
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        jtPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Concepto", "Importe", "Mora", "Forma de Pago", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPagos.setFillsViewportHeight(true);
        jtPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPagosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtPagos);

        jLabel88.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel88.setText("*Importe a pagar:");

        jLabel89.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel89.setText("Total Q");

        cbxMora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxMora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicar Mora", "No", "Si" }));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Observaciones:");

        txtObservacionesPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtObservacionesPago.setForeground(new java.awt.Color(153, 153, 153));
        txtObservacionesPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesPagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesPagoFocusLost(evt);
            }
        });

        txtNoRecibo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtImporte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtImporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txtImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtImporteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtImporteFocusLost(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelMora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(txtIdCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(btnRecibo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(txtId_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel89)
                        .addGap(3, 3, 3)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservacionesPago))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel86)
                            .addComponent(jLabel88))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMes, 0, 224, Short.MAX_VALUE)
                            .addComponent(txtImporte)
                            .addComponent(txtNoRecibo))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel87))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxFormaPago, 0, 197, Short.MAX_VALUE)
                                    .addComponent(cbxMora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnRegistrarPago)))
                    .addComponent(jScrollPane5)))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel83)
                                    .addComponent(cbxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(txtNoRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(cbxMora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarPago)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel88)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservacionesPago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(txtId_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtIdCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRecibo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelMora, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        btnPagoAlumno.setText("Realizar Pago");

        jLabel75.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel75.setText("Grado:");

        txtGradoPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGradoPago.setDoubleBuffered(true);

        txtCodAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txtCodAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodAlumnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodAlumnoFocusLost(evt);
            }
        });

        txtNombreAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel111.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel111.setText("Código Alumno:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel69)
                            .addComponent(jLabel111))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                        .addComponent(txtCodAlumno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarAluPago)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPagoAlumno)
                                        .addGap(101, 101, 101))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                        .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel75)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGradoPago)
                                    .addComponent(txtFechaRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cicloIns1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cicloIns1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel111))
                    .addComponent(btnBuscarAluPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(txtFechaRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addComponent(btnPagoAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGradoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75))
                    .addComponent(jLabel69))
                .addGap(11, 11, 11)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAgregarPagoLayout = new javax.swing.GroupLayout(panelAgregarPago);
        panelAgregarPago.setLayout(panelAgregarPagoLayout);
        panelAgregarPagoLayout.setHorizontalGroup(
            panelAgregarPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarPagoLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelAgregarPagoLayout.setVerticalGroup(
            panelAgregarPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainCursos3.add(panelAgregarPago, "card3");

        panelVerPagos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago Alumno"));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago"));

        jtPagos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Concepto", "Importe", "Mora", "Forma de Pago", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jtPagos1);

        jLabel115.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel115.setText("Total Q");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setText("Observaciones:");

        txtObservacionesPago1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtObservacionesPago1.setForeground(new java.awt.Color(153, 153, 153));
        txtObservacionesPago1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesPago1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesPago1FocusLost(evt);
            }
        });

        txtIdRecibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRecibo1ActionPerformed(evt);
            }
        });

        txtTotal1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel95.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel95.setText("Código Alumno:");

        txtCodAlumno1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodAlumno1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodAlumno1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodAlumno1FocusLost(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel104.setText("Alumno:");

        txtNombreAlumno1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtFechaRecibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaRecibo1ActionPerformed(evt);
            }
        });

        txtGradoPago1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGradoPago1.setDoubleBuffered(true);

        jLabel116.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel116.setText("Fecha del pago:");

        jLabel117.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel117.setText("Grado:");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelMora1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel104)
                            .addComponent(jLabel117))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(txtGradoPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreAlumno1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addComponent(txtCodAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservacionesPago1))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(txtIdCodAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId_pago1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel115)
                        .addGap(10, 10, 10)
                        .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel95)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel116)
                            .addComponent(txtFechaRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGradoPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservacionesPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCodAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId_pago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMora1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        jLabel110.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel110.setText("No. Recibo:");

        txtNoRecibo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNoRecibo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Número de Recibo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        btnBuscarAluPago1.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAluPago1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8_search_filled_24px.png"))); // NOI18N

        btnRecibo1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnRecibo1.setText("Anular Recibo");
        btnRecibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnRecibo1))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNoRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarAluPago1))
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel110))
                    .addComponent(txtNoRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAluPago1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecibo1)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout panelVerPagosLayout = new javax.swing.GroupLayout(panelVerPagos);
        panelVerPagos.setLayout(panelVerPagosLayout);
        panelVerPagosLayout.setHorizontalGroup(
            panelVerPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerPagosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerPagosLayout.setVerticalGroup(
            panelVerPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        mainCursos3.add(panelVerPagos, "card2");

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        lbAgregarPago.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbAgregarPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgregarPago.setText("+ Ingresar Pago");
        lbAgregarPago.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbAgregarPago.setOpaque(true);
        lbAgregarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarPagoMouseClicked(evt);
            }
        });

        lbVerPago.setBackground(new java.awt.Color(204, 204, 204));
        lbVerPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbVerPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVerPago.setText("Ver detalle pago / Anular");
        lbVerPago.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        lbVerPago.setOpaque(true);
        lbVerPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVerPagoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(lbAgregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbVerPago, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelPagosLayout = new javax.swing.GroupLayout(panelPagos);
        panelPagos.setLayout(panelPagosLayout);
        panelPagosLayout.setHorizontalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainCursos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPagosLayout.setVerticalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainCursos3, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelPagos, "card2");

        javax.swing.GroupLayout MainpanelLayout = new javax.swing.GroupLayout(Mainpanel);
        Mainpanel.setLayout(MainpanelLayout);
        MainpanelLayout.setHorizontalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainpanelLayout.setVerticalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Colegio Liceo Mixto");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jpInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInscripcionMouseClicked
        // TODO add your handling code here:
        //panel 1 Inscripciones
        setLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
         resetLblColor(jpCerrar);
        resetLblColor(jpInicio);

        a = true;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;

        panelInscripcion.setVisible(true);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelAlumnos.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
        
        IndiceGrado cc = new IndiceGrado();
        DefaultComboBoxModel modeloGrado = new DefaultComboBoxModel(cc.mostrarGrado());
        cbxGradoIns.setModel(modeloGrado);
        
        
        IndiceNivel ccc = new IndiceNivel();
        DefaultComboBoxModel modeloNivel = new DefaultComboBoxModel(ccc.mostrarNivel());
        cbxNivel.setModel(modeloNivel);
        
        IndiceNivel ccx = new IndiceNivel();
        DefaultComboBoxModel modeloNiveles = new DefaultComboBoxModel(ccx.mostrarNivel());
        cbxNivelAlu.setModel(modeloNiveles);
        
       
        cbxGradoAlu.setSelectedIndex(0);
        cbxGradoAlu.setEnabled(false);
        
        IndiceBeca cd = new IndiceBeca();
        DefaultComboBoxModel modeloBeca = new DefaultComboBoxModel(cd.mostrarBeca());
        cbxBeca.setModel(modeloBeca);
        
        IndiceEstado ce = new IndiceEstado();
        DefaultComboBoxModel modeloEstado = new DefaultComboBoxModel(ce.mostrarEstado());
        cbxEstadoAlum.setModel(modeloEstado);
        
        btnInscribir.setEnabled(false);
        btnModificarIns.setEnabled(false);
        labelEstado.setVisible(false);
        cbxEstadoAlum.setVisible(false);
        
        JSpinner spinner = (JSpinner)yearGrado.getSpinner();
       ((javax.swing.JTextField)spinner.getEditor()).setEditable(false);
       
        JSpinner spinners = (JSpinner)cicloIns.getSpinner();
       ((javax.swing.JTextField)spinners.getEditor()).setEditable(false);
    }//GEN-LAST:event_jpInscripcionMouseClicked

    public void setPanelEnabled(JPanel panel, Boolean isEnabled) {
    panel.setEnabled(isEnabled);

    Component[] components = panel.getComponents();

    for(int i = 0; i < components.length; i++) {
        if(components[i].getClass().getName() == "javax.swing.JPanel") {
            setPanelEnabled((JPanel) components[i], isEnabled);
        }

        components[i].setEnabled(isEnabled);
    }
}
    private void jpPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPagosMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        setLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpCerrar);
        resetLblColor(jpInicio);

        a = false;
        b = true;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;

        panelInscripcion.setVisible(false);
        panelPagos.setVisible(true);
        panelInformes.setVisible(false);
        panelAlumnos.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
        
        IndiceMes ss = new IndiceMes();
        DefaultComboBoxModel modeloMes = new DefaultComboBoxModel(ss.mostrarMes());
        cbxMes.setModel(modeloMes);
        
        IndiceFormaPago we = new IndiceFormaPago();
        DefaultComboBoxModel modeloPago = new DefaultComboBoxModel(we.mostrarFormaPago());
        cbxFormaPago.setModel(modeloPago);
        cbxMora.setSelectedIndex(1);
        
        btnPagoAlumno.setEnabled(false);
        btnRecibo1.setEnabled(false);
        Date date = new Date();
        DateFormat fechaHora;
        fechaHora = new SimpleDateFormat("dd' de 'MMMM' de 'yyyy");
        txtFechaRecibo.setText(fechaHora.format(date));
         setPanelEnabled(jPanel22, false);
         
         JSpinner spinners = (JSpinner)cicloIns1.getSpinner();
       ((javax.swing.JTextField)spinners.getEditor()).setEditable(false);
    }//GEN-LAST:event_jpPagosMouseClicked

    private void jpInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        setLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpInicio);
        resetLblColor(jpCerrar);

        a = false;
        b = false;
        c = true;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;

        panelInscripcion.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(true);
        panelAlumnos.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
        
         JSpinner spinners = (JSpinner)cicloIns2.getSpinner();
       ((javax.swing.JTextField)spinners.getEditor()).setEditable(false);
       
       JSpinner spinnerss = (JSpinner)yearBuscar1.getSpinner();
       ((javax.swing.JTextField)spinnerss.getEditor()).setEditable(false);
        
    }//GEN-LAST:event_jpInformesMouseClicked

    private void jpAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlumnosMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        setLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpInicio);
         resetLblColor(jpCerrar);

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = true;
        g = false;
        h = false;
        i = false;

        panelInscripcion.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelAlumnos.setVisible(true);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
        
        IndiceGenero cf = new IndiceGenero();
        DefaultComboBoxModel modeloGenero = new DefaultComboBoxModel(cf.mostrarGenero());
        cbxGenero.setModel(modeloGenero);
        
        ((JTextField) this.fechaAlumno.getDateEditor()).setEditable(false); 
         btnModificarAlumno.setEnabled(false);
         btnRegistrarAlumno.setEnabled(true);
    }//GEN-LAST:event_jpAlumnosMouseClicked

    private void jpBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBackupMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        setLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpInicio);
        resetLblColor(jpCerrar);

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = true;
        h = false;
        i = false;

        panelInscripcion.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelAlumnos.setVisible(false);
        panelBackup.setVisible(true);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
     
    }//GEN-LAST:event_jpBackupMouseClicked

    private void jpInscripcionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInscripcionMouseDragged
        // TODO add your handling code here:
        setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpInscripcionMouseDragged

    private void jpInscripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInscripcionMouseEntered
        // TODO add your handling code here:
        jpInscripcion.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpInscripcionMouseEntered

    private void jpInscripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInscripcionMouseExited
        // TODO add your handling code here:
        if (a == true) {
            jpInscripcion.setBackground(new Color(60, 113, 158));
        } else {
            jpInscripcion.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpInscripcionMouseExited

    private void jpPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPagosMouseEntered
        // TODO add your handling code here:
        jpPagos.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpPagosMouseEntered

    private void jpPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPagosMouseExited
        // TODO add your handling code here:
        if (b == true) {
            jpPagos.setBackground(new Color(60, 113, 158));
        } else {
            jpPagos.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpPagosMouseExited

    private void jpInformesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseEntered
        // TODO add your handling code here:
        jpInformes.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpInformesMouseEntered

    private void jpInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseExited
        // TODO add your handling code here:
        if (c == true) {
            jpInformes.setBackground(new Color(60, 113, 158));
        } else {
            jpInformes.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpInformesMouseExited

    private void jpAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlumnosMouseEntered
        // TODO add your handling code here:
        jpAlumnos.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpAlumnosMouseEntered

    private void jpAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlumnosMouseExited
        // TODO add your handling code here:
        if (f == true) {
            jpAlumnos.setBackground(new Color(60, 113, 158));
        } else {
            jpAlumnos.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpAlumnosMouseExited

    private void jpBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBackupMouseEntered
        // TODO add your handling code here:
        jpBackup.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpBackupMouseEntered

    private void jpBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBackupMouseExited
        // TODO add your handling code here:
        if (g == true) {
            jpBackup.setBackground(new Color(60, 113, 158));
        } else {
            jpBackup.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpBackupMouseExited

    private void jpUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpInicio);
        setLblColor(jpUsuarios);
        resetLblColor(jpCerrar);

        a = false;
        b = false;
        c = false;
        d = false;
        e = true;
        f = false;
        g = false;
        h = false;
        i = false;
        
        panelInscripcion.setVisible(false);
        panelAlumnos.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(true);
        panelInicio.setVisible(false);
        
        IndiceUsuarios ce = new IndiceUsuarios();
        DefaultComboBoxModel modeloUsuario = new DefaultComboBoxModel(ce.mostrarUsuarios());
        cbxUsuario.setModel(modeloUsuario);
        
        IndiceGenero cf = new IndiceGenero();
        DefaultComboBoxModel modeloGenero = new DefaultComboBoxModel(cf.mostrarGenero());
        cbxGenero2.setModel(modeloGenero);
    }//GEN-LAST:event_jpUsuariosMouseClicked

    private void jpUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseEntered
        // TODO add your handling code here:
        jpUsuarios.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpUsuariosMouseEntered

    private void jpUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseExited
        // TODO add your handling code here:
        if (e == true) {
            jpUsuarios.setBackground(new Color(60, 113, 158));
        } else {
            jpUsuarios.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpUsuariosMouseExited

    private void jpCatedraticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCatedraticosMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        setLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpInicio);
        resetLblColor(jpCerrar);
        a = false;
        b = false;
        c = false;
        d = true;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;

        panelInscripcion.setVisible(false);
        panelAlumnos.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(true);
        panelUsuarios.setVisible(false);
        panelInicio.setVisible(false);
        
        IndiceGenero cf = new IndiceGenero();
        DefaultComboBoxModel modeloGenero = new DefaultComboBoxModel(cf.mostrarGenero());
        cbxGenero1.setModel(modeloGenero);
        
        IndiceEstado ce = new IndiceEstado();
        DefaultComboBoxModel modeloEstado = new DefaultComboBoxModel(ce.mostrarEstado());
        cbxEstadoAlum1.setModel(modeloEstado);
      //  jDateChooser1.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
       LocalTime time = LocalTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       //txtHoraAsis.setText(time.format(formatter));
       
        IndiceNivel ccx = new IndiceNivel();
        DefaultComboBoxModel modeloNiveles = new DefaultComboBoxModel(ccx.mostrarNivel());
        cbxNivelAlu1.setModel(modeloNiveles);
        
         ((JTextField) this.fechaAlumno1.getDateEditor()).setEditable(false); 
       
        cbxGradoAlu1.setSelectedIndex(0);
        cbxGradoAlu1.setEnabled(false);
        cbxEstadoAlum1.setVisible(false);
        labelEstado1.setVisible(false);
        btnModificarCat.setEnabled(false);
        btnAsignarGrado.setEnabled(false);
        
        JSpinner spinner = (JSpinner)yearAsignar.getSpinner();
        ((javax.swing.JTextField)spinner.getEditor()).setEditable(false);
        
         JSpinner spinners = (JSpinner)yearBuscar.getSpinner();
        ((javax.swing.JTextField)spinners.getEditor()).setEditable(false);
    }//GEN-LAST:event_jpCatedraticosMouseClicked

    private void jpCatedraticosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCatedraticosMouseEntered
        // TODO add your handling code here:
        jpCatedraticos.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpCatedraticosMouseEntered

    private void jpCatedraticosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCatedraticosMouseExited
        // TODO add your handling code here:
        if (d == true) {
            jpCatedraticos.setBackground(new Color(60, 113, 158));
        } else {
            jpCatedraticos.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpCatedraticosMouseExited

    private void lbAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarUsuarioMouseClicked
        // TODO add your handling code here:
        lbVerUsuario.setBackground(new Color(204, 204, 204));

        panelAgregarUsuario.setVisible(true);
        panelVerUsuarios.setVisible(false);
        lbAgregarUsuario.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbAgregarUsuarioMouseClicked

    private void lbVerUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerUsuarioMouseClicked
        // TODO add your handling code here:
        lbAgregarUsuario.setBackground(new Color(204, 204, 204));

        panelVerUsuarios.setVisible(true);
        panelAgregarUsuario.setVisible(false);
        lbVerUsuario.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbVerUsuarioMouseClicked

    private void jpInicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInicioMouseDragged
        // TODO add your handling code here:
        setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpInicioMouseDragged

    private void jpInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInicioMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos);
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        resetLblColor(jpCerrar);
        setLblColor(jpInicio);

        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = true;
        i = false;

        panelAlumnos.setVisible(false);
        panelPagos.setVisible(false);
        panelInformes.setVisible(false);
        panelBackup.setVisible(false);
        panelCatedraticos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelInscripcion.setVisible(false);
        panelInicio.setVisible(true);
    }//GEN-LAST:event_jpInicioMouseClicked

    private void jpInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInicioMouseEntered
        // TODO add your handling code here:
        jpInicio.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpInicioMouseEntered

    private void jpInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInicioMouseExited
        // TODO add your handling code here:
        if (h == true) {
            jpInicio.setBackground(new Color(60, 113, 158));
        } else {
            jpInicio.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpInicioMouseExited

    private void jpCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseClicked
        // TODO add your handling code here:
        resetLblColor(jpInscripcion);
        resetLblColor(jpPagos); 
        resetLblColor(jpInformes);
        resetLblColor(jpAlumnos);
        resetLblColor(jpBackup);
        resetLblColor(jpCatedraticos);
        resetLblColor(jpUsuarios);
        setLblColor(jpCerrar);
        resetLblColor(jpInicio);
        
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        i = true;
        
        
       int res= JOptionPane.showConfirmDialog(null, "¿Desea Salir del Programa?", "Confirmar salida", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
       if( res==JOptionPane.OK_OPTION){
            this.dispose();
            Login frmLogin = new Login();
            frmLogin.setVisible(true);
       }
    }//GEN-LAST:event_jpCerrarMouseClicked

    private void jpCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseEntered
        // TODO add your handling code here:
        jpCerrar.setBackground(new Color(115, 161, 199));
    }//GEN-LAST:event_jpCerrarMouseEntered

    private void jpCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseExited
        // TODO add your handling code here:
        if (i == true) {
            jpCerrar.setBackground(new Color(60, 113, 158));
        } else {
            jpCerrar.setBackground(new Color(70, 130, 180));
        }
    }//GEN-LAST:event_jpCerrarMouseExited

    private void lbGenerarBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGenerarBackupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbGenerarBackupMouseClicked

    private void btnRegistrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCatActionPerformed

    private void lbAgregarCatedraticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarCatedraticosMouseClicked
        // TODO add your handling code here:
        lbVerCatedraticos.setBackground(new Color(204, 204, 204));
        lbAsistencia.setBackground(new Color(204, 204, 204));
        lbAsignar.setBackground(new Color(204, 204, 204));

        panelAgregarCatedratico.setVisible(true);
        panelVerCatedratico.setVisible(false);
        panelAsistencia.setVisible(false);
        panelAsignarCurso.setVisible(false);
        lbAgregarCatedraticos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbAgregarCatedraticosMouseClicked

    private void lbVerCatedraticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerCatedraticosMouseClicked
        // TODO add your handling code here:
        lbAgregarCatedraticos.setBackground(new Color(204, 204, 204));
        lbAsistencia.setBackground(new Color(204, 204, 204));
        lbAsignar.setBackground(new Color(204, 204, 204));

        panelVerCatedratico.setVisible(true);
        panelAgregarCatedratico.setVisible(false);
        panelAsistencia.setVisible(false);
        panelAsignarCurso.setVisible(false);
        lbVerCatedraticos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbVerCatedraticosMouseClicked

    private void btnRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAlumnoActionPerformed

    private void lbAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarAlumnoMouseClicked
        lbVerAlumno.setBackground(new Color(204, 204, 204));

        panelAgregarAlumnos.setVisible(true);
        panelVerAlumnos.setVisible(false);
        lbAgregarAlumno.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbAgregarAlumnoMouseClicked

    private void lbVerAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerAlumnoMouseClicked
         lbAgregarAlumno.setBackground(new Color(204, 204, 204));

        panelVerAlumnos.setVisible(true);
        panelAgregarAlumnos.setVisible(false);
        lbVerAlumno.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbVerAlumnoMouseClicked

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void btnModificarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarCatActionPerformed

    private void txtId_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId_alumnoActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnModificarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarInsActionPerformed

    private void lbInscribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInscribirMouseClicked
        // TODO add your handling code here:
        lbVerInscritos.setBackground(new Color(204, 204, 204));
        lbVerGrado.setBackground(new Color(204, 204, 204));

        panelVerInscripcion.setVisible(false);
        panelVerGrados.setVisible(false);
        panelAgregarInscripcion.setVisible(true);
        lbInscribir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbInscribirMouseClicked

    private void lbVerInscritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerInscritosMouseClicked
        // TODO add your handling code here:
        lbInscribir.setBackground(new Color(204, 204, 204));
        lbVerGrado.setBackground(new Color(204, 204, 204));

        panelVerInscripcion.setVisible(true);
        panelAgregarInscripcion.setVisible(false);
        panelVerGrados.setVisible(false);
        lbVerInscritos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbVerInscritosMouseClicked

    private void btnRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarPagoActionPerformed

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboActionPerformed

    private void lbAgregarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarPagoMouseClicked
        // TODO add your handling code here:
        lbVerPago.setBackground(new Color(204, 204, 204));
        

        panelAgregarPago.setVisible(true);
        panelVerPagos.setVisible(false);
        lbAgregarPago.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_lbAgregarPagoMouseClicked

    private void lbVerPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerPagoMouseClicked
        // TODO add your handling code here:
        lbAgregarPago.setBackground(new Color(204, 204, 204));
        
        panelAgregarPago.setVisible(false);
        panelVerPagos.setVisible(true);
        lbVerPago.setBackground(new Color(255, 255, 255));
        

    }//GEN-LAST:event_lbVerPagoMouseClicked

    private void lbAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciaMouseClicked
        // TODO add your handling code here:
        LocalTime time = LocalTime.now();
        
        lbAgregarCatedraticos.setBackground(new Color(204, 204, 204));
        lbVerCatedraticos.setBackground(new Color(204, 204, 204));
        lbAsignar.setBackground(new Color(204, 204, 204));

        panelAsistencia.setVisible(true);
        panelAgregarCatedratico.setVisible(false);
        panelVerCatedratico.setVisible(false);
        panelAsignarCurso.setVisible(false);
        lbAsistencia.setBackground(new Color(255, 255, 255));
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("dd-MM-yyyy");
        txtFechaAsis.setText(fechaHora.format(date));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //txtHoraAsis.setText(time.format(formatter));
       // System.out.println(time.format(formatter));
   
    }//GEN-LAST:event_lbAsistenciaMouseClicked

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void lbVerGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVerGradoMouseClicked
        // TODO add your handling code here:
        lbInscribir.setBackground(new Color(204, 204, 204));
        lbVerInscritos.setBackground(new Color(204, 204, 204));

        panelVerInscripcion.setVisible(false);
        panelAgregarInscripcion.setVisible(false);
        panelVerGrados.setVisible(true);
        lbVerGrado.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbVerGradoMouseClicked

    private void cbxNivelAluItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNivelAluItemStateChanged
        // TODO add your handling code here:
        
        cbxGradoAlu.setEnabled(true);
        txtGradoId.setText("");
        IndiceNivel niv= (IndiceNivel) cbxNivelAlu.getSelectedItem();
        IndiceGrado cr = new IndiceGrado();
        DefaultComboBoxModel modeloGrados = new DefaultComboBoxModel(cr.mostrarGrados(niv.getId_nivel()));
        cbxGradoAlu.setModel(modeloGrados);
      
    }//GEN-LAST:event_cbxNivelAluItemStateChanged

    private void cbxGradoAluItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGradoAluItemStateChanged
        // TODO add your handling code here:
        IndiceGrado esst = (IndiceGrado) cbxGradoAlu.getSelectedItem();
        txtGradoId.setText(String.valueOf(esst.getId_grado()));
    }//GEN-LAST:event_cbxGradoAluItemStateChanged

    private void cbxGenero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGenero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGenero1ActionPerformed

    private void txtNombreAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumActionPerformed

    private void txtCodAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumActionPerformed

    private void txtCuotaMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuotaMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotaMenActionPerformed

    private void txtCuotaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuotaInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotaInsActionPerformed

    private void cbxEstadoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoAlumActionPerformed

    private void lbAsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsignarMouseClicked
        // TODO add your handling code here:
        lbVerCatedraticos.setBackground(new Color(204, 204, 204));
        lbAsistencia.setBackground(new Color(204, 204, 204));
        lbAgregarCatedraticos.setBackground(new Color(204, 204, 204));

        panelAsignarCurso.setVisible(true);
        panelVerCatedratico.setVisible(false);
        panelAsistencia.setVisible(false);
        panelAgregarCatedratico.setVisible(false);
        lbAsignar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbAsignarMouseClicked

    private void cbxNivelAlu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNivelAlu1ItemStateChanged
        // TODO add your handling code here:
        cbxGradoAlu1.setEnabled(true);
        txtGradoId1.setText("");
        IndiceNivel niv= (IndiceNivel) cbxNivelAlu1.getSelectedItem();
        IndiceGrado cr = new IndiceGrado();
        DefaultComboBoxModel modeloGrados = new DefaultComboBoxModel(cr.mostrarGrados(niv.getId_nivel()));
        cbxGradoAlu1.setModel(modeloGrados);
    }//GEN-LAST:event_cbxNivelAlu1ItemStateChanged

    private void cbxGradoAlu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGradoAlu1ItemStateChanged
        // TODO add your handling code here:
        IndiceGrado esst = (IndiceGrado) cbxGradoAlu1.getSelectedItem();
        txtGradoId1.setText(String.valueOf(esst.getId_grado()));
        btnAsignarGrado.setEnabled(true);
    }//GEN-LAST:event_cbxGradoAlu1ItemStateChanged

    private void btnCargarGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarGradoActionPerformed

    private void txtCodAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAluFocusGained
        // TODO add your handling code here:     
    }//GEN-LAST:event_txtCodAluFocusGained
    
    
    private void txtCodAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAluFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAluFocusLost

    private void txtPriNomAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriNomAluFocusGained
        // TODO add your handling code here:   
    }//GEN-LAST:event_txtPriNomAluFocusGained
    
    
    private void txtPriNomAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriNomAluFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriNomAluFocusLost

    private void txtSegNomAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSegNomAluFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegNomAluFocusGained
    
    
    private void txtSegNomAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSegNomAluFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegNomAluFocusLost

    private void txtTerNomAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTerNomAluFocusGained
        // TODO add your handling code here:   
    }//GEN-LAST:event_txtTerNomAluFocusGained

    
    private void txtTerNomAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTerNomAluFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerNomAluFocusLost

    private void txtPriApeAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriApeAluFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriApeAluFocusGained

    private void txtPriApeAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriApeAluFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriApeAluFocusLost

    private void txtSegApeAluFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSegApeAluFocusGained
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtSegApeAluFocusGained

    private void txtSegApeAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSegApeAluFocusLost
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtSegApeAluFocusLost

    private void txtNomEncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomEncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomEncFocusGained

    private void txtNomEncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomEncFocusLost
        // TODO add your handling code here:  
    }//GEN-LAST:event_txtNomEncFocusLost

    private void txtApeEncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApeEncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeEncFocusGained

    private void txtApeEncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApeEncFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeEncFocusLost

    private void txtParentezcoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParentezcoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParentezcoFocusGained

    private void txtParentezcoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParentezcoFocusLost
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtParentezcoFocusLost

    private void txtCodAlumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumFocusGained
        // TODO add your handling code here:      
    }//GEN-LAST:event_txtCodAlumFocusGained

    private void txtCodAlumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumFocusLost

    private void txtCuotaInsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuotaInsFocusGained
        // TODO add your handling code here:    
    }//GEN-LAST:event_txtCuotaInsFocusGained

    private void txtCuotaInsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuotaInsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotaInsFocusLost

    private void txtCuotaMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuotaMenFocusGained
        // TODO add your handling code here:     
    }//GEN-LAST:event_txtCuotaMenFocusGained

    private void txtCuotaMenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuotaMenFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotaMenFocusLost

    private void txtNomUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomUsuarioFocusGained

    private void txtNomUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomUsuarioFocusLost

    private void txtApeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApeUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeUsuarioFocusGained

    private void txtApeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApeUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeUsuarioFocusLost

    private void txtCorreoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioFocusGained
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtCorreoUsuarioFocusGained

    private void txtCorreoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtCodAlumnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumnoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumnoFocusGained

    private void txtCodAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumnoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumnoFocusLost

    private void txtImporteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImporteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteFocusGained

    private void txtImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImporteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteFocusLost

    private void txtObservacionesPagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesPagoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesPagoFocusGained

    private void txtObservacionesPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesPagoFocusLost
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtObservacionesPagoFocusLost

    private void btnCargarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarInformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarInformeActionPerformed

    private void lbPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPagoMouseClicked
        // TODO add your handling code here:
        lbDetalle.setBackground(new Color(204, 204, 204));
        lbDetalle1.setBackground(new Color(204, 204, 204));

        panelVerRecibos.setVisible(true);
        panelVerDetalles.setVisible(false);
        panelVerDetalles1.setVisible(false);
        lbPago.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbPagoMouseClicked

    private void lbDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDetalleMouseClicked
        // TODO add your handling code here:
        lbPago.setBackground(new Color(204, 204, 204));
        lbDetalle.setBackground(new Color(255, 255, 255));
        
        panelVerDetalles1.setVisible(false);
        panelVerRecibos.setVisible(false);
        panelVerDetalles.setVisible(true);
       
        
        lbDetalle1.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lbDetalleMouseClicked

    private void btnRecibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecibo1ActionPerformed

    private void txtObservacionesPago1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesPago1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesPago1FocusGained

    private void txtObservacionesPago1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesPago1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesPago1FocusLost

    private void txtCodAlumno1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumno1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumno1FocusGained

    private void txtCodAlumno1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodAlumno1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAlumno1FocusLost

    private void txtFechaRecibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaRecibo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaRecibo1ActionPerformed

    private void txtIdRecibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRecibo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRecibo1ActionPerformed

    private void lbDetalle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDetalle1MouseClicked
        // TODO add your handling code here:
        lbDetalle.setBackground(new Color(204, 204, 204));
        lbPago.setBackground(new Color(204, 204, 204));
        
        panelVerDetalles1.setVisible(true);
        panelVerRecibos.setVisible(false);
        panelVerDetalles.setVisible(false);
        lbDetalle1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbDetalle1MouseClicked

    private void jtPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPagosMouseClicked
        // TODO add your handling code here:
           
               DefaultTableModel modelos=  (DefaultTableModel)jtPagos.getModel();
               int selectedRowIndex = jtPagos.getSelectedRow();
               if (jtPagos.getSelectedRow() >= 0) {
               jTextField1.setText(modelos.getValueAt(selectedRowIndex,0).toString());
          } 
    }//GEN-LAST:event_jtPagosMouseClicked

    private void txtCuotaInsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotaInsKeyPressed

    }//GEN-LAST:event_txtCuotaInsKeyPressed

    private void cbxNivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNivelItemStateChanged
        // TODO add your handling code here:
        cbxGradoIns.setEnabled(true);
        txtGrad.setText("");
        IndiceNivel niv= (IndiceNivel) cbxNivel.getSelectedItem();
        IndiceGrado cr = new IndiceGrado();
        DefaultComboBoxModel modeloGrados = new DefaultComboBoxModel(cr.mostrarGrados(niv.getId_nivel()));
        cbxGradoIns.setModel(modeloGrados);
    }//GEN-LAST:event_cbxNivelItemStateChanged

    private void cbxGradoInsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGradoInsItemStateChanged
        // TODO add your handling code here:
        IndiceGrado esst = (IndiceGrado) cbxGradoIns.getSelectedItem();
        txtGrad.setText(String.valueOf(esst.getId_grado()));
    }//GEN-LAST:event_cbxGradoInsItemStateChanged

    private void cbxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNivelActionPerformed

    private void cbxEstadoAlum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoAlum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoAlum1ActionPerformed

   
    public void setLblColor(JPanel lbl) {

        lbl.setBackground(new Color(60, 113, 158));
    }

    public void resetLblColor(JPanel lbl) {

        lbl.setBackground(new Color(70, 130, 180));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mainpanel;
    public javax.swing.JButton btnAsignarGrado;
    public javax.swing.JButton btnAsistencia;
    public javax.swing.JButton btnBackup;
    public javax.swing.JButton btnBusAluIns;
    public javax.swing.JButton btnBuscarAlu;
    public javax.swing.JButton btnBuscarAluPago;
    public javax.swing.JButton btnBuscarAluPago1;
    public javax.swing.JButton btnBuscarCat;
    public javax.swing.JButton btnBuscarUsuario;
    public javax.swing.JButton btnCargarAlumnos;
    public javax.swing.JButton btnCargarAsignados;
    public javax.swing.JButton btnCargarCatedraticos;
    public javax.swing.JButton btnCargarCatedraticos1;
    public javax.swing.JButton btnCargarCatedraticosA;
    public javax.swing.JButton btnCargarDetalle;
    public javax.swing.JButton btnCargarDetalle1;
    public javax.swing.JButton btnCargarGrado;
    public javax.swing.JButton btnCargarInforme;
    public javax.swing.JButton btnCargarInscritos;
    public javax.swing.JButton btnCargarUsuarios;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnImprimirGrado;
    public javax.swing.JButton btnInscribir;
    public javax.swing.JButton btnModificarAlumno;
    public javax.swing.JButton btnModificarCat;
    public javax.swing.JButton btnModificarIns;
    public javax.swing.JButton btnModificarUsuario;
    public javax.swing.JButton btnPagoAlumno;
    public javax.swing.JButton btnRecibo;
    public javax.swing.JButton btnRecibo1;
    public javax.swing.JButton btnRegistrarAlumno;
    public javax.swing.JButton btnRegistrarCat;
    public javax.swing.JButton btnRegistrarPago;
    public javax.swing.JButton btnRegistrarUsuario;
    public javax.swing.JComboBox<String> cbxBeca;
    public javax.swing.JComboBox<String> cbxEstadoAlum;
    public javax.swing.JComboBox<String> cbxEstadoAlum1;
    public javax.swing.JComboBox<String> cbxFormaPago;
    public javax.swing.JComboBox<String> cbxGenero;
    public javax.swing.JComboBox<String> cbxGenero1;
    public javax.swing.JComboBox<String> cbxGenero2;
    public javax.swing.JComboBox<String> cbxGradoAlu;
    public javax.swing.JComboBox<String> cbxGradoAlu1;
    public javax.swing.JComboBox<String> cbxGradoIns;
    public javax.swing.JComboBox<String> cbxMes;
    public javax.swing.JComboBox<String> cbxMora;
    public javax.swing.JComboBox<String> cbxNivel;
    public javax.swing.JComboBox<String> cbxNivelAlu;
    public javax.swing.JComboBox<String> cbxNivelAlu1;
    public javax.swing.JComboBox<String> cbxUsuario;
    public com.toedter.calendar.JYearChooser cicloIns;
    public com.toedter.calendar.JYearChooser cicloIns1;
    public com.toedter.calendar.JYearChooser cicloIns2;
    public com.toedter.calendar.JDateChooser fechaAlumno;
    public com.toedter.calendar.JDateChooser fechaAlumno1;
    public javax.swing.JComboBox<String> jComboBox3;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    public javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAlumnos;
    private javax.swing.JPanel jpBackup;
    private javax.swing.JPanel jpCatedraticos;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JPanel jpInformes;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpInscripcion;
    private javax.swing.JPanel jpPagos;
    private javax.swing.JPanel jpUsuarios;
    public javax.swing.JTable jtAlumnos;
    public javax.swing.JTable jtAsignacion;
    public javax.swing.JTable jtAsistencia;
    public javax.swing.JTable jtCatedraticos;
    public javax.swing.JTable jtGrados;
    public javax.swing.JTable jtInscritos;
    public javax.swing.JTable jtPagoAlu;
    public javax.swing.JTable jtPagoAlu1;
    public javax.swing.JTable jtPagoAlu2;
    public javax.swing.JTable jtPagos;
    public javax.swing.JTable jtPagos1;
    public javax.swing.JTable jtUsuarios;
    private javax.swing.JLabel labelAsisten;
    public javax.swing.JLabel labelAsistencia;
    public javax.swing.JLabel labelEstado;
    public javax.swing.JLabel labelEstado1;
    private javax.swing.JLabel labelGrado;
    private javax.swing.JLabel labelGrado1;
    private javax.swing.JLabel labelGrado2;
    private javax.swing.JLabel labelGrado3;
    public javax.swing.JLabel labelGradoIns;
    public javax.swing.JLabel labelInscritos;
    public javax.swing.JLabel labelInscritos1;
    public javax.swing.JLabel labelMora;
    public javax.swing.JLabel labelMora1;
    public javax.swing.JLabel labelMostrarDocente;
    public javax.swing.JLabel labelMostrarGrado;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelNivel1;
    private javax.swing.JLabel lbAgregarAlumno;
    private javax.swing.JLabel lbAgregarCatedraticos;
    private javax.swing.JLabel lbAgregarPago;
    private javax.swing.JLabel lbAgregarUsuario;
    private javax.swing.JLabel lbAsignar;
    private javax.swing.JLabel lbAsistencia;
    private javax.swing.JLabel lbDetalle;
    private javax.swing.JLabel lbDetalle1;
    private javax.swing.JLabel lbGenerarBackup;
    private javax.swing.JLabel lbInscribir;
    private javax.swing.JLabel lbPago;
    private javax.swing.JLabel lbVerAlumno;
    private javax.swing.JLabel lbVerCatedraticos;
    public javax.swing.JLabel lbVerGrado;
    private javax.swing.JLabel lbVerInscritos;
    private javax.swing.JLabel lbVerPago;
    private javax.swing.JLabel lbVerUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JPanel mainAlumnos;
    private javax.swing.JPanel mainBackup;
    private javax.swing.JPanel mainCatedraticos;
    private javax.swing.JPanel mainCursos3;
    private javax.swing.JPanel mainInformes;
    private javax.swing.JPanel mainInscripcion;
    private javax.swing.JPanel mainUsuarios;
    private javax.swing.JPanel pAlumnos;
    private javax.swing.JPanel pBackup;
    private javax.swing.JPanel pCatedraticos;
    private javax.swing.JPanel pInformes;
    private javax.swing.JPanel pInscripciones;
    private javax.swing.JPanel pPagos;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JPanel panelAgregarAlumnos;
    private javax.swing.JPanel panelAgregarCatedratico;
    private javax.swing.JPanel panelAgregarInscripcion;
    private javax.swing.JPanel panelAgregarPago;
    private javax.swing.JPanel panelAgregarUsuario;
    public javax.swing.JPanel panelAlumnos;
    private javax.swing.JPanel panelAsignarCurso;
    private javax.swing.JPanel panelAsistencia;
    private javax.swing.JPanel panelBackup;
    private javax.swing.JPanel panelCatedraticos;
    private javax.swing.JPanel panelGenerarBackup;
    private javax.swing.JPanel panelInformes;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelInscripcion;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPagos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JPanel panelVerAlumnos;
    private javax.swing.JPanel panelVerCatedratico;
    private javax.swing.JPanel panelVerDetalles;
    private javax.swing.JPanel panelVerDetalles1;
    private javax.swing.JPanel panelVerGrados;
    private javax.swing.JPanel panelVerInscripcion;
    private javax.swing.JPanel panelVerPagos;
    private javax.swing.JPanel panelVerRecibos;
    private javax.swing.JPanel panelVerUsuarios;
    public javax.swing.JTextField txtApeEnc;
    public javax.swing.JTextField txtApeUsuario;
    public javax.swing.JTextField txtBusAlumno;
    public javax.swing.JTextField txtBusAlumno1;
    public javax.swing.JTextField txtBusCat;
    public javax.swing.JTextField txtBusCat1;
    public javax.swing.JTextField txtBusCat4;
    public javax.swing.JTextField txtBusInscrito;
    public javax.swing.JTextField txtBusUsuario;
    public javax.swing.JTextField txtCodAlu;
    public javax.swing.JTextField txtCodAlum;
    public javax.swing.JTextField txtCodAlumno;
    public javax.swing.JTextField txtCodAlumno1;
    public javax.swing.JTextField txtCodCat;
    public javax.swing.JPasswordField txtConfirmarPassword;
    public javax.swing.JTextField txtCorreoCat;
    public javax.swing.JTextField txtCorreoUsuario;
    public javax.swing.JTextField txtCuotaIns;
    public javax.swing.JTextField txtCuotaMen;
    public javax.swing.JTextField txtFechaAsis;
    public javax.swing.JTextField txtFechaRecibo;
    public javax.swing.JTextField txtFechaRecibo1;
    public javax.swing.JTextField txtGrad;
    public javax.swing.JTextField txtGradoId;
    public javax.swing.JTextField txtGradoId1;
    public javax.swing.JTextField txtGradoPago;
    public javax.swing.JTextField txtGradoPago1;
    public javax.swing.JTextField txtHoraAsis;
    public javax.swing.JTextField txtIdCat;
    public javax.swing.JTextField txtIdCodAlumno;
    public javax.swing.JTextField txtIdCodAlumno1;
    public javax.swing.JTextField txtIdRecibo;
    public javax.swing.JTextField txtIdRecibo1;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtIdUsuario;
    public javax.swing.JTextField txtId_Ins;
    public javax.swing.JTextField txtId_Ins1;
    public javax.swing.JTextField txtId_alumno;
    public javax.swing.JTextField txtId_cat;
    public javax.swing.JTextField txtId_cat1;
    public javax.swing.JTextField txtId_pago;
    public javax.swing.JTextField txtId_pago1;
    public javax.swing.JTextField txtImporte;
    public javax.swing.JTextField txtNoRecibo;
    public javax.swing.JTextField txtNoRecibo1;
    public javax.swing.JTextField txtNomEnc;
    public javax.swing.JTextField txtNomUsuario;
    private javax.swing.JLabel txtNombre;
    public javax.swing.JTextField txtNombreAlum;
    public javax.swing.JTextField txtNombreAlumno;
    public javax.swing.JTextField txtNombreAlumno1;
    public javax.swing.JTextField txtNombreCat;
    public javax.swing.JTextField txtNombreCat1;
    public javax.swing.JTextField txtNumCat;
    public javax.swing.JTextField txtNumEnc;
    public javax.swing.JTextField txtObserAsis;
    public javax.swing.JTextField txtObservacionesPago;
    public javax.swing.JTextField txtObservacionesPago1;
    public javax.swing.JTextField txtParentezco;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtPriApeAlu;
    public javax.swing.JTextField txtPriApeCat;
    public javax.swing.JTextField txtPriNomAlu;
    public javax.swing.JTextField txtPriNomCat;
    public javax.swing.JTextField txtSegApeAlu;
    public javax.swing.JTextField txtSegApeCat;
    public javax.swing.JTextField txtSegNomAlu;
    public javax.swing.JTextField txtSegNomCat;
    public javax.swing.JTextField txtTerNomAlu;
    public javax.swing.JTextField txtTerNomCat;
    public javax.swing.JTextField txtTotal;
    public javax.swing.JTextField txtTotal1;
    public javax.swing.JTextField txtUsuario;
    public com.toedter.calendar.JYearChooser yearAsignar;
    public com.toedter.calendar.JYearChooser yearBuscar;
    public com.toedter.calendar.JYearChooser yearBuscar1;
    public com.toedter.calendar.JYearChooser yearGrado;
    public com.toedter.calendar.JYearChooser yearGrado3;
    // End of variables declaration//GEN-END:variables
}
