import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    float nota1, nota2, nota3, mediaExercicio, mediaAproveitamento;
	    char conceito;
	    String situacao;
	    
	    System.out.print("Informe a nota 1: ");
	    nota1 = sc.nextFloat();
	    
	    System.out.print("Informe a nota 2: ");
	    nota2 = sc.nextFloat();
	    
	    System.out.print("Informe a nota 3: ");
	    nota3 = sc.nextFloat();
	    
	    mediaExercicio = (nota1 + nota2 + nota3)/3;
	    
	    mediaAproveitamento = ( nota1 + ( nota2 * 2 ) + ( nota3 * 3 ) + mediaExercicio ) / 7;
	    
	    System.out.printf("Média do aproveitamento: %.2f", mediaAproveitamento);

	    if( mediaAproveitamento >= 90 ){
	        conceito = 'A';
	    } else {
	        if( mediaAproveitamento >= 75 ){
	            conceito = 'B';
	        } else {
	            if( mediaAproveitamento >= 60) {
	                conceito = 'C';
                } else {
	                if( mediaAproveitamento >= 40 ){
	                    conceito = 'D';
	                } else {
	                    conceito = 'E';
	                }
	            }
	        }
	    }
	    System.out.printf("\nConceito: %s\n", conceito);
	    
	    if( conceito == 'A' || conceito == 'B' || conceito == 'C' ){
	        situacao = "Aprovado";
	    } else {
	        situacao = "Reprovado";
	        
	    }
	    
	    System.out.printf("A média do aproveitamento foi. %.2f, sendo o conceito %s, resultando em aluno %s",
	        mediaAproveitamento, conceito, situacao );
	}
}
