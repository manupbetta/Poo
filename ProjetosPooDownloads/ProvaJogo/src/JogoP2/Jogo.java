package JogoP2;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private final String nome;
	private List<Lutavel> lista;
	
	public Jogo(String nome) {
		this.nome = nome;
		this.lista = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}

	public List<Lutavel> getLista() {
		return lista;
	}

	public void setLista(List<Lutavel> lista) {
		this.lista = lista;
	}
	
	public void rinhaDeEntidades(Lutavel l1, Lutavel l2) {
		int v1 = l1.calcularVidaTotal();
		int v2 = l2.calcularVidaTotal();
		
		while(v1 > 0 && v2 > 0) {
			//l1 ataca l2
			v2 -= l1.calcularAtaqueTotal();
			//se l2 morrer acaba
			if(v2 <= 0) break;
			//l2  ataca l1
			v1 -= l2.calcularAtaqueTotal();
		}
		
		//Imprimir o nome do vencedor
		if(v1 > 0) {
			System.out.println("Vencedor: " + l1.getNome());
		} else {
			System.out.println("Vencedor: " + l2.getNome());
		}
	}
}
