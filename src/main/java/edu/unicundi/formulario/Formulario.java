/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.formulario;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author sergio
 */
@Named(value = "formulario")
@SessionScoped
public class Formulario implements Serializable{
   

    private int cedula = 0;
    private String nombre = "";
    private String apellido = "";
    private String fecha = "";
    private String nivelEstudio = "";
    private String[] idioma;
    private int diasTrabajados = 0;

    /**
     * Creates a new instance of Formulario
     */
    public Formulario() {
        System.out.println("esta en el costructor");
    }

    /**
     *metodo para imprimir datos una cadena de String
     *
     */
    @PostConstruct
    public void cargar() {
        System.out.println("datos cargados");
    }

    /**
     * Creates a new instance of Formulario
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * metodo para modificar la cedula
     *
     * @param cedula dato a guardar
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * metodo para recuperar el nombre
     *
     * @return variable String nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * metodo para recuperar el apellido
     *
     * @return variable String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * metodo para modificar el apellido
     *
     * @param apellido dato a guardar
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * metodo para recuperar fecha de nacimiento
     *
     * @return variable String fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * metodo para modificar fecha
     *
     * @param fecha dato a guardar
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * metodo para recuperar el nivel de estudio
     *
     * @return variable String estudio
     */
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    /**
     * metodo para modificar
     *
     * @param nivelEstudio dato a guardar
     */
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    /**
     * metodo para recuperar el idioma
     *
     * @return variable String idioma
     */
    public String[] getIdioma() {
        return idioma;
    }

    /**
     * metodo para modificar el idioma
     *
     * @param idioma dato a guardar
     */
    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    /**
     * metodo para recuperar los dias trabajados
     *
     * @return variable int dias trabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * metodo para modificar los dias trabajados
     *
     * @param diasTrabajados dato a guardar
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

}
