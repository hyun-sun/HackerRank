package interviewPreparationKit;

import java.util.HashSet;
import java.util.Set;

public class WarmupChallenges {
	// https://www.hackerrank.com/interview/interview-preparation-kit/warmup/challenges
	public static void main(String[] args) {
		System.out.println(repeatedString("a", 100));
	}

	// 2021.02.04
	// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
	public static long repeatedString(String s, long n) {
		int allA = 0;
		int indexA = 0;

		long repeatCount = n/s.length();
		long lastIndex = n%s.length();

		String[] ss = s.split("");

		for(int i=0; i<s.length(); i++) {
			if(ss[i].equals("a")) {
				allA++;
				if(i < lastIndex) {
					indexA++;
				}
			}
		}
		return allA*repeatCount + indexA;
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
			} else {
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
