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

	public boolean sameStarChar(String str) {
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
				return false;
		}

		return true;
	}

	public String starOut(String str) {
		int len = str.length();
		String finalString = "";
		for (int i = 0; i < len; i++) {
			if (i == 0 && str.charAt(i) != '*')
				finalString += str.charAt(i);
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
				finalString += str.charAt(i);
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
				finalString = finalString.substring(0, finalString.length() - 1);
		}
		return finalString;
	}

	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		int aLen = a.length();
		b = b.toLowerCase();
		int bLen = b.length();
		if (aLen < bLen) {
			String temp = b.substring(bLen - aLen, bLen);
			if (temp.compareTo(a) == 0)
				return true;
			else
				return false;
		} else {
			String temp = a.substring(aLen - bLen, aLen);
			if (temp.compareTo(b) == 0)
				return true;
			else
				return false;
		}
	}

	public boolean xyBalance(String str) {
		Boolean x = false;
		Boolean y = false;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'x' && y == true) {
				x = true;
				y = false;
			} else if (str.charAt(i) == 'x') {
				x = true;
			}
			if (str.charAt(i) == 'y' && x == true)
				y = true;
		}
		if (x == false)
			y = true;
		return y;
	}

	public String repeatFront(String str, int n) {
		String result = "";
		if (n == 0 || n <= str.length()) {
			for (int i = n; i > 0; i--) {
				result += str.substring(0, i);
			}
		}
		return result;
	}

	public boolean xyzMiddle(String str) {
		String xyz = "xyz";
		int len = str.length();
		int middle = len / 2;
		if (len < 3)
			return false;
		if (len % 2 != 0) {
			if (xyz.equals(str.substring(middle - 1, middle + 2))) {
				return true;
			} else {
				return false;
			}
		} else if (xyz.equals(str.substring(middle - 1, middle + 2))
				|| xyz.equals(str.substring(middle - 2, middle + 1))) {
			return true;
		} else
			return false;
	}

	public String oneTwo(String str) {
		String result = "";
		for (int i = 0; i < str.length() - 2; i += 3) {
			result = result + str.substring(i + 1, i + 3) + str.charAt(i);
		}
		return result;
	}

	public String plusOut(String str, String word) {
		int slen = str.length();
		int wlen = word.length();
		String fin = "";
		for (int i = 0; i < slen; i++) {
			if (i <= slen - wlen) {
				String tmp = str.substring(i, i + wlen);
				if (tmp.equals(word)) {
					fin += word;
					i += wlen - 1;
				} else
					fin += "+";
			} else
				fin += "+";
		}
		return fin;
	}

	public boolean catDog(String str) {
		int len = str.length();
		int cat = 0;
		int dog = 0;
		for (int i = 0; i < len - 2; i++) {
			String temp = str.substring(i, i + 3);
			if (temp.compareTo("cat") == 0)
				cat++;
			if (temp.compareTo("dog") == 0)
				dog++;
		}
		if (cat == dog)
			return true;
		else
			return false;
	}

	public Boolean xyzThere(String str) {
		int len = str.length();
		String xyz = "xyz";
		Boolean match = false;
		if (len < 3)
			return false;
		for (int i = 0; i < len - 2; i++) {
			String temp = str.substring(i, i + 3);
			if (temp.compareTo(xyz) == 0 && i == 0)
				match = true;
			else if (temp.compareTo(xyz) == 0 && str.charAt(i - 1) != 46)
				match = true;
		}
		return match;
	}

	public String mixString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int max = Math.max(aLen, bLen);
		String word = "";
		for (int i = 0; i < max; i++) {
			if (i <= aLen - 1)
				word += a.substring(i, i + 1);
			if (i <= bLen - 1)
				word += b.substring(i, i + 1);
		}
		return word;
	}

	public String repeatSeparator(String word, String sep, int count) {
		String newWord = "";
		for (int i = 0; i < count; i++) {
			if (i < count - 1)
				newWord += word + sep;
			else
				newWord += word;
		}
		return newWord;
	}

	public String getSandwich(String str) {
		int len = str.length();
		String tmpString = "";
		String finalString = "";
		int start = 0;
		int finish = 0;
		boolean found = false;
		if (len <= 10)
			return "";
		for (int i = 0; i < len - 4; i++) {
			tmpString = str.substring(i, i + 5);
			if (tmpString.equals("bread") && found == true)
				finish = i;
			if (tmpString.equals("bread") && found == false) {
				start = i + 5;
				found = true;
			}
		}
		finalString = str.substring(start, finish);
		return finalString;
	}

	public String zipZap(String str) {
		int len = str.length();
		String finalString = "";
		for (int i = 0; i < len; i++) {
			finalString += str.substring(i, i + 1);
			if (i > 0 && i < len - 1) {
				if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p')
					finalString = finalString.substring(0, finalString.length() - 1);
			}
		}
		return finalString;
	}

	public String wordEnds(String str, String word) {
		int slen = str.length();
		int wlen = word.length();
		String fin = "";
		for (int i = 0; i < slen - wlen + 1; i++) {
			String tmp = str.substring(i, i + wlen);
			if (i > 0 && tmp.equals(word))
				fin += str.substring(i - 1, i);
			if (i < slen - wlen && tmp.equals(word))
				fin += str.substring(i + wlen, i + wlen + 1);
		}
		return fin;
	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6)
			return true;
		else
			return false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
	}

	public int[] reverse3(int[] nums) {
		int[] myArray = new int[3];
		myArray[0] = nums[2];
		myArray[1] = nums[1];
		myArray[2] = nums[0];
		return myArray;
	}

	public int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}

	public boolean no23(int[] nums) {
		return (nums[0] != 2 && nums[1] != 3 && nums[1] != 2 && nums[0] != 3);
	}

	public int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3)
			nums[1] = 0;
		if (nums[1] == 2 && nums[2] == 3)
			nums[2] = 0;
		return new int[] { nums[0], nums[1], nums[2] };
	}

	public int[] makeMiddle(int[] nums) {
		return new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2] };
	}

	public int[] midThree(int[] nums) {
		int[] myArray = new int[3];
		int middle = nums.length / 2;
		myArray[0] = nums[middle - 1];
		myArray[1] = nums[middle];
		myArray[2] = nums[middle + 1];
		return myArray;
	}

	public boolean unlucky1(int[] nums) {
		if (nums.length < 2) {
			return false;
		} else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
			return true;
		} else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
			return true;
		} else
			return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0 && nums[0] == nums[nums.length - 1])
			return true;
		else
			return false;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] maxEnd3(int[] nums) {
		int larger = Math.max(nums[0], nums[2]);
		nums[0] = larger;
		nums[1] = larger;
		nums[2] = larger;
		return nums;
	}

	public int[] makeEnds(int[] nums) {
		int[] myArray = new int[2];
		if (nums.length == 1) {
			myArray[0] = nums[0];
			myArray[1] = nums[0];
		} else {
			myArray[0] = nums[0];
			myArray[1] = nums[nums.length - 1];
		}
		return myArray;
	}

	public int[] makeLast(int[] nums) {
		int len = nums.length;
		int[] myArray = new int[2 * len];
		myArray[myArray.length - 1] = nums[len - 1];
		return myArray;
	}

	public int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length != 0) {
			if (a[0] == 1)
				count++;
		}
		if (b.length != 0) {
			if (b[0] == 1)
				count++;
		}
		return count;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] myArray = new int[4];
		myArray[0] = a[0];
		myArray[1] = a[1];
		myArray[2] = b[0];
		myArray[3] = b[1];
		return myArray;
	}

	public int maxTriple(int[] nums) {
		int result = 0;
		int a = nums[0];
		int b = nums[((nums.length + 1) / 2) - 1];
		int c = nums[nums.length - 1];
		if (a > b && a > c)
			result = a;
		if (b > a && b > c)
			result = b;
		if (c > a && c > b)
			result = c;
		return result;
	}

	public int[] make2(int[] a, int[] b) {
		int[] temp = new int[2];
		int index = 0;
		for (int i = 0; i < a.length; i++)
			if (index < 2) {
				temp[index] = a[i];
				index++;
			}
		for (int i = 0; i < b.length; i++)
			if (index < 2) {
				temp[index] = b[i];
				index++;
			}
		return temp;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int sum2(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		else if (nums.length == 0)
			return 0;
		else
			return nums[0] + nums[1];
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
			return true;
		else
			return false;
	}

	public boolean double23(int[] nums) {
		if (nums.length != 1 && nums.length != 0)
			return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
		else
			return false;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		if (b[1] + b[0] > a[1] + a[0])
			return b;
		else
			return a;
	}

	public int[] swapEnds(int[] nums) {
		int a = nums[0];
		int b = nums[nums.length - 1];
		nums[0] = b;
		nums[nums.length - 1] = a;
		return nums;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length == 1)
			return new int[] { nums[0] };
		else if (nums.length == 0)
			return new int[] {};
		else
			return new int[] { nums[0], nums[1] };
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0)
			return new int[] {};
		else if (a.length != 0 && b.length == 0)
			return new int[] { a[0] };
		else if (a.length == 0 && b.length != 0)
			return new int[] { b[0] };
		else
			return new int[] { a[0], b[0] };
	}

	public int countYZ(String str) {
		int len = str.length();
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
				if (i < len - 1 && !Character.isLetter(str.charAt(i + 1)))
					count++;
				else if (i == len - 1)
					count++;
			}
		}
		return count;
	}

	public boolean gHappy(String str) {
		int len = str.length();
		boolean happy = true;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g')
					happy = true;
				else if (i < len - 1 && str.charAt(i + 1) == 'g')
					happy = true;
				else
					happy = false;
			}
		}
		return happy;
	}

	public String sameEnds(String string) {
		int len = string.length();
		String fin = "";
		String tmp = "";
		for (int i = 0; i < len; i++) {
			tmp += string.charAt(i);
			int tmplen = tmp.length();
			if (i < len / 2 && tmp.equals(string.substring(len - tmplen, len)))
				fin = tmp;
		}
		return fin;
	}

	public int sumNumbers(String str) {
		int len = str.length();
		int sum = 0;
		String tmp = "";
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i < len - 1 && Character.isDigit(str.charAt(i + 1))) {
					tmp += str.charAt(i);
				} else {
					tmp += str.charAt(i);
					sum += Integer.parseInt(tmp);
					tmp = "";
				}
			}
		}
		return sum;
	}

	public String withoutString(String base, String remove) {
		int blen = base.length();
		int rlen = remove.length();
		String lowbase = base.toLowerCase();
		String lowrem = remove.toLowerCase();
		String fin = "";
		for (int i = 0; i < blen; i++) {
			if (i <= blen - rlen) {
				String tmp = lowbase.substring(i, i + rlen);
				if (!tmp.equals(lowrem))
					fin += base.substring(i, i + 1);
				else {
					i += rlen - 1;
				}
			} else {
				String tmp2 = lowbase.substring(i, i + 1);
				if (!tmp2.equals(lowrem))
					fin += base.substring(i, i + 1);
			}
		}
		return fin;
	}

	public int countTriple(String str) {
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len - 2; i++) {
			char tmp = str.charAt(i);
			if (tmp == str.charAt(i + 1) && tmp == str.charAt(i + 2))
				count++;
		}
		return count;
	}

	public String mirrorEnds(String string) {
		int len = string.length();
		String fin = "";
		String tmp1 = "";
		String tmp2 = "";
		for (int i = 0; i < len; i++) {
			tmp1 += string.substring(i, i + 1);
			tmp2 = "";
			for (int j = tmp1.length() - 1; j >= 0; j--) {
				tmp2 += tmp1.substring(j, j + 1);
				if (tmp2.equals(string.substring(len - i - 1, len)))
					fin = tmp1;
			}
		}
		return fin;
	}

	public String notReplace(String str) {
		String result = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
					|| i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
				result += str.charAt(i);
			} else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {
				result += "is not";
				i++;
			} else
				result += str.charAt(i);
		}
		return result;
	}
}
