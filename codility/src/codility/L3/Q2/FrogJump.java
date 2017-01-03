package codility.L3.Q2;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * <pre>
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Assume that:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
 * </pre>
 * @author nzin4x
 *
 */
class FrogJump {
    public int solution(int X, int Y, int D) {
    	
    	int trial = 0;
    	
    	trial = (Y - X) / D;
    	int remain = (Y - X) % D;
    	
    	if(remain > 0) {
    		trial++;
    	}
    	
		return trial;
    }
    
    public static void main(String[] args) {
		printVarsAndReturn(10, 85, 30);
		printVarsAndReturn(10, 10, 30);
		printVarsAndReturn(10, 11, 30);
		printVarsAndReturn(10, 11, 1);
		printVarsAndReturn(10, 12, 1);
		printVarsAndReturn(10, 210000000, 1);
	}
    
    private static void printVarsAndReturn(int X, int Y, int D) {
    	System.out.println("X=" + X + ",Y=" + Y + ",D=" + D);
		
		FrogJump s = new FrogJump();
		int res = s.solution(X, Y, D);
		System.out.println("res : " + res);
	}
}