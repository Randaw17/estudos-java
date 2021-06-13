package testes;

import java.util.Random;
public class VetorAlterado {
    public static void exibirdados(int[] vetor){
        for(int i=0;i<10;i++){
            System.out.printf("%d, ",vetor[i]);
        }
    }
    public static void mudarValores(int[] vetor){
        for(int i=0;i<10;i++){
            if(i%2==0){
                vetor[i]=1;
            }else{
                vetor[i]=2;
            }
        }
    }
    public static void main(String[] args) {
        Random gerar = new Random();
        int[] exemplo = new int[10];
        for(int i=0;i<10;i++){
            exemplo[i] =  gerar.nextInt(10);
        }
        exibirdados(exemplo);
        mudarValores(exemplo);
        System.out.printf("\n");
        exibirdados(exemplo);
    }
}
