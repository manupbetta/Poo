
public class InstalacaoFoca extends Instalacao{
	public InstalacaoFoca(Localização localizacao) {
		super(5, localizacao, 15.0);
		adicionarElemento(new Tanque(100));
	}
}
