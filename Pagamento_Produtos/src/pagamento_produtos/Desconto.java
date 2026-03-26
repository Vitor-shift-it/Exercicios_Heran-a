/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento_produtos;

/**
 *
 * @author Admin
 */
public class Desconto {
    
    public double aplicarDesconto (double preco, double percentual){
        return preco - (preco * percentual / 100);
        
    }
    
}
