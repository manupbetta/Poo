
public class InstalacaoMacaco extends Instalacao{
	public InstalacaoMacaco(Localização localizacao) {
		super(10, localizacao, 25.0);
		adicionarElemento(new Jaula(40, 35.7, 90));
	}
}
