package modelo;
import java.io.Serializable;


public class Curso implements Serializable{
    private boolean estado=false;
    private Formulario formulario;
    private int indice;


    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Formulario getFormulario() {
        return formulario;
    }
    
    public boolean getEstado() {
        return estado;
    }
    public void setIndice(int indice){
    this.indice = indice;
    }
    
    public int getIndice(){
    return indice;
    }

}


