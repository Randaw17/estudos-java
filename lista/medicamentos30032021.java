import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int idade, dosagem;
	    int gotas;
	    double peso;
	    
	    System.out.print("Informe a idade: ");
	    idade = sc.nextInt();
	    
	    System.out.print("Informe o peso (kg): ");
	    peso = sc.nextDouble();
	    
	    if( idade >= 12 ){
	        
	       if( peso >= 60 ){
	           dosagem = 1000;
	       }  else {
	           dosagem = 875;
	       }
	        
	    } else {
	       
	       if( peso <= 9 ) dosagem = 125;
	        else if( peso <= 16 ) dosagem = 250;
	            else if(peso <= 24 ) dosagem = 375;
	                else if(peso <= 30) dosagem = 500;
	                    else dosagem = 750;
	    }
	    
	    gotas = dosagem / 25;
	    
	    System.out.printf("\nPara a idade %d, peso %.2f(Kg) utilizar %d gotas.", idade, peso, gotas);
	}
}