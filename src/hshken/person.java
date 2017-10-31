package hshken;

public class person {

	public void sayHello(){
		System.out.println("Hello world");}
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			 person p = new person();
			 p.sayHello();
			 
			 int x = 5;
			 int y = 3;
			 int z = x % y;
			 int z1 = x + y;
			 int z2 = x - y;
			 int z3 = x / y;
			 System.out.println(z);
			 
			 System.out.println(x == y);
			 System.out.println(x != y);
			 System.out.println(x > y);
			 System.out.println(x < y);
			 System.out.println(x >= y);
			 System.out.println(x <= y);
			
			 System.out.println(x >> 1);
			 x++;
			 x--;
			 System.out.println(x);
			 x = x + 2;
			 x +=2;
			 System.out.println(x);
			 //字串轉整數
			 String data = "123";
			 int n = Integer.parseInt(data);
			//字串轉整數
			 String mydata = String.valueOf(n);
	}

}
