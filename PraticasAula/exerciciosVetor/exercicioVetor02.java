package PraticasAula.exerciciosVetor;

import java.util.Scanner;
public class exercicioVetor02
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double[] notasAlunos = new double[10];
	    double media=0;
	    int i;
	    for(i=0;i<10;i++){
	        System.out.printf("Digite a nota do %d Aluno: ",i+1);
	        notasAlunos[i] = ler.nextDouble();
	        media = media+notasAlunos[i];
	    }
	    media=media/i;
	    System.out.printf("\nAlunos com nota maior ou igual a nota média = %.2f\n",media);
	    for(i=0;i<10;i++){
	        if(notasAlunos[i] >= media){
	            System.out.printf("%d° Aluno. Nota = %.2f\n",i+1,notasAlunos[i]);
	        }
	    }
	    System.out.printf("\nAlunos com nota menor que a nota média = %.2f\n",media);
	    for(i=0;i<10;i++){
	        if(notasAlunos[i] < media){
	            System.out.printf("%d° Aluno. Nota = %.2f\n",i+1,notasAlunos[i]);
	        }
	    }
	}
}
