import java.util.Arrays;

/**
 * <pre>
 * A non-empty zero-indexed array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

Array A contains only 0s and/or 1s:

0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
</pre>
 * @author nzin4x
 *
 */
class Solution3 {
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

		Solution3 s = new Solution3();
		int res = s.solution(is);
		System.out.print(exp + "=" + res + " => ");

		if (res == exp)
			System.out.println(true);
		else
			System.out.println(false);

	}
}