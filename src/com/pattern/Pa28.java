package com.pattern;

import java.util.Scanner;

public class Pa28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("	");
				
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print(j+"	");
				
			}
			
			System.out.println(" ");
		}


	}

}
