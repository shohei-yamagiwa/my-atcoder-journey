import java.util.Scanner;

public class ABC459C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		int[] squareBlocks = new int[N + 1]; // squareStates[i] -> 左からi番目のマスにこれまで累計で積まれたブロックの個数
		FenwickTree squareAmounts = new FenwickTree(Q + 1); // squares.sum(x + 1, N + 1) -> x個以上のブロックが積まれているマスの合計個数
		squareAmounts.add(1, N);
		
		int wholeRemovalCount = 0;
		
		StringBuilder ans = new StringBuilder();
		
		for (int i = 0; i < Q; i++) {
			int type = sc.nextInt();
			int value = sc.nextInt();
			
			switch (type) {
				case 1: {
					squareAmounts.add(squareBlocks[value] + 1, -1);
					squareBlocks[value]++;
					squareAmounts.add(squareBlocks[value] + 1, 1);
					
					if (squareAmounts.sum(wholeRemovalCount + 1) == 0) { // すべてのマスにブロックが積まれている場合
						wholeRemovalCount++;
					}
					break;
				}
				
				case 2: {
					int actualBlockAmount = Math.min(value + wholeRemovalCount, Q + 1);
					long totalSquareAmount = squareAmounts.sum(actualBlockAmount + 1, Q + 1);
					
					ans.append(totalSquareAmount).append(System.lineSeparator());
					break;
				}
			}
		}
		
		sc.close();
		
		System.out.println(ans);
	}
	
	/**
	 * 1-indexed
	 */
	static class FenwickTree {
		private final long[] tree;
		
		/**
		 * @param size 管理する配列の要素数
		 */
		public FenwickTree(int size) {
			tree = new long[size + 1];
		}
		
		/**
		 * i番目の要素にxを足す
		 */
		public void add(int i, long x) {
			for (; i < tree.length; i += (i & -i)) {
				tree[i] += x;
			}
		}
		
		/**
		 * 最初の要素からi番目の要素までの合計を求める
		 */
		public long sum(int i) {
			long sum = 0;
			for (; i > 0; i -= (i & -i)) {
				sum += tree[i];
			}
			return sum;
		}
		
		/**
		 * {@code left}番目から{@code right}番目までの要素の区間和を求める
		 */
		public long sum(int left, int right) {
			return sum(right) - sum(left - 1);
		}
		
		private long get(int i) {
			return sum(i) - sum(i - 1);
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 1; i < tree.length; i++) {
				sb.append(get(i));
				if (i < tree.length - 1) sb.append(", ");
			}
			sb.append("]");
			return sb.toString();
		}
	}
}
