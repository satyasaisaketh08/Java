package oops;

public class Student {
//	data member of a class!!
//	data parsing
//	acess specifiers - private , public 
	private String Name;
	private int Age;
//	float Bmi;
	
	public Student(int A, String N) {
		Age = A;
		Name = N;
	}

	public void intro() {
		System.out.println(this);
		System.out.println("Hello," + this.Name + "Your Age is:" + this.Age);
	}
	
	public int getAge() {
		return Age;
	}
	
	public int setAge(int Age) throws Exception {
		if(Age < 0) {
			throw new Exception("Your age cannot be negative");
		}
		return this.Age = Age;
	}
}
