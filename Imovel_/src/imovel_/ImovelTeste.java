/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imovel_;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ImovelTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite o preco do imovel: " );
       double preco = sc.nextDouble();
       
       System.out.println("Tipo: 1 = Novo | 2 = Velho");
       int tipo = sc.nextInt();
       
       if (tipo == 1){
           
          ImovelNovo IN1 = new ImovelNovo(preco);
          IN1.valorFinal();
          
       
       } else {
           
           ImovelVelho IV1 = new ImovelVelho(preco);
           IV1.valorFinal();
       }
               
    }
    
}
