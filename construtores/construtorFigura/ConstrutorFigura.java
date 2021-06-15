package construtores.construtorFigura;
public class ConstrutorFigura{
    private double base,altura;

    public ConstrutorFigura(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public ConstrutorFigura(){
    }


    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public double calculoArea(){
        double calculo;
        calculo = this.base * this.altura;
        return calculo;
    }
}