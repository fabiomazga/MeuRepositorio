# include <stdio.h>
# include <stdlib.h>
# include <locale.h>

int main (){

setlocale(LC_ALL, "");
printf("###___Exercício do valor absoluto da diferença entre dois numeros.___###\n");
int a, b, d;
printf("Entre com o primeiro valor:\n");
scanf("%d", &a);
printf("Entre com o segundo valor:\n");
scanf("%d", &b);
d = a - b;
printf("A o valor absoluto da diferença entre %d e %d é %d", a,b,abs(d));
return 0;


system ("pause");
}
