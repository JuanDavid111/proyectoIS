package modelo;

import java.io.Serializable;

public class Carta implements Serializable{
    String Tipo;
    String Info;
    private int indice;


    public Carta(String tipo, String info)
    {
        this.Tipo=tipo;
        this.Info=info;
    }
    
    public String getInfo() {
        return Info;
    }

    public String getTipo() {
        return Tipo;
    }
    public int getIndice(){
        return indice;
    }
    public void setIndice(int i){
        indice = i;
    }
    

}
