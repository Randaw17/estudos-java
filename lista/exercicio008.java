package lista;

import java.util.Scanner;
public class exercicio008
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    float peso,altura,imc,media;
		int contador,normalPeso=0,abaixoPeso=0;
      
	    for (contador = 1;contador<=10;contador++){
		System.out.println("Digite um peso: ");
		peso = ler.nextFloat();
		System.out.println("Digite uma altura: ");
		altura = ler.nextFloat();

        imc = (float) (peso/Math.pow(altura,2));

        if (imc < 20){
            System.out.println("Abaixo do peso!\n");
			abaixoPeso++;
        }else{
            if(imc >=20 && imc<25){
                System.out.println("Peso normal!\n");
				normalPeso++;
            }else{
                if(imc >=25 && imc < 30){
                    System.out.println("Sobre peso!\n");
                }else{
                    if(imc >=30 && imc <40){
                        System.out.println("Obeso!\n");
                    }else{
                      System.out.println("Obeso Mórbido!\n");
                    }
                }
            }
        }
      }
      System.out.printf("A quantidades de pessoas com peso normal é: %d.\nA quantidade de pessoas abaixo do peso é: %d",normalPeso,abaixoPeso);
	}
}