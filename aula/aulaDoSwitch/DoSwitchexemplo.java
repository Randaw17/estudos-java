package aula.aulaDoSwitch;

import java.util.Scanner;

public class DoSwitchexemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1,num2,resultado;
        int opcao,opcao2;

        do{
            System.out.println("1 - Calcular");
            System.out.println("2 - Sair");
            System.out.println("Digite uma opção desejada!");
            opcao = ler.nextInt();

            switch(opcao){
                case 1:
                    do {
                        System.out.println("11 - Soma");
                        System.out.println("12 - Subtração");
                        System.out.println("13 - voltar");
                        System.out.println("Digite uma opção valida!\n");
                        opcao2 = ler.nextInt();
                        if(opcao2 ==11 || opcao2 ==12){
                            System.out.println("Digite o 1° numero: ");
                            num1 = ler.nextInt();

                            System.out.println("Digite o 2° numero: ");
                            num2 = ler.nextInt();
                            if (opcao2 ==11){
                                resultado = num1+num2;
                                System.out.printf("\n%d + %d = %d\n", num1,num2,resultado);
                            }else{
                                resultado = num1-num2;
                                System.out.printf("\n%d - %d = %d\n", num1,num2,resultado);
                            }
                            break;
                        }else {
                             if(opcao2 == 13){
                                System.out.println("Opção invalida! \n");
                             }
                        }
                    }while(opcao2 != 13);
                
                case 2: 
                    System.out.println("Finalizando o programa ...");
                    break;
                
                default: System.out.println("Opção invalida!");
            }
        } while( opcao !=2);

    }
    
}