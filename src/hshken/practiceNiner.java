package hshken;

public class practiceNiner {

	public static void main(String[] args){
		for (int n = 1 ;n <= 9 ; n++){
		    for (int i = 1;i <= 9 ; i++){
		    	System.out.print( n + "x" + i +" = ");
		    	if((n * i) < 10 ){
		    		System.out.print(" ");
		}
		System.out.println((n * i));
	}
		    System.out.println();
}
}
 }