package PraticasAula.exercicioMatriz;

public class imprimindoDiagonalMatriz02 {
    public static void main(String[] args) {
	    int[][] matriz = new int[10][10];
	    int[][] matriz1 = new int[10][10];
	    int pri=10,sec=10,valor=0,i=9;
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	            matriz[linha][coluna]= valor;
	            if(coluna ==linha){
	                matriz[linha][coluna]=1;
	            }
	        }
	    }
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	            matriz1[linha][coluna]= matriz[coluna][linha];
	            if(coluna+linha == i-1){
	                matriz1[linha][coluna]=2;
	                i++;
	            }
	        }
	    }
	    
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	          System.out.printf("%d", matriz[linha][coluna]);
	            
	        }
	        System.out.printf("\n");
	    }
	    
	    System.out.printf("\n");
	    for(int linha=0;linha<10;linha++){
	        for(int coluna=0;coluna<10;coluna++){
	          System.out.printf("%d", matriz1[linha][coluna]);
	            
	        }
	        System.out.printf("\n");
	    }
	}
}
