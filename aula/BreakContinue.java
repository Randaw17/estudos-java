package aula;

import java.util.Scanner;
public class BreakContinue
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		float numero=0,soma=0;
		int cont=1;
		while(cont<=10){
		    System.out.printf("Digite o %d° numero: ",cont);
		    numero = ler.nextFloat();
		    
		    if(numero <0){
		        System.out.println("Numero invalido!");
		        cont--;
				/*
				Break: interrompe a repetição finalizando-a.
				Continue: interrompe somente a ultima chamada feita na repetição
				 */
		        break;
				//continue;
		    }
		        soma = soma+numero;
		        cont++;
		}
		System.out.printf("Foram %d numeros lidos.\nSoma todal: %.2f",cont,soma);
		
	}
}
