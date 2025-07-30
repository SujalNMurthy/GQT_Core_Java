package com.pattern;



import java.util.Scanner;

class ArrayStringOperations2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the School count:");
		int sch=sc.nextInt();
		System.out.println("Enter the Class count in each school: ");
		int cls=sc.nextInt();
		System.out.println("Enter the Student count in each class: ");
		int stu=sc.nextInt();
		arr=new String[sch][cls][stu];
		
		System.out.println("Array Created");
		System.out.println("----------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student no: " +(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data stored into the array");
		System.out.println("----------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: " + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The name of student in school no: " +(k+1)+" is = " +arr[i][j][k]);
				}
				
			}
			System.out.println("----------");
		}
	}
	
}
public class ArrayCode5 {

	public static void main(String[] args) {
		
		ArrayStringOperations2 a0=new ArrayStringOperations2();
		a0.createArray();
		a0.collectData();
		a0.displayData();
	}

}
