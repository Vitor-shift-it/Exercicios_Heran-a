/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Vitor", "482.289.378-22", "14/05/2008");
        p1.Info();
        
        Aluno a1 = new Aluno("Guilherme", "444.555.777-22",  "31/01/2000", "55666", "Arquitetura");
         a1.Info();
         
        Professor prof1 = new Professor( "Juremo", "333.444.555-32", "04/06/1990", "782289", "Física");
         prof1.Info();
         
        Funcionario func1 = new Funcionario ("Alice", "288.445.334-56", "03/07/2000", "230", "Diretora Geral");
         func1.Info();
    } 
}
    

