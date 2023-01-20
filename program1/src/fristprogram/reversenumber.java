package fristprogram;

public class reversenumber {
	int number=12345;
	int reverseNumber=0;

	public void reverseNumber(){
		System.out.println(" Given Number : "+ number);

		while(number!=0){
			reverseNumber=reverseNumber*10+number%10;
			number=number/10;
		}

		System.out.println(" Reversed Number : "+ reverseNumber);
	}
	public static void main(String[] args) {

		reversenumber aNumber= new reversenumber();
		aNumber.reverseNumber();

	}

}
