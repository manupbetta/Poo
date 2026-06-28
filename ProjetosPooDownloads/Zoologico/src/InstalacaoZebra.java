
public class InstalacaoZebra extends Instalacao{
	public InstalacaoZebra(Localização localizacao) {
		super(2, localizacao, 24.0);
		adicionarElemento(new Jaula(20, 30, 25));
	}
}
