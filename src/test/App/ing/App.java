package App.ing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controlador.Admin_Control;
import controlador.BD_Control;
import controlador.Control_Archivo;
import controlador.Llenar_Formulario;
import controlador.Proponente_Control;
import controlador.Registrarse;
import modelo.Administrador;
import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
import modelo.Usuario;











public class App {
    public static void main(String[] args) {

        Proponente p1 =new Proponente("juan", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p2 =new Proponente("luis", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p3 =new Proponente("manuel", "123", "2615", "link", "link2", "link", "link3", "link4");

        

        
        Curso c1 = new Curso();
        
        

        BD_Control DB = BD_Control.getinstancia();
        ArrayList<Proponente> Proponentes= DB.getProponentes();
        Formulario F;
        
        Llenar_Formulario form = new Llenar_Formulario();
        for(Proponente p: Proponentes){
 
            F=new Formulario("Matematicas", null, null, null, null, null, null, null, null, null, null);
            form.Guardar_Curso(c1,F,p);    
            DB.guardarTxt();
        }DB.cargarTxt();
        

        Proponente_Control p=Proponente_Control.getinstancia();
        Admin_Control A=Admin_Control.getinstancia();

    
    }

}
