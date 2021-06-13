package exercicioMatriz;

public class imprimindoMatriz01 {
    public static void main(String[] args) {
	    int[][] matriz = new int [2][5];
	    for(int coluna=0;coluna<5;coluna++){
	        matriz[0][coluna]=0;
	        matriz[1][coluna]=1;
	        
	    }
	    for(int linha=0;linha<2;linha++){
	        for(int coluna=0;coluna<5;coluna++){
	            System.out.printf("%d, \n", matriz[linha][coluna]);
	        }
	    }
	}
}
