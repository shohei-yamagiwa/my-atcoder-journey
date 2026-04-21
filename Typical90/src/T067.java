import java.util.Scanner;

public class T067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int K = sc.nextInt();
		
		for (int i = 0; i < K; i++) {
			long value = Long.parseLong(N, 8);
			String base9Str = Long.toString(value, 9);
			
			N = base9Str.replace("8", "5");
		}
		
		System.out.println(N);
	}
}
