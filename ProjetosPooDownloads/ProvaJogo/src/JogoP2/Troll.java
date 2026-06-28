package JogoP2;

public class Troll extends Entidade{
	public Troll (String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public int poder(Lutavel oponente) {
		return this.calcularDefesaTotal() * this.calcularManaTotal();
	}
}
