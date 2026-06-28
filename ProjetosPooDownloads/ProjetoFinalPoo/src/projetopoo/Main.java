package projetopoo;

public class Main {

	public static void main(String[] args) {
		Video [] v = new Video[3];
		
		v[0] = new Video("Aula 1 de Poo");
		v[1] = new Video("Aula 5 de Estrutura de Dados em C");
		v[2] = new Video("Aula 15 de Python");
		v[0].toString();
		/*System.out.println(v[1].toString());
		System.out.println("----------");
		System.out.println(v[2].toString());
		System.out.println("----------");
		System.out.println(v[0].toString());
		System.out.println("----------");*/
		
		Aluno a[] = new Aluno[2];
		
		a[0] = new Aluno("Isabella", 19, "F", "isaB");
		a[1] = new Aluno("Júlio", 20, "M", "julio");
		/*System.out.println(a[0].toString());
		System.out.println(a[1].toString());*/
		
		Visualizacao [] vis = new Visualizacao[5];
		vis[0] = new Visualizacao(v[0], a[1]);
		vis[0].avaliar();
		
		System.out.println(vis[0].toString());

		vis[1] = new Visualizacao(v[1], a[1]);
		vis[0].avaliar(87.6f);
		
	    System.out.println(vis[1].toString());
	}
}
