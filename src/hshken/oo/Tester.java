package hshken.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student("王小明",66,86,97);
//		Student stu = new Student("王小明");
		//stu.english = 66;
		//stu.math = 86;
		//stu.chinese = 97;
		stu.print();
		int avg = stu.getaverage();
		System.out.println(stu.name + ":" + avg);
		

	}

}
