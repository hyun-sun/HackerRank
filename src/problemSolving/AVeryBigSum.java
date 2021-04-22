package problemSolving;

public class AVeryBigSum {

	public static void main(String[] args) {
		long ar[] = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		long result = aVeryBigSum(ar);
		System.out.println(result);
		assert result == 5000000015L;
	}

	// A Very Big Sum
	// https://www.hackerrank.com/challenges/a-very-big-sum/problem
	static long aVeryBigSum(long[] ar) {
		long sum = 0L;

		for(long n : ar) {
			sum += n;
		}
		return sum;
	}



}
