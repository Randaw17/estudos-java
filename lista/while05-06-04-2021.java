import java.util.Scanner;

public class LeituraNaoDeterminada {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lerDados = true;
		int numero, somaPar = 0, somaImpar = 0;
		int quantidadePares = 0, quantidadeImpares = 0;
		
		while( lerDados == true ) {
			System.out.println("Informe o número: ");
			numero = sc.nextInt();
			
			if( numero != 0 ) {
				
				if( numero % 2 == 0 ) {
					quantidadePares = quantidadePares + 1;
					somaPar = somaPar + numero;
				} else {
					quantidadeImpares = quantidadeImpares + 1;
					somaImpar = somaImpar + numero;
				}
				
			} else {
				lerDados = false;
			}
		}
		System.out.printf("\nQuantidade de números pares informados: %d", quantidadePares);
		System.out.printf("\nQuantidade de números ímpares informados: %d", quantidadeImpares);
		System.out.printf("\nMédia dos números pares %d", somaPar/quantidadePares);
		System.out.printf("\nMédia geral %d", ( somaPar + somaImpar) / (quantidadePares + quantidadeImpares ) );
		
	}
}