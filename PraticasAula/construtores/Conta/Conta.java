package PraticasAula.construtores.Conta;

public class Conta {
    protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if( this.saldo - valor >= 0 ) {
			this.saldo = this.saldo - valor;
		}
	}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}

    
}
