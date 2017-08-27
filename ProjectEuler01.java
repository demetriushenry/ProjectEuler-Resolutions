import java.util.Scanner;

public class Solution {
	
	static int filterMultiple(int count) {
		int result = 0;
		for (int i = 0; i < count; i++) {
			if (/*(i >= 3) &&*/ (i % 3 == 0 || i % 5 == 0)) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] count = new int[t];
		
		for (int i = 0; i < t; i++) {
			int n = Math.abs(in.nextInt());
			count[i] = filterMultiple(n);
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println("" + count[i]);
		}
		
	}

}
