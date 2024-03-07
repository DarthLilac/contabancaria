package conta.model;

public class ContaPoupanca extends Conta{

	private int aniversario;

	public ContaPoupanca(int numeroConta, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numeroConta, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}
	
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}

}
