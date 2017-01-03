package codility.L4;
import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/*
 *
 * <pre>A non-empty zero-indexed array A consisting of N integers is given.

 A permutation is a sequence containing each element from 1 to N once, and only once.

 For example, array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3	
 A[3] = 2
 is a permutation, but array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 is not a permutation, because value 2 is missing.

 The goal is to check whether array A is a permutation.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.

 For example, given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 the function should return 1.

 Given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 the function should return 0.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [1..1,000,000,000].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

 Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 </pre>
 */
class PermCheck {
	public int solution(int[] A) {

		Arrays.sort(A);

		if (A.length == 1) {
			if (A[0] == 1)
				return 1;
			else
				return 0;
		} else {
			if (A[0] != 1)
				return 0;
			
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] + 1 != A[i + 1]) {
//					System.out.println("hello : " + i + ", "+ A[i]);
//					System.out.println("hello : " + (i + 1) + ", "+ A[(i + 1)]);
					return 0;
				} else {
					System.out.println("what : " + i + ", "+ A[i]);
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) {

		printAndReturn(new int[] { 1 });
		printAndReturn(new int[] { 1, 1 });
		printAndReturn(new int[] { 1, 1, 3, 3 });
		printAndReturn(new int[] { 1, 1, 3, 3, 4 });
		printAndReturn(new int[] { 4, 1, 3, 2 });
		printAndReturn(new int[] { 4, 1, 3 });

	}

	private static void printAndReturn(int[] is) {
		System.out.print("array : [");
		for (int i : is) {
			System.out.print(i + ", ");
		}
		System.out.print("]\n");

		PermCheck s = new PermCheck();
		int res = s.solution(is);
		System.out.println("res : " + res);
	}
}