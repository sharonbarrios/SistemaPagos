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

// CLASE PARA OBTENER DATOS DE LOS ALUMNOS
public class Alumnos {
    private int id_alumno;
    private String codigo_alumno;
    private int id_genero;
    private String primer_nombre;
    private String segundo_nombre;
    private String tercer_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String fecha_nac;
    private String nombre_encargado;
    private String apellido_encargado;
    private String numero_encargado;
    private String parentezco_encargado;
    
    
    //SETTERS & GETTERS DE LA CLASE ALUMNOS

    public String getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(String codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getTercer_nombre() {
        return tercer_nombre;
    }

    public void setTercer_nombre(String tercer_nombre) {
        this.tercer_nombre = tercer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre_encargado() {
        return nombre_encargado;
    }

    public void setNombre_encargado(String nombre_encargado) {
        this.nombre_encargado = nombre_encargado;
    }

    public String getApellido_encargado() {
        return apellido_encargado;
    }

    public void setApellido_encargado(String apellido_encargado) {
        this.apellido_encargado = apellido_encargado;
    }

    public String getNumero_encargado() {
        return numero_encargado;
    }

    public void setNumero_encargado(String numero_encargado) {
        this.numero_encargado = numero_encargado;
    }

    public String getParentezco_encargado() {
        return parentezco_encargado;
    }

    public void setParentezco_encargado(String parentezco_encargado) {
        this.parentezco_encargado = parentezco_encargado;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    
    
}
