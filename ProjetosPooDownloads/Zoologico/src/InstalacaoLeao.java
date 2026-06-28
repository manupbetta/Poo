
public class InstalacaoLeao extends Instalacao{
	public InstalacaoLeao(Localização localizacao) {
		super(3, localizacao, 21.5);
		adicionarElemento(new Jaula(20, 30, 25));
	}
}
