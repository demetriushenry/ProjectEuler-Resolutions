import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PE04LargestPalindrome {

	static boolean isPalindrome(int n) {
		int tmp = n;
		int sum = 0;
		int r;
		
		while (tmp != 0) {
			r = tmp % 10;
			tmp = tmp / 10;
			sum = sum * 10 + r;
		}
		
		return n == sum;
	}
	
	static int getLargestPalindrome(int n) {
		List<Integer> compareList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (isPalindrome(i))
				compareList.add(i);
		}
		
		System.out.println(compareList.toString());
		
		int max = Collections.max(compareList);
		
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Math.abs(in.nextInt());
		int[] list = new int[t];
		for(int i = 0; i < t; i++){
		    int n = Math.abs(in.nextInt());
		    list[i] = getLargestPalindrome(n);
		}

		for (int l : list) {
			System.out.println("" + l);
		}

		in.close();
	}

}
