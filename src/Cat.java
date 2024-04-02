public class Cat extends Animal {
	
	String breed;
	String color;
	
	void eat() {
		System.out.println(this.getName() + "먹이를 먹다");
	}
	
	void scratch() {
		System.out.println(this.getName() +  "발톱으로 할퀴다");
	}
	
	public void sound() {
		System.out.println(this.getName() + "meow~ meow~"); 
	}
}
