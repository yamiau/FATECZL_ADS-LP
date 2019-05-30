public class Mensagens {
	public String Opcoes() {
		
		String msg_opcoes = "SISTEMA DE VOTAÇÃO\n"
				+ "1 - Registrar Votos\n"
				+ "2 - Classificar Votos\n"
				+ "3 - Gravar Registros\n"
				+ "4 - Mostrar Indicadores\n"
				+ "9 - Finalizar";
		
		return msg_opcoes;
	}
	
	public String OpcoesIndicadores() {
		
		String msg_indicadores = "INDICADORES\n"
				+ "1 - Quantidade de eleitores por Seção\n"
				+ "2 - Seções com mais e menos eleitores\n"
				+ "3 - Quantidade de votos por Candidato\n"
				+ "4 - Ver os 10 Candidatos mais votados\n"
				+ "9 - Retornar";
		
		return msg_indicadores;
	}
	
	public String Erro() {
		
		String msg_erro = "Opção inválida!";
		
		return msg_erro;
	}
}
