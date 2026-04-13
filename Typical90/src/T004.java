import java.util.Scanner;

public class T004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		
		int[][] values = new int[H][W];
		
		int[] hSums = new int[H];
		int[] vSums = new int[W];
		
		for (int y = 0; y < H; y++) {
			int hSum = 0;
			
			for (int x = 0; x < W; x++) {
				int value = scanner.nextInt();
				
				values[y][x] = value;
				hSum += value;
				vSums[x] += value;
			}
			hSums[y] = hSum;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				sb.append(hSums[y] + vSums[x] - values[y][x]);
				if (x != W - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
