package com.Karayvansky.HomeWork8;

public class Utils {

	public static void printStr(String some) {
		System.out.println(some);
	}

	public static String reduction(String word) {
		if (word.length() < 4)
			return word;
		return word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1);
	}

	public static boolean palindrome(String word) {
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void toBin(int n) {
		if (n >= 2)
			toBin(n >> 1);
		int result = n % 2;
		System.out.print(result);
	}
}
