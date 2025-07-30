package com.pattern;

import java.util.Scanner;
/**
 * @author Sujal
 * @category patterns
 * @description This is an example for my_name pattern
 */
public class Name {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	//S
        	for (int j = 0; j < n; j++) {
        		if ((i == 0 && j > 0) ||                 
						   (i == n / 2 && j > 0 && j < n - 1) || 
						    (i == n - 1 && j < n - 1) ||          
						    (j == 0 && i > 0 && i < n / 2) ||     
						    (j == n - 1 && i > n / 2 && i < n - 1))
        		{
        			System.out.print("# ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	
        	//U
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(((j == 0 || j == n - 1) && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1))
        			 {
        			System.out.print("# ");
        		}else {
        			System.out.print("  ");
        	
        		}
        	}
        	
        	//J
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==0 || (j==n/2 && i<n-1) || (i==n-1 && j<=n/2) || (j==0 && i>=n-3)){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//A
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if((i==0 && j!=0 && j!=(n-1)) || i==(n/2) || (j==0 && i!=0) || (j==(n-1) && i!=0))
				     {
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//L
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==(n-1) || j==0){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//N
        	System.out.print("           ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==(n-1) || i==j)
				{
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//M
        	System.out.print("          ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && i<=(n/2)))
				
				{
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//U
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(((j == 0 || j == n - 1) && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1))
        			{
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//R
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if (
	                    j == 0 ||                                               
	                    (i == 0 && j < n - 1) ||                                 
	                    (i == n / 2 && j < n - 1) ||                             
	                    (j == n - 1 && i > 0 && i < n / 2) || (i==j && i>=n/2)){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//T
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==0 || j==(n/2) ){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//H
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==n-1 || i==(n/2)){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	
        	//Y
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if((j==(n/2) && i>=(n/2)) || (i==j && j<=(n/2)) || (i+j==(n-1) && i<=(n/2))){
            			System.out.print("# ");
            		}else {
            			System.out.print("  ");
            		}
            	}
        	System.out.println();
        }
	}
}