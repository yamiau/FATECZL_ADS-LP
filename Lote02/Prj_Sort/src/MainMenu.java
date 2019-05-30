import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;

public class MainMenu {
	public static void main(String args[]) {
		
		int op = 0;
		ArrayList<Integer> my_list = new ArrayList<Integer>();
		Menu(op, my_list);
	}

	private static void Menu(int op, ArrayList<Integer> my_list) {
		
		ArrayGen arraygen = new ArrayGen();
		int x = arraygen.getArraySize();
		
		my_list = arraygen.ReturnList(my_list, x);
		Object[] my_array = my_list.toArray();
		
		JOptionPane.showMessageDialog(null, "An array of " + x + " indexes has arrived! `(°^°)");
		System.out.println(Arrays.toString(my_array));
		Menu(op, my_list, my_array);
	}

	private static void Menu(int op, ArrayList<Integer> my_list, Object[] my_array) {
		
		while (op != 9) {

			op = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Sortie menu\n" 
				+ "I am here to help you! (°u°)\n" 
				+ "1-Generate a new array\n"
				+ "2-Quick sort\n"
				+ "3-Bubble sort\n" 
				+ "4-Merge sort\n" 
				+ "9-Exit"));

			switch (op) {

			case 1:
				ArrayGen arraygen = new ArrayGen();
				int x = arraygen.getArraySize();
				
				my_array = new Object[x];
				my_array = arraygen.ReturnArray(my_array, x);
				
				JOptionPane.showMessageDialog(null, "An array of " + x + " indexes has arrived!" + " `(°^°)");
				System.out.println(Arrays.toString(my_array));
				Menu(op, my_list, my_array);
				break;
			case 2:
				Quick quick = new Quick();
				my_array = quick.ReturnSorted(my_array);
				
				JOptionPane.showMessageDialog(null,  Message(op));
				System.out.println(Arrays.toString(my_array));
				break;
			case 3:
				Bubble bubble = new Bubble();
				my_array = bubble.ReturnSorted(my_array);
				
				JOptionPane.showMessageDialog(null,  Message(op));
				System.out.println(Arrays.toString(my_array));
				break;
			case 4:
				Merge merge = new Merge();
				my_array = merge.ReturnSorted(my_array);
				
				JOptionPane.showMessageDialog(null,  Message(op));
				System.out.println(Arrays.toString(my_array));
				break;
			case 9:
				JOptionPane.showMessageDialog(null,  Message(op));
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "That is an invalid operation!" + " (ò—ó)");
			}
		}
	}
	
	private static String Message(int c) {
		
		switch (c) {
		case 2: case 3: case 4:
			return "Order is coming `(°>°`)";
		case 9:
			return "Thank you for using this program (°3°)/"; 
		}
		return null;
	}
}
