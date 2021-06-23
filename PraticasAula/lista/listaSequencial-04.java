import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double diagonalMaior,diagonalMenor,area;
	    
	    System.out.print("Digite o valor da maior Diagonal: ");
	    diagonalMaior = ler.nextDouble();
	    System.out.print("Digite o valor da menor diagonal: ");
	    diagonalMenor = ler.nextDouble();
	    area = (diagonalMaior*diagonalMenor)/2;
	    System.out.printf("Valor da área é %.2f", area);
	    
		
	}
}