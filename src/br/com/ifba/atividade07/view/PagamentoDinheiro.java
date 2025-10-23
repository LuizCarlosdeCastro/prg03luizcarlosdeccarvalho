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
public class PagamentoDinheiro implements PagamentoInterface {
    private double valor;
    private double desconto = 0.10;
    
    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
    //os override decidem o que vai estar escrito nos metodos da interface de pagamento, e o de recibo mostra o valor pago, e o desconto por pagar em dinheiro, e o valor total pós desconto
    @Override
    public double calcularTotal(){
        double descontoTotal = getValor() * getDesconto();
        double total = getValor() - descontoTotal;
        return total;
    }
    
    @Override
    public void imprimirRecibo(){
    
    
    String recibo = "Pagamento com dinheiro no valor de R$ = " + String.format("%.2f",getValor()) + "\n" + "Recebeu desconto no valor de R$ = " + String.format("%.2f", getValor() * getDesconto()) +"Total de R$ = " + String.format("%.2f", calcularTotal()) +  "\n";
    
    JOptionPane.showMessageDialog(null, recibo, "Recibo Dinheiro", JOptionPane.INFORMATION_MESSAGE);
    }
}
