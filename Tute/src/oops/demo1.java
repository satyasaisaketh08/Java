package oops;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a1 = new Student(20,"Ambani");
//		System.out.println(a1.getAge());
		try {
			a1.setAge(-21);
		}catch(Exception E) {
			System.out.println(E.getMessage());
		}finally {
			System.out.println("It keeps running");
		}
		System.out.println(a1.getAge());

	}

}
