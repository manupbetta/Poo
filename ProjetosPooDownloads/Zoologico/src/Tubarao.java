
public class Tubarao implements Aquatico{
	private Sexo sexo;
	private Porte porte;
	
	public Tubarao(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.GRANDE;
	}
	
	@Override
	public Boolean Alimentar(Alimento alimento) {
		return alimento == Alimento.CARNES || alimento == Alimento.PEIXES;
	}
	
	@Override
	public void locomover() {
		this.nadar();
	}
	
	@Override
	public void nadar() {
		System.out.println("Estou nadando");
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
