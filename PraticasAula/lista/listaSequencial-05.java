import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double tempCelsius,tempFahrenheit;
	    
	    System.out.print("Digite a temperatura em Celsius: ");
	    tempCelsius = ler.nextDouble();
	    tempFahrenheit= (tempCelsius * 1.8)+32;
	    System.out.printf("Valor da temperatura em Fahrenheit é %.2f", tempFahrenheit);
	    
		
	}
}