package com.aish.assignment1;

public class Sort10 {
	static int largest(int a[]) {
		int larger = a[0], i;
		for (i = 1; i < 10; i++) {
			if (a[i] > larger)
				larger = a[i];
		}
		return larger;
	}

	static void frequency(int a[]) {
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
		frequency(a);
		return a;
	}

	static int getMedian(int ar1[], int ar2[], int n) {
		int i = 0;
		int j = 0;
		int count;
		int m1 = -1, m2 = -1;
		for (count = 0; count <= n; count++) {
			if (i == n) {
				m1 = m2;
				m2 = ar2[0];
				break;
			} else if (j == n) {
				m1 = m2;
				m2 = ar1[0];
				break;
			}
			if (ar1[i] <= ar2[j]) {
				m1 = m2;
				m2 = ar1[i];
				i++;
			} else {
				m1 = m2;
				m2 = ar2[j];
				j++;
			}
		}
		return (m1 + m2) / 2;
	}

	public boolean q2(int ar1[], int ar2[], int n) {
		int n1 = ar1.length;
		int n2 = ar2.length;
		if (n1 == n2)
			return true;
		else
			return false;
	}
	static int temp;

	static void list(int a[], int n) {
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

	public int[] q3(int a[], int n) {
		list(a, n);
		return a;
	}

	static int maxRepeating(int arr[], int n, int k) {
		for (int i = 0; i < n; i++)
			arr[(arr[i] % k)] += k;
		int max = arr[0], result = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = i;
			}
		}
		return result;
	}

	public int q4(int arr[], int n, int k) {
		maxRepeating(arr, n, k);
		return n;
	}
	   
    
}  

      

