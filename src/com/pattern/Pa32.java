package com.pattern;
import java.util.Scanner;
public class Pa32 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
        int n = sc.nextInt();
        for(int i =	n; i >= 1; i--){
            for(int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i+"");
            }
            System.out.println();
        }

        
        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}

