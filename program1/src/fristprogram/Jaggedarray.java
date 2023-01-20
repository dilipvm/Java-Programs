package fristprogram;

public class Jaggedarray {

	public static void main(String[] args) {
		int [][] jaggedarr = new int [2][];
		jaggedarr [0]=new int[2];
		jaggedarr [1]=new int[3];
		
		jaggedarr [0][0]=21;
		jaggedarr [0][1]=65;
		jaggedarr[1][0]=34;
		jaggedarr[1][1]=67;
		jaggedarr[1][2]=90;
		
		System.out.println(jaggedarr [0][0]);
		System.out.println(jaggedarr [0][1]);
		System.out.println(jaggedarr [1][0]);
		System.out.println(jaggedarr [1][1]);
		System.out.println(jaggedarr [1][2]);
  
	}

}
