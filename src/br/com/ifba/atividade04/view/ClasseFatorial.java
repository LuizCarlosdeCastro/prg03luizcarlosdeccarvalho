/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade04.view;

/**
 *
 * @author Arkins
 */
public class ClasseFatorial {
    
    int fatorial;
    String formula;
    
    public void setValor(int n){
    
    this.fatorial = n;
    }
    
    public int getFatorial(){
    int resultado = 1;
    StringBuilder copiaFormula = new StringBuilder();
    
    for(int i = fatorial; i > 1; i --){
    resultado *= i;
    copiaFormula.append(i).append(" x ");
    }
    resultado = resultado * 1;
    copiaFormula.append("1 = ").append(resultado);
    formula = copiaFormula.toString();
    return resultado;
    }
    
    public String getFormula(){
    return formula;
    }
}
