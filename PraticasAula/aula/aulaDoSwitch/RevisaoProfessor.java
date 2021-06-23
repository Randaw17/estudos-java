package PraticasAula.aula.aulaDoSwitch;

import java.util.Scanner;

public class RevisaoProfessor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade,quantidade=0,somaIdade=0,maiorIdade=0;
        double altura,menorAltura=0;
        String continuar;
        do{
            System.out.println("Informe a idade: ");
            idade =ler.nextInt();

            System.out.println("Informe a altura: ");
            altura = ler.nextDouble();
            quantidade++;
            somaIdade =somaIdade +idade;
            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            if(quantidade == 0){
                menorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }

            System.out.println("Deseja inserir outro (S/N)");
            continuar = ler.next();

        }while( continuar.equalsIgnoreCase("S")==true);

        System.out.printf("\nQuantidade de pessoas Entrevistadas: %d",quantidade);
        System.out.printf("\nMedia das idades: %d",somaIdade/quantidade);
        System.out.printf("\nMaior idade Digitada: %d",maiorIdade);
        System.out.printf("\nMenor altura Informada: %.2f",menorAltura);
    }
    
}
