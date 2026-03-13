/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa {
    
    String RM;
    String curso;
    
    public Aluno (String nome, String cpf, String telefone, String dt_nascimento, String RM, String curso){
        super (nome, cpf, telefone, dt_nascimento);
       
        this.RM = RM;
        this.curso = curso;
    }
    
    @Override
    public void Info(){
        System.out.println("------- Cadastro de Aluno -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RM: " + this.RM);
        System.out.println("curso matriculado: " + this.curso);
    }
}
