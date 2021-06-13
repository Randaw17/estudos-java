package lista.testeProjetos;
import java.util.Scanner;
public class exemploAula {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int numero;
        System.out.printf("Digite um número: ");
        numero=ler.nextInt();
        dobro(numero);
        
    }
    public static void dobro(int numero){
        System.out.printf("%d",numero*2);

    }
}
