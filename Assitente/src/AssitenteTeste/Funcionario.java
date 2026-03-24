/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssitenteTeste;

/**
 *
 * @author Admin
 */
public class Funcionario {
    
    int n_matricula;
    String nome;
    
    public Funcionario (int n_matricula, String nome){
        this.n_matricula = n_matricula;
        this.nome = nome;
    }
    
    public void infoDados(){
    System.out.println("----- Funcionario -----");
    System.out.println ("Numero de matricula do funcionario: " + this.n_matricula);
    System.out.println("Nome do funcionario" + this.nome);
            
    }
    
}
