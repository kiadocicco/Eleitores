
public class PercentualEleitores {

	public static void main(String[] args) {
		// Calcula o percentual de eleitores
		
		float n_eleitores=200;
		float votos_brancos=24;
		float votos_nulos=13;
		float votosvalidos=(n_eleitores-(votos_brancos+votos_nulos));
		float percent_nulos=((votos_nulos/votosvalidos)*100);
		float percent_brancos=((votos_brancos/votosvalidos)*100);
		
		System.out.println("O percentual de votos nulos é: "+percent_nulos+" %");
		System.out.println("O percentual de votos brancos é: "+percent_brancos+" %");
		

		
	}

}
