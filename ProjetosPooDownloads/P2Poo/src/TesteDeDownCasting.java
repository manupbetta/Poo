import java.util.ArrayList;

public class TesteDeDownCasting {
	public static void main (String[] args) {
		ArrayList<Forma> formas = TesteFormas.criaFormas(5);
		
		System.out.println("=== IMPRIMINDO ATRIBUTOS ESPECÍFICOS (DOWNCASTING) ===\n");
		
		for(int i = 0; i < formas.size(); i++) {
			Forma f = formas.get(i);
			System.out.println("Forma [" + i + "]: " + f.getClass().getSimpleName());
			
			if (f instanceof Retangulo && !(f instanceof Quadrado)) {
				Retangulo r = (Retangulo) f;
				System.out.printf(" > Largura: %.2f | Comprimento: %.2f%n", r.getLargura(), r.getComprimento());
			} else if(f instanceof Quadrado) {
				Quadrado q = (Quadrado) f;
				System.out.printf(" > Lado: %.2f%n", q.getLado());
			} else if(f instanceof Circulo) {
				Circulo c = (Circulo) f;
				System.out.printf(" > Raio: %.2f%n", c.getRaio());
			} else if(f instanceof Elipse) {
				Elipse e = (Elipse) f;
				System.out.printf(" > Eixo Maior (a): %.2f | Eixo Menor (b): %.2f%n", e.getA(), e.getB());
			}
			
			if (f instanceof Excentricidade) {
				Excentricidade e = (Excentricidade) f;
				System.err.printf(" > Excentricidade: %.4f%n", e.calcularExcentricidade());
			}
		    
			f.imprimir();
		    System.out.println("------------------------------------");
		}
	}
}
