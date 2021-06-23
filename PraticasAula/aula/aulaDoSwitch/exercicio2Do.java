package PraticasAula.aula.aulaDoSwitch;

import java.util.Scanner;
public class exercicio2Do {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double valorUnitario,valorTotal=0,desconto,valorTotalBruto=0,valorTotalDesconto = 0;
        int quantidade,quantidadeTotal=0;
        String continuar;

        do{
            System.out.println("Digite a quantidade do produto: ");
            quantidade = sc.nextInt();
            
            System.out.println("Digite a valor do produto: ");
            valorUnitario = sc.nextDouble();
            
            valorTotal = valorUnitario*quantidade;

            if(valorTotal>3000){
                desconto = valorTotal * 0.05;
            }else{ 
                if(valorTotal>1000){
                desconto = valorTotal *0.02;
                }else{
                    desconto=0;
                }
            }
            quantidadeTotal = quantidadeTotal + quantidade;
            valorTotalBruto = valorTotalBruto + valorTotal;
            valorTotalDesconto = valorTotalDesconto + desconto;
            System.out.println("Deseja inserir outro produto?  (S/N) ");
            continuar = sc.next();


        }while(continuar.equalsIgnoreCase("S") == true);

        System.out.printf("quantidade total vendida: %d\n",quantidadeTotal);
        System.out.printf("Valor total Bruto: %.2f\n",valorTotalBruto);
        System.out.printf("Valor total dos descontos: %.2f",valorTotalDesconto);
    }
    
}
