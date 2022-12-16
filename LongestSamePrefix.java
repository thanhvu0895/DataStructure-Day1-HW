// O(n)
import java.util.Arrays;

public class LongestSamePrefix {
	
	public static void main(String[] args) {
		String[] input = { "1floamento flou", "1flourist flo", "1flouwer" };
		System.out.println("The longest same prefix is: " + longestSamePrefix(input));
	}
	
	public static String longestSamePrefix (String[] strs) {
		 // Find longest string
		int maxLengthIndex = 0;
		int minLengthIndex = 0;
		for (int i = 0; i < strs.length; i++) {
			if (maxLengthIndex < strs[i].length()) {
				maxLengthIndex = i;
			} else {
				minLengthIndex = i;
			}
		}
		

		for (int i = 0; i < strs[minLengthIndex].length(); i++) {
			if(strs[minLengthIndex].charAt(i) != strs[maxLengthIndex].charAt(i)) {
				return strs[minLengthIndex].substring(0, i);
			}
			
		}
		return null;
	}
}
