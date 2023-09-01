package com.programs;

import java.util.Scanner;

public class StringReverseWordwise {
	
	public static void reverseWord() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

	public static void main(String[] args) {
		StringReverseWordwise.reverseWord();
	}

}
