import javax.swing.JOptionPane;

public class Consultar {
	public void main(Contas[] contas, Movimento[] movimento) {
		
		int op = 0;
		
		while (op != 9) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Contas Correntes\n"
					+ "2 - Movimento\n"
					+ "3 - Atualizado\n"
					+ "9 - Retornar"));
			
			switch (op) {
			
			case 1:
				int term = Integer.parseInt(JOptionPane.showInputDialog("Número da conta"));
				for (int i = 0; i < contas.length; i++) {
					if (term == contas[i].getCodConta()) {
						System.out.println(contas[i].getCodConta());
						System.out.println(contas[i].getTipo());
						System.out.println(contas[i].getNomeCliente());
						System.out.println(contas[i].getSaldo());
					}
				}
				break;
			case 2:
				term = Integer.parseInt(JOptionPane.showInputDialog("Número da conta"));
				for (int i = 0; i < movimento.length; i++) {
					if (term == movimento[i].getCodConta()) {
						System.out.println("Movimentações realizadas na conta " + movimento[i].getCodConta() + ": \n");
						System.out.println(movimento[i].getValorMovimento());
						System.out.println(movimento[i].getTipoMovimento());
						System.out.println(movimento[i].getStatusMovimento());
					}
				}
				break;
			case 3:
				break;
			case 9:
				Menu menu = new Menu();
				menu.main(null);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;				
			}
		}
	}
}
