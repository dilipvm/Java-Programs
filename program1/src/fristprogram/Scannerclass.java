package fristprogram;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		String s="";//here we are writing the name we want 
		Scanner sc = new Scanner(System.in);// we can give any name instead of sc 
		 s=sc.nextLine();// 
		System.out.println(s);
		
		System.out.println("what your name ?");
		String name = sc.nextLine(); 
		System.out.println("Hello "+name);// if you need space between hello and name give space in hello
        System.out.println("what is your age ?");
        int age = sc.nextInt();
        System.out.println("your age is "+age);
		sc.close();// closing the scanner
	}

}/* 
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 
In our example,we will use the nextLine() method, which is used to read Strings */