import java.util.Scanner;

public class PE06SumSquareDifference {

	static int getAbsoluteDifference(int num) {
		int sumOfSquares = 0;
		int sumOfNumbers = 0;
		for (int i = 1; i <= num; i++) {
			sumOfSquares += (int) Math.pow(i, 2);
			sumOfNumbers += i;
		}
		return ((int) Math.pow(sumOfNumbers, 2) - sumOfSquares);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Math.abs(in.nextInt());
		t = t < 1 ? 1 : t;
		int[] list = new int[t];
		for (int i = 0; i < t; i++) {
			int n = Math.abs(in.nextInt());
			n = n < 1 ? 1 : n;
			list[i] = getAbsoluteDifference(n);
		}
		
		for (int l : list) {
			System.out.println("" + l);
		}
		
		in.close();
	}

}
