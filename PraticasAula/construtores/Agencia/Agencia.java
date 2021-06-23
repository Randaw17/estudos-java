package PraticasAula.construtores.Agencia;

public class Agencia {
    private double saldo;
    private int agencia, numero;

    public Agencia(int agencia, int numero, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public Agencia(){
        this.saldo=0;
    }


    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

}
