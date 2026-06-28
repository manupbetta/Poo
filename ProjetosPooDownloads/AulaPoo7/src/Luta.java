import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	//Métodos Especiais
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiado(Lutador l1) {
		this.desafiado = l1;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setDesafiante(Lutador l2) {
		this.desafiante = l2;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setRounds(int r) {
		this.rounds = r;
	}
	
	public boolean isAprovado() {
		return this.aprovado;
	}
	
	public void setAprovado(boolean aprovada) {
		this.aprovado = aprovada;
	}
	
	//Métodos Públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta aprovada!");
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Luta não aprovada!");
		}
	}
	
	public void lutar() {
		if(this.aprovado) {
			System.out.println("----Desafiado----");
			this.desafiado.apresentar();
			System.out.println("----Desafiante----");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //0 1 2
			switch(vencedor) {
			case 0: //empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1: //desafiado vence
				System.out.println("Vencedor: " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: //desafiante vence
				System.out.println("Vencedor: " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("----------------");
		} else {
			System.out.println("A luta não pode acontecer");
		}
	}
}
