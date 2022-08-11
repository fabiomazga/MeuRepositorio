# include <stdio.h>
# include <stdlib.h>
# include <locale.h>

int main (){
    setlocale(LC_ALL,"");
    printf("\n###___Exercício de fixação 2 - Comparação lados de um triângulo.___###\n");
    printf("\nEntre com 3 valores para os lados de um triângulo.\n");
    int a,b,c;

    printf("\nEntre com o primeiro lado:");
    scanf("%d", &a);
    printf("\nEntre com o segundo lado:");
    scanf("%d", &b);
    printf("\nEntre com o terceiro lado:");
    scanf("%d", &c);
    if((a==b)&&(b==c)){
        printf("\nEsse triângulo é equilátero!\n");
    }else if ((a==b)&& (b!=c)){
        printf("\nEsse triângulo é isósceles!\n");
    }else if ((a!=b)&& (b==c)){
        printf("\nEsse triângulo é isósceles!\n");
    }else {
        printf("\nEsse triângulo é escaleno!");
    }
return 0;
}
