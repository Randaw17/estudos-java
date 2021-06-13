package Projeto2.principal;
import java.util.Scanner;
import Projeto2.venda.Venda;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Venda v = new Venda();

        System.out.printf("Digite o valor do produto: ");
        v.setValor(ler.nextDouble());

        System.out.printf("Digite a quantidade de parcelas: ");
        v.setQuantParcelas(ler.nextInt());

        System.out.printf("Digite a taxa de juros(sem %%): ");
        v.setTaxa(ler.nextDouble());


        System.out.printf("\n***** Calculo de Juros *****\n");
        System.out.printf("Valor do montante a pagar: %.2f\n", v.calculaMontante());
        System.out.printf("Valor das parcelas a pagar: %.2f\n", v.calculaParcela());
    }
}
