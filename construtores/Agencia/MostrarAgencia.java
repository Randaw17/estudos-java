package construtores.Agencia;

public class MostrarAgencia {
    public static void main(String[] args) {
        Agencia a1 = new Agencia(2018, 1598, 0);
        System.out.printf("Agencia: %d\n", a1.getAgencia());
        System.out.printf("Numero : %d\n", a1.getNumero());
        System.out.printf("Saldo: %.2f\n", a1.getSaldo());

        System.out.printf(" \n");
        Agencia c2 = new Agencia();
        c2.setNumero(2548);
        c2.setAgencia(2019);

        System.out.printf("Agencia: %d\n", c2.getAgencia());
        System.out.printf("Numero: %d\n", c2.getNumero());
        System.out.printf("Saldo: %.2f\n", c2.getSaldo());
    }
}
