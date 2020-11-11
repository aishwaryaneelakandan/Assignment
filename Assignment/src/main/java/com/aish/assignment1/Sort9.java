package com.aish.assignment1;

public class Sort9 {
	public static int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}

	static void quickSort(int array[], int low, int high) {

		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	public int[] q1(int array[], int low, int high) {
		quickSort(array, low, high);
		return array;
	}

	public int[] q2(int a[]) {
		int k = a.length;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	static int largest(int a[]) {
		int larger = a[0], i;
		for (i = 1; i < 10; i++) {
			if (a[i] > larger)
				larger = a[i];
		}
		return larger;
	}

	static void radix_sort(int a[]) {
		int bucket[][] = new int[10][10];
		int bucket_count[] = new int[10];
		int i, j, k, remainder, NOP = 0, divisor = 1, larger, pass;
		larger = largest(a);
		while (larger > 0) {
			NOP++;
			larger /= 10;
		}
		for (pass = 0; pass < NOP; pass++) {
			for (i = 0; i < 10; i++)
				bucket_count[i] = 0;
			for (i = 0; i < 10; i++) {
				remainder = (a[i] / divisor) % 10;
				bucket[remainder][bucket_count[remainder]] = a[i];
				bucket_count[remainder] += 1;
			}
			i = 0;
			for (k = 0; k < 10; k++) {
				for (j = 0; j < bucket_count[k]; j++) {
					a[i] = bucket[k][j];
					i++;
				}
			}
			divisor *= 10;
		}
	}

	public int[] q3(int a[]) {
		radix_sort(a);
		return a;
	}

	public static int sort(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}

	static void mergeSort(int array[], int low, int high) {

		if (low < high) {
			int pi = partition(array, low, high);
			mergeSort(array, low, pi - 1);
			mergeSort(array, pi + 1, high);
		}
	}

	public int[] q4(int array[], int low, int high) {
		mergeSort(array, low, high);
		return array;
	}

	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr[l] > arr[largest])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, n, largest);
		}
	}

	public int[] q5(int arr[]) {
		sort(arr);
		return arr;
	}

	public static int smallest(int a[], int n, int i) {
		int small, pos, j;
		small = a[i];
		pos = i;
		for (j = i + 1; j < 10; j++) {
			if (a[j] < small) {
				small = a[j];
				pos = j;
			}
		}
		return pos;
	}

	public int[] q6(int a[], int n, int i) {
		int pos, temp;
		for (i = 0; i < 10; i++) {
			pos = smallest(a, n, i);
			temp = a[i];
			a[i] = a[pos];
			a[pos] = temp;
		}
		return a;
	}

	public int[] q7(int a[]) {
		int m = a.length;
		for (int k = 1; k < m; k++) {
			int temp = a[k];
			int j = k - 1;
			while (j >= 0 && temp <= a[j]) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
		return a;
	}

	static int sort1(int a[]) {
		int larger = a[0], i;
		for (i = 1; i < 10; i++) {
			if (a[i] > larger)
				larger = a[i];
		}
		return larger;
	}

	static void beadsort(int a[]) {
		int bucket[][] = new int[10][10];
		int bucket_count[] = new int[10];
		int i, j, k, remainder, NOP = 0, divisor = 1, larger, pass;
		larger = largest(a);
		while (larger > 0) {
			NOP++;
			larger /= 10;
		}
		for (pass = 0; pass < NOP; pass++) {
			for (i = 0; i < 10; i++)
				bucket_count[i] = 0;
			for (i = 0; i < 10; i++) {
				remainder = (a[i] / divisor) % 10;
				bucket[remainder][bucket_count[remainder]] = a[i];
				bucket_count[remainder] += 1;
			}
			i = 0;
			for (k = 0; k < 10; k++) {
				for (j = 0; j < bucket_count[k]; j++) {
					a[i] = bucket[k][j];
					i++;
				}
			}
			divisor *= 10;
		}
	}

	public int[] q8(int a[]) {
		beadsort(a);
		return a;
	}

	static int sort2(int a[]) {
		int larger = a[0], i;
		for (i = 1; i < 10; i++) {
			if (a[i] > larger)
				larger = a[i];
		}
		return larger;
	}

	static void bogosort(int a[]) {
		int bucket[][] = new int[10][10];
		int bucket_count[] = new int[10];
		int i, j, k, remainder, NOP = 0, divisor = 1, larger, pass;
		larger = largest(a);
		while (larger > 0) {
			NOP++;
			larger /= 10;
		}
		for (pass = 0; pass < NOP; pass++) {
			for (i = 0; i < 10; i++)
				bucket_count[i] = 0;
			for (i = 0; i < 10; i++) {
				remainder = (a[i] / divisor) % 10;
				bucket[remainder][bucket_count[remainder]] = a[i];
				bucket_count[remainder] += 1;
			}
			i = 0;
			for (k = 0; k < 10; k++) {
				for (j = 0; j < bucket_count[k]; j++) {
					a[i] = bucket[k][j];
					i++;
				}
			}
			divisor *= 10;
		}
	}

	public int[] q9(int a[]) {
		bogosort(a);
		return a;
	}

	static int temp;

	static void Cocktail(int a[], int n) {
		boolean is_swapped = true;
		int begin = 0, i;
		int end = n - 1;

		while (is_swapped) {
			is_swapped = false;
			for (i = begin; i < end; ++i) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					is_swapped = true;
				}
			}
			if (!is_swapped)
				break;
			is_swapped = false;
			for (i = end - 1; i >= begin; --i) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					is_swapped = true;
				}
			}
			++begin;
		}
	}

	public int[] q10(int a[], int n) {
		Cocktail(a, n);
		return a;
	}

	int getNextGap(int gap) {
		gap = (gap * 10) / 13;
		if (gap < 1)
			return 1;
		return gap;
	}

	void sort4(int arr[]) {
		int n = arr.length;
		int gap = n;
		boolean swapped = true;
		while (gap != 1 || swapped == true) {
			gap = getNextGap(gap);
			swapped = false;
			for (int i = 0; i < n - gap; i++) {
				if (arr[i] > arr[i + gap]) {
					int temp = arr[i];
					arr[i] = arr[i + gap];
					arr[i + gap] = temp;
					swapped = true;
				}
			}
		}
	}

	public int[] q11(int arr[]) {
		sort(arr);
		return arr;
	}

	void countSort(int array[], int size) {
		int[] output = new int[size + 1];
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}

	public int[] q12(int array[], int size) {
		countSort(array, size);
		return array;
	}

	static void gnomeSort(int arr[], int n) {
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index] >= arr[index - 1])
				index++;
			else {
				int temp = 0;
				temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		return;
	}

	public int[] q13(int arr[], int n) {
		gnomeSort(arr, n);
		return arr;
	}

	static void flip(int arr[], int i) {
		int temp, start = 0;
		while (start < i) {
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			start++;
			i--;
		}
	}

	static int findMax(int arr[], int n) {
		int mi, i;
		for (mi = 0, i = 0; i < n; ++i)
			if (arr[i] > arr[mi])
				mi = i;
		return mi;
	}

	static int pancakeSort(int arr[], int n) {
		for (int curr_size = n; curr_size > 1; --curr_size) {
			int mi = findMax(arr, curr_size);
			if (mi != curr_size - 1) {
				flip(arr, mi);
				flip(arr, curr_size - 1);
			}
		}
		return 0;
	}

	public int[] q14(int arr[], int n) {
		pancakeSort(arr, n);
		return arr;
	}

	void permutationSort(int array[], int size) {
		int[] output = new int[size + 1];
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}

	public int[] q15(int array[], int size) {
		countSort(array, size);
		return array;
	}

	int sort5(int arr[]) {
		int n = arr.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];
				arr[j] = temp;
			}
		}
		return 0;
	}

	public int[] q16(int arr[]) {
		sort5(arr);
		return arr;
	}

	static void sleepSort(int arr[], int n) {
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index] >= arr[index - 1])
				index++;
			else {
				int temp = 0;
				temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		return;
	}

	public int[] q17(int arr[], int n) {
		gnomeSort(arr, n);
		return arr;
	}

	static void stoogesort(int arr[], int l, int h) {
		if (l >= h)
			return;
		if (arr[l] > arr[h]) {
			int t = arr[l];
			arr[l] = arr[h];
			arr[h] = t;
		}
		if (h - l + 1 > 2) {
			int t = (h - l + 1) / 3;
			stoogesort(arr, l, h - t);
			stoogesort(arr, l + t, h);
			stoogesort(arr, l, h - t);
		}
	}

	public int[] q18(int arr[], int l, int h) {
		stoogesort(arr, l, h);
		return arr;
	}

	public int[] q19(int a[]) {
		int k = a.length;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
