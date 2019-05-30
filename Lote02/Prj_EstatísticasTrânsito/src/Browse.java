import javax.swing.JOptionPane;

public class Browse {
	
	public void ByCity(Stats[] stats, int lang) {
		Messages msg = new Messages();
		String term_one = JOptionPane.showInputDialog(msg.Inserting(lang, 0));
		int term_two = Integer.parseInt(JOptionPane.showInputDialog(msg.Inserting(lang, 1)));
		int j = 0;

		for (int i = 0; i < stats.length; i++) {
			if (term_one.equals(stats[i].getName()) & term_two == stats[i].getCode()) {
				if (j < 1) {
					System.out.println(msg.Found(lang));
					System.out.println("");
				}
				msg.FoundResults(lang, stats, i);
				j++;
			}
		}

		if (j < 1) {
			JOptionPane.showMessageDialog(null, msg.NotFound(lang));
		}
	}

	public void ByAccidents(Stats[] stats, int lang) {
		Messages msg = new Messages();
		int term = Integer.parseInt(JOptionPane.showInputDialog(msg.Inserting(lang, 2)));
		int j = 0;

		for (int i = 0; i < stats.length; i++) {
			if (term == stats[i].getAccidents()) {
				if (j < 1) {
					System.out.println(msg.Found(lang));
					System.out.println("");
				}
				msg.FoundResults(lang, stats, i);
				j++;
			}
		}

		if (j < 1) {
			JOptionPane.showMessageDialog(null, msg.NotFound(lang));
		}
	}

	public void ByVehicle(Stats[] stats, int lang) {
		Messages msg = new Messages();
		int term = Integer.parseInt(JOptionPane.showInputDialog(msg.Inserting(lang, 3)));
		int j = 0;

		for (int i = 0; i < stats.length; i++) {
			if (term == stats[i].getVehicle()) {
				if (j < 1) {
					System.out.println(msg.Found(lang));
					System.out.println("");
				}
				msg.FoundResults(lang, stats, i);
				j++;
			}
		}

		if (j < 1) {
			JOptionPane.showMessageDialog(null, msg.NotFound(lang));
		}
	}

	public void ByGeneral(Stats[] stats, int lang) {
		Messages msg = new Messages();
		int min = 0;
		int max = 0;
		double avg = 0;
		msg.GeneralResults(lang, stats, min, max, avg);		
	}
}
