// Complexity: O(log n) 
public class SquareRoot {
	public static void main(String[] args) {
		int input = 1120;
	    findSqrt(input);
	}
	
	
	public static double square (double n, double i, double j) {
		double mid = (i + j)/2;
		double mult = mid*mid;
		
		// return mid if mid is squareroot
		if( (mult == n) || (Math.abs(mult - n) < 0.001)){
			return mid;
		} else if (mult < n) { 
			return square(n, mid, j); // recursively square 2nd half
		} else { 
			return square(n, i, mid); // recursively square first half
		}
	}
	
	public static void findSqrt(double input) {
		double x = 1;
		
		// while not squareRoot
		boolean isSquareRoot = false; 
		while (!isSquareRoot) {
			
			// if input is perfect square
			if (x*x == input) {
				System.out.println(x);
				isSquareRoot = true;
			} else if (x*x > input) { // square root lies in intervals x-1 and x
				double result = square(input, x - 1, x);
				System.out.printf("%.2f", result);
				isSquareRoot = true;
			}
			x++;
		}		
	}
}
