package controlador;

import modelo.Usuario;


    

//Clase encargada del control de los proponente

public class Admin_Control {
    private static Admin_Control session;
    Usuario Admin;

    private Admin_Control() {
    }
    

    public static Admin_Control getinstancia()
    {
        if (session==null) {
            session=new Admin_Control();
        }
        return session;
    }
    
    
    
    public boolean verificacion(String user,String password){
        
        BD_Control c=BD_Control.getinstancia();
        Admin = c.buscarAdmin(user, password);
           return !(Admin == null);
    }
    
    public String getNombre(){
        return Admin.getUser();
    }


}
    

