
public class SelectionSort {

    private int comparions;
    private int movements;

	/** The method for sorting the numbers */
	public void selectionSort(int[] list) { //int[] list?
        
		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
                
                comparions += 1;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {

                movements += 1;

				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

    public SelectionSort() {}

    public int getComparisons() {

            return comparions;

    }

    public int getMovements() {

        return movements;

    }
}
