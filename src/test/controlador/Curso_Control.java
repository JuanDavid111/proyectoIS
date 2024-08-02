/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
/**
 *
 * @author emili
 */
public class Curso_Control {
    
    private static Curso_Control CC;
    Curso C1;
    
    private Curso_Control()
    {}

    public static Curso_Control getinstancia() // se uso el patrol de diseño singleton
    {
        if (CC==null) {
            CC=new Curso_Control();
        }
        return CC;
    }
    
    public Curso getCurso(){
        return C1;
    }
    
    public void setCurso(Curso c) {
        C1=c;
    };
    
    public void CursoSelect(int busqueda,String user,String password){
        
    BD_Control c=BD_Control.getinstancia();
    C1 = c.buscarCurso(busqueda,user,password);

    }
    
}
