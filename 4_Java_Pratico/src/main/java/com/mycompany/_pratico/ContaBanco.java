
package com.mycompany._pratico;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String pessoa;
    private float saldo;
    private boolean status;
    
    //Metodos Personalizados
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta() );
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Pessoa: " + this.getPessoa());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
        
        System.out.println("--------------------");
        
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t== "CC") {
            this.setSaldo(50);
            
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois existe saldo.");
    } else if(this.getSaldo() < 0) {
            System.out.println("conta não pode ser fechada, pois consta débito.");   
} else {
    this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
    }
}
    public void depositar(float v){
        if (this.getStatus()){
        //this.saldo = this.saldo + v; // mexe com o atributo direto
        this.setSaldo(this.getSaldo()+v); // melhor mexer pelo método
            System.out.println("Deposito realizado na conta de " + this.getPessoa());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada."); 
        }
        
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo()>= v){
            this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getPessoa());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
        
    }
    public void pagarMensal(){
        int v=0;
        if (this.getTipo() == "CC") {
            v =12;
            
        } else if (this.getTipo() == "CP"){
            v=20;
        }
     if(this.getStatus()){
     this.setSaldo(this.getSaldo()-v);
         System.out.println("Mensalidade paga com sucesso "+ this.getPessoa());
     } else {
         System.out.println("Impossivel pagar uma conta fechada.");
     }
    }   
    
    //Metodos Especiais
    public void ContaBanco(){
     this.saldo = 0;
     this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
}
