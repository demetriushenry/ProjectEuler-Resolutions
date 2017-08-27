import java.util.Scanner;

public class PE05SmallestMultiple {

	static boolean isMultiple(long x, int n) {
		for (int i = 1; i < n; i++) {
			if (x % i != 0)
				return false;
		}
		return true;
	}

	static long factorial(long n) {
		if (n > 1)
			return n * factorial(n - 1);
		else if (n >= 0)
			return 1;
		else
			return -1;
	}

	static int getSmallestMultiple(int n) {
		for (long i = n; i <= factorial(n); i += n) {
			if (isMultiple(i, n))
				return (int) i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] list = new int[t];
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			list[i] = getSmallestMultiple(n);
		}

		for (int l : list) {
			System.out.println("" + l);
		}

		in.close();
	}

}
