import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int anoNasc,atual,futuro;
	    
	    System.out.print("Digite o ano de nascimento: ");
	    anoNasc = ler.nextInt();
	    atual = 2021-anoNasc;
	    futuro = 2050-anoNasc;
	    
	    System.out.print("A idade atual é: "+atual+"\n"+
	                        "Idade no ano de 2050 é: "+futuro);
	    
		
	}
}