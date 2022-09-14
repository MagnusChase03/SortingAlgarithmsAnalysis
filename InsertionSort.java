
public class InsertionSort {

    private int comparions;
    private int movements;

	/**The method for sorting the numbers */
	public void insertionSort(int[] list) {

		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that 
			 * 	list[0..i] is sorted
			 */
			int currentElement = list[i];
			int k;
            comparions += 1;
			for (k = i-1; k>= 0 && list[k] > currentElement; k--) {

                comparions += 1;
                movements += 1;
				list[k+1] = list[k];

			}
			
			//insert the current element into list[k + 1]
            movements += 1;
			list[k + 1] = currentElement;
			
		}
	}

    public InsertionSort() {}

    public int getComparisons() {

        return comparions;

    }

    public int getMovements() {

        return movements;

    }
}
