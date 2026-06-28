
public class UltraCombat{

	public static void main(String[] args) {
	
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("Putscripst", "Brasil", 29, 1.63, 57.8, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 81.6, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 80.9, 13, 0, 2);
		l[4] = new Lutador("UCOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.6, 12, 2, 4);
	
		/*l[0].Status();
		l[3].setPeso(10);
		l[3].empatarLuta();
		l[3].Status();*/
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[4], l[5]);
		UEC01.lutar();
		l[4].Status();
		l[5].Status();
   }	
	
}

