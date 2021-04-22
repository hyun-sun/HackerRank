package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		Integer[] ar1 = {6, 6, 7, -10, 9, -3, 8, 9, -1};
		Integer[] ar2 = {9, 7, -10, 6, 4, 1, 6, 1, 1};
		Integer[] ar3 = {-1, -2, 4, -6, 1, -4, -6 ,3 ,9};
		Integer[] ar4 = {-8, 7, 6, -1, -6, -6, 6, -7, 2};
		Integer[] ar5 = {-10, -4, 9, 1, -7, 8, -5, 3, -5};
		Integer[] ar6 = {-8, -3, -4, 2, -3, 7, -5, 1, -5};
		Integer[] ar7 = {-2, -7, -4, 8, 3, -1, 8, 2, 3};
		Integer[] ar8 = {-3, 4, 6, -7, -7, -8, -3, 9, -6};
		Integer[] ar9 = {-2, 0, 5, 4, 4, 4, -3, 3, 0};

		List<List<Integer>> list = new ArrayList<>();
		list.add(0, new ArrayList<>(Arrays.asList(ar1)));
		list.add(1, new ArrayList<>(Arrays.asList(ar2)));
		list.add(2, new ArrayList<>(Arrays.asList(ar3)));
		list.add(3, new ArrayList<>(Arrays.asList(ar4)));
		list.add(4, new ArrayList<>(Arrays.asList(ar5)));
		list.add(5, new ArrayList<>(Arrays.asList(ar6)));
		list.add(6, new ArrayList<>(Arrays.asList(ar7)));
		list.add(7, new ArrayList<>(Arrays.asList(ar8)));
		list.add(8, new ArrayList<>(Arrays.asList(ar9)));

		System.out.println(diagonalDifference(list));

	}

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	 */
	// https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen
	static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int sum1 = 0;
		int sum2 = 0;
		int size = arr.size();

		for(int i = 0; i< arr.size(); i++) {
			sum1 += arr.get(i).get(i);
			sum2 += arr.get(i).get(size-i-1);
		}
		int result = sum1-sum2;
		return result<0?-result:result;
	}
}
