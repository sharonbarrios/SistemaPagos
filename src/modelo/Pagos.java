/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sharon
 */

// CLASE PARA LOS DATOS DEL RECIBO DE LOS PAGOS DE LOS ALUMNOS
public class Pagos {
    private int id_alumno;
    private int cod_alu;
    private String codigo_alumno;
    private String nombre_alumno;
    private int id_detalle_recibo;
    private int id_recibo;
    private String no_recibo;
    private int id_concepto_pago;
    private double mora;
    private int id_mes_pago;
    private double subtotal;
    private String fecha_recibo;
    private double total;
    private int id_user;
    private int id_forma_pago;
    private int id_mora;
    private double importe;
    private String concepto;
    private String observaciones;
    private String grado;
    private String estado_recibo;
    private String ciclo;
    
    
    // SETTERS & GETTERS DE PAGOS

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(String codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public int getId_detalle_recibo() {
        return id_detalle_recibo;
    }

    public void setId_detalle_recibo(int id_detalle_recibo) {
        this.id_detalle_recibo = id_detalle_recibo;
    }

    public int getId_recibo() {
        return id_recibo;
    }

    public void setId_recibo(int id_recibo) {
        this.id_recibo = id_recibo;
    }

    public int getId_concepto_pago() {
        return id_concepto_pago;
    }

    public void setId_concepto_pago(int id_concepto_pago) {
        this.id_concepto_pago = id_concepto_pago;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public int getId_mes_pago() {
        return id_mes_pago;
    }

    public void setId_mes_pago(int id_mes_pago) {
        this.id_mes_pago = id_mes_pago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getFecha_recibo() {
        return fecha_recibo;
    }

    public void setFecha_recibo(String fecha_recibo) {
        this.fecha_recibo = fecha_recibo;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_forma_pago() {
        return id_forma_pago;
    }

    public void setId_forma_pago(int id_forma_pago) {
        this.id_forma_pago = id_forma_pago;
    }       

    public int getId_mora() {
        return id_mora;
    }

    public void setId_mora(int id_mora) {
        this.id_mora = id_mora;
    }

    public String getNo_recibo() {
        return no_recibo;
    }

    public void setNo_recibo(String no_recibo) {
        this.no_recibo = no_recibo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getCod_alu() {
        return cod_alu;
    }

    public void setCod_alu(int cod_alu) {
        this.cod_alu = cod_alu;
    }

    public String getEstado_recibo() {
        return estado_recibo;
    }

    public void setEstado_recibo(String estado_recibo) {
        this.estado_recibo = estado_recibo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    } 
    
}
