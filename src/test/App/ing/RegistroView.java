package App.ing;
import controlador.BD_Control;
import vista.UI_Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author emili
 */
public class RegistroView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BD_Control c=BD_Control.getinstancia();
        c.cargarTxt();
        UI_Login inicial = new UI_Login();
        inicial.setVisible(true);
        // TODO code application logic here
    }
    
}
