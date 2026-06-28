package Heranca2;

public final class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
		System.out.println("Salário pós aumento é de: " + this.getSalario());
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
}
