
public class InstalacaoBaleia extends Instalacao{
	public InstalacaoBaleia(Localização localizacao) {
		super(2, localizacao, 19.0);
		adicionarElemento(new Tanque(1000));
	}
}
