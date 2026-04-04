import java.util.Scanner;

public class ABC086C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean result = true;
		
		int lastT = 0;
		int lastX = 0;
		int lastY = 0;
		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int diffT = t - lastT;
			int diffX = Math.abs(x - lastX);
			int diffY = Math.abs(y - lastY);
			
			if (diffX + diffY > diffT) {
				result = false;
				break;
			}
			
			if (Math.abs(diffX + diffY - diffT) % 2 != 0) {
				result = false;
				break;
			}
			
			lastT = t;
			lastX = x;
			lastY = y;
		}
		
		System.out.println(result ? "Yes" : "No");
	}
}
