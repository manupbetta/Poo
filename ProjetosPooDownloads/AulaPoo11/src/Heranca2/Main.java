package Heranca2;

public class Main {
	public static void main(String [] args) {
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		
		v1.setNome("Julio");
		v1.setIdade(22);
		v1.setSexo("Masculino");
		System.out.println(v1.toString());
		System.out.println("----------");
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Vitória");
		a1.setMatricula(1234);
		a1.setCurso("Informática");
		a1.setIdade(19);
		a1.setSexo("Masculino");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		System.out.println("----------");
		
		Aluno a2 = new Aluno();
		
		a2.setNome("Jessica");
		a2.setIdade(17);
		a2.setSexo("Feminino");
		a2.setMatricula(67691);
		a2.setCurso("Ensino Médio");
		System.out.println(a2.toString());
		a2.pagarMensalidade();
		System.out.println("----------");
		
		Bolsista b1 = new Bolsista();
		
		b1.setMatricula(6483);
		b1.setNome("Larissa");
		b1.setBolsa(12.5f);
		b1.setSexo("Feminino");
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		System.out.println("----------");
		
		Professor p1 = new Professor();
		
		p1.setNome("Bruno");
		p1.setEspecialidade("Computação Gráfica");
		p1.setSalario(15000.0f);
		p1.setIdade(45);
		p1.setSexo("Masculino");
		System.out.println(p1.toString());
		p1.receberAumento(300.0f);
		System.out.println("----------");
		
		Tecnico t1 = new Tecnico();
		
		t1.setNome("Fernanda");
		t1.setIdade(17);
		t1.setSexo("Feminino");
		t1.setCurso("Jornalismo");
		t1.setRegistroProfissional("53674-8");
		System.out.println(t1.toString());
		t1.praticar();
		System.out.println("----------");
		
		Tecnico t2 = new Tecnico();
		
		t2.setNome("Duda");
		t2.setIdade(19);
		t2.setSexo("Feminino");
		t2.setMatricula(202203634);
		t2.setCurso("Quimica");
		t2.setRegistroProfissional("Estagiária");
		System.out.println(t2.toString());
		t2.praticar();
	}
}
