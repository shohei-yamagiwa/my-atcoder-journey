import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC436C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Set<Square> placedSquares = new HashSet<>();
		int result = 0;
		
		for (int i = 0; i < M; i++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			
			Square leftTop = new Square(R - 1, C - 1);
			Square rightTop = new Square(R - 1, C);
			Square leftBottom = new Square(R, C - 1);
			Square rightBottom = new Square(R, C);
			
			if (placedSquares.contains(leftTop) || placedSquares.contains(rightTop) || placedSquares.contains(leftBottom) || placedSquares.contains(rightBottom)) {
				continue;
			}
			
			// Place a new block
			placedSquares.add(leftTop);
			placedSquares.add(rightTop);
			placedSquares.add(leftBottom);
			placedSquares.add(rightBottom);
			
			result++;
		}
		
		System.out.println(result);
	}
	
	record Square(int row, int col) {
	}
}
