package conta.model;

public class Conta {
	 
	// atributos / características
	// encapsulamento: proteger os dados
	// private / protected / public / friendly

	private int numero, agencia, tipo;
	private String titular;
	private float saldo;
	
	// Método Construtor > auxilia na criação de um objeto da classe
	public Conta( int numero, int agencia, int tipo, String titular, float saldo) {
		
		// this: representa o nome da própria classe (Conta)
		this.agencia = agencia; // conta.numero recebe o valor do arg. numero
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numeroConta) {
		this.numero = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	// métodos / ações
	
public boolean sacar(float valor) { 
		
		if(this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
			
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);

	}
	
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
		break;
		case 2:
			tipo = "Conta Poupança";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}
  
	
}