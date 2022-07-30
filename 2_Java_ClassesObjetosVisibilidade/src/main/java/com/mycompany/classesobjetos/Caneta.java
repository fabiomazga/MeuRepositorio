
package com.mycompany.classesobjetos;


public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    private int carga;
    private boolean tampada;
    
    public void status (){
        System.out.println("marca " + this.modelo);
        System.out.println("Uma caneta "  +  this.cor);
        System.out.println("tipo de ponta " + this.ponta);
        System.out.println("estado " + this.carga);
        System.out.println("está tampada? "  +  this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não é possível rabiscar com a caneta tamapada");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    public void tampar (){      // mesma tampar sendo privada o metodo publico permite que ela seja alterada por alguem dentro da mesma classe
        this.tampada = true;        
    }
    protected void destampar (){ 
        this.tampada = false;    
    }
    
}