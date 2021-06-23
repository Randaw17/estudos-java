package PraticasAula.aula.aulaDoSwitch;

import java.util.Scanner;
public class Doteste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1,num2,resultado;
        int opcao;
        
        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Sair");
            System.out.println("Digite uma opção desejada!");
            opcao = ler.nextInt();

            if(opcao ==1){
                System.out.println("Digite o 1° numero: ");
                num1 = ler.nextInt();

                System.out.println("Digite o 2° numero: ");
                num2 = ler.nextInt();

                resultado = num1 +num2;
                System.out.printf("\n%d + %d = %d\n", num1,num2,resultado);
            }

            if(opcao !=1 && opcao != 2){
                System.out.println("Digite um valor valido");
            }
        } while(opcao!= 2);
        

        
    }
        
    
}