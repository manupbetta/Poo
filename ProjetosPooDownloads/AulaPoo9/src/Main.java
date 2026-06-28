
public class Main {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro [3];
				
		p[0] = new Pessoa("Manuela", 21, "F");
		p[1] = new Pessoa("Bia", 21, "F");
				
		l[0] = new Livro("Bíblia", "Deus", 1000, p[0]);
		l[1] = new Livro("Jogos Vorazes", "Susane Collins", 396, p[0]);
		l[2] = new Livro("Em Chamas", "Susane Collins", 399, p[1]);
		
		l[1].abrir();
		l[1].folhear(200);
		l[1].avancarPag();
		System.out.println(l[1].detalhes());
		
		System.out.println("-------------");
		System.out.println(l[0].detalhes());
	}
}