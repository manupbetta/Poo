package JogoPo;

public class Escudeiro extends Gladiador{
	public Escudeiro(String nome, int vida, int mana, Item [] itens) {
		super(nome, vida, mana, itens);
	}
	
	public int golpePoderoso(Lutavel gladiador) {
		return this.calcularDefesaTotal() * this.calcularManaTotal();
	}
}
