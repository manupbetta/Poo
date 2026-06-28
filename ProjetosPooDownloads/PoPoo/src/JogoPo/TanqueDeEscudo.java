package JogoPo;

public class TanqueDeEscudo extends Escudeiro{
	public TanqueDeEscudo(String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int golpePoderoso(Lutavel gladiador) {
		return (this.calcularAtaqueTotal() * this.calcularDefesaTotal() * this.calcularManaTotal()) - gladiador.calcularDefesaTotal();
	}
}
