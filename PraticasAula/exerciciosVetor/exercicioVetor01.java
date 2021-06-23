package PraticasAula.exerciciosVetor;

import java.util.Scanner;
public class exercicioVetor01
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double[] notasAlunos = new double[10];
	    double maiorNota=0,menorNota=0;
	    int i;
	    for(i=0;i<10;i++){
	        System.out.printf("Digite a nota do %d Aluno: ",i+1);
	        notasAlunos[i] = ler.nextDouble();
	        if(i==0){
	            menorNota = notasAlunos[i];
	            maiorNota = notasAlunos[i];
	        }
	        if(notasAlunos[i]>maiorNota){
	            maiorNota = notasAlunos[i];
	        }
	        if(notasAlunos[i]<menorNota){
	            menorNota = notasAlunos[i];
	        }
	    }
	    System.out.printf("\nAlunos com maior nota = %.2f\n",maiorNota);
	    for(i=0;i<10;i++){
	        if(notasAlunos[i] == maiorNota){
	            System.out.printf("%d° Aluno.\n",i+1);
	        }
	    }
	    System.out.printf("\nAlunos com Menor nota = %.2f\n",menorNota);
	    for(i=0;i<10;i++){
	        if(notasAlunos[i] == menorNota){
	            System.out.printf("%d° Aluno.\n",i+1);
	        }
	    }
	}
}
