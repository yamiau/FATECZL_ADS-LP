import javax.swing.JOptionPane;

public class Menu {
	public void main(String args) {
		Cadastrar cad = new Cadastrar();
		Movimentar mov = new Movimentar();
		Atualizadas atual = new Atualizadas();
		Consultar cons = new Consultar();
		
		int op = 0;
		Contas contas[] = new Contas[5];
		Movimento movimento[] = new Movimento[5];
		
		while (op != 9) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Conta\n"
					+ "2 - Cadastrar Movimento\n"
					+ "3 - Gerar Contas Atualizadas\n"
					+ "4 - Consultar Cadastros\n"
					+ "9 - Finalizar"));
			
			switch (op) {
				case 1:
					cad.CadastrarConta(contas);
					break;
				case 2:
					mov.main(contas, movimento);
					break;
				case 3:
					atual.main();
					break;
				case 4:
					cons.main(contas, movimento);
					break;
				case 9:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida!");
					break;
			}
		}
		
		
	}
}
