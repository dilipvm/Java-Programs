package fristprogram;

public class Methods {

	public static void main(String[] args) {
              // this is a main method or entry point 
		// we can call is sayhello multi times
//		sayhello(); //We need to call the mathod name from down 
//		sayhello(); 
//		sayhello(); 
		//greety("Dilip");//below gretty(string name)
		int result =add (2,3);// method name is add we need to pass 2 values for i and j
		System.out.println(result);// we need to capture the k value as result so we created a result variable
	}
	// example 1
	public static void sayhello() { //sayhello is a method name
		System.out.println("Hello");
	}
	//example 2 - with pram()
	public static void greety(String name) { // we can give any name insted of greety
		System.out.println("Hello "+name);
	}
	//example 3 - with pram() and return value
	public static int add(int i, int j) {
		int k = i+j; // 3rd variable is k
		return k;// returning the k value
		// we not printing inside the method so we need to print outside the method
		//() is a parameter 
	}

}
