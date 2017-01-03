package codility.L1.Q1;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * 2������ �ٲ� ������� 0�� ���� �� ���� ã�´�.
 */
class Solution {
    public int solution(int N) {
    	
    	String bi = Integer.toBinaryString(N);
    	
//    	System.out.println(bi);
    	
    	int cnt = 0;
    	int max = 0;
    	int lastmax = 0;
    	for(int i = 0; i < bi.length(); i++) {

    		if(bi.charAt(i) == '1')
    		{
    			// reset
    			cnt = 0;
    			lastmax = max;
    		} else {
    			// increase
    			cnt++;
//    			System.out.println("increase cnt " + cnt);
    			
    			if(cnt > max) {
    				max = cnt;
//    				System.out.println("cur max : " + max);
    			}
    		}
    		
    	}
    	
    	return lastmax;
    	
    }
}