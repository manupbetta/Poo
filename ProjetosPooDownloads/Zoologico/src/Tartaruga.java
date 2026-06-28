
public class Tartaruga implements Anfibio{
	private Sexo sexo;
	private Porte porte;
	
	public Tartaruga(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.PEQUENO;
	}
	
	@Override
	public Boolean Alimentar(Alimento alimento) {
		return alimento == Alimento.FRUTAS || alimento == Alimento.VERDURAS || alimento == Alimento.PEIXES;
	}
	
	@Override
	public void locomover() {
		this.nadar();
		this.andar();
	}
	
	@Override
	public void nadar() {
		System.out.println("Estou nadando!");
	}
	
	@Override
	public void andar() {
		System.out.println("Estou andando!");
	}
	
	@Override
	public Sexo getSexo() {
		return this.sexo;
	}
	
	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public Porte getPorte() {
		return this.porte;
	}
	
	@Override
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
}
