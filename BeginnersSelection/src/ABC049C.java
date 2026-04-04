import java.util.Scanner;

public class ABC049C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		
		boolean result = true;
		int i = 0;
		
		while (result) {
			int remainingLength = c.length - i;
			
			if (remainingLength == 0) { // ピッタリ終了
				break;
			}
			
			if (remainingLength < 5) { // 文字数足りない
				result = false;
				break;
			}
			
			switch (c[i]) {
				case 'd': { // 'd' 始まり
					if (c[i + 1] == 'r' && c[i + 2] == 'e' && c[i + 3] == 'a' && c[i + 4] == 'm') { // "dream"
						if (remainingLength >= 7 && c[i + 5] == 'e' && c[i + 6] == 'r') {
							if (remainingLength == 7 || c[i + 7] != 'a') { // "dreamer"で確定
								i = i + 7;
							} else {
								i = i + 5;
							}
						} else {
							i = i + 5;
						}
					} else {
						result = false;
						break;
					}
					break;
				}
				case 'e': { // 'e' 始まり
					if (c[i + 1] == 'r' && c[i + 2] == 'a' && c[i + 3] == 's' && c[i + 4] == 'e') { // "erase"
						if (remainingLength >= 6 && c[i + 5] == 'r') { // "eraser"
							i = i + 6;
						} else {
							i = i + 5; // "erase"
						}
					} else {
						result = false;
						break;
					}
					break;
				}
				default: {
					result = false;
					break;
				}
			}
		}
		
		System.out.println(result ? "YES" : "NO");
	}
}
