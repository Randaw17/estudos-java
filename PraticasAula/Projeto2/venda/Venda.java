package PraticasAula.Projeto2.venda;

public class Venda {
    private double taxa,valor,montante; 
    private int quantParcelas; 

    //valor
    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return taxa;
    }

    //quantParcelas
    public void setQuantParcelas(int quantParcelas){
        this.quantParcelas = quantParcelas;
    }

    public int getQuantParcelas(){
        return quantParcelas;
    }

     //taxa
     public void setTaxa(double taxa){
        this.taxa = taxa/100;
    }

    public double getTaxa(){
        return taxa;
    }

    public double calculaMontante(){
        montante = valor*Math.pow((1+taxa),quantParcelas);
        return montante;
    }

    public double calculaParcela(){
        double parcela;
        parcela = montante/quantParcelas;
        return parcela;
    }
    
}
