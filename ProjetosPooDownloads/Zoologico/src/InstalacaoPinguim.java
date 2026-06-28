
public class InstalacaoPinguim extends Instalacao{
	public InstalacaoPinguim(Localização localizacao) {
		super(25, localizacao, 15.0);
		adicionarElemento(new Tanque(100));
	}
}
