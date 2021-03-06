package ds;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = { 19, 20, 40, 40, 50, 60, 70, 12, 38 };
		System.out.println("Before Sorting" + Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println("After Sorting" + Arrays.toString(arr));
	}

	void bubbleSort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				// To sort in descending order, change > to < in this line.
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
