// Time Complexity: O(n)
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 2, 1, 0, 0, 2, 0, 1 };
        System.out.println(Arrays.toString(sortZeroOneTwo(input)));

	}
	
	public static int[] sortZeroOneTwo (int[] arr) {
		int countZero = 0, countOne = 0;
		for (int num : arr) {
			if (num == 0) countZero++;
			if (num == 1) countOne++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i < countZero){ 
				arr[i] = 0;
			} else if (i < countZero + countOne) {
				arr[i] = 1;
			} else {
				arr[i] = 2;
			}
		}
		
		return arr;
	} 
	
}
