
public class InstalacaoPeixe extends Instalacao{
	public InstalacaoPeixe(Localização localizacao) {
		super(7, localizacao, 18.0);
		adicionarElemento(new Tanque(750));
	}
}
