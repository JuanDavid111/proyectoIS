package modelo;
import java.io.Serializable;

public class Formulario implements Serializable{
    String Denominacion;
    String Objetivos;
    String Fundamentacion;
    String Perfiles_I_E;
    String Perfil_Docente;
    String Estructura_Curricular;
    String Estrategias_Evaluacion;
    String Exigencias_y_Servicios;
    String Duracion;
    String Estructura_Costo;
    String Cronograma_De_Ejecucion;

    public Formulario(String Denominacion,String Objetivos,String Fundamentacion,String Perfiles_I_E,String Perfil_Docente,String Estructura_Curricular,String Estrategias_Evaluacion,String Exigencias_y_Servicios,String Duracion,String Estructura_Costo,String Cronograma_De_Ejecucion)
    {
         this.Denominacion=Denominacion;
         this.Objetivos=Objetivos;
         this.Fundamentacion=Fundamentacion;
         this.Perfiles_I_E=Perfiles_I_E;
         this.Perfil_Docente=Perfil_Docente;
         this.Estructura_Curricular=Estructura_Curricular;
         this.Estrategias_Evaluacion=Estrategias_Evaluacion;
         this.Exigencias_y_Servicios=Exigencias_y_Servicios;
         this.Duracion=Duracion;
         this.Estructura_Costo=Estructura_Costo;
         this.Cronograma_De_Ejecucion=Cronograma_De_Ejecucion;
        

    }

    public void setDenominacion(String denominacion) {
        Denominacion = denominacion;
    }
    public void setObjetivos(String objetivos) {
        Objetivos = objetivos;
    }
    public void setFundamentacion(String fundamentacion) {
        Fundamentacion = fundamentacion;
    }
    public void setPerfiles_I_E(String perfiles_I_E) {
        Perfiles_I_E = perfiles_I_E;
    }
    public void setPerfil_Docente(String perfil_Docente) {
        Perfil_Docente = perfil_Docente;
    }
    public void setEstructura_Curricular(String estructura_Curricular) {
        Estructura_Curricular = estructura_Curricular;
    }
    public void setEstrategias_Evaluacion(String estrategias_Evaluacion) {
        Estrategias_Evaluacion = estrategias_Evaluacion;
    }
    public void setExigencias_y_Servicios(String exigencias_y_Servicios) {
        Exigencias_y_Servicios = exigencias_y_Servicios;
    }
    public void setDuracion(String duracion) {
        Duracion = duracion;
    }
    public void setEstructura_Costo(String estructura_Costo) {
        Estructura_Costo = estructura_Costo;
    }
    public void setCronograma_De_Ejecucion(String cronograma_De_Ejecucion) {
        Cronograma_De_Ejecucion = cronograma_De_Ejecucion;
    }

    public String getDenominacion() {
        return Denominacion;
    }
    public String getDuracion(){
        return Duracion;
    }
    
    public String getEstructura_Costo() {
        return Estructura_Costo;
    }
    public String getCronograma_De_Ejecucion() {
        return Cronograma_De_Ejecucion;
    }
    public String getObjetivos() {
        return Objetivos;
    }
    public String getFundamentacion() {
        return Fundamentacion;
    }
    public String getPerfiles_I_E() {
        return Perfiles_I_E;
    }
    public String getPerfil_Docente() {
        return Perfil_Docente;
    }
    public String getEstructura_Curricular() {
        return Estructura_Curricular;
    }
    public String getEstrategias_Evaluacion() {
        return Estrategias_Evaluacion;
    }
    public String getExigencias_y_Servicios() {
        return Exigencias_y_Servicios;
    }

}
