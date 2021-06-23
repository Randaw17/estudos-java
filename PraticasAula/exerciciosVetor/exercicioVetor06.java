package PraticasAula.exerciciosVetor;

import java.util.Scanner;
public class exercicioVetor06
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] numeros = new int[6];
	    int[] numero = new int[6];
	    int i,j,contador=0;
	    

	    for(i=0;i<6;i++){
	        System.out.printf("Digite o %d° numero da Mega Sena: ",i+1);
	        numeros[i] = ler.nextInt();
	    }
	    
	    for(j=0;j<6;j++){
	        System.out.printf("Digite %d° numero do jogo: ",j+1);
	        numero[j] = ler.nextInt();
	            for(i=0;i<6;i++){
    	               if(numero[j]==numeros[i]){
    	               contador++;
	               }
	            }
	            
	    }
	    System.out.printf("%d pontos feitos.\n",contador);
	}
}