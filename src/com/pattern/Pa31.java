package com.pattern;

import java.util.Scanner;

public class Pa31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			if(i!=1) {
			for(int k=1;k<=(2*i-3);k++) {
				System.out.print(" ");
			}
			System.out.print(i);
			}
			
			
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			if(i!=1) {
				for(int k=1;k<=(2*i-3);k++) {
					System.out.print(" ");
				}
				System.out.print(i);
				}
				System.out.println();
			}
		}

}
