/* Usando o @OverRide para sobrescrever um método da classe Pai.*/
package construtores.Conta;

public class ContaCorrente extends Conta{
    private double limite;

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    @Override
    public void sacar(double valor) {
		if( (this.saldo + this.limite) - valor >= 0 ) {
			this.saldo = this.saldo - valor;
		}
	}

    @Override
    public double getSaldo() {
		return this.saldo+this.limite;
	}
    
}
