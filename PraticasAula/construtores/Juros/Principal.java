package PraticasAula.construtores.Juros;

public class Principal {
    public static void main(String[] args) {
        JurosCompostos jc1 = new JurosCompostos();
        jc1.setValor(15);
        jc1.setTempo(10);
        jc1.setTaxa(0.02);

        System.out.printf("Valor: %.2f\n",jc1.getValor());
        System.out.printf("Tempo: %d\n",jc1.getTempo());
        System.out.printf("Taxa: %.2f\n",jc1.getTaxa());
        System.out.printf("\n");
        System.out.printf("Montante: %.2f\n",jc1.calculaMontante());
    }
}
