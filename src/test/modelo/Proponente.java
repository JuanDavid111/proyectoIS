package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

//clase que representa al proponente y su informacion para su uso
//

public class Proponente extends Usuario
{
    
    private String CI;
    private String RIF;
    private String ISLR;
    private String CV;
    private String Titulo_Universitario;
    private String Registro_Mercantil= null;    //revisar
    private ArrayList<Curso> Cursos = new ArrayList<Curso>();
    private ArrayList<Carta> Cartas = new ArrayList<Carta>();
    boolean aliado=false;


    public Proponente(String User,String Password,String CI,String RIF,String ISLR,String CV,String Título_Universitario,String Registro_Mercantil)
    {
        super(User, Password);

        this.CI=CI;
        this.RIF=RIF;
        this.ISLR=ISLR;
        this.CV=CV;
        this.Titulo_Universitario=Título_Universitario;
        this.Registro_Mercantil=Registro_Mercantil;

    }

    public void agregarCurso(Curso c)
    {
        Cursos.add(c);
        
    }
    
    public ArrayList<Curso> getCursos() {
        return Cursos;
    }
    
    @Override
    public void mostrar() {
        
        System.out.println(getUser()+" "+RIF+" "+ISLR);
    }

    public String getNombre(){
        return getUser();
    }
    
    public String getCedula(){
        return CI;
    }
    public String getTitulo(){
        return Titulo_Universitario;
    }

    public ArrayList<Carta> getCartas() {
        return Cartas;
    }
    public void agregar(Carta carta)
    { 
        Cartas.add(carta);
    }
    
    public void setAliado(boolean b){
        aliado = b;
    };
    public boolean getAliado(){
        return aliado;
    };
    
}
