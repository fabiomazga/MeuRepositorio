# include <stdio.h>
# include <stdlib.h>
# include <locale.h>

int main (){
    setlocale(LC_ALL,"");
    printf("\n###___Exerc�cio de fixa��o 2 - Compara��o lados de um tri�ngulo.___###\n");
    printf("\nEntre com 3 valores para os lados de um tri�ngulo.\n");
    int a,b,c;

    printf("\nEntre com o primeiro lado:");
    scanf("%d", &a);
    printf("\nEntre com o segundo lado:");
    scanf("%d", &b);
    printf("\nEntre com o terceiro lado:");
    scanf("%d", &c);
    if((a==b)&&(b==c)){
        printf("\nEsse tri�ngulo � equil�tero!\n");
    }else if ((a==b)&& (b!=c)){
        printf("\nEsse tri�ngulo � is�sceles!\n");
    }else if ((a!=b)&& (b==c)){
        printf("\nEsse tri�ngulo � is�sceles!\n");
    }else {
        printf("\nEsse tri�ngulo � escaleno!");
    }
return 0;
}
