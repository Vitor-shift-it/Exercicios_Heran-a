/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagamento_produtos;

/**
 *
 * @author Admin
 */
public class ProdutoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Produto p1 = new Produto ("Notebook", 5760);
      
      Desconto d1 = new Desconto ();
      
      double precoFinal = d1.aplicarDesconto(p1.getPreco(), 10);
      
        System.out.println("Produto: " + p1.getNome());
        
        System.out.println ("Preço com desconto: R$ " + precoFinal);
    }
    
}
