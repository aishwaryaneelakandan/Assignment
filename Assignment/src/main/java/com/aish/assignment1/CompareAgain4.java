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
}
