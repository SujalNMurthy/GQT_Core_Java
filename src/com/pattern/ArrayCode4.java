package com.pattern;

import java.util.Scanner;

class ArrayStringOperations1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the class count:");
		int cls=sc.nextInt();
		arr=new String[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of students inside the class no: "+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
		System.out.println("Array Created");
		System.out.println("----------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of the student no: " +(j+1));
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Data stored into the array");
		System.out.println("----------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of the student no: "+(j+1)+" is = "+arr[i][j]);
				
			}
			System.out.println("----------");
		}
	}
	
}
public class ArrayCode4 {

	public static void main(String[] args) {
		
		ArrayStringOperations1 a0=new ArrayStringOperations1();
		a0.createArray();
		a0.collectData();
		a0.displayData();
	}

}




