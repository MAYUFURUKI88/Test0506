package test4;

public class Dog implements Animal {
	
	static Animal dog = new Dog();

	@Override
	public String call() {
		return "ワン";
	}
}
