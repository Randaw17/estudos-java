package PraticasAula.exercicioMatriz;

import java.util.Scanner;
public class exercicioMatriz03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int matriz[][] = new int [4][4];
	    int numero,i,j,cont=0;
	    
	    System.out.printf("Matriz com numeros Reais:\n");
	    for(i=0;i<4;i++){
	        for(j=0;j<4;j++){
	            matriz[i][j] = cont+1;
	            cont++;
	            System.out.printf("%d ", matriz[i][j]);
	        }
	        System.out.printf("\n");
	    }
	    
	    System.out.printf("\nDigite o numero da linha (de 1-4): ");
	    numero = ler.nextInt();
	    
	    if(numero<4){
    	    System.out.printf("\nNumeros da linha indicada:\n");
    	        for(j=0;j<4;j++){
    	            System.out.printf("%d ", matriz[numero-1][j]);
    	        }
	    }else{
	        System.out.printf("\nNumero digitado maior que o numeros de linhas da Matriz.");
	    }
	    
	}
}
