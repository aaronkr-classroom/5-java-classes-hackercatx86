public class Ex701 {

	public static void main(String[] args) {
		Cat my_cat = new Cat();
		my_cat.setAge(14);
		my_cat.setName("Aaron");
		
		System.out.println("Say hi to my cat, " + my_cat.getName());
		System.out.println("My cat is " + my_cat.age + " years old");
		
		my_cat.age = 6;
		System.out.println("My cat is " + my_cat.age + " years old");
	}

}
