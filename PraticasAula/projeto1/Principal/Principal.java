package PraticasAula.projeto1.Principal;
import java.util.Scanner;

import PraticasAula.projeto1.Pessoa.*;
import PraticasAula.projeto1.Retangulo.*;

public class Principal {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        Pessoa p = new Pessoa();
        Retangulo r = new Retangulo();
        
        p.setNome("Jose Alfredo");
        System.out.printf("%s\n",p.getNome());

        p.setEmail("ja@una.brz");
        System.out.printf("%s\n",p.getEmail());

        p.setTelefone("(31) 221-564");
        System.out.printf("%s\n",p.getTelefone());

        p.setIdade(18);
        System.out.printf("%d\n",p.getIdade());

        // retangulo
        System.out.printf("\n******Calculo do Retangulo*******\n");

        System.out.printf("Digite a Base: ");
        r.setBase(ler.nextDouble());
        System.out.printf("Digite a Altura: ");
        r.setAltura(ler.nextDouble());

        System.out.printf("\nvalor da Base: %.2f\n", r.getBase());
        System.out.printf("valor da Altura: %.2f\n", r.getAltura());

        System.out.printf("valor da Área: %.2f\n", r.calculaArea());
        System.out.printf("valor do Perimetro: %.2f\n", r.calculaPerimetro());
    }
    
}
