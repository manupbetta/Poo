package Heranca2;

public final class Tecnico extends Aluno {
	private String registroProfissional;
	
	public void praticar() {
		System.out.println("O técnico " + this.getNome() + ", com registro profissional " + this.getRegistroProfissional() + ", está praticando no curso de " + this.getCurso());
	}
	
	public void setRegistroProfissional(String registro) {
		this.registroProfissional = registro;
	}
	
	public String getRegistroProfissional() {
		return registroProfissional;
	}
}
