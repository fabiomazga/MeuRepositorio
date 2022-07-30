
package com.mycompany._pratico;

public class App {

    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco ();
       p1.setNumConta(111);
       p1.setPessoa("Fabio");
       //p1.estadoAtual();
       p1.abrirConta("CC");
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(222);
       p2.setPessoa("Pedro");
       //p2.estadoAtual();
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(1000);
       p1.sacar(150);
       p1.fecharConta();
       p1.estadoAtual();
       p2.estadoAtual();
              
       
    }
}
