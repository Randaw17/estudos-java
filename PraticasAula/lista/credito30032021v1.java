package lista;
import java.util.Scanner;
public class credito30032021v1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double saldoMedio=0,saldoAtual = 0;
	    
	    System.out.print("Digite o Saldo médio do cliente: ");
	    saldoMedio = ler.nextDouble();
	    
	    if (saldoMedio <=500){
	        saldoAtual = saldoMedio + ((saldoMedio*30)/100);
	        System.out.printf("Saldo médio atual: %.2f",saldoAtual);
	    }else if(saldoMedio <=1000){
	        saldoAtual = saldoMedio + ((saldoMedio*40)/100);
	        System.out.printf("Saldo médio atual: %.2f",saldoAtual);
	    }else if(saldoMedio <=1000){
	        saldoAtual = saldoMedio + ((saldoMedio*50)/100);
	        System.out.printf("Saldo médio atual: %.2f",saldoAtual);
	    }
	    
	}
}