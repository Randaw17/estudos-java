package lista.testeProjetos;
import java.util.Scanner;


public class Projeto02 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double peso,altura,imc;

        System.out.printf("Digite o peso: ");
        peso=ler.nextDouble();
        System.out.printf("Digite a altura: ");
        altura=ler.nextDouble();

        imc = calculaIMC(peso,altura);
        if(imc >=25 && imc<30){
            System.out.printf("Acima do peso");
        }else{
            if(imc >=18.5 && imc<25){
                System.out.printf("Peso normal");
            }else{
                if(imc >=17 && imc<18.5){
                    System.out.printf("Abaixo do peso");
                }else{
                    if(imc >=16 && imc<17){
                        System.out.printf("Muito abaixo do peso");
                    }
                }
                
            }
        }

        
    }
    public static double calculaIMC(double peso,double altura){
        double imc;
        imc = peso/(Math.pow(altura,2));
        return imc;
    }
}
