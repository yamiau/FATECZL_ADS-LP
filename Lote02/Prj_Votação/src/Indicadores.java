import javax.swing.JOptionPane;

public class Indicadores {
	public void main (Votacao2019[] votos) {
		Mensagens msg = new Mensagens();
		
		int op = 0;
		
		while (op !=9) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(msg.OpcoesIndicadores()));
			
			switch (op) {
			case 1:
				break;
			case 2: 
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				Menu.main(null);
			default:
				JOptionPane.showMessageDialog(null, msg.Erro());
				break;
			}
		}
	}
}
