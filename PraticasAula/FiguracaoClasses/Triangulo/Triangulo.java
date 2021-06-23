package PraticasAula.FiguracaoClasses.Triangulo;

public class Triangulo implements IFigura {

    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base * (altura/2));
    }

    @Override
    public double calculaPerimetro() {
        return (3*base);
    }
    
}
