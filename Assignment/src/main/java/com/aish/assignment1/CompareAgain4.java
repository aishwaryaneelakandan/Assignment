package com.aish.assignment1;

public class CompareAgain4 {
	public int countHi2(String str) {
		if (str.length() <= 1)
			return 0;
		if (str.length() > 2 && str.substring(0, 3).equals("xhi"))
			return countHi2(str.substring(3));
		if (str.substring(0, 2).equals("hi")) 
			return 1 + countHi2(str.substring(2));
		return countHi2(str.substring(1));
	}

	public int strCount(String str, String sub) {
		int sLen = sub.length();
		if (str.length() < sLen)
			return 0;
		if (str.substring(0, sLen).equals(sub))
			return 1 + strCount(str.substring(sLen), sub);
		return strCount(str.substring(1), sub);
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		return 2 + bunnyEars(bunnies - 1);
	}

	public int triangle(int rows) {
		if (rows == 0)
			return 0;
		return rows + triangle(rows - 1);
	}

	public int count8(int n) {
		if (n == 0)
			return 0;
		if (n % 10 == 8) {
			if ((n / 10) % 10 == 8)
				return 2 + count8(n / 10);
			return 1 + count8(n / 10);
		}
		return count8(n / 10);
	}

	public int countHi(String str) {
		if (str.length() < 2)
			return 0;
		if (str.charAt(0) == 'h' && str.charAt(1) == 'i')
			return 1 + countHi(str.substring(2));
		return countHi(str.substring(1));
	}

	public String noX(String str) {
		char ch;
		if (str.length() == 0)
			return str;
		ch = str.charAt(0);
		if (ch == 'x')
			return noX(str.substring(1));
		return ch + noX(str.substring(1));
	}

	public boolean array220(int[] nums, int index) {
		if (index >= nums.length - 1)
			return false;
		return nums[index + 1] == 10 * nums[index] || array220(nums, index + 1);
	}

	public String endX(String str) {
		if (str.length() <= 1)
			return str;
		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + "x";
		return str.charAt(0) + endX(str.substring(1));
	}

	public int count11(String str) {
		if (str.length() < 2)
			return 0;
		if (str.substring(0, 2).equals("11"))
			return 1 + count11(str.substring(2));
		return count11(str.substring(1));
	}

	public String parenBit(String str) {
		if (str.charAt(0) != '(')
			return parenBit(str.substring(1));
		if (str.charAt(str.length() - 1) != ')')
			return parenBit(str.substring(0, str.length() - 1));
		return str;
	}

	public boolean strCopies(String str, String sub, int n) {
		if (n == 0)
			return true;
		if (str.length() < sub.length())
			return false;
		if (str.substring(0, sub.length()).equals(sub))
			return strCopies(str.substring(1), sub, n - 1);
		return strCopies(str.substring(1), sub, n);
	}

	public int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int sumDigits(int n) {
		if (n < 10)
			return n;
		return ((n % 10) + (sumDigits(n / 10)));
	}

	public int powerN(int base, int n) {
		if (n == 1)
			return base;
		return base * powerN(base, n - 1);
	}

	public String changeXY(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == 'x')
			return 'y' + changeXY(str.substring(1));
		return str.charAt(0) + changeXY(str.substring(1));
	}

	public boolean array6(int[] nums, int index) {
		if (index >= nums.length)
			return false;
		return nums[index] == 6 || array6(nums, index + 1);
	}

	public String allStar(String str) {
		if (str.length() <= 1)
			return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	public int countPairs(String str) {
		if (str.length() <= 2)
			return 0;
		if (str.charAt(0) == str.charAt(2))
			return 1 + countPairs(str.substring(1));
		return countPairs(str.substring(1));
	}

	public String stringClean(String str) {
		if (str.length() <= 1)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return stringClean(str.substring(1));
		return str.charAt(0) + stringClean(str.substring(1));
	}
	public boolean nestParen(String str) {
		if (str.length() == 0)
			return true;
		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
			return nestParen(str.substring(1, str.length() - 1));
		return false;
	}

	public int strDist(String str, String sub) {
		if (str.length() < sub.length())
			return 0;
		if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub))
			return str.length();
		if (!str.substring(0, sub.length()).equals(sub))
			return strDist(str.substring(1), sub);
		return strDist(str.substring(0, str.length() - 1), sub);
	}

	public boolean groupSum(int start, int[] nums, int target) {
		if (target == 0)
			return true;
		if (start == nums.length)
			return false;
		if (groupSum(start + 1, nums, target - nums[start]))
			return true;
		return groupSum(start + 1, nums, target);
	}

	public boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0)
				return true;
			return false;
		}
		if (nums[start] % 5 == 0) {
			if (start < nums.length - 1 && nums[start + 1] == 1)
				return groupSum5(start + 2, nums, target - nums[start]);
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		if (groupSum5(start + 1, nums, target - nums[start]))
			return true;
		return groupSum5(start + 1, nums, target);
	}

	public boolean splitOdd10(int[] nums) {
		int index = 0;
		int sum1 = 0;
		int sum2 = 0;
		return recArray(nums, index, sum1, sum2);
	}

	private boolean recArray(int[] nums, int index, int sum1, int sum2) {
		if (index >= nums.length) {
			return (sum1 % 10 == 0 && sum2 % 2 != 0) || (sum2 % 10 == 0 && sum1 % 2 != 0);
		}
		int value = nums[index];
		return (recArray(nums, index + 1, sum1 + value, sum2) || recArray(nums, index + 1, sum1, sum2 + value));
	}

	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		if (nums[start] == 6)
			return groupSum6(start + 1, nums, target - 6);
		if (groupSum6(start + 1, nums, target - nums[start]))
			return true;
		if (groupSum6(start + 1, nums, target))
			return true;
		return false;
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		int i = start;
		int sum = 0;
		while (i < nums.length && nums[start] == nums[i]) {
			sum += nums[i];
			i++;
		}
		if (groupSumClump(i, nums, target - sum))
			return true;
		if (groupSumClump(i, nums, target))
			return true;
		return false;
	}

	public boolean split53(int[] nums) {
		return split53Helper(0, nums, 0, 0);
	}

	public boolean split53Helper(int start, int[] nums, int mult5, int mult3) {
		if (start >= nums.length)
			return mult5 == mult3;
		if (nums[start] % 5 == 0)
			return split53Helper(start + 1, nums, mult5 + nums[start], mult3);
		if (nums[start] % 3 == 0)
			return split53Helper(start + 1, nums, mult5, mult3 + nums[start]);
		if (split53Helper(start + 1, nums, mult5 + nums[start], mult3))
			return true;
		if (split53Helper(start + 1, nums, mult5, mult3 + nums[start]))
			return true;
		return false;
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length)
			return (target == 0);
		if (groupNoAdj(start + 1, nums, target))
			return true;
		if (groupNoAdj(start + 2, nums, target - nums[start]))
			return true;
		return false;
	}

	public boolean splitArray(int[] nums) {
		return splitArrayHelper(0, nums, 0, 0);
	}

	public boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
		if (start >= nums.length)
			return group1 == group2;
		if (splitArrayHelper(start + 1, nums, group1 + nums[start], group2))
			return true;
		if (splitArrayHelper(start + 1, nums, group1, group2 + nums[start]))
			return true;
		return false;
	}
}
