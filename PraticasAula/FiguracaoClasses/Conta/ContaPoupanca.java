package PraticasAula.FiguracaoClasses.Conta;

public class ContaPoupanca implements IFigura{
    protected double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }
    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo+valor;
        
    }
    @Override
    public boolean sacar(double valor) {
         if(saldo>valor){
             this.saldo = this.saldo-valor;
             return true;
         }

        return false;
    }
    
}
