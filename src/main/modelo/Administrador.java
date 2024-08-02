package modelo;

public class Administrador extends Usuario
{
    private String Departamento ="trabsajo";
    
    public Administrador(String User,String Password,String Departamento)
    {
        super(User, Password);
        this.Departamento=Departamento;
        
    }


    @Override
    public void mostrar() {
        System.out.println(Departamento);
        
    }


}
