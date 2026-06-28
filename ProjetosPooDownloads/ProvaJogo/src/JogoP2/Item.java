package JogoP2;

public class Item {
	private final String nome;
	private int ataque;
	private int defesa;
	private int vida;
	private int mana;
	
	public Item(String nome, int ataque, int defesa, int vida, int mana) {
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.mana = mana;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
	public int getDefesa() {
		return this.defesa;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public int getMana() {
		return this.mana;
	}
}
