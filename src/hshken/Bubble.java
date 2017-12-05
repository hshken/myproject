package hshken;

public class Bubble {

	public static void main(String[] args) {
		int n[] = {25,10,39,40,33,12};
		for (int i=0; i <n.length - 1; i++){
			for (int j=i+1; j < n.length; j++){
			System.out.println(i+ "," +j);
			if (n[i] > n[j]){
				int tmp = n[i] ;
			n[i] = n[j] ;
			n[j] = tmp;
			}

	}
			 }
		for (int  num : n){
					System.out.print(num + " ");
			}
		}
	}
		
	
