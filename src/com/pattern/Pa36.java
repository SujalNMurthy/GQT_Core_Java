package com.pattern;

import java.util.Scanner;

public class Pa36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch=(char)('A'+i-1);
			for(int j=1;j<=n-i;j++) {
				System.out.print("	");
				
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(ch+"	");
				
			}
			System.out.println("");
		}


	}

}
