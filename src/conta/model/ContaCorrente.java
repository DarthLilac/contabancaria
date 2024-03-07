package conta.model;

// ContaCorrente herda de conta (classe mãe)

public class ContaCorrente extends Conta {

	private float limite;

// Método construtor

// atributo = ciano argumento = azul

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {

		// Método construtor da suoer classe
		super(numero, agencia, tipo, titular, saldo);

		// Atributo da classe
		this.limite = limite;

	}

	// Métodos de acesso get/set (source, getter and setters)
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	// Métodos especificos

	@Override // Sobrescrever
	public void visualizar() {
		// Super == chamada da super class -> Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
