package exercicioMatriz;

//import java.util.Scanner;
import java.util.Random;
public class exercicioMatriz02
{
	public static void main(String[] args) {
	    //Scanner ler = new Scanner(System.in);
	    Random gerar = new Random();
	    int matriz[][] = new int [4][4];
	    int vetor[] = new int [4];
	    int i,j;
	    
	    System.out.printf("Matriz com numeros Reais:\n");
	    for(i=0;i<4;i++){
	        for(j=0;j<4;j++){
	            matriz[i][j] = gerar.nextInt(100);
	            if(i==0&&j==0){
	                vetor[j] = matriz[i][j];
	            }
	            if(matriz[i][j] > vetor[j]){
	                vetor[j] = matriz[i][j];
	            }
	            System.out.printf("%d ", matriz[i][j]);
	        }
	        System.out.printf("\n");
	    }
	    
	    System.out.printf("\nMaiores valores de cada linha:\n");
	    for(j=0;j<4;j++){
	        System.out.printf("%d ",vetor[j]);
	    }
	    
	}
}