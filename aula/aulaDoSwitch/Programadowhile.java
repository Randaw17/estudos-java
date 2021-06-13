package aula.aulaDoSwitch;

import java.util.Scanner;
public class Programadowhile {
    public static void main (String[]args){
        Scanner ler =  new Scanner(System.in);
        double altura,menorAltura;
        int opcao,opcao2,opcao3,contador,idade,maiorIdade;

            do{
                System.out.println("1 - Entevistar");
                System.out.println("2 - Finalizando o Programa....");
                System.out.println("Digite um valor Valido!\n");
                opcao = ler.nextInt();

                switch(opcao){
                    case 1:
                        for(contador = 1; contador>=0; contador++){
                            System.out.printf("Digite a Altura do %d° entrevistado: ");
                            altura = ler.nextDouble();

                            System.out.printf("Digite a Idade do %d° entrevistado: ");
                            idade = ler.nextInt();

                            do{
                                System.out.println("Deseja inserir outros valores?");
                                System.out.println("1 - Sim");
                                System.out.println("2 - Não");
                                System.out.println("Digite um valor Valido!\n");
                                opcao2 = ler.nextInt();

                                switch(opcao2){
                                    case 1: 

                                }
                            
                            }while(opcao2 != 3);                            
                        }
                    break;

                    case 2:
                        System.out.println("Finalizando o programa");
                }

            }while(opcao != 3);
    }
    
}
