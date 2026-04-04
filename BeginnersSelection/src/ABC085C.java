import java.util.Scanner;

public class ABC085C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		int x = -1;
		int y = -1;
		int z = -1;
		
		for (int i = 0; i <= N; i++) {
			int remaining = (10000 * N - Y) - (5000 * i);
			
			if (remaining < 0) {
				break;
			}
			
			if (remaining == 0) {
				x = N - i;
				y = i;
				z = 0;
				break;
			}
			
			if (remaining % 9000 == 0 && remaining / 9000 <= N - i) {
				y = i;
				z = remaining / 9000;
				x = N - y - z;
				break;
			}
		}
		
		System.out.println(x + " " + y + " " + z);
	}
}
