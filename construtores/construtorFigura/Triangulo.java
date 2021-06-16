package construtores.construtorFigura;

public class Triangulo extends ConstrutorFigura{
    public double calculoArea(){
        double calculo;
        calculo = (this.base * this.altura)/2;
        return calculo;
    }
}
