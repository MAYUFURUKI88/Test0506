package test4;

public class Cat implements Animal{
	
	static Animal cat = new Cat();
	
	
	@Override
	public String call() {
		return "にゃー";
	}
	
}
