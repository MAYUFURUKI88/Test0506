package test2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("複数行に入力された数字を、合計します。");
		System.out.println("入力を終えるときは、何も入力せずにEnterキーを押してください。");

		int sum = 0;

		while (true) {
			String str = scan.nextLine();

			if (str.equals(""))
				break;

			try {
				int num = Integer.parseInt(str);
				sum += num;
			} catch (NumberFormatException e) {
				System.out.println("数字で入力してください。");
			}
		}

		System.out.println("合計は、" + sum + "です。");

	}

}
