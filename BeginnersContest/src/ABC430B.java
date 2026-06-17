import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC430B {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		// Read squares' width and height
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		// Read the given squares
		final char[][] rawSquares = new char[N][N];
		for (int i = 0; i < N; i++) {
			String columns = sc.next();
			for (int j = 0; j < N; j++) {
				rawSquares[i][j] = columns.charAt(j);
			}
		}
		
		final Set<Squares> uniqueSquares = new HashSet<>();
		
		int c = 0;
		int r = 0;
		while (true) {
			// Read the target area of raw squares
			final char[][] newSquares = new char[M][M];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < M; j++) {
					newSquares[i][j] = rawSquares[c + i][r + j];
				}
			}
			
			Squares squares = new Squares(newSquares);
			uniqueSquares.add(squares);
			
			if (c == N - M && r == N - M) {
				break;
			}
			
			// Go to the next column
			if (r == N - M) {
				c++;
				r = 0;
				continue;
			}
			
			// Go to the next row
			r++;
		}
		
		System.out.println(uniqueSquares.size());
	}
	
	protected static class Squares {
		private final char[][] values;
		
		public Squares(char[][] values) {
			this.values = values;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Squares other) {
				return Arrays.deepEquals(values, other.values);
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return Arrays.deepHashCode(values);
		}
	}
}
