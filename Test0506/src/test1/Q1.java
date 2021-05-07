package test1;

public class Q1 {
	
	public static void main(String[] args) {
		int n = 1;
	int i = 1;
	
	while(i < 1000000) {
		System.out.println(n + "日目で" + i + "円です");
		n++;
		i *= 2;
	}
	
	System.out.println(n + "日目で" + i + "円です");
	System.out.println(n + "日目で" + "100万円を超えました。");
	}
	

}
