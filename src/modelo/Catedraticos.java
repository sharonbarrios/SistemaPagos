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

//CLASE PARA DATOS DE CATEDRÁTICOS
public class Catedraticos {
    private int id_catedratico;
    private String cod_catedratico;
    private int id_genero;
    private String primerNombre_cat;
    private String segundoNombre_cat;
    private String tercerNombre_cat;
    private String primerApellido_cat;
    private String segundoApellido_cat;
    private String numero_catedratico;
    private String correo_catedratico;
    private String nombre_catedratico;
    private String fecha_asistencia;
    private String hora_entrada;
    private String hora_salida;
    private String observacion_asistencia;
    private int anio;
    private int id_grado;
    private int id_estado;
    private String fecha;
    
    
    //SETTERS & GETTERS DE LA CLASE CATEDRATICOS
    public String getCod_catedratico() {
        return cod_catedratico;
    }

    public void setCod_catedratico(String cod_catedratico) {
        this.cod_catedratico = cod_catedratico;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getPrimerNombre_cat() {
        return primerNombre_cat;
    }

    public void setPrimerNombre_cat(String primerNombre_cat) {
        this.primerNombre_cat = primerNombre_cat;
    }

    public String getSegundoNombre_cat() {
        return segundoNombre_cat;
    }

    public void setSegundoNombre_cat(String segundoNombre_cat) {
        this.segundoNombre_cat = segundoNombre_cat;
    }

    public String getTercerNombre_cat() {
        return tercerNombre_cat;
    }

    public void setTercerNombre_cat(String tercerNombre_cat) {
        this.tercerNombre_cat = tercerNombre_cat;
    }

    public String getPrimerApellido_cat() {
        return primerApellido_cat;
    }

    public void setPrimerApellido_cat(String primerApellido_cat) {
        this.primerApellido_cat = primerApellido_cat;
    }

    public String getSegundoApellido_cat() {
        return segundoApellido_cat;
    }

    public void setSegundoApellido_cat(String segundoApellido_cat) {
        this.segundoApellido_cat = segundoApellido_cat;
    }

    public String getNumero_catedratico() {
        return numero_catedratico;
    }

    public void setNumero_catedratico(String numero_catedratico) {
        this.numero_catedratico = numero_catedratico;
    }

    public String getCorreo_catedratico() {
        return correo_catedratico;
    }

    public void setCorreo_catedratico(String correo_catedratico) {
        this.correo_catedratico = correo_catedratico;
    }

    public int getId_catedratico() {
        return id_catedratico;
    }

    public void setId_catedratico(int id_catedratico) {
        this.id_catedratico = id_catedratico;
    }

    public String getNombre_catedratico() {
        return nombre_catedratico;
    }

    public void setNombre_catedratico(String nombre_catedratico) {
        this.nombre_catedratico = nombre_catedratico;
    }

    public String getFecha_asistencia() {
        return fecha_asistencia;
    }

    public void setFecha_asistencia(String fecha_asistencia) {
        this.fecha_asistencia = fecha_asistencia;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getObservacion_asistencia() {
        return observacion_asistencia;
    }

    public void setObservacion_asistencia(String observacion_asistencia) {
        this.observacion_asistencia = observacion_asistencia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public int getId_grado() {
        return id_grado;
    }

    public void setId_grado(int id_grado) {
        this.id_grado = id_grado;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    } 

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
