package JogoPo;

public class Espadachim extends Gladiador{
	public Espadachim(String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int golpePoderoso(Lutavel gladiador) {
		return this.calcularAtaqueTotal() * this.calcularVidaTotal(); 
	}
}
