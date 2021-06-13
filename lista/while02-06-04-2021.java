import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int cont=1, soma=0;
    	while(cont <=500){
    	    
    	    if(cont % 3 == 0 && cont % 2 !=0){
    	        System.out.println(cont);
    	        soma = soma+cont;
    	    }
    	    cont++;
		}
		System.out.print("A soma total dos numeros multiplos de 3 foi: "+soma);
	}
}