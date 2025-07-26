package com.pattern;

import java.util.Scanner;

public class Pa42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
				
			}
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch);
				
			}
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch);
				
			}
			System.out.println();
		}

	}

}
