package testes;
import java.net.PortUnreachableException;

import java.util.Scanner;
public class testeOne {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario=0,mediaSalario,totalSalario=0;
        int numeroFilhos=0,totalFilhos=0,mediaFilhos=0,contador=1,inicio;

        System.out.printf("Deseja começar a pesquisa? \n\n Digite '1' para iniciar ou '0' para encerrar o programa! \n");
        inicio = ler.nextInt();
        if (inicio ==1){
        for (contador = 1;salario>=0;contador++){
            System.out.printf("Digite o salario da %d° pessoa: ",contador);
            salario = ler.nextDouble();
            if (salario>=0){
                totalSalario = totalSalario + salario;
                System.out.printf("Digite a quantidade de filhos da %d pessoa: ",contador);
                numeroFilhos = ler.nextInt();
                totalFilhos = totalFilhos+numeroFilhos;
                
            }else{
                     System.out.println("Contabilizando o sistema!");
                     contador =contador-2;
                 }
        }
    
        mediaSalario = totalSalario/contador;
        mediaFilhos = totalFilhos/contador;
        System.out.printf("\nO numero total de %d de pessoas lidas\nOnde a media do salario foi: %.2f reais\nOnde tem a média de %d filhos por pessoa",contador,mediaSalario,mediaFilhos);        
        }else if(inicio==0){
                System.out.println("Fim programa!");

        }else{
            System.out.println("Digite um valor entre as opções!");
        }
        
    }
}
