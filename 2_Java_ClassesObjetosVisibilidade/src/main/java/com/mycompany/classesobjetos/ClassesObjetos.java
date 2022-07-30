
package com.mycompany.classesobjetos;


public class ClassesObjetos {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.carga = 0;  retirar o acesso privado
        //c1.tampada = true; // a alteração em tampar não é possivel pois ela é privada
        c1.tampar();       // mas a ateração pelo método tampar pode pois o metodo tampar é publico e está na mesma classe de tampar
        
        c1.status();
        //c1.rabiscar(); // retirar o acesso privado
        
        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        
       
    }
}
