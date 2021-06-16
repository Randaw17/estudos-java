package construtores.construtorFigura;

public class Principal {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.setBase(15);
        t1.setAltura(20);
        System.out.printf("base: %.1f\n", t1.getBase());
        System.out.printf("Altura: %.1f\n", t1.getAltura());
        System.out.printf("Calculo da Área: %.1f\n", t1.calculoArea());

        
        System.out.printf("\n");

        Retangulo r1 = new Retangulo();
        r1.setBase(15);
        r1.setAltura(20);

        System.out.printf("base: %.1f\n", r1.getBase());
        System.out.printf("Altura: %.1f\n", r1.getAltura());
        System.out.printf("Calculo da Área: %.1f\n", r1.calculoArea());
    }
}