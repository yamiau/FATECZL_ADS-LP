import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.security.SecureRandom;

public class ArrayGen {

	public int getArraySize() {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Input the size of your array :D yay"));
		return (x);
	}

	public ArrayList<Integer> ReturnList(ArrayList<Integer> my_list, int x) {
		
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < x; i++) {
			my_list.add(random.nextInt(100));
		}
		return my_list;
	}
	
	public Object[] ReturnArray(Object[] my_array, int x) {
		
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < x; i++) {
			my_array[i] = random.nextInt(100);
		}
		return my_array;
	}
}
