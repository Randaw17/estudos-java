package exercicioMatriz;

import java.util.Scanner;
public class imprimindoMatriz
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int numero1[][] = new int [3][3];
	    int j,i;
		for(j=0;j<3;j++){
		    for(i=0;i<3;i++){
		        System.out.printf("Digite o numero da linha %d e  coluna %d,",j+1,i+1);
		        numero1[j][i] = ler.nextInt();
		    }
		}
		
		for(j=0;j<3;j++){
		    for(i=0;i<3;i++){
		        System.out.println(numero1[j][i]);
		    }
		}
	}
}