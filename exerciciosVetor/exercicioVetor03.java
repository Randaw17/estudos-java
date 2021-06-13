package exerciciosVetor;

import java.util.Scanner;
public class exercicioVetor03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] numeros = new int[10];
	    int numero;
	    int i;
	    

	    for(i=0;i<10;i++){
	        System.out.printf("Digite o %d° numero: ",i+1);
	        numeros[i] = ler.nextInt();
	    }
	    System.out.printf("Digite um numero: ");
	    numero = ler.nextInt();
	    for(i=0;i<10;i++){
	        
	        if(numero == numeros[i]){
	            System.out.printf("%d° numero.\n",i+1);
	        }else{
				System.out.printf("Não existe este número entre os informados.\n");
				break;
			}
	    }
	}
}
