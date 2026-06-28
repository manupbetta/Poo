package Heranca;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Luiza");
		p2.setNome("Maria");
		p3.setNome("Lucas");
		p4.setNome("Eduarda");
		
		p1.setSexo("Feminimo");
		p2.setSexo("Feminino");
		p3.setSexo("Masculino");
		p4.setSexo("Feminino");
		
		p1.setIdade(20);
		p2.setIdade(22);
		p3.setIdade(38);
		p4.setIdade(30);
			
		p2.setCurso("Ciência da Computação");
		p3.setSalario(2500.78f);
		p4.setSetor("Biblioteca");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		}
	}
