package test4;

public class Q4 {

	public static void main(String[] args) {
		Q4 main = new Q4();
		main.exeute();
	}

	private void exeute() {
		// ここを実装する
		call(Dog.dog);
		call(Cat.cat);
		call(Bird.bird);
		call(Horse.horse);
	}

	private void call(Animal animal) {
		System.out.println(animal.call());
	}
}
