package com.pattern;


import java.util.Scanner;

class ArrayStringOperations3{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the School count:");
		int sch=sc.nextInt();
		arr=new String[sch][][];
		
		//collect class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside school no: " +(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		
		//collect student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count inside the class no: " +(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
			
		}
		System.out.println("Array Created");
		System.out.println("----------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "
						+ ""
						+ " class count no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student no: "+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data stored into the array");
		System.out.println("----------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The name of the student no: "+(j+1) +" is = " +arr[i][j][k]);
				}
				
			}
			System.out.println("----------");
		}
	}
	
}
public class ArrayCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStringOperations3 a0=new ArrayStringOperations3();
		a0.createArray();
		a0.collectData();
		a0.displayData();
	}

}
