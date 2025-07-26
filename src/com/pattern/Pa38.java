package com.pattern;

import java.util.Scanner;

public class Pa38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		char start='A';
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<(n-i-1)*2;j++) {
				System.out.print(" ");
				
			}
			char ch=(char) (start+i*2);
			for(int j=0;j<=i*2;j++) {
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println("");
		}


	}

}
