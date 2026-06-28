package JogoP2;

public class SpellBlade extends Guerreiro{
	public SpellBlade(String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int poder(Lutavel oponente) {
		return this.calcularAtaqueTotal() * (this.calcularVidaTotal() + this.calcularManaTotal());
	}
}
