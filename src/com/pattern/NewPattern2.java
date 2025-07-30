/**
 * 
 */
package com.pattern;
import java.util.Scanner;
/**
 * @author Sujal
 * @category New Patterns
 * @Description This is an example for conditional pattern 
 */
public class NewPattern2 {

	/**
	 * @param args
	 * Description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==n || j==1 || j==i) {
					
				System.out.print("# ");
		}
		
		else {
		
				System.out.print("- ");
			}
		}
			System.out.println();

	}

	}
}



