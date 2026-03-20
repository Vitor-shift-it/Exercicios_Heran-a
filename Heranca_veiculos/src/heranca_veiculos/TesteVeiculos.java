/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca_veiculos;

/**
 *
 * @author Admin
 */
public class TesteVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Veiculos veiculo1 = new Veiculos("Lamborghine", "Venen01", 2009);
        veiculo1.Info();
        
        Carro car1 = new Carro("Camaro", "M144", 2014, "Gasolina");
        car1.Info();
        
        Carro_eletrico carEle1 = new Carro_eletrico ("BYD", "Tan", 2022, "Eletricidade", "108 kWh");
        carEle1.Info();
    }
    
}
