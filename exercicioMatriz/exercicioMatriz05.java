package exercicioMatriz;

import java.util.Scanner;
public class exercicioMatriz05
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int votacao[][] = new int [6][4];
	    int maiorVoto=0,menorVoto=0,i,j;
	    
	    System.out.printf("***** Iniciando a Votação *****:\n");
	    for(i=0;i<6;i++){
	        for(j=0;j<4;j++){
	            System.out.printf("\nDigite o numero de votos do %d° candidato, do %d° mês: ",j+1,i+1);
	            votacao[i][j] = ler.nextInt();
	            
	            if(i==0&&j==0){
	                maiorVoto = votacao[i][j];
	                menorVoto = votacao[i][j];
	            }
	            
	            if(votacao[i][j] > maiorVoto){
	                maiorVoto = votacao[i][j];
	            }
	            
	            if(votacao[i][j] < menorVoto){
	                menorVoto = votacao[i][j];
	            }
	        }
	    }
	    

	    System.out.printf("\n***** Apuração dos votos! *****");
	    for(i=0;i<6;i++){
	        for(j=0;j<4;j++){
	            if(votacao[i][j] == maiorVoto){
	                System.out.printf("\nO %d° Candidato teve a maior quantidade de votos do %d° mês!\nA maior quantidade de votos do mês foi: %d.\n",j+1,i+1,votacao[i][j]);
	            }
	            
	            if(votacao[i][j] == menorVoto){
	                System.out.printf("\nO %d° Candidato teve a menor quantidade de votos do %d° mês!\nA menor quantidade de votos do mês foi: %d.\n",j+1,i+1,votacao[i][j]);
	            }
	        }
	    }
	    
	}
}