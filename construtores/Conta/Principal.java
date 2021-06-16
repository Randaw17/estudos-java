package construtores.Conta;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setAgencia(5488);
        c1.setNumero(8845);
        c1.setLimite(1000);

        System.out.printf("%d\n",c1.getAgencia());
        System.out.printf("%d\n",c1.getNumero());
        System.out.printf("%.2f\n",c1.getSaldo());

        c1.sacar(500);
        System.out.printf("%.2f\n",c1.getSaldo());

        c1.depositar(300);
        System.out.printf("%.2f\n",c1.getSaldo());
        
        c1.sacar(1000);
        System.out.printf("%.2f\n",c1.getSaldo());
    }
}
