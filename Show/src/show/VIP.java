/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package show;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class VIP extends Ingresso {
    
    public VIP (double valor){
            super(valor);
    }
        public void tipoIngresso(){
            Scanner sc = new Scanner (System.in);
            System.out.println("Escolha o tipo de VIP: ");
             System.out.println("1- Camarote Superior ");
              System.out.println("2- Camarote Inferior ");
              
              int opcao = sc.nextInt();
              
              if (opcao == 1){
                  
                   System.out.println("Camarote Superior - Valor de R$ " + (valor + 50));
                   
              
            
        } else {
                   System.out.println("Camarote Inferior - Valor de R$ " + (valor + 30));
              }
        }
        
    
}
