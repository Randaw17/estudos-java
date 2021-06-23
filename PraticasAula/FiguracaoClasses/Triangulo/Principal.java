package PraticasAula.FiguracaoClasses.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();

        t.base = 10;
        t.altura = 15;

        System.out.println(t.calculaArea());
        System.out.println(t.calculaPerimetro());
    }
    
}
