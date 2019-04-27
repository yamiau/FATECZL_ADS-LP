import java.io.*;

import javax.swing.JOptionPane;

public class Register {
	public void main(Stats[][] stats, int lang) throws IOException {
		
		Messages msg = new Messages();
		
		for (int i = 0; i < stats[0].length; i++) {
			int j = 0; 
			stats[j][i].setName(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Setting(lang, j)));
			j++;
			stats[j][i].setName(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Setting(lang, j)));
			j++;
			stats[j][i].setName(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Setting(lang, j)));
			j++;
			stats[j][i].setName(JOptionPane.showInputDialog("#" + (i+1) + "\n" + msg.Setting(lang, j)));
			
		}
		
		Write(stats, lang);
	}
	
	private static void Write(Stats[][] stats, int lang) throws IOException {
		
		BufferedWriter buffer = new BufferedWriter(new FileWriter("Latest Logs.txt"));

		for (int i = 0; i < stats[0].length; i++) {
			buffer.write("#" + i);
			buffer.newLine();
			int j = 0;
			
			buffer.write(stats[j][i].getName());
			buffer.newLine();
			j++;
			
			buffer.write(Integer.toString(stats[j][i].getCode()));
			buffer.newLine();
			j++;
			
			buffer.write(Integer.toString(stats[j][i].getAccidents()));
			buffer.newLine();
			j++;
			
			buffer.write(Integer.toString(stats[j][i].getVehicle()));
			buffer.newLine();
		}	buffer.close();
	}
}
