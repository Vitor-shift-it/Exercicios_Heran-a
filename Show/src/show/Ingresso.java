/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package show;

/**
 *
 * @author Admin
 */
public class Ingresso {
    protected double valor;
    
    public Ingresso (double valor){
        this.valor = valor;
    }
    
    public void tipoIngresso(){
        System.out.println("Ingresso normal, valor de: R$" + valor);
    }
}
