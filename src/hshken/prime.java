package hshken;

public class prime {

	public static void main(String[] args) {
		boolean prime = true;
		for(int n = 2; n<=1000 ;n++) {
			for (int i = 2 ; n< i; i++) {
			if( n % i == 0) {
				(prime) = false;
			}
				}	
		if (prime){
			System.out.print(n +" ");
		}
	
	
}
	}
}