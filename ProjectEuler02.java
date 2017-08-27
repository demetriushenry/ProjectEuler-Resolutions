import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler02 {
	
	static List<Integer> getEvenFibo(long n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		int i = 1;

	    while (true) {
	        int val = list.get(i) + list.get(i -1);
	        if (val >= n)
	            break;
	        list.add(val);
	        i++;
	    }
	    
		return list;
    }
	
	static long getEvenNumbersSum(List<Integer> list) {
		long result = 0;
		for (Integer n : list) {
			result += (n % 2 == 0) ? n : 0;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = Math.abs(in.nextInt());
        List<Integer> fiboList = new ArrayList<Integer>(t);
        long[] resultList = new long[t];
        for(int i = 0; i < t; i++){
            long n = Math.abs(in.nextLong());
            fiboList = getEvenFibo(n);
            resultList[i] = getEvenNumbersSum(fiboList);
        }
        
        for (long l : resultList) {
			System.out.println("" + l);
		}
        
        in.close();
	}

}
