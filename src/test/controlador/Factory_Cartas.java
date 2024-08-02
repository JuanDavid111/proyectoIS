package controlador;
import modelo.Carta;



//SE USO EL PATRON DE DISEÑO FACTORY Method
//Para la creacion de las cartas 

public abstract class Factory_Cartas {
    public abstract Carta Crear_Carta(String info);

    public void Subir_Carta(String info){
       Proponente_Control P1= Proponente_Control.getinstancia();
       Carta carta=Crear_Carta(info);
       P1.Subir_Carta(carta);
   }    
}





    

