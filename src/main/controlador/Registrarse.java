package controlador;

import modelo.Administrador;
import modelo.Proponente;
import modelo.Usuario;


//esta clase se encarga de registrar a los Usuarios en la Base de Datos que esta en la logica   

public class Registrarse {
    static BD_Control C=BD_Control.getinstancia(); // llama a la instancia de Control de la Base de Datos

    public static void Registrar(String User,String Password,String CI,String RIF,String ISLR,String CV,String Título_Universitario,String Registro_Mercantil)  //El metodo se encarga envial el Usuario 
    {
        Proponente p=new Proponente(User, Password, CI, RIF, ISLR, CV, Título_Universitario, Registro_Mercantil);
        C.agregarP(p);                                  // llama al metodo de agregar para Guardar en la BD de la logica
        C.guardarTxt();
    }
    public static void Registrar(String User, String Password, String Departamento){
        Administrador a=new Administrador(User, Password, Departamento);

        C.agregarA(a);
        C.guardarTxt();


    }

}
