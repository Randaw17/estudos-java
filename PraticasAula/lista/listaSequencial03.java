package lista;

import java.util.Scanner;

public class listaSequencial03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double cotacao,dolar,reais;
	    
	    System.out.print("Digite a cotação do dolar para reais atual: ");
	    cotacao = ler.nextDouble();
	    System.out.print("Digite valor em dolar: ");
	    dolar = ler.nextDouble();
	    reais = cotacao*dolar;
	    System.out.printf("Valor da conversão é R$ %.2f.", reais);
	    
		
	}
}