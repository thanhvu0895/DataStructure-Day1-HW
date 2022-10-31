// Time Complexity O(n)
public class RomanNumber {
	public static void main(String[] args) {
		String romanString = "LXVMC";
		System.out.println("romanToInt(romanString): " + romanToInt(romanString));
		
	}

	public static int romanToInt(String s) {
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int currentValue = romanCharToInt(s.charAt(i));
			// if currentValue < nextValue
			if (i + 1 < s.length()) {
				int nextValue = romanCharToInt(s.charAt(i + 1));
				result = (currentValue >= nextValue) ? (currentValue + result) : (result - currentValue);
			} else {
				result += currentValue;
			}
		}
		return result;
	} 
	
	public static int romanCharToInt (char c) {
			switch (c) {
				case 'I': 
					return 1;
				case 'V':
					return 5;
				case 'X':
					return 10;
				case 'L':
					return 50;
				case 'C':
					return 100;
				case 'D':
					return 500;
				case 'M':
					return 1000;
				default:
					throw new Error("Invalid input");
			}
	}
}
