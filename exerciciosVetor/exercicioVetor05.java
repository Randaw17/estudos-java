package exerciciosVetor;
import java.util.Scanner;
public class exercicioVetor05 {
    public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double[] numero= new double[10];
	    int i;
	    for(i=0;i<10;i++){
	        System.out.printf("Digite o %d° numero: ",i+1);
	        numero[i]= ler.nextDouble();
	    }
	    for(i=0;i<10;i++){
	        if(numero[i] <0){
	            numero[i]=0;
	        }
	    }
	    for(i=0;i<10;i++){
	        if(numero[i] != 0 ){
	            System.out.printf("%d° numero digitado é: %.2f\n",i+1,numero[i]);
	        }else{
	            System.out.printf("%d° numero digitado foi negativo e foi trocado para: %.2f\n",i+1,numero[i]);
	        }
	    }
	}
    
}
