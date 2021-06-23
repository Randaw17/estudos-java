import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int numero = 0, soma=0,cont=1;
    	while(cont <=10){
    	    
    		System.out.print("Digite o "+cont+"° numero: ");
    		numero = ler.nextInt();
    		soma = soma+ numero;
    		cont++;
		}
		System.out.print("O valor da soma foi: "+soma);
	}
}