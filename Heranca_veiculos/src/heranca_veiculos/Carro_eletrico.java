/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_veiculos;

/**
 *
 * @author Admin
 */
public class Carro_eletrico extends Carro {
    String capacidade_bateria;
    
    public Carro_eletrico (String modelo, String marca, int ano, String tipo_combustivel, String capacidade_bateria){
        super (modelo, marca, ano, tipo_combustivel);
        
        this.capacidade_bateria = capacidade_bateria;
    }
    
    @Override
        public void InfoV(){
            System.out.println("---------- Carro eletrico ---------");
    System.out.println ("Marca do veiculo: " + this.marca);
    System.out.println ("Modelo do veiculo: " + this.modelo);
    System.out.println("Ano de fabricacao: " + this.ano);
    System.out.println ("Tipo de combustivel: " + this.tipo_combustivel);
    System.out.println ("Capacidade da bateria: " + this.capacidade_bateria);
        }
}
