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
import javax.inject.Inject;

/**
 *
 * @author sergio
 */
@Named(value = "nomina")
@RequestScoped
public class Nomina implements Serializable{
@Inject Formulario respuestaFormulario;
private float nomina;
private float costoDia=30000;
private float costoEstudio;
private float costoIdioma;
    /**
     * Creates a new instance of Nomina
     */
    public Nomina() {
    }
    /**
     * metodo que se ejecuta seguidamente del costructor y llama a los metodos calcularvaloridioma
     *y calcularvalorestuudio   para definir el valor de la nomina
     */
    @PostConstruct
    public void calcularNomina ()            
    {
       calcularValorIdioma ()  ;
       calcularValorEstudio () ;
       costoDia=costoDia+costoEstudio+costoIdioma;
       nomina=costoDia*respuestaFormulario.getDiasTrabajados();
      
    }
    /**
     * 
     *  metodo que calcula cuanto hay que pagar de nomina segun la cantidad de idiomas dominados
     */
    
    
    public void calcularValorIdioma ()            
    {
        if(respuestaFormulario.getIdioma().length>0)
        {
        costoIdioma=respuestaFormulario.getIdioma().length*10000;
        }
        else 
        {
            costoIdioma=0;
        }
    }
    /**
     * metodo que calcula cuanto hay que pagar de nomina segun el nivel de estudio
     * 
     */
    public void calcularValorEstudio ()            
    {
        if(respuestaFormulario.getNivelEstudio().equals("primaria"))
        {costoEstudio=0;}
        else if(respuestaFormulario.getNivelEstudio().equals("secundaria"))
        {costoEstudio=0;}
        else if(respuestaFormulario.getNivelEstudio().equals("tecnico"))
        {costoEstudio=5000;}
        else if(respuestaFormulario.getNivelEstudio().equals("tecnologo"))
        {costoEstudio=15000;}
        else if(respuestaFormulario.getNivelEstudio().equals("profecional"))
        {costoEstudio=30000;}
        else if(respuestaFormulario.getNivelEstudio().equals("magister"))
        {costoEstudio=40000;}
    }
/**
 * metodo para recuoerar un beans de tipo formulario
 * 
 * @return retorna un beans de tipo formulario
 */
    public Formulario getRespuestaFormulario() {
        return respuestaFormulario;
    }
/**
 * metodo para modificar un beans de tipo formulario
 * 
 * @param respuestaFormulario  beans de tipo formulario 
 */
    public void setRespuestaFormulario(Formulario respuestaFormulario) {
        this.respuestaFormulario = respuestaFormulario;
    }
/**
 * metodo para recuperar la nomina
 * 
 * @return  variable float nomina
 */
    public float getNomina() {
        return nomina;
    }
/**
 * 
 * metodo para modificar la nomina
 * @param nomina  variable float nomina
 */
    public void setNomina(float nomina) {
        this.nomina = nomina;
    }
    /**
     * 
     * metodo para concatenar  el arreglo de los idiomas en un String
     * @return retorna un String  de todos los idiomas
     */
     public String idiomas()
    { String idiomas="";
        for (int i=0;i<respuestaFormulario.getIdioma().length;i++)
        {
           idiomas=idiomas+" "+respuestaFormulario.getIdioma()[i]+"";
        }
        return idiomas;
    }
    
}
