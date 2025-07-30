package com.pattern;
import java.util.Scanner;
/**
 * @author Sujal
 * @category patterns
 * @description This is an example for number pattern
 */
public class Digits {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	//0
        	for (int j = 0; j < n; j++) {
        		if((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1)|| (j==0 && i>0 && i<n-1) ||(j==n-1 && i>0 && i<n-1))
        		{
        			System.out.print("# ");
        		}else {
        			System.out.print("  ");
        		}
        	}
			//1
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==(n-1) || j==(n/2) || i+j==(n/2) && i<n/2 )
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//2
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if ((i == 0) || (i == n - 1) || (i == n / 2) || (i < n / 2 && j == n - 1) || (i > n / 2 && j == 0))
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//3
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if ((i == 0) || (i == n - 1) || (i == n / 2) || j == n - 1)
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//4
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==(n/2) || j==0 && i<=n/2 || j==(n-1) )
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//5
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0 || i==(n/2) || i==(n-1) || (j==0 && i<=(n/2))) || (j==(n-1) && i>=(n/2)))
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//6
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i == 0 && j > 0) || (i==n-1) || (i==n/2) || (j==0) || j==n-1 && i>n/2)
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//7
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i == 0 || j == n - i - 1))
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//8
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) || i==(n/2))
				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
			//9
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(((i == 0) || (i == n / 2) || (i == n - 1 && j > 0 && j < n - 1 == false)
	    || (j == 0 && i < n / 2) || (j == n - 1)) || i==(n-1))				{
					System.out.print("# ");
				}
				else { 
					System.out.print("  ");
				}
			}
        	
        	System.out.println();
        }
	}
}

	