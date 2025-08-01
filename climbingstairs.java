import java.util.*;

class Solution {	
	static int ClimbStairs(int n){
		if (n <= 2)
			return n;
		return  ClimbStairs(n-1) + ClimbStairs(n-2);
	}

	// Returns number of ways to reach s'th stair
	static int countWays(int s)
	{
		return ClimbStairs(s);
	}

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		//System.out.println("enter no.of stairs");
		int s = sc.nextInt();
// 		System.out.println("Number of ways = " + countWays(s));
		System.out.println("Number of ways = " + countWays(s));
	}
}


