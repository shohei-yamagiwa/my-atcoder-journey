import java.util.Scanner;

public class T033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int count = 0;
		
		int hBoxCount = W / 2;
		int vBoxCount = H / 2;
		if (hBoxCount == 0) {
			count = H;
		} else if (vBoxCount == 0) {
			count = W;
		} else {
			count += hBoxCount * vBoxCount;
			
			boolean remainH = W % 2 == 1;
			boolean remainV = H % 2 == 1;
			if (remainH && remainV) {
				count += (H / 2) + (W / 2) + 1;
			} else if (remainH) {
				count += (H / 2);
			} else if (remainV) {
				count += (W / 2);
			}
		}
		
		System.out.println(count);
	}
}
