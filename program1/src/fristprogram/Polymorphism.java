package fristprogram;

public class Polymorphism {
	
	public void talk(Parent styleoftalk) // Polymorphism is the ability of an object to take on many forms.
	//The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
	{
		System.out.println("Polite");
	}
	public void talk(Lover styleoftalk) 
	{
		System.out.println("romantic");
	}

	public static void main(String[] args) {
		
		
		Polymorphism talk = new Polymorphism() ;
		Parent parent = new Parent();
		talk.talk(parent);
		
		Lover lover = new Lover();
		talk.talk(lover);

	}

}
