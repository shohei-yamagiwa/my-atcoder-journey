import java.util.*;

public class ABC433C_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		Map<Integer, Set<Integer>> numToIndices = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			int num = Character.getNumericValue(S.charAt(i));
			Set<Integer> indices = numToIndices.getOrDefault(num, new HashSet<>());
			
			indices.add(i);
			numToIndices.put(num, indices);
		}
		
		int result = 0;
		
		for (int currentNum : numToIndices.keySet()) {
			int nextNum = currentNum + 1;
			if (!numToIndices.containsKey(nextNum)) {
				continue;
			}
			
			Set<Integer> currentIndices = numToIndices.get(currentNum);
			Set<Integer> nextNumIndices = numToIndices.get(nextNum);
			for (int index : currentIndices) {
				int maxSequenceLength = currentIndices.size();
				int currentSequenceLength = 1;
				while (currentSequenceLength <= maxSequenceLength) {
					boolean valid = true;
					for (int i = 0; i < currentSequenceLength; i++) {
						int targetNum = index + i;
						int targetOppositeNum = index + i + currentSequenceLength;
						if (!currentIndices.contains(targetNum) || !nextNumIndices.contains(targetOppositeNum)) {
							valid = false;
							break;
						}
					}
					
					if (valid) {
						result++;
					}
					
					currentSequenceLength++;
				}
			}
		}
		
		System.out.println(result);
	}
}
