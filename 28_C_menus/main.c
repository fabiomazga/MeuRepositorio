#include <stdio.h>
#include <stdlib.h>

int main(){
            int opcao=0;



            while( opcao<1 || opcao>3){


                printf("\n 1- opcao 1.");
                printf("\n 2- opcao 2.");
                printf("\n 3- opcao 3.\n");


                scanf ("%d", &opcao);

                switch(opcao){
                case 1:
                    printf("Escolheu a opcao 1.");
                    break;
                case 2:
                    printf("Escolheu a opcao 2.");
                    break;
                case 3:
                    printf("Escolheu a opcao 3.");
                    break;

                default:
                    printf("Escolheu uma opcao invalida, tente mais uma vez.");
                    break;

                }


            }
            return 0;


}
