
public class Pessoa {
	//atributos privados - encapsulamento
	private String nome;
	private String nomePai;
	private String nomeMae;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private String nacionalidade; //BR, PT, EN e OUTRAS
	private String sexo; //MASCULINO ou FEMININO
	private String estadoCivil; //SOLTEIRO(A), CASADO(A), DIVORCIADO(A) e VIUVO(A)
	private double peso;
	private double altura;
	
	public Pessoa () {} //construtor vazio padrão do java beans
	
	//nome
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//nomePai
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai (String nomePai) {
		this.nomePai = nomePai;
	}
	
	//nomeMae
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//diaNacimento
	public int getDiaNascimento() {
		return diaNascimento;
	}
	
	public void setDiaNascimento(int dia) {
		this.diaNascimento = dia;
	}
	
	//mesNascimento
	public int getMesNascimento() {
		return mesNascimento;
	}
	
	public void setMesNascimento(int mes) {
		this.mesNascimento = mes;
	}
	
	//anoNascimento
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public void setAnoNascimento(int ano) {
		this.anoNascimento = ano;
	}
	
	//nascionalidade
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		if(nacionalidade.equals("BR") || nacionalidade.equals("PT") || nacionalidade.equals("EN")) {
			this.nacionalidade = nacionalidade;
		} else {
			System.out.println("Nacionalidade Inválida");
		}
	}
	
	//sexo
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		if(sexo.equalsIgnoreCase("MASCULINO") || sexo.equalsIgnoreCase("FEMININO")) {
			this.sexo = sexo.toUpperCase();
		} else {
			System.out.println("Sexo deve ser MASCULINO ou FEMININO");
		}
	}
	
	//estadoCivil
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		if(estadoCivil.equals("SOLTEIRO(A)") || estadoCivil.equals("CASADO(A)") || estadoCivil.equals("DIVORCIADO(A)") || estadoCivil.equals("VIUVO(A)")) {
			this.estadoCivil = estadoCivil;
		} else {
			System.out.println("Estado Civil Inválido");
		}
	}
	
	//peso
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//altura
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
