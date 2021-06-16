package construtores.construtorFigura;

public class Retangulo extends ConstrutorFigura {
    public double calculoArea(){
        double calculo;
        calculo = this.base * this.altura;
        return calculo;
    }
}
