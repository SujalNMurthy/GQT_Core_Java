package com.pattern;

import java.util.Scanner;

public class Pa39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print("	");
				
			}
			for(int k=i;k>=0;k--) {
				System.out.print(k+"	");
				
			}
			for(int l=1;l<=i;l++) {
				System.out.print(l+"	");
				
			}
			System.out.println("");
		}
	}

}
