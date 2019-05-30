
public class Classificar {
	public void main(Votacao2019[] votos) {
		BubbleSort(votos);
	}

	private static Votacao2019[] BubbleSort(Votacao2019[] votos) {

		Votacao2019 troca = new Votacao2019();

		for (int i = 0; i < votos.length -1; i++) {
			for (int j = i+1; j < votos.length; j++) {
				if (votos[i].getNumSecao() > votos[j].getNumSecao()) {
					troca = votos[j];
					votos[j] = votos[i];
					votos[i] = troca;
				}
			}
		}

		for (int i = 0; i < votos.length; i++) {
			System.out.println(votos[i].getNumSecao());
			System.out.println(votos[i].getNumCandidato());	
		}

		return votos;
	}
}
