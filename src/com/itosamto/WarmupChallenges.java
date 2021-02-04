package com.itosamto;

import java.util.HashSet;
import java.util.Set;

public class WarmupChallenges {

	public static void main(String[] args) {
		System.out.println(countingValleys(8, "DDUUDDUDUUUD"));
	}

	// 2021.02.04
	public static int repeatedString(String s, long n) {

		return 0;
	}

	// 2021.01.30
	public static int jumpingOnClouds(int[] c) {
		int jump = 0;
		for(int i=0; i<c.length-1; i++) {
			if(c[i]==0) i++;
			jump++;
		}
		return jump;
	}

	// 2021.01.29
	public static Integer countingValleys(int steps, String path) {
		// Write your code here
		int valleys = 0;
		int height = 0;
		boolean in = false;
		for(String step : path.split("")) {
			height = step.equals("U") ? height+1 : height-1;
			if (height < 0) {
				if(!in) {
					in = true;
					valleys++;
				}
			} else if (height >= 0) {
				in = false;
			}
		}

		return valleys;
	}

	public static Integer sockMerchant(int n, int[] ar) {
		int count = 0;
		Set<Integer> tmpSet = new HashSet<>();
		for(int a : ar) {
			if (tmpSet.contains(a)) {
				tmpSet.remove(a);
				count++;
			} else {
				tmpSet.add(a);
			}
		}
		return count;
	}
}
