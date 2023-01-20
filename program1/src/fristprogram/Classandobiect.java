package fristprogram;

public class Classandobiect {

	public static void main(String[] args) {

		//ClassName variableName = new Constructor;
 
		Bike bike = new Bike();//Here bike is a class we are getting from bike program 
		bike.setcolour("Red");
	   	System.out.println("bike colour -" + bike.getcolour());// here we are getting colour of the class from bike program
	
		Bike bike1 = new Bike();
		System.out.println(bike1.getcolour());
	
	}

}
