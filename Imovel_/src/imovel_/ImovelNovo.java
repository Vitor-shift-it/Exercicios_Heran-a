/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imovel_;

/**
 *
 * @author Admin
 */
public class ImovelNovo extends Imovel {

            public ImovelNovo (double preco){
                super(preco);
            }
            
            public void valorFinal(){
                System.out.println("Imovel novo: valor de R$ " + (preco + 20000));
            }
}
