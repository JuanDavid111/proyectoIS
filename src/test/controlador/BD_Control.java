package controlador;
import java.lang.reflect.Array;
import java.util.ArrayList;
import modelo.Administrador;
import modelo.Dato;
import modelo.Proponente;
import modelo.Curso;
import java.io.Serializable;



//Esta clase se va a encargar de Controlar de las operaciones que están relacionadas con la gestión básica de la “base de dato” 
//en la lógica 

public class BD_Control implements Serializable {  
    
    private static BD_Control instancia;

    private Dato DB;
    //private ArrayList<administradore> Usuarios= new ArrayList<Object>();

    private final static String RUTA = "BD.txt";
                                                                    
    private BD_Control()
    {
        DB=new Dato();
        
    }
    public static BD_Control getinstancia()
    {
        if (instancia==null) {
            instancia=new BD_Control();
        }
        return instancia;
    }

    public void agregarP(Proponente P)
    {
        DB.agregarP(P);
        Control_Archivo.serializarObjeto(RUTA, DB);
    }
    public void agregarA(Administrador A)
    {
        DB.agregarA(A);
        Control_Archivo.serializarObjeto(RUTA, DB);
    }
    

    public void mostrarP()
    {
        DB.mostrar();
        
    }


    public Proponente buscarP(String user,String password){

        ArrayList<Proponente> Proponentes = DB.getProponentes();
        
        for(Proponente p : Proponentes){ 
        if(user.equals(p.getUser()) && password.equals(p.getPassword())){
            
        return p;
            
        }
            
        }
        
    return null;
    
 
    }
    
    public Curso buscarCurso(int busca,String user,String password){
        
    ArrayList<Proponente> Proponentes = DB.getProponentes();
    
    for(Proponente p : Proponentes){ 
        if(user.equals(p.getUser()) && password.equals(p.getPassword())){
            ArrayList<Curso> cc = p.getCursos();
            for(Curso c1 : cc){
    
                if(busca == c1.getIndice()){
                return c1;

                }
       
            }
        }
            
            
    }

    return null;
    }
    
    public Administrador buscarAdmin(String user,String password){

        ArrayList<Administrador> Administradores=DB.getAdministradores();
        
        for(Administrador admin : Administradores){ 
        if(user.equals(admin.getUser()) && password.equals(admin.getPassword())){
            
        return admin;
            
        }
            
        }
        
    return null;
    
 
    }
 
     public void guardarTxt()
    {  
        Control_Archivo.serializarObjeto(RUTA,DB);
    }

    public void cargarTxt()
    {
        Dato Datotm = new Dato();

        Datotm=Control_Archivo.deserializarObjeto(RUTA, Dato.class);  //esta funcion se encarga de sacar los datos del archivo y guardaros en la lista en la logica
        if (Datotm==null) 
        {
            System.out.println("vacio crear nueva carpeta");
        }
        else
        {
            DB=Datotm;
        }
    }

    public ArrayList<Proponente> getProponentes(){
        return DB.getProponentes();
    }

}
