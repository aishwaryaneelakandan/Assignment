package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sort9Test {

	@Test
	void QuickSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q1(a, 0, 3));
	}

	@Test
	void BubbleSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q2(a));
	}

	@Test
	void RadixSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		assertArrayEquals(new int[] { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 }, s1.q3(a));
	}

	@Test
	void MergeSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q4(a, 0, 3));
	}

	@Test
	void HeapSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 12, 11, 13, 5, 6, 7 };
		assertArrayEquals(new int[] { 5, 6, 7, 11, 12, 13 }, s1.q5(a));
	}

	@Test
	void SelectionSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
		assertArrayEquals(new int[] { 7, 9, 10, 12, 23, 23, 34, 44, 78, 101 }, s1.q6(a, 10, 9));
	}

	@Test
	void InsertionSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q7(a));
	}

	@Test
	void BeadSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		assertArrayEquals(new int[] { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 }, s1.q8(a));
	}

	@Test
	void BogoSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		assertArrayEquals(new int[] { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 }, s1.q9(a));
	}

	@Test
	void CockTailSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q10(a, 3));
	}

	@Test
	void CombSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q11(a));
	}

	@Test
	void CountSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q12(a, 3));
	}

	@Test
	void GnomeSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q13(a, 3));
	}

	@Test
	void PancakeSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q14(a, 3));
	}

	@Test
	void PermutationSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q15(a, 3));
	}

	@Test
	void ShellSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q16(a));
	}

	@Test
	void SleepSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 70, 90, 100, 60 }, s1.q17(a, 3));
	}

	@Test
	void StoogeSort() {
		Sort9 s1 = new Sort9();
		int a[] = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q18(a, 0, 3));
	}

	@Test
	void BucketSort() {
		Sort9 s1 = new Sort9();
		int[] a = { 90, 70, 100, 60 };
		assertArrayEquals(new int[] { 60, 70, 90, 100 }, s1.q19(a));
	}
}
