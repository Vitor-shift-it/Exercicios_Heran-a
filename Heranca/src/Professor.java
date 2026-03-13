/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa {
    
    String RF;
    String disciplina;
    
    public Professor (String nome, String cpf, String telefone, String dt_nascimento, String RF, String disciplina){
        super (nome, cpf, telefone, dt_nascimento);
        
        this.RF = RF;
        this.disciplina = disciplina;
    }
     @Override
    public void Info(){
        System.out.println("------- Cadastro de Professor -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RF: " + this.RF);
        System.out.println("Disciplina: " + this.disciplina);
}
}