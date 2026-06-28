
public class InstalacaoElefante extends Instalacao{
	public InstalacaoElefante(Localização localizacao) {
		super(2, localizacao, 23.0);
		adicionarElemento(new Jaula(20, 30, 25));
	}
}
