package PraticasAula.construtores.Juros;

public class Juros {
    protected double valor, taxa;
    protected int tempo;

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }

    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    public int getTempo(){
        return tempo;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    public double getTaxa(){
        return taxa;
    }

    public double calculaMontante(){
        double calculaMontante;
        calculaMontante = this.valor * this.taxa * this.tempo;
        return calculaMontante;
    }
}
