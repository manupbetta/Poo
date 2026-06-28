
public class Circulo extends Elipse{
	public Circulo(double raio) {
		super(raio, raio);
	}
	
	public double getRaio() {
		return this.getA();
	}
	
	@Override
	public double calcularExcentricidade() {
		return 0.0;
	}
}
