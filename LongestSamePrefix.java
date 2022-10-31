// O(nlogn)
import java.util.Arrays;

public class LongestSamePrefix {
	
	public static void main(String[] args) {
		String[] input = { "1floamento flou", "1flourist flo", "1flouwer" };
		System.out.println("The longest same prefix is: " + longestSamePrefix(input));
	}
	
	public static String longestSamePrefix (String[] strings) {
		  Arrays.sort(strings);
		  for(int i = 0; i < Math.min(strings[0].length(), strings[strings.length-1].length()); i++) {
		      if(strings[0].charAt(i) != strings[strings.length-1].charAt(i))
		          return strings[0].substring(0, i);
		  }
		  return strings[0];
	}
}
