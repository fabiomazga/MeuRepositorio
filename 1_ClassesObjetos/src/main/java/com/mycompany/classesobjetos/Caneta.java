
package com.mycompany.classesobjetos;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("marca " + this.modelo);
        System.out.println(" Uma caneta "  +  this.cor);
        System.out.println("tipo de ponta " + this.ponta);
        System.out.println("estado " + this.carga);
        System.out.println(" está tampada? "  +  this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não é possível rabiscar com a caneta tamapada");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    void tampar (){
        this.tampada = true;        
    }
    void destampar (){ 
        this.tampada = false;    
    }
    
}