/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    String nome;
    String cpf;
    String dt_nascimento;

    public Pessoa ( String nome, String cpf, String dt_nascimento){
        
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
                
    }
    public void Info(){
        System.out.println("------- Cadastro de Pessoa -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
    }
}