package PraticasAula.exercicioMatriz;

import java.util.Scanner;
public class exercicioMatriz01
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int matriz[][] = new int [3][3];
	    int numero,i,j,cont=0;
	    
	    System.out.printf("Matriz com numeros Reais:\n");
	    for(i=0;i<3;i++){
	        for(j=0;j<3;j++){
	            matriz[i][j] = cont+1;
	            cont++;
	            System.out.printf("%d ", matriz[i][j]);
	        }
	        System.out.printf("\n");
	    }
	    
	    System.out.printf("Digite um numero para multiplicar a matriz: ");
	    numero = ler.nextInt();
	    
	    System.out.printf("\nMatriz multiplicada:\n");
	    for(i=0;i<3;i++){
	        for(j=0;j<3;j++){
	            matriz[i][j] = matriz[i][j]*numero;
	            System.out.printf("%d ", matriz[i][j]);
	        }
	        System.out.printf("\n");
	    }
	    
	}
}