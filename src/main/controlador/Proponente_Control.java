package controlador;

import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
import modelo.Carta;



//Clase encargada del control del proponente asi como lo que el puede hacer

public class Proponente_Control {
    private static Proponente_Control PC;
    Proponente P1;

    private Proponente_Control()
    {}

    public static Proponente_Control getinstancia() // se uso el patrol de diseño singleton
    {
        if (PC==null) {
            PC=new Proponente_Control();
        }
        return PC;
    }
    
    public boolean verificacion(String user,String password){
        
        BD_Control c=BD_Control.getinstancia();
        
        P1 = c.buscarP(user, password);
           return P1 != null;
    }


    public void Proponer_Curso(Formulario F)
    {
        Curso c=new Curso();
        c.setFormulario(F);
        P1.agregarCurso(c);
        BD_Control session=BD_Control.getinstancia();
        session.guardarTxt();
    }

    public void Ver_Curso()
    {
    ArrayList<Curso> Cursos;
    Cursos=P1.getCursos();

    for(Curso c:Cursos)
    {
        String D=c.getFormulario().getDenominacion();
        System.out.println(D);

    }
        

    }
    public Proponente getProponente(){
        return P1;
    }
    
    public void setProponente(Proponente P1){
    
        this.P1 = P1;
        
    }

    public void Subir_Carta(Carta carta)
    {
        P1.agregar(carta);

    }

    public void setP1(Proponente p1) {
        P1 = p1;
    }


    public void mostrar_Cartas()
    {
        Carta C1=P1.getCartas().get(0);
    }


}
