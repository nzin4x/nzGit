package codility.L4;
import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * <pre>
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * 
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a zero-indexed array A, returns the value of the missing element.
 * 
 * For example, given array A such that:
 * 
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 * 
 * Assume that:
 * 
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Complexity:
 * 
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 * </pre>
 * 
 * @author nzin4x
 *
 */
class Missing {
	public int solution(int[] A) {
		Arrays.sort(A);

		int missing = 1;

		for (int i = 0; i + 1 < A.length; i++) {

			if (i + 1 >= A.length - 1) {
				if (A[i] == 1)
					return missing + 1;
			}

			if (A[i + 1] != A[i] + 1) {
				missing = A[i] + 1;
				return missing;
			}

		}

		return missing;
	}

	public static void main(String[] args) {
		pArrayAndCompareSolution(new int[] {}, 1);
		pArrayAndCompareSolution(new int[] { 1 }, 2);
		pArrayAndCompareSolution(new int[] { 2 }, 1);
		pArrayAndCompareSolution(new int[] { 1, 3 }, 2);
		pArrayAndCompareSolution(new int[] { 2, 3, 1, 5 }, 4);
		pArrayAndCompareSolution(new int[] { 1, 2, 3, 5 }, 4);
		pArrayAndCompareSolution(new int[] { 333, 335 }, 334);
	}

	private static void pArrayAndCompareSolution(int[] is, int exp) {
		System.out.print("array : [");
		for (int i : is) {
			System.out.print(i + ", ");
		}
		System.out.print("]\n");

		Missing s = new Missing();
		int res = s.solution(is);
		System.out.print(exp + "=" + res + " => ");

		if (res == exp)
			System.out.println(true);
		else
			System.out.println(false);

	}
}