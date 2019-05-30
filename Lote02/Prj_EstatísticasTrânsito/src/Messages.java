public class Messages {
	public String LangSelect() {
		String msg = "Select your Language:\n"
				+ "1 - English\n"
				+ "2 - Français\n"
				+ "3 - Português";
		return msg; 
	}
	
	public String Options(int lang) {
		
		String[] msg = new String[3];
		
		msg[0] =  "1 - Register new \n"
				+ "2 - Browse Vehicle \n"
				+ "3 - Browse Number of Accidents \n"
				+ "4 - Browse City Name and Code \n"
				+ "5 - View General Stats \n"
				+ "9 - End";
		
		msg[1] =  "1 - Enregistrer nouveau \n"
				+ "2 - Consulter Véhicule \n"
				+ "3 - Consulter Nombre d'Accidents \n"
				+ "4 - Consulter Nom et Code de Ville \n"
				+ "5 - Voir Statistiques Génerales \n"
				+ "9 - Finir";
				
		msg[2] =  "1 - Cadastrar novo \n"
				+ "2 - Consultar Veículo \n"
				+ "3 - Consultar Número de Acidentes \n"
				+ "4 - Consultar Nome e Código da Cidade \n"
				+ "5 - Ver Estatísticas Gerais \n"
				+ "9 - Finalizar";
		
		return msg[lang];
	}
	
	public String Error(int lang) {
		String[] msg = new String[3];
		
		msg[0] ="Invalid option!";
		msg[1] ="Option invalide!";
		msg[2] ="Opção inválida";
		
		return msg[lang];
	}
	
	public String Inserting(int lang, int instance) {
		
		String[][] msg = new String[3][4];
		
		msg[0][0] = "Insert City Name";
		msg[0][1] = "Insert City Code";
		msg[0][2] = "Insert Number of Accidents";
		msg[0][3] = "Insert Vehicle Code \n"
				+ "1 - Car \n"
				+ "2 - Truck \n"
				+ "3 - Motorcycle";
		
		msg[1][0] = "Insérez Nom de Ville";
		msg[1][1] = "Insérez Code de Ville";
		msg[1][2] = "Insérez Nombre d'Accidents";
		msg[1][3] = "Insérez Code de Véhicule \n"
				+ "1 - Voiture \n"
				+ "2 - Camion \n"
				+ "3 - Moto";
		
		msg[2][0] = "Insira o Nome da Cidade";
		msg[2][1] = "Insira Código da Cidade";
		msg[2][2] = "Insira Número de Acidentes";
		msg[2][3] = "Insira Código de Veículo \n"
				+ "1 - Carro \n"
				+ "2 - Caminhão \n"
				+ "3 - Moto";
			
		return msg[lang][instance];
	}
	
	public String Found(int lang) {
		String[] msg = new String[3];
		
		msg[0] = "Results found:";
		msg[1] = "Résultats trouvés:";
		msg[2] = "Resultados encontrados:.";
		
		return msg[lang];
	}
	
	public void FoundResults(int lang, Stats[] stats, int i) {
				
		switch (lang) {
			case 0:
				System.out.println("City: " + stats[i].getName());
				System.out.println("Code: " + stats[i].getCode());
				System.out.println("Number of accidents: " + stats[i].getAccidents());
				System.out.println("Vehicle code: " + stats[i].getVehicle());
				System.out.println("");	
				break;
			case 1:
				System.out.println("Ville: " + stats[i].getName());
				System.out.println("Code: " + stats[i].getCode());
				System.out.println("Nombre d'accidents: " + stats[i].getAccidents());
				System.out.println("Code de véhicule: " + stats[i].getVehicle());
				System.out.println("");	
				break;
			case 2:
				System.out.println("Cidade: " + stats[i].getName());
				System.out.println("Código: " + stats[i].getCode());
				System.out.println("Número de acidentes: " + stats[i].getAccidents());
				System.out.println("Código de veículo: " + stats[i].getVehicle());
				System.out.println("");	
				break;
		}
	}
	
	public String NotFound(int lang) {
		String[] msg = new String[3];
		
		msg[0] = "Your term was not found.";
		msg[1] = "Votre term n'avais pas eté trouvé.";
		msg[2] = "Seu termo não foi encontrado.";
		
		return msg[lang];
	}
	
	public String GeneralStats(int lang, int instance) {
		String[][] msg = new String[3][3];
		
		msg[0][0] = "City with the fewest accidents: \n";
		msg[0][1] = "City with the most accidents: \n";
		msg[0][2] = "Cities with an above-average number of accidents: \n";
		
		msg[1][0] = "Ville avec le moins accidents: \n ";
		msg[1][1] = "Ville avec le plus accidents: \n";
		msg[1][2] = "Villes avec le nombre d'accidents au dessus de la moyenne: \n";
		
		msg[2][0] = "Cidade com menor número de acidentes: \n";
		msg[2][1] = "Cidade com maior número de acidentes: \n";
		msg[2][2] = "Cidades com número de acidentes acima da média: \n";
		
		return msg[lang][instance];
	}
	
	public void GeneralResults(int lang, Stats[] stats, int min, int max, double avg) {
		
		int i = 0;
		
		for (i = 0; i < stats.length; i++) {
			if (i == 0) {
				min = stats[i].getAccidents();
				max = stats[i].getAccidents();
			}
			if (stats[i].getAccidents() < min) {
				min = i;
			}
			if (stats[i].getAccidents() > max) {
				max = i;
			}
			avg += stats[i].getAccidents();
		}	avg /= stats.length;
		

		System.out.println(GeneralStats(lang, 0) + stats[min].getName());
		System.out.println(GeneralStats(lang, 1) + stats[max].getName());
		
		for (int j = 0; j < stats.length; j++) {
			if (avg < stats[j].getAccidents()) {
				System.out.println(GeneralStats(lang, 2) + stats[j].getName());
			}
		}
	}
}
