public class Messages {
	public String Options(int lang) {
		
		String[] msg = new String[3];
		
		msg[0] =  "1 - Register new \n"
				+ "2 - Browse Vehicle \n"
				+ "3 - Browse Number of Accidents \n"
				+ "4 - \n"
				+ "5 - View General Stats \n"
				+ "9 - End";
		
		msg[1] =  "1 - Enregistrer nouveau \n"
				+ "2 - Consulter Voiture \n"
				+ "3 - Consulter Nombre d'Accidents \n"
				+ "4 - \n"
				+ "5 - Voir Statistiques G�nerales \n"
				+ "9 - Finir";
				
		msg[2] =  "1 - Cadastrar novo \n"
				+ "2 - Consultar Ve�culo \n"
				+ "3 - Consultar N�mero de Acidentes \n"
				+ "4 - \n"
				+ "5 - Ver Estat�sticas Gerais \n"
				+ "9 - Finalizar";
		
		return msg[lang];
	}
	
	public String Setting(int lang, int j) {
		
		String[][] msg = new String[3][4];
		
		msg[0][0] = "Insert City Name";
		msg[0][1] = "Insert City Code";
		msg[0][2] = "Insert Number of Accidents";
		msg[0][3] = "Insert Vehicle Code";
		
		msg[1][0] = "Ins�rez Nom de Ville";
		msg[1][1] = "Ins�rez Code de Ville";
		msg[1][2] = "Ins�rez Nombre d'Accidents";
		msg[1][3] = "Ins�rez Code de Voiture";
		
		msg[2][0] = "Insira o Nome da Cidade";
		msg[2][1] = "Insira C�digo da Cidade";
		msg[2][2] = "Insira N�mero de Acidentes";
		msg[2][3] = "Insira C�digo de Ve�culo";
			
		return msg[lang][j];
	}
}
