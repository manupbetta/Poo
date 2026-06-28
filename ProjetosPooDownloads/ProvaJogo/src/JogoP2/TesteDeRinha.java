package JogoP2;

public class TesteDeRinha {
	public static void main(String[] args) {
		Item espada = new Item("Espada", 15, 0, 10, 0);
		Item escudo = new Item("Escudo", 0, 20, 50, 0);
		
		Item [] itensGuerreiro = { espada };
		Item [] itensTroll = { escudo };
		
		Guerreiro g1 = new Guerreiro("Aragorn", 100, 20, itensGuerreiro);
		Troll t1 = new Troll("Grog", 150, 10, itensTroll);
		
		Jogo meuJogo = new Jogo("Ragnarok");
		meuJogo.rinhaDeEntidades(g1, t1);
	}
}
