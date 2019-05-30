import java.io.*;
import javax.swing.*;

public class Menu {
	public static void main(String[] args) throws IOException {
		Messages msg = new Messages();
		int lang = (-1)  + Integer.parseInt(JOptionPane.showInputDialog(msg.LangSelect()));
		
		main(lang);
	}
	
	public static void main(int lang) throws IOException{
		//declaration
		int op = 0;
		
		Browse browse = new Browse();
		Messages msg = new Messages();
		Register reg = new Register();
		Read read = new Read();
		Stats[] stats = new Stats[10];
				
		//initialization		
		for (int i = 0; i < stats.length; i++) {
			stats[i] = new Stats();
			}
		
		//options menu
		while (op != 9) {
			op = Integer.parseInt(JOptionPane.showInputDialog(msg.Options(lang)));
			
			switch(op) {
				case 0:
					read.main(stats, lang);
					break;
				case 1:
					reg.main(stats, lang);
					break;
				case 2:
					browse.ByVehicle(stats, lang);
					break;
				case 3:
					browse.ByAccidents(stats, lang);
					break;
				case 4:
					browse.ByCity(stats, lang);
					break;
				case 5:
					browse.ByGeneral(stats, lang);
					break;
				case 9:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, msg.Error(lang));
			}
		}
	}
}
