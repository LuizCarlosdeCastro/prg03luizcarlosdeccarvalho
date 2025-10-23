/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Arkins
 */
public class PagamentoCartao implements PagamentoInterface{
    private double valor;
    private double taxa = 0.05;
    
    public PagamentoCartao(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
        //os override decidem o que vai estar escrito nos metodos da interface de pagamento, e o de recibo mostra o valor pago, e a taxa por pagar em cartao, e o valor total pós taxa

    @Override
    public double calcularTotal(){
        double totalTaxa = getValor() * getTaxa();
        double total = getValor() + totalTaxa;
        return total;
    }
    
    @Override
    public void imprimirRecibo(){
    
    
    String recibo = "Pagamento com cartao no valor de R$ = " + String.format("%.2f",getValor()) + "\n" + "Recebeu uma taxa no valor de R$ = " + String.format("%.2f", getValor() * getTaxa()) +"Total de R$ = " + String.format("%.2f", calcularTotal()) +  "\n";
    
    JOptionPane.showMessageDialog(null, recibo, "Recibo Cartao", JOptionPane.INFORMATION_MESSAGE);
    }
}

