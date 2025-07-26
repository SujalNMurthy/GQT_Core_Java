package com.pattern;

import java.util.Scanner;

public class Pa26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");		
		int n=sc.nextInt();
		int a=1;
		int b=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((j%2)==0) {
					System.out.print(b+"	");			}
				else
				{
					System.out.print(a+"	");
				}
			}System.out.println("");

	}
	}
}

