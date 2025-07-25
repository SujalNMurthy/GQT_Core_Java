package com.pattern;

import java.util.Scanner;

public class Pattern14A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("	");
				ch++;	
			}
			System.out.println(" ");
			
		}


	}

}
