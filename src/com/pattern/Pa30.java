package com.pattern;

import java.util.Scanner;

public class Pa30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("	");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+"	");
				
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+"	");
				
			}
			
			System.out.println(" ");
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print("	");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+"	");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+"	");
			}
			System.out.println(" ");
		}

	}

}
