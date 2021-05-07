package test4;

public class Bird implements Animal {
	
	static Animal bird = new Bird();
	
	@Override
	public String call() {
		return "かぁー";
	}
}
