# include <stdio.h>
# include <stdlib.h>
# include <locale.h>

int main (){
setlocale(LC_ALL,"");
printf("\n###___Exercício de fixação 1 - media tres notas com aprovação.___###\n");
float a,b,c,m;
printf("\nEntre com a primeira nota:\n");
scanf("%f",&a);
printf("\nEntre com a segunda nota:\n");
scanf("%f",&b);
printf("\nEntre com a terceira nota:\n");
scanf("%f",&c);

m = (a+b+c)/3;

if(m > 7.0){
    printf("\nMedia %.2f => Aprovado!\n",m);
}else{
    printf("\nMedia %.2f => Reprovado!\n",m);
}
return 0;
}

