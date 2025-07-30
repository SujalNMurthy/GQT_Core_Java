package com.pattern;
import java.util.Scanner;
class ArrayOperations {
		int arr[];
		Scanner sc=new Scanner(System.in);
		void createArray() { 
		System.out.println("Enter the student count: ");
		int n = sc.nextInt();
		arr =new int[n];
		System.out.println("Array created");
		System.out.println("--------------");
		}
		
		void collectData() { 
			//Collecting and Storing marks of n students
			for(int i=0;i<arr.length;i++) {
		
			System.out.println("Enter the marks of student no: "+(i+1));
			arr[i]=sc.nextInt();
			}
			
			System.out.println("Data stored into the array ");
			System.out.println("--------------");
		}
			
			void displayData() {
			for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no: "+(i+1)+" is= "+arr[i]);	
		
		
		}
		
		
		}

	}
public class Structured{
	public static void main(String args[]) {
		ArrayOperations s =new ArrayOperations();
		s.createArray();
		s.collectData();
		s.displayData();
	}
}

