
public class InstalacaoTubarao extends Instalacao{
	public InstalacaoTubarao(Localização localizacao) {
		super(2, localizacao, 22.0);
		adicionarElemento(new Tanque(500));
	}
}
