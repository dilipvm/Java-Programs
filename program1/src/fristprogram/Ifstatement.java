package fristprogram;

public class Ifstatement {

	public static void main(String[] args) {

		int securedmark = 40;
		int cutoffmark =50;
		
		if (securedmark > cutoffmark) {
			System.out.println("Good");
		}
		else if(securedmark == cutoffmark) {
			System.out.println("Fiar");
		}
		else {
			System.out.println("bad");
		}
	}

}
