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

// CLASE PARA LOS DATOS DE INSCRIPCIÓN DE LOS ALUMNOS
public class Inscripcion {
    private int id_inscripcion;
    private int id_alumno;
    private String codigo_alumno;
    private int id_grado;
    private String cuota_ins;
    private String cuota_mensual ;
    private String ciclo;
    private String fecha_inscripcion;
    private String nombre_alumno;
    private int id_beca;
    private int id_estado;

    // SETTERS & GETTERS DE INSCRIPCIÓN
    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

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

    public int getId_grado() {
        return id_grado;
    }

    public void setId_grado(int id_grado) {
        this.id_grado = id_grado;
    }

    public String getCuota_ins() {
        return cuota_ins;
    }

    public void setCuota_ins(String cuota_ins) {
        this.cuota_ins = cuota_ins;
    }

    public String getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(String cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    
  

    public String getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(String fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public int getId_beca() {
        return id_beca;
    }

    public void setId_beca(int id_beca) {
        this.id_beca = id_beca;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

  
    
            
}
