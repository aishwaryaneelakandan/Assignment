package com.aish.assignment1;
public class Compare 
{
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
		if (str1 == str2) {
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

}
