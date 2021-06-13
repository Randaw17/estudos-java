package lista;
import java.util.Scanner;

public class a
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Digite a temperatura en Celsius");
		double c = ler.nextDouble();
		double f = (c*1.8) + 32;
/*		double q = Math.sqrt(f);
		double s = Math.cbrt(f);
*/		
		System.out.println("A temperatura em Fahrenheit é: " + f);
	/*	System.out.println("O quadrado da temperatura em Fahrenheit é: " + q);
		System.out.println("O cubo da temperatura em Fahrenheit é: " + s);
	*/	
	}
}