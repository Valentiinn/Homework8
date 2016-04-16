package com.Karayvansky.HomeWork8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//firstTask();
		//secondTask();
		thirdTask();
		//fourthTask();
	}

	public static void firstTask() {
		String mail = "Valik-isuzu@mail.ru";
		Utils.printStr(mail);
		mail = mail.replace("@", "[ at ]");
		mail = mail.replace(".", "[ dot ]");
		Utils.printStr(mail);
	}

	public static void secondTask() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your words: ");
		String in = sc.nextLine();
		String[] arr = in.split(" ");
		String out = "";

		for (String word : arr)
			out += Utils.reduction(word) + ", ";

		System.out.println(out);
	}

	public static void thirdTask() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Input your words: ");
		String in = sc.nextLine();
		String[] arr = in.split(",");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			if (Utils.palindrome(arr[i]))
				n++;
		}
		System.out.println("There are " + n + " palindromes in the text");
	}

	public static void fourthTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number: ");
		int n = sc.nextInt();
		Utils.toBin(n);
		sc.close();
	}

}
