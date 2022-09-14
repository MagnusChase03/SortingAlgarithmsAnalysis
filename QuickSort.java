public class QuickSort {

	private int comparions;
	private int movements;

	public void quickSort(int[] list) {
		quickSort(list, 0, list.length-1);
	}
	
	public void quickSort(int[] list, int first, int last) {
		comparions += 1;
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex -1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	/** Partition the array list[first..last] */
	public int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; //Index for backward search
		
		comparions += 1;
		while (high > low) {
			comparions += 3;
			// Search forward from left
			while (low <= high && list[low] <= pivot) {

				low++;
				comparions += 1;

			}
			
			// Search backward from right
			while (low <= high && list[high] > pivot) {

				high--;
				comparions += 1;

			}
			
			//	Swap two elements in the list
			comparions += 1;
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				movements += 1;
			}
		}
		
		comparions += 1;
		while (high > first && list[high] >= pivot) {
			
			high--;
			comparions += 1;

		}
		
		//	Swap pivot with list[high]
		comparions += 1;
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot; 
			movements += 1;
			return high;
		}
		else {
			return first;
		}
	}

	public int getComparisons() {

		return comparions;

	}

	public int getMovements() {

		return movements;

	}
}
