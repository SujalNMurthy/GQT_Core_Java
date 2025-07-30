package com.pattern;
import java.util.Scanner;
public class Unstructured {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student count: ");
		
		int n = sc.nextInt();
		//Creating the array to store n student marks
		int arr[]=new int[n];
		//Collecting and Storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no: "+(i+1));	
		
			arr[i]=sc.nextInt();
		}
			System.out.println("-----------------");
		//Display marks stored inside the array 
			for(int i=0;i<arr.length;i++) {
				System.out.println("The marks of student no: "+(i+1) + " is= "+arr[i]);	
				
			}

	}
}



