import com.example.sorting.ISorting;
import com.example.sorting.impl.ISortingImpl;

public class SortingDriver {
	
	int[] inputSet = {26,54,93,17,77,31,44,55,20};
	
	public static void main(String[] args) {
		
		ISorting sorter = new ISortingImpl();
		System.out.println("Selection Sort");
		sorter.selectionSort(new SortingDriver().inputSet);
		System.out.println("\nInsertion Sort");
		sorter.insertionSort(new SortingDriver().inputSet);
		System.out.println("\nBubble Sort");
		sorter.bubbleSort(new SortingDriver().inputSet);
		System.out.println("\nMerge Sort");
		sorter.mergeSort(new SortingDriver().inputSet);
	}

}
