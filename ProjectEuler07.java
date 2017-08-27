import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }

	static int getThousandFirstprime(int num) {
		int numPrimes = 0;
	    int i = 1;
	    while (numPrimes < num) {
	        if (isPrime(i)) {
	            numPrimes++;
	            if (numPrimes == num) {
	                return i;
	            }
	        }
	        i++;
	    }
	    return i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] list = new int[t];
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			list[i] = getThousandFirstprime(n);
		}
		
		for (int l : list) {
			System.out.println("" + l);
		}
		
		in.close();
	}
}
