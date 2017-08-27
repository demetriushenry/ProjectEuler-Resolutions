import java.util.Scanner;

public class PE03LargestPrimeFactor {
	
	static long getLargestPrimeFactor(long n) {
		long i = 2;
	    while (Math.pow(i, 2) < n) {
	        while (n % i == 0) {
	            n /= i;
	        }
	        i++;
	    }
	    return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = Math.abs(in.nextInt());
        long[] list = new long[t];
        for(int a0 = 0; a0 < t; a0++){
            long n = Math.abs(in.nextLong());
            list[a0] = getLargestPrimeFactor(n);
        }
        
        for (long l : list) {
			System.out.println("" + l);
		}
	}

}
