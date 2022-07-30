

package com.mycompany._getset;

public class App {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("fabercastel","vermelha",0.7f); // passando os parametros pelo construtor
        Caneta c2 = new Caneta ("kilometrica","preta", 1.0f);       
//c1.setModelo("bic"); //metodo acessor
        //c1.modelo = "BIC";   // diretamente o atributo
        //c1.setPonta(0.5f);
        //c1.ponta = 0.7f;  // da erro porque tem acesso privado
        c1.status();
        c2.status();
        //System.out.println("Tenho uma caneta "+ c1.getModelo()+ " de ponta "+ c1.getPonta());
    }
}
