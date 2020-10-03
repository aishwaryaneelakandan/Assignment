package com.aish.assignment1;

public class CompareAgain {
	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val)
				if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i])
					if (nums[i + 1] > nums[i - 1])
						nums[i] = nums[i + 1];
					else if (nums[i + 1] < nums[i - 1])
						nums[i] = nums[i - 1];
		}
		return nums;
	}

	public int[] zeroMax(int[] nums) {
		int max = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 != 0)
				max = Math.max(max, nums[i]);
			if (nums[i] == 0)
				nums[i] = max;
		}
		return nums;
	}

	public int centeredAverage(int[] nums) {
		int sum = 0;
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		return (sum - min - max) / (nums.length - 2);
	}

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;
		}
		return false;
	}

	public boolean more14(int[] nums) {
		int count1 = 0;
		int count4 = 0;
		boolean isTrue = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				count1++;
			if (nums[i] == 4)
				count4++;
		}
		if (count1 > count4)
			isTrue = true;
		return isTrue;
	}

	public String[] fizzArray2(int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++)
			result[i] = String.valueOf(i);
		return result;
	}

	public boolean either24(int[] nums) {
		int two = 0, four = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				two++;
			if (nums[i] == 4 && nums[i + 1] == 4)
				four++;
		}
		if (two != 0 && four != 0)
			return false;
		else if (two != 0 || four != 0)
			return true;
		else
			return false;
	}

	public boolean has12(int[] nums) {
		boolean foundOne = false;
		boolean foundOneTwo = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				foundOne = true;
			if (nums[i] == 2 && foundOne)
				foundOneTwo = true;
		}
		return foundOneTwo;
	}

	public boolean twoTwo(int[] nums) {
		for (int i = 0; i < (nums.length); i++) {
			if (nums[i] == 2) {
				i++;
				if (!(i < (nums.length)) || nums[i] != 2)
					return false;
				while (i < nums.length && nums[i] == 2)
					i++;
			}
		}
		return true;
	}

	public int[] fizzArray3(int start, int end) {
		int n = end - start;
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
			result[i] = start++;
		return result;
	}
}
