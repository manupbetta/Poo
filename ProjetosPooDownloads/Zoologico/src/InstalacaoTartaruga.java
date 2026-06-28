
public class InstalacaoTartaruga extends Instalacao{
	public InstalacaoTartaruga(Localização localizacao) {
		super(17, localizacao, 20.0);
		adicionarElemento(new Tanque(200));
	}
}
