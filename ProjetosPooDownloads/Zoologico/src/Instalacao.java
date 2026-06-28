import java.util.List;
import java.util.ArrayList;

public abstract class Instalacao {
	private int capacidadeMaxima;
	private Localização localizacao;
	private double temperatura;
	private List<Animal> animaisInstalados;
	private List<ElementoInstalacao> elementos; //relação 1..1*
	
	public Instalacao(int capacidadeMaxima, Localização localizacao, double temperatura) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.localizacao = localizacao;
		this.temperatura =  temperatura;
		this.animaisInstalados = new ArrayList<>();
		this.elementos = new ArrayList<>();
	}
	
	//Método para adicionar elementos (Jaula/Tanque) à instalação
	public void adicionarElemento(ElementoInstalacao elemento) {
		if(elemento != null) {
			this.elementos.add(elemento);
		}
	}
	
	public boolean instalaAnimal(Animal animal) {
		if(animaisInstalados.size() < this.capacidadeMaxima) {
			animaisInstalados.add(animal);
			return true;
		}
		return false;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public Localização getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localização localizacao) {
		this.localizacao = localizacao;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public List<Animal> getAnimaisInstalados() {
		return animaisInstalados;
	}

	public void setAnimaisInstalados(List<Animal> animaisInstalados) {
		this.animaisInstalados = animaisInstalados;
	}

	public List<ElementoInstalacao> getElementos() {
		return elementos;
	}

	public void setElementos(List<ElementoInstalacao> elementos) {
		this.elementos = elementos;
	}
	
	
}
