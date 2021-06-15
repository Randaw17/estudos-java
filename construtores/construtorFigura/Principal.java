package construtores.construtorFigura;

public class Principal {
    public static void main(String[] args) {
        ConstrutorFigura c1 = new ConstrutorFigura(20, 30);
        System.out.printf("base: %.1f\n", c1.getBase());
        System.out.printf("Altura: %.1f\n", c1.getAltura());
        System.out.printf("Calculo da Área: %.1f\n", c1.calculoArea());

        
        System.out.printf("\n");

        ConstrutorFigura c2 = new ConstrutorFigura();
        c2.setBase(15);
        c2.setAltura(20);

        System.out.printf("base: %.1f\n", c2.getBase());
        System.out.printf("Altura: %.1f\n", c2.getAltura());
        System.out.printf("Calculo da Área: %.1f\n", c2.calculoArea());
    }
}