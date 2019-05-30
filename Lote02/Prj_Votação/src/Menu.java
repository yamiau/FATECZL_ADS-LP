import javax.swing.*;

public class Menu {
	public static void main(String[] args) {
		Mensagens msg = new Mensagens();
		Votacao2019[] votos = new Votacao2019[10];
		
		for (int i = 0; i < votos.length; i++) {
			votos[i] = new Votacao2019();
		}
		
		int op = 0;
		
		while (op !=9) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(msg.Opcoes()));
			
			switch (op) {
			case 1:
				Registrar registrar = new Registrar();
				registrar.Votos(votos);
				break;
			case 2: 
				Classificar classificar = new Classificar();
				classificar.main(votos);
				break;
//			case 3:
//				Gravar gravar = new Gravar();
//				gravar.main(votos);
//				break;
			case 4:
				Indicadores indicadores = new Indicadores();
				indicadores.main(votos);
				break;
			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, msg.Erro());
				break;
			}
		}
	}
}

