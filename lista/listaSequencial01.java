import java.util.Scanner;

public class listaSequencial01
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double n1,n2,n3,media;
	    
	    System.out.print("Digite o primeiro número: ");
	    n1 = ler.nextDouble();
	    System.out.print("Digite o segundo número: ");
	    n2 = ler.nextDouble();
	    System.out.print("Digite o terceiro número: ");
	    n3 = ler.nextDouble();
	    
	    media = (n1+n2+n3)/3;
	    
	    System.out.print("A média é: "+media);
	    
		
	}
}