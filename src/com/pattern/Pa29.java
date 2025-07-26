package com.pattern;

import java.util.Scanner;

public class Pa29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("	");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print(j+1 +"	");
				
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+"	");
				
			}
			
			System.out.println(" ");
		}

	}

}
