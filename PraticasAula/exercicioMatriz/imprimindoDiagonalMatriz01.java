package PraticasAula.exercicioMatriz;

public class imprimindoDiagonalMatriz01 {
    public static void main(String[] args) {
	    int[][] matriz = new int[10][10];
	    int valor=0;
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	            if(coluna ==linha){
	                matriz[linha][coluna]=1;
	            }else{
	                matriz[linha][coluna]= valor;
	            }
	        }
	    }
	    
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	          System.out.printf("%d", matriz[linha][coluna]);
	            
	        }
	        System.out.printf("\n");
	    }
	}
    
}
