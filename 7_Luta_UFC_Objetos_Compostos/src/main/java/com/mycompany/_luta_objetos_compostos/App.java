package com.mycompany._luta_objetos_compostos;
public class App {

    public static void main(String[] args) {
         Lutador l[] = new Lutador[5];
         l[0] = new Lutador ("fabio","brasil", 39, 1.71f,80.0f,3,2,1);
         l[1] = new Lutador ("pedro","brasil", 8, 1.71f,20.0f,9,2,1);
         l[2] = new Lutador ("laura","brasil", 6, 1.71f,30.0f,8,1,1);
         l[3] = new Lutador ("fernanda","brasil", 33, 1.71f,50.0f,5,2,1);
         l[4] = new Lutador ("eliana","brasil", 60, 1.71f,40.0f,6,2,1);
         //l[5] = new Lutador ("mauro","brasil", 60, 1.71f,40.0f,6,2,1);
         l[0].status();
         l[1].status();
         l[2].status();
         l[3].status();
         l[4].status();
         //l[5].status();
         l[0].ganharLuta();
         l[0].status();
    }
}
