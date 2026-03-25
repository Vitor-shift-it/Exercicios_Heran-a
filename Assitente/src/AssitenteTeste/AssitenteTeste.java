/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AssitenteTeste;

/**
 *
 * @author Admin
 */
public class AssitenteTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Funcionario F1 = new Funcionario (13448, "Joelma");
        F1.infoDados();
        
        Adm A1 = new Adm (56784, "Giovana");
        A1.infoDados();
        
        Tec T1 = new Tec (46383, "Alisson");
        T1.infoDados();
    }
    
}
