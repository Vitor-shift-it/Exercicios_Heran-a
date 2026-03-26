/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imovel_;

/**
 *
 * @author Admin
 */
public class ImovelVelho extends Imovel{
    
    public ImovelVelho (double preco){
        super (preco);
        
    }
    
    public void valorFinal(){
        System.out.println("Imovel velho: Valor de R$ " + (preco - 15000));
    }
}
