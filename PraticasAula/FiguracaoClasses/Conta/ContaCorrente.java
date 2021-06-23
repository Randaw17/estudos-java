package PraticasAula.FiguracaoClasses.Conta;

public class ContaCorrente implements IFigura{
    protected double saldo;
    protected double valor;
    protected double limite = 1000;

    ContaCorrente(){

    }

    ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    
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
        if(saldo+limite>valor){
                this.saldo = this.saldo-valor;
                return true;
        }
        return false;
    }
    
}
