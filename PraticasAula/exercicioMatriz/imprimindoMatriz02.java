package PraticasAula.exercicioMatriz;

public class imprimindoMatriz02 {
    public static void main(String[] args) {
	    int valor=0;
		int[][] matriz = new int [2][5];
	    for(int linha=0;linha<2;linha++){
	        for(int coluna=0;coluna<5;coluna++){
	            matriz[linha][coluna] = valor;
	            valor++;
	        }
	    }
	    for(int linha=0;linha<2;linha++){
	        for(int coluna=0;coluna<5;coluna++){
	                System.out.printf("%d ", matriz[linha][coluna]);
	        }
	        System.out.printf("\n");
	    }
	    
	}
}
