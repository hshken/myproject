package hshken;

public class Niner {
	
	public static void main(String[] args) {
		for (int n= 1; n <= 9 ; n++){
			for (int i= 1; i <= 9 ; i++){
			if ((n * i) >= 1) { 
					System.out.println(" "+ n + " x " + i +" = " + (n * i)  + "\t");
					System.out.println("");
				}
			System.out.println();
		} 
	} 
		
}
}