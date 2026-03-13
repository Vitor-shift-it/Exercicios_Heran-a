/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeveiculo;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculos {
    
    String tpCombustivel;
    
    public Carro (String marca, String modelo, int ano, String tpCombustivel);
    super (marca, modelo, ano);
    
    this.tpCombustivel = tpCombustivel;
}
