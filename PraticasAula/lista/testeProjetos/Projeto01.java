package lista.testeProjetos;
import java.util.Scanner;
public class Projeto01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base,altura;
        System.out.printf("Digire a base para o calculo: ");
        base=ler.nextDouble();
        System.out.printf("Digire a altura para o calculo: ");
        altura=ler.nextDouble();

        calculaAreaRetangulo(base,altura);
        calculaAreaTriangulo(base,altura);
    }
    public static void calculaAreaRetangulo(double base,double altura){
        double area;
        area = base*altura;
        System.out.printf("Área do retangulo é: %.1f\n", area);

    }
    public static void calculaAreaTriangulo(double base,double altura){
        double area;
        area = (base*altura)/2;
        System.out.printf("Área do triangulo é: %.1f\n", area);
    }
}
