/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa {
    String RGM;
    String funcao;
    
    public Funcionario (String nome, String cpf, String telefone, String dt_nascimento, String RGM, String funcao){
        super (nome, cpf, telefone, dt_nascimento);
        
        this.RGM= RGM;
        this.funcao = funcao;
    }
     @Override
    public void Info (){
        System.out.println("------- Cadastro de Funcionario -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RGM: " + this.RGM);
        System.out.println("Função: " + this.funcao);
}
}
