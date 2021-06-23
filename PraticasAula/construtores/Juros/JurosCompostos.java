/*
    sobre escrevendo o metodo CamculaMontante() da classe Pai    
*/
package PraticasAula.construtores.Juros;

public class JurosCompostos extends Juros{
    @Override
    public double calculaMontante(){
        double calculaMontante;
        calculaMontante = valor * Math.pow((1+taxa), tempo);
        return calculaMontante;
    }
    
}
