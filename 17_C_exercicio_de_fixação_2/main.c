# include <stdio.h>
# include <stdlib.h>
# include <locale.h>

int main (){

setlocale(LC_ALL, "");
printf("###___Exerc�cio do valor absoluto da diferen�a entre dois numeros.___###\n");
int a, b, d;
printf("Entre com o primeiro valor:\n");
scanf("%d", &a);
printf("Entre com o segundo valor:\n");
scanf("%d", &b);
d = a - b;
printf("A o valor absoluto da diferen�a entre %d e %d � %d", a,b,abs(d));
return 0;


system ("pause");
}
