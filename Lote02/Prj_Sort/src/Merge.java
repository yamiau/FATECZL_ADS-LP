class Merge {
    public Object[] ReturnSorted(Object[] my_array){
        
    	return(Divide(my_array));
    }
    
    private static Object[] Divide(Object[] my_array){
        
    	Divide(my_array, null, 0, my_array.length);            
        return my_array;
        }
        
    private static Object[] Divide(Object[] my_array, Object[] temp, int leftstart, int rightend){
    	
    	int midpoint = 0;
    	
    	if ((my_array.length % 2) == 0) {
    		midpoint = (rightend / 2);

    	} else {
        	midpoint = (rightend / 2) + 1;
    	}
    	
    	Object[] temp2 = new Object[midpoint];
    	
    	System.arraycopy(my_array, leftstart, temp2, leftstart,  midpoint);
    	Divide(my_array, temp2, leftstart, midpoint);
    	Conquer(temp2, leftstart, midpoint);
    	
    	System.arraycopy(my_array, midpoint, temp2, midpoint, temp2.length);
    	System.out.println((temp2));
    	Divide(my_array, temp2, midpoint, temp2.length);
    	Conquer(temp2, midpoint, temp.length);
    	
        return my_array;
    }
    
    private static void Conquer(Object[] temp, int leftstart, int rightend) {
    	
    	if (rightend < (leftstart + 2)) {
    		for (int i = 0; i < rightend; i++) {
    			for (int j = i+1; j <= rightend; j++) {
    				if ((int) temp[j] < (int)temp[i]) {
    					int z = (int) temp[j];
    					temp[j] = temp[i];
    					temp[i] = z; 
    				}
    			}
    		}
    	}
    	Merge(my_array, temp);
    }
    
    private static void MergeParts(Object[] my_array, int[] temp, int leftstart, int rightend){
        int leftend = ((leftstart+rightend)/2);
        int rightstart = (leftend + 1);
        int size = (rightstart - leftstart + 1);
        
        if (size <= 3) {
        	for (int i = leftstart; i <= rightend; i++  ) {
        		if (my_array[i] > my_array[i+1]) {
        			
        		}
        	}
        }
     
        
        System.arraycopy(my_array, left, temp, index, (leftstart - left + 1));
        System.arraycopy(my_array, right, temp, index, (rightstart - right + 1));
        System.arraycopy(temp, leftstart, my_array, leftstart, (size));
    }
}
