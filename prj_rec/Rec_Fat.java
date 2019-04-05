import javax.swing.JOptionPane;


public class Rec_Fat {
	public static void main(String args[]) {
	
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro e receba seu fatorial"));
		
		System.out.print(ffat(num));
			
	}

	static int ffat(int n) {
		
		int fat = 1;
		
		if (n != 1) {
			fat = n * ffat(n-1);
			return fat;
		} else {
			return n;
		}
		
	}
}
