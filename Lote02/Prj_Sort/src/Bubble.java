
public class Bubble {

	public Object[] ReturnSorted(Object[] my_array) {
		
		return (BubbleSort(my_array));
	}

	private static Object[] BubbleSort(Object[] my_array) {
		
		for (int i = 0; i < my_array.length; i++) {
			for (int j = 0; j < my_array.length - 1 - i; j++) {
				if ((int) my_array[j] > (int) my_array[j + 1]) {
					int z = (int) my_array[j];
					my_array[j] = my_array[j + 1];
					my_array[j + 1] = z;
				}
			}
		}
		return my_array;
	}
}
