package test4;

public class Horse implements Animal {
	static Animal horse = new Horse();
	
	@Override
	public String call() {
		return "ひひーん";
	}
}
