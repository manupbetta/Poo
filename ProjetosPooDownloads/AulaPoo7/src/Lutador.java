
public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//construtor
	public Lutador(String nome, String nac, int i, double a, double p, int v, int d, int e) {
		this.nome = nome;
		this.nacionalidade = nac;
		this.idade = i;
		this.altura = a;
		setPeso(p);
		this.vitorias = v;
		this.derrotas = d;
		this.empates = e;
	}
	
	//getters e setters (metodos especiais)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNacionalidade(String nac) {
		this.nacionalidade = nac;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setAltura(float a) {
		this.altura = a;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double g) {
		this.peso = g;
		this.setCategoria();
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "inválido";
		} else if(this.peso <= 70.3) {
			this.categoria = "leve";
		} else if(this.peso <= 83.9) {
			this.categoria = "médio";
		} else if(this.peso <= 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "inválido";
		}
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setVitorias(int v) {
		this.vitorias = v;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void setDerrotas(int d) {
		this.derrotas = d;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public void setEmpates(int e) {
		this.empates = e;
	}
	
	public int getEmpates() {
		return this.empates;
	}
	
	//Métodos Públicos
	public void apresentar() {
		System.out.println("------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos " + this.getAltura() + " Kg");
		System.out.println("Pesando: " + this.getPeso());
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}
	
	public void Status() {
		System.out.println("------------------");
		System.out.println(this.getNome() + " é um " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
}
