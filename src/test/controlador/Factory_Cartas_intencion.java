package controlador;
import modelo.Carta;

public class Factory_Cartas_intencion extends Factory_Cartas {

    @Override
    public Carta Crear_Carta(String info) {
        return new Carta("Intencion",info);
    }
  
}
