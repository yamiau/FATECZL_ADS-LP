import java.io.*;

import javax.swing.JOptionPane;

public class Register {
	public void main(Stats[] stats, int lang) throws IOException {

		Messages msg = new Messages();

		for (int i = 0; i < stats.length; i++) {
			stats[i].setName(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Inserting(lang, 0)));
			stats[i].setCode(Integer.parseInt(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Inserting(lang, 1))));
			stats[i].setAccidents(Integer.parseInt(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Inserting(lang, 2))));
			stats[i].setVehicle(Integer.parseInt(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Inserting(lang, 3))));
		}

		Write(stats, lang);
	}

	private static void Write(Stats[] stats, int lang) throws IOException {

		BufferedWriter buffer = new BufferedWriter(new FileWriter("Latest Logs.txt"));

		for (int i = 0; i < stats.length; i++) {

			buffer.write(stats[i].getName());
			buffer.newLine();
			buffer.write(Integer.toString(stats[i].getCode()));
			buffer.newLine();
			buffer.write(Integer.toString(stats[i].getAccidents()));
			buffer.newLine();
			buffer.write(Integer.toString(stats[i].getVehicle()));
			buffer.newLine();
		}	buffer.close();
	}
}
