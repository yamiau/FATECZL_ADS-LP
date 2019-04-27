import java.io.*;
import javax.swing.*;

public class Menu {
	public static void main(String args[]) throws IOException {
		//declaration
		int x = 5;
		Browse browse = new Browse();
		Messages msg = new Messages();
		Register reg = new Register();
		Stats[][] stats = new Stats[4][x];
		int lang = 0;
		int op = 0;
		
		//initialization		
		for (int i = 0; i < stats.length; i++) {
			for (int j = 0; j < stats[0].length; j++) {
				stats[i][j] = new Stats();
			}
		}
		
		//options
		while (op != 9) {
			op = Integer.parseInt(JOptionPane.showInputDialog(msg.Options(lang)));
			
			switch(op) {
				case 1:
					reg.main(stats, lang);
					break;
				case 2:
					
					break;
				
			}
		}
	}
}
