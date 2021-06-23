package PraticasAula.exerciciosVetor;
import java.util.Scanner;
public class exercicioVetor04 {
    public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double[] vetor1= new double[10];
	    double[] vetor2= new double[10];
	    double[] vetorMulti = new double[10];
	    double[] vetorDiv = new double[10];
	    int i;
	    for(i=0;i<10;i++){
	        System.out.printf("Digite o %d° numerodo primeiro vetor: ",i+1);
	        vetor1[i]= ler.nextDouble();
	        System.out.printf("Digite o %d° numerodo segundo vetor: ",i+1);
	        vetor2[i]= ler.nextDouble();
	    }
	    System.out.printf("\n****** MULTIPLICANDO VETOR 1° PELO VETOR 2° ******\n");
	    for(i=0;i<10;i++){
	        vetorMulti[i]= vetor1[i] * vetor2[i];
	        System.out.printf(" %.2f * %.2f é igual á: %.2f\n",vetor1[i],vetor2[i],vetorMulti[i]);
	    }
	    System.out.printf("\n****** DIVIDINDO VETOR 1° PELO VETOR 2° ******\n");
	    for(i=0;i<10;i++){
	        vetorDiv[i]= vetor1[i] / vetor2[i];
	        System.out.printf(" %.2f /  %.2f é igual á: %.2f\n",vetor1[i],vetor2[i],vetorDiv[i]);
	    }
	}
    
}
