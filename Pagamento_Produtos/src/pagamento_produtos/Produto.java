/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento_produtos;

/**
 *
 * @author Admin
 */
public class Produto {
    
    private String nome;
    private double preco;
    
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        
    }
    
    public double getPreco(){
        return preco;
    }
    
    public String getNome(){
      return nome;  
        
    }
    
}
