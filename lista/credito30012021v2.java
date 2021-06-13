package lista;
import java.util.Scanner;

public class credito30012021v2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double saldoMedio, percentualCredito, valorCredito, juros;
	    
	    System.out.println("Informe o saldo médio do último ano:");
	    saldoMedio = sc.nextDouble();
	    
	    
	    if( saldoMedio <= 500 ){
	        percentualCredito = 0;
	    } else {
	        if( saldoMedio <= 1000 ){
	            percentualCredito = 30;
	        } else {
	            if( saldoMedio <= 3000 ){
	                percentualCredito = 40;
	            } else {
	                percentualCredito = 50;
	            }
	        }
	    }
	    
	    valorCredito = saldoMedio * percentualCredito / 100;
	    juros = valorCredito * 0.02;
	    
	    
	    System.out.printf("\nPara um saldo médio de R$ %.2f existe um valor de crédito de R$ %.2f com R$ %.2f de juros.", 
	        saldoMedio, valorCredito,juros);
	    
	}
}