#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int gera_aleatorio(){                             //fun��o gera aleatorio at� 10
           int aleatorio;
           srand((unsigned)time(NULL));
           aleatorio = rand()%9;



}


int main(){
            int a = gera_aleatorio();
            //a=gera_aleatorio();
           //srand((unsigned)time(NULL));
          // int aleatorio = rand()%9;
           //printf("\n %d \n", aleatorio);
           //return 0;
           //system("pause");

printf("\n%d\n", a);
return 0;
}
