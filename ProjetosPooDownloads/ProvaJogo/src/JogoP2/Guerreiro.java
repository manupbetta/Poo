package JogoP2;

public class Guerreiro extends Entidade {
	public Guerreiro (String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int poder(Lutavel oponente) {
		return this.calcularVidaTotal() * this.calcularAtaqueTotal();
	}
}
