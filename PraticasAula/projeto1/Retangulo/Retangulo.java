package PraticasAula.projeto1.Retangulo;

public class Retangulo {
    private double base,altura,area,perimetro;
    //base
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    //altura
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public double calculaArea(){
        area=base*altura;
        return area;
    }

    public double calculaPerimetro(){
        perimetro=(2*base)+(2*altura);
        return perimetro;
    }
}
