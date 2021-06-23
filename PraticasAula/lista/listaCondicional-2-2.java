import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double a,b,c,delta,x1,x2;
	    
	    System.out.print("Digite o coeficiente 'A' da equação: ");
	    a = ler.nextDouble();
	    System.out.print("Digite o coeficiente 'B' da equação: ");
	    b = ler.nextDouble();
	    System.out.print("Digite o coeficiente 'C' da equação: ");
	    c = ler.nextDouble();
	    
	    delta = (b*b)-4*a*c;
	    if(delta < 0){
	        System.out.print("Não possui resultado Válido!");
	    }else if(delta == 0){
	        x1 = (-b)/(2*a);
	        System.out.printf("Resultado:\n x = %.2f",x1);
	    }else{
	        x1 = (-b + Math.sqrt(delta))/(2*a);
    	    x2 = (-b - Math.sqrt(delta))/(2*a);
    	    System.out.printf("Resultado:\n x1 = %.2f \n x2 = %.2f", x1,x2);
	    }
	    
	    
		
	}
}