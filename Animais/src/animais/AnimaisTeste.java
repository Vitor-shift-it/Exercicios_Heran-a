/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animais;

/**
 *
 * @author Admin
 */
public class AnimaisTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.Caminhar();
        cachorro.Latir();
        
        gato.Caminhar();
        gato.Miar();
        
    }
    
}
