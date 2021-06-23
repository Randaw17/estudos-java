package PraticasAula.FiguracaoClasses.Conta;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		IFigura conta;
		int tipoConta;
		double valor;
		System.out.println("Informe o tipo de conta 1 - CC; 2 - CP");
		tipoConta = sc.nextInt();

		System.out.println("Informe o valor a sacar");
		valor = sc.nextDouble();
		
		if( tipoConta == 1) {
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupanca();
		}
		
		conta.sacar(valor);
		System.out.printf("O saldo da conta é %f", conta.getSaldo());
    }
    
}
