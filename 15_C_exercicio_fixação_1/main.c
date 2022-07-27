#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL,"");
    float a,b,m;
    printf("###___Exercício da média entre dois valores.___###\n");
    printf("Entre com o primeiro valor:\n");
    scanf("%f", &a);
    printf("Entre com o segundo valor:\n");
    scanf("%f", &b);
    m=((a+b)/2);
    printf("A média entre %f e %f é: %.2f\n",a,b,m);
system("pause");
}
