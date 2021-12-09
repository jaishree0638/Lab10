public class SelectionSort {
	private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * precondition: x is not empty
     * post-condition: sorted array is returned
     * inputs: an array of integers
     * outputs: a sorted array of integers
     * special conditions: only one element in the array
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method

}
