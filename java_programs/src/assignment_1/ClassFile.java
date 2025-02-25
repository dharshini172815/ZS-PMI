package assignment_1;

public class ClassFile {

	public static void main(String[] args) {
		System.out.println("Its a main method");
		One obj1 = new One();
		obj1.display();
		Two obj2 = new Two();
		obj2.display();
	}

}
class One {
	void display() {
		System.out.println("It is class one");
	}
}
class Two {
	void display() {
		System.out.println("It is class two");
	}
}
