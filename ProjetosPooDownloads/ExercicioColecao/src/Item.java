
public class Item {
	private int quatidade;
	private double precoUnitario;
	private String nome;
	
	public Item(int quatidade, double precoUnitario, String nome) {
		this.quatidade = quatidade;
		this.precoUnitario = precoUnitario;
		this.nome = nome;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
