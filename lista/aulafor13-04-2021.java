import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int quantidade, numero,mtres=0,mcinco=0,resultado = 0;
	    for (quantidade = 1; quantidade<=10;quantidade++){
	        System.out.printf("Digite o %d° numero: ",quantidade);
	        numero = sc.nextInt();
	        resultado = resultado+numero;
	        if (numero % 3 == 0){
	            mtres++;
	        }
	        if (numero % 5 == 0){
	            mcinco++;
	        }
	    }
		System.out.printf("\no valor total foi: %d",resultado);
		System.out.printf("\no valor total de multiplos de 3 foi: %d",mtres);
		System.out.printf("\no valor total de multiplos de cinco foi: %d",mcinco);
	}
}