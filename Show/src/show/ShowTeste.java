/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package show;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ShowTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor base do ingresso: ");
        double valor = sc.nextDouble();
        
        System.out.println("Tipo de ingresso: 1-normal | 2-VIP ");
        
        int tipo = sc.nextInt();
        
        if (tipo == 1){
            
            Ingresso i = new Ingresso(valor);
            
            i.tipoIngresso();
        } else {
            
            VIP v = new VIP (valor);
            v.tipoIngresso();
        }
        
        
    }
    
}
