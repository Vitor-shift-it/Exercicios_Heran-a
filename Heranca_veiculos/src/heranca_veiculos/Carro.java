/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_veiculos;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculos{
       
  String tipo_combustivel;
  
  public Carro (String marca, String modelo, int ano, String tipo_combustivel){
      super (marca, modelo, ano);
      this.tipo_combustivel = tipo_combustivel;
      
  }
  
  @Override
  
            public void Info(){
                System.out.println("---------- Carro ---------");
    System.out.println ("Marca do veiculo: " + this.marca);
    System.out.println ("Modelo do veiculo: " + this.modelo);
    System.out.println("Ano de fabricacao: " + this.ano);
     System.out.println ("Tipo de combustivel: " + this.tipo_combustivel);
            }
}
