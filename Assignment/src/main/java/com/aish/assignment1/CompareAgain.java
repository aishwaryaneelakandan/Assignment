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

	public int[] pre4(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4 && i > 0) {
				int[] foo;
				foo = new int[i];
				for (int j = 0; j < foo.length; j++) {
					foo[j] = nums[j];
				}
				if (nums[0] != 4)
					return foo;
			}
		}
		int[] bar;
		bar = new int[0];
		return bar;
	}

	public int[] zeroFront(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;
	}

	public int[] evenOdd(int[] nums) {
		int countE = 0;
		int countO = nums.length - 1;
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[countE] = nums[i];
				countE++;
			} else {
				array[countO] = nums[i];
				countO--;
			}
		}
		return array;
	}

	public int maxSpan(int[] nums) {
		int span = 0;
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					tmp = j - i + 1;
					span = Math.max(tmp, span);
				}
			}
		}
		return span;
	}

	public boolean canBalance(int[] nums) {
		int lSum = 0;
		for (int i = 0; i < nums.length; i++) {
			lSum += nums[i];
			int rSum = 0;
			for (int j = nums.length - 1; j > i; j--) {
				rSum += nums[j];
			}
			if (rSum == lSum)
				return true;
		}
		return false;
	}

	public int[] seriesUp(int n) {
		int[] result = new int[n * (n + 1) / 2];
		int i = 0;
		for (int j = 1; j <= n; ++j)
			for (int k = 1; k <= j; ++k)
				result[i++] = k;
		return result;
	}

	public int[] fix34(int[] nums) {
		int j = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 3 && nums[i + 1] != 4) {
				for (; nums[j] != 4; j++)
					;
				nums[j] = nums[i + 1];
				nums[i + 1] = 4;
			}
		}
		return nums;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int numFound = 0;
		if (inner.length == 0) {
			return true;
		}
		int k = 0;
		for (int i = 0; i < outer.length; i++) {
			if (outer[i] == inner[k]) {
				numFound++;
				k++;
			} else if (outer[i] > inner[k]) {
				return false;
			}
			if (numFound == inner.length)
				return true;
		}
		return false;
	}

	public int maxMirror(int[] nums) {
		int len = nums.length;
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = len - 1; i + count < len && j > -1; j--) {
				if (nums[i + count] == nums[j]) {
					count++;
				} else {
					if (count > 0) {
						max = Math.max(count, max);
						count = 0;
					}
				}
			}
			max = Math.max(count, max);
		}
		return max;
	}

	public int[] fix45(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 4 && nums[i + 1] != 5) {
				for (; !(nums[j] == 5 && (j == 0 || j > 0 && nums[j - 1] != 4)); j++)
					;
				nums[j] = nums[i + 1];
				nums[i + 1] = 5;
			}
		}
		return nums;
	}

	public int[] squareUp(int n) {
		int[] arr = new int[n * n];
		if (n == 0)
			return arr;
		for (int i = n - 1; i < arr.length; i += n) {
			for (int j = i; j >= i - i / n; j--)
				arr[j] = i - j + 1;
		}
		return arr;
	}

	public int countClumps(int[] nums) {
		int count = 0;
		int i = 0;
		while (i < nums.length) {
			int val = nums[i];
			i++;
			int length = 1;
			while (i < nums.length && nums[i] == val) {
				i++;
				length++;
			}
			if (length > 1)
				count++;
		}
		return count;
	}

	public int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0)
			return 0;
		if (bunnies % 2 == 1)
			return 2 + bunnyEars2(bunnies - 1);
		return 3 + bunnyEars2(bunnies - 1);
	}

	public int count7(int n) {
		if (n == 0)
			return 0;
		if (n % 10 == 7)
			return 1 + count7(n / 10);
		return count7(n / 10);
	}

	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));
		return countX(str.substring(1));
	}

	public String changePi(String str) {
		if (str.length() < 2)
			return str;
		if (str.substring(0, 2).equals("pi"))
			return "3.14" + changePi(str.substring(2));
		return str.charAt(0) + changePi(str.substring(1));
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length)
			return 0;
		if (nums[index] == 11)
			return 1 + array11(nums, index + 1);
		return array11(nums, index + 1);
	}

	public String pairStar(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		return str.charAt(0) + pairStar(str.substring(1));
	}

	public int countAbc(String str) {
		String left;
		if (str.length() < 3)
			return 0;
		left = str.substring(0, 3);
		if (left.equals("abc"))
			return 1 + countAbc(str.substring(3));
		if (left.equals("aba"))
			return 1 + countAbc(str.substring(2));
		return countAbc(str.substring(1));
	}
}
