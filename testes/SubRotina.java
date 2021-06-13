package testes;

import java.util.Scanner;
public class SubRotina {
    public static double Parcelar(double valorProduto, int quantidadeParcelas){
        double valorParcela, montante=0, juros = 0.02;
        montante = valorProduto*Math.pow((1+juros),quantidadeParcelas);
        valorParcela = montante/quantidadeParcelas;
        return(valorParcela);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorProduto,valorParcelas;
        int quantidadeParcelas;

        System.out.printf("Digite o valor do produto: ");
        valorProduto = ler.nextDouble();

        System.out.printf("Digite a quantidade de parcelas: ");
        quantidadeParcelas = ler.nextInt();

        valorParcelas= Parcelar(valorProduto,quantidadeParcelas);

        System.out.printf("Valor de cada parcela com juros é: R$ %.2f",valorParcelas);

        
    }
    
}
