
public class Macaco implements Terrestre{
	private Sexo sexo;
	private Porte porte;
	
	public Macaco(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.PEQUENO;
	}
	
	@Override
	public Boolean Alimentar(Alimento alimento) {
		return alimento == Alimento.FRUTAS;
	}
	
	@Override
	public void locomover() {
		this.andar();
	}
	
	@Override
	public void andar() {
		System.out.println("Estou andando!");
	}
	
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
