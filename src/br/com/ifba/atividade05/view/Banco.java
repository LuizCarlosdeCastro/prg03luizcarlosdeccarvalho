/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author Arkins
 */
public class Banco {

    public int num_conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //construtor da classe banco, com todas as variaveis exceto tipo que é criado em tempo de execução do método abrir conta
    public Banco(int num_conta,String dono, double saldo, boolean status) {
        this.num_conta = num_conta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    //transforma o status da conta em true, abrindo a conta, verifica qual o tipo da conta e dá o bonus de saldo pela criação da conta
    public void abrir_conta(String tipo){
    this.setTipo(tipo);

    if(tipo.contains("cc") || tipo.contains("cp")){
        System.out.println("Conta Validada");
        
        }else{
        System.out.println("Tipo de conta invalido");
        
            }
    
    this.setStatus(true);
    
     if(tipo.contains("cp")){         
     this.saldo = 150;
     
        }else{        
     this.saldo = 50;
     
        }
    }
    //fecha a conta e printa situações possiveis para impedir a conta de ser fechada caso caia nessas situações
    public void fechar_conta(){
    
    if(this.saldo > 0){
    System.out.println("Voce ainda possui saldo em conta");
        }
    if(this.saldo == 0){
    System.out.println("sua conta foi fechada");
        }
    if(this.saldo < 0){
    System.out.println("Voce possui dividas no banco, impossivel fechar conta");
        }
    
    }
    //deposita na conta e printa caso a conta nao esteja aberta
    public void depositar(double valor){

        if (!this.status){
            System.out.println("Conta não aberta, impossivel depositar");
            return;
        }

        this.saldo += valor;

    }
    
    //saca da conta e printa caso a conta nao esteja aberta ou voce nao tenha o valor na conta para sacar 
    public void sacar (double valor){


        if (!this.status){
            System.out.println("Conta não aberta, impossivel sacar");
            return;
        }

        if(valor > this.saldo){
            System.out.println("Valor indisponivel na conta!");
            return;
        } 


        this.saldo -= valor;
    }
    public void pagarMensal (){

        if (!this.status){
            System.out.println("Conta fechada, impossivel pagar mensalidade");
            return;
        }

        if(this.tipo.contains("cc")){
            this.saldo -= 12;
        }else{
            this.saldo -= 20;
        }

        if(this.saldo < 0){
            System.out.println("a sua conta esta negativada!");
        }



    }
    
    //getters e setters automaticos pela IDE
    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
    
    
    
    
}
