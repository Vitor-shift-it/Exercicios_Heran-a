/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssitenteTeste;

/**
 *
 * @author Admin
 */
public class Tec extends Funcionario {
    public Tec ( int n_matricula, String nome){
      super (n_matricula, nome);
  
    }
 @Override
 public void infoDados(){
     System.out.println("----- Assistente Tecnico -----");
      System.out.println ("Numero de matricula do funcionario: " + this.n_matricula);
      System.out.println("Nome do funcionario: " + this.nome);
 }
}
