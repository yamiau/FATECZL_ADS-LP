import javax.swing.*;

public class Movimentar {
	public void main(Contas[] contas, Movimento[] movimento) {
		Movimento(contas);
	}
	
	private static void Movimento(Contas[] contas) {
		
		int codOrigem = Integer.parseInt(JOptionPane.showInputDialog("C�digo da conta origem"));	
		for (int i = 0; i <= contas.length; i++) {
			if ( i == contas.length) {
				JOptionPane.showMessageDialog(null, "A conta origem n�o existe");
				Movimento(contas);
			} else if (codOrigem == contas[i].getCodConta()) {
				break;
			}	
		}
		
		int codDestino = Integer.parseInt(JOptionPane.showInputDialog("C�digo da conta destino"));
		for (int i = 0; i <= contas.length; i++) {
			if ( i == contas.length) {
				JOptionPane.showMessageDialog(null, "A conta destino n�o existe");
				Movimento(contas);
			} else if (codDestino == contas[i].getCodConta()) {
				break;
			}	
		}
		
		contas[codDestino].addSaldo(Integer.parseInt(JOptionPane.showInputDialog("Valor a ser adicionado")));
	}		
}
