package com.aish.assignment1;

public class Compare {
	public boolean negative(int a) {
		if (a < 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equal(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isequal(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(String str1, String str2) {
		boolean bool = str1.equalsIgnoreCase(str2);
		if (bool) {
			return true;
		} else {
			return false;
		}

	}

	public boolean even(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean odd(int num) {
		if (num % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean palindrome(String str) {
		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isStringOnlyAlphabet(String str) {
		return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
	}

	public String stringTimes(String str, int n) {
		String abc = "";
		for (int i = 0; i < n; i++) {
			abc = abc + str;
		}
		return abc;
	}

	public String frontTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			if (str.length() <= 3)
				result += str;
			if (str.length() > 3)
				result += str.substring(0, 3);
		}
		return result;
	}

	public boolean array123(int[] number) {
		for (int i = 0; i < number.length - 2; i++) {
			if (number[i] == 1 && number[i + 1] == 2 && number[i + 2] == 3)
				return true;
		}
		return false;
	}

	public String stringSplosion(String str) {
		String n = "";
		for (int i = 0; i < str.length(); i++) {
			n += str.substring(0, i + 1);
		}
		return n;
	}

	public boolean has271(int[] number) {
		for (int a = 0; a < number.length - 2; a++) {
			int c = number[a];
			int b = number[a + 2];
			if (number[a + 1] == c + 5 && (Math.abs(b - c + 1) <= 2))
				return true;
		}
		return false;
	}

	public String altPairs(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 4) {
			int lim = i + 2;
			if (lim > str.length()) {
				lim = str.length();
			}
			result += str.substring(i, lim);
		}
		return result;
	}

	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
				count++;
		}
		return count;
	}

	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9)
				count++;
		}
		return count;
	}

	public int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else if (n > 21) {
			return ((n - 21) * 2);
		}
		return 0;
	}

	public int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6 || nums[i + 1] == 7)
					count++;
			}
		}
		return count;
	}

	public boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i + 2 <= nums.length - 1) {
				if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
					return false;
			}
		}
		return true;
	}

	public String notString(String str) {
		if (str.startsWith("not"))
			return str;
		else
			return "not " + str;
	}

	public boolean arrayFront9(int[] nums) {
		int len = nums.length;
		if (len <= 4) {
			for (int i = 0; i < len; i++) {
				if (nums[i] == 9)
					return true;
				else
					;
			}
		} else {
			for (int j = 0; j < 4; j++) {
				if (nums[j] == 9)
					return true;
				else
					;
			}
		}
		return false;
	}

	public String endUp(String str) {
		int len = str.length();
		if (len <= 3)
			return str.toUpperCase();
		else {
			String temp = str.substring(len - 3, len);
			return str.substring(0, len - 3) + temp.toUpperCase();
		}
	}

	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n + 1, str.length());
	}

	public String doubleChar(String str) {
		String a = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			a += str.charAt(i);
			a += str.charAt(i);
		}
		return a;
	}

	public int countCode(String str) {
		int len = str.length();
		int count = 0;
		String co = "co";
		String e = "e";
		if (len < 4)
			return 0;
		for (int i = 0; i < len - 3; i++) {
			if (co.compareTo(str.substring(i, i + 2)) == 0 && e.compareTo(str.substring(i + 3, i + 4)) == 0)
				count++;
		}
		return count;
	}

	public boolean bobThere(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 > str.length() - 1)
				continue;
			else if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
				return true;
		}
		return false;
	}

	public String repeatEnd(String str, int n) {
		int len = str.length();
		String newWord = "";
		for (int i = 0; i < n; i++) {
			newWord += str.substring(len - n, len);
		}
		return newWord;
	}

	public boolean prefixAgain(String str, int n) {
		int len = str.length();
		String prefix = str.substring(0, n);
		for (int i = n; i < len; i++) {
			if (n + i <= len) {
				if (prefix.equals(str.substring(i, n + i)))
					return true;
			}
		}
		return false;
	}

	
}
