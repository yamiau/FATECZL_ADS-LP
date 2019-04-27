import javax.swing.*;

public class Language {
	
	private int lang;

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		while (lang > 0 & lang < 4) {
			try {
				this.lang = lang;	
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
			}
		}
		
	}
	
}
