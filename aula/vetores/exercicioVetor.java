package aula.vetores;

import java.util.Scanner;
public class exercicioVetor
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] numeros = new int[10];
	    int pos,media,soma=0;
	    for (pos=0;pos<5;pos++){
	        System.out.printf("Digite o %d° numero: \n",pos+1);
	        numeros[pos] = ler.nextInt();
	        soma = soma+numeros[pos];
	    }
	    
	    media = soma/pos;
	    System.out.printf("Média: %d\n",media);
	    
	    for (pos=0;pos<5;pos++){
	        if(numeros[pos] > media){
	            System.out.printf("%d° numero digitado: %d\n",pos+1,numeros[pos]);
	        }
	        
	    }
		
	}
}