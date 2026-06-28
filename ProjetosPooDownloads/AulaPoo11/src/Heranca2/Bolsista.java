package Heranca2;

public final class Bolsista extends Aluno{
	private float bolsa;
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public float getBolsa() {
		return bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado");
	}
}
