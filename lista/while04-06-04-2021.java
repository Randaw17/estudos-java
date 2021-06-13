import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int cont=1;
        float altura=0, alturaMax=0,alturaMin=0;
    	while(cont <=15){
    	    System.out.print("Digite a altura da "+cont+"° pessoa: ");
    	    altura = ler.nextFloat();
            if (cont == 1){
                alturaMax = altura;
                alturaMin = altura;
            }
    	    if(altura > alturaMax){
    	        alturaMax = altura;
    	    }
    	    if (altura < alturaMin){
    	        alturaMin = altura;
    	    }
    	    cont++;
		}
		System.out.printf("Maior altura foi: %.2f\nMenor altura foi: %.2f",alturaMax,alturaMin);
	}
}