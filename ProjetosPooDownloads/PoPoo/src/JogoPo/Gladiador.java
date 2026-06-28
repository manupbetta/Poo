package JogoPo;

public abstract class Gladiador implements Lutavel{
	private final String nome;
	private int vida;
	private int mana;
	private Item [] itens;
	
	public 	Gladiador(String nome, int vida, int mana, Item [] itens) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.itens = itens;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract int golpePoderoso(Lutavel gladiador);
	
	public int getVida() {
		return this.vida;
	}
	
	public int getMana() {
		return this.mana;
	}
	
	public Item [] getItens() {
		return this.itens;
	}
	
	@Override
	public int calcularAtaqueTotal() {
		int ataqueTotal = 0;
		if(this.itens != null) {
			for(Item item : this.itens) {
				ataqueTotal += item.getAtaque();
			}
		}
		return ataqueTotal;
	}
	
	@Override
	public int calcularDefesaTotal() {
		int defesaTotal = 0;
		if(this.itens != null) {
			for(Item item : this.itens) {
				defesaTotal += item.getDefesa();
			}
		}
		return defesaTotal;
	}
	
	@Override
	public int calcularVidaTotal() {
		int vidaTotal = this.getVida();
		if(this.itens != null) {
			for(Item item : this.itens) {
				vidaTotal += item.getVida();
			}
		}
		return vidaTotal;
	}
	
	@Override
	public int calcularManaTotal() {
		int manaTotal = this.getMana();
		if(this.itens != null) {
			for(Item item : this.itens) {
				manaTotal += item.getMana();
			}
		}
		return manaTotal;
	}
}
