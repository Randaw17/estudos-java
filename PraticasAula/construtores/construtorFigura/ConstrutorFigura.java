package PraticasAula.construtores.construtorFigura;
public class ConstrutorFigura{
    protected double base,altura;

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
}