import java.lang.*;
import javax.swing.JOptionPane;

public class Registrar {
	public void Votos(Votacao2019[] votos) {
		
		for (int i = 0; i < votos.length; i++) {
			votos[i].setNumSecao(i);
			votos[i].setNumCandidato(i);
		}
		
		JOptionPane.showMessageDialog(null, "Votos registrados!"); 
	}
}
