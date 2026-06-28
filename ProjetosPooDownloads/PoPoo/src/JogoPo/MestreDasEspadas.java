package JogoPo;

public class MestreDasEspadas extends Espadachim {
	public MestreDasEspadas(String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int golpePoderoso(Lutavel gladiador) {
		return this.calcularAtaqueTotal() + (this.calcularVidaTotal() * this.calcularManaTotal());
	}
}
