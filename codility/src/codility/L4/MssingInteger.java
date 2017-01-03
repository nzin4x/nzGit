package codility.L4;
import java.util.Arrays;
import java.util.HashSet;

/**
 * <pre>
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 * 
 * For example, given:
 * 
 *   A[0] = 1
 *   A[1] = 3
 *   A[2] = 6
 *   A[3] = 4
 *   A[4] = 1
 *   A[5] = 2
 * the function should return 5.
 * 
 * Assume that:
 * 
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * 
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 * </pre>
 * 
 * @author nzin4x
 *
 */
class MssingInteger {
	public int solution(int[] A) {

		HashSet<Integer> hset = new HashSet<Integer>();
		
		int num = 1;
		for(int i = 0; i < A.length; i++) {
			System.out.println("adding new " + A[i]);
			hset.add(A[i]);
			
			while(hset.contains(num)) {
				System.out.println("checking : " + num);
				num++;
			}
		}

		return num;
	}

	public static void main(String[] args) {

		printAndReturn(new int[] { 1, 3, 6, 4, 1, 2 });
		printAndReturn(new int[] { 1 });
		printAndReturn(new int[] { 1, 1 });
		printAndReturn(new int[] { 1, 3 });
		printAndReturn(new int[] { 1, 2 });
		printAndReturn(new int[] { 1, 2, 3 });
		printAndReturn(new int[] { 4, 1, 3 });

	}

	private static void printAndReturn(int[] is) {
		System.out.print("array : [");
		for (int i : is) {
			System.out.print(i + ", ");
		}
		System.out.print("]\n");

		MssingInteger s = new MssingInteger();
		int res = s.solution(is);
		System.out.println("res : " + res);
	}
}