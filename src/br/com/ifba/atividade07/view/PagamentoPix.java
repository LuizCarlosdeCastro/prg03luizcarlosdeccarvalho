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
public class PagamentoPix implements PagamentoInterface {
    
    private double valor;
    private double pix = 0.02;
    
    public PagamentoPix(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPix() {
        return pix;
    }

    public void setPix(double pix) {
        this.pix = pix;
    }
    
    
        //os override decidem o que vai estar escrito nos metodos da interface de pagamento, e o de recibo mostra o valor pago, e o cashback por pagar em pix

    @Override
    public double calcularTotal(){
        return this.valor;
    }
    
    @Override
    public void imprimirRecibo(){
    double cashBack = getValor() *getPix();
    
    String recibo = "Pagamento pix no valor de R$ = " + String.format("%.2f",getValor()) + "\n" + "Recebeu cashback de 2% no valor de R$ = " + String.format("%.2f", cashBack) + "\n";
    
    JOptionPane.showMessageDialog(null, recibo, "Recibo Pix", JOptionPane.INFORMATION_MESSAGE);
    }
}
