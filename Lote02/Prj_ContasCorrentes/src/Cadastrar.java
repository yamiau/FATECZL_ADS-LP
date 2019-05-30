import java.io.*;
import javax.swing.JOptionPane;

public class Cadastrar {
	public void CadastrarConta(Contas[] contas) throws IOException {
	
		for (int i = 0; i < contas.length; i++) {
			contas[i].setCodConta(Integer.parseInt(JOptionPane.showInputDialog("Código da conta")));
			contas[i].setNomeCliente(JOptionPane.showInputDialog("Nome do cliente"));
			contas[i].setLimite(Integer.parseInt(JOptionPane.showInputDialog("Limite da conta \n"
					+ "Insira 0 para ilimitada")));
			contas[i].setTipo(Integer.parseInt(JOptionPane.showInputDialog("Tipo da Conta"
					+ "1 - Física\n"
					+ "2 - Conjunta\n"
					+ "3 - Jurídica\n"
					+ "4 - Especial")));
		}
		
		Gravar(contas);
	}
	
	private void Gravar(Contas[] contas) throws IOException {
		
		String filename = "Contas.txt";
	
		BufferedWriter buffer = new BufferedWriter(new FileWriter(filename));
		
		for (int i = 0; i < contas.length; i++) {
			buffer.newLine();
			buffer.write(contas[i].getCodConta());
			buffer.newLine();
			buffer.write(contas[i].getNomeCliente());
			buffer.newLine();
			buffer.write(Double.toString(contas[i].getLimite()));
			buffer.newLine();
			buffer.write(contas[i].getTipo());
			buffer.newLine();
		}	buffer.close();
	}
}
