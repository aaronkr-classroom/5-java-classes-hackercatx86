public class Student {
	int id;
	String name;
	
	// method overloading(in same class)
	Student() {
		System.out.println("학생 생성");
	}
	
	Student(int id, String name) {
		insertRecord(id, name);
	}
	
	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void printInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
