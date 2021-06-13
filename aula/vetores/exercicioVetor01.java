package aula.vetores;

import java.util.Scanner;
public class exercicioVetor01
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] numeros = new int[10];
	    int pos,media,soma=0;
	    for (pos=0;pos<10;pos++){
	        System.out.printf("Digite o %d° numero: \n",pos+1);
	        numeros[pos] = ler.nextInt();
	    }
	    for (pos=9;pos>=0;pos--){
	        if(numeros[pos]%2==0){
	            System.out.printf("%d° numero par digitado: %d\n",pos+1,numeros[pos]);
	        }
	        
	    }
		
	}
}