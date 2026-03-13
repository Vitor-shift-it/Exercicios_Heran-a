/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeveiculo;

/**
 *
 * @author Admin
 */
public class Veiculos {
    
    String marca;
    String modelo;
    int ano;
    
    public Veiculos (String marca, String modelo, int ano){
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void InfoV(){
    System.out.println("---------- Veiculo ---------");
    System.out.println ("Marca do veiculo: " + this.marca);
    System.out.println ("Modelo do veiculo: " + this.modelo);
    System.out.println("Ano de fabricacao: " + this.ano);
   }
}
