
public class Leao implements Terrestre{
	private Sexo sexo;
	private Porte porte;
	
	public Leao(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.MEDIO;
	}
	
	@Override
	public Boolean Alimentar(Alimento alimento) {
		return alimento == Alimento.CARNES;
	}
	
	@Override
	public void locomover() {
		this.andar();
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
