package hshken;

public class DateofYear {

	public static void main(String[] args) { 
		int n = 62;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i=0; i < months.length; i++){
		 if( n <= months[i]){
				System.out.println((i+1)+"/"+n);
				break;
		 }else{
				n = n-months[i];
		 
		 
		 }

}}}