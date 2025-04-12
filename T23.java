/*Find the Middle Index in Array - 1991 */

/*Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

leetcode link

Input Format

input should be an array

Constraints

1<=n<=100

Output Format

output should be a number

Sample Input 0

5
2 3 -1 8 4
Sample Output 0

3 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];   
        }
        int right = 0;
        for(int i = 0; i < n; i++)
        {
            if(right == sum - right - arr[i])
            {
                System.out.print(i);
               return;
            }
            right += arr[i];
        }
        System.out.print(-1);
    }
}

/*Prime Pairs With Target Sum -2761 */

/*You are given an integer n. We say that two integers x and y form a prime number pair if:

1 <= x <= y <= n

x + y == n

x and y are prime numbers

Return the 2D sorted list of prime number pairs [xi, yi]. The list should be sorted in increasing order of xi. If there are no prime number pairs at all, return an empty array.

Note: A prime number is a natural number greater than 1 with only two factors, itself and 1.

leetcode link:- prime paris

Input Format

input should be a number

Constraints

1<=n<=10^5

Output Format

output should be a 2D array of prime pairs

Sample Input 0

10
Sample Output 0

[[3, 7], [5, 5]]
Sample Input 1

2
Sample Output 1

[] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
  
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 2; i < n/2+1; i++) {
            if(prime[i] && prime[n-i]){
                ans.add(Arrays.asList(i, n-i));
            }
        }
        System.out.print(ans);
    }
}


/*Trapping rain water 50 */

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

image

Input Format

12
0 1 0 2 1 0 1 3 2 1 2 1

Constraints

solve in O(n)

Output Format

6

Sample Input 0

12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output 0

6 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        int[] pre = new int[n];
        int[] suf = new int[n];
        
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(arr[i] >= max)
            {
                max = arr[i];
            }
            pre[i] = max;
        }
        
        max = arr[n - 1];
        for(int i = n - 1; i >= 0; i--)
        {
            
            if(arr[i] > max)
            {
                max = arr[i];
            }
            suf[i] = max;
        }
        int result = 0;
        for(int i = 0; i < n; i++)
        {
            int ans = Math.min(pre[i], suf[i]);
            result += Math.abs(ans - arr[i]);
        }
        System.out.print(result);
    }
}

/*Tower of Hanoi 46 */

/*The Tower of Hanoi is a mathematical puzzle where you have three rods (A, B, and C) and N disks of different sizes arranged in ascending order on rod A. The goal is to move all the disks from rod A to rod C, following these rules:

RULES Only one disk can be moved at a time. A disk can only be placed on an empty rod or on a larger disk. You can use the auxiliary rod (B) as an intermediate step.

Write a program that prints the steps to solve the Tower of Hanoi for N disks.

Input Format

A single integer N representing the number of disks.

Constraints

1 ≤ N ≤ 12 (Larger values of N would generate too many moves, making it impractical for output.) Moves should be printed in order following the Tower of Hanoi algorithm. The minimum number of moves required is (2ⁿ - 1).

Output Format

Print each move in the format

Move disk from to

Print the total number of moves at the end.

Sample Input 0

3
Sample Output 0

Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
Total moves: 7
Explanation 0

Step-by-Step Explanation for N = 3
1️⃣ Move smallest disk (1) from A → C
A: [3, 2] B: [] C: [1]

2️⃣ Move disk 2 from A → B
A: [3] B: [2] C: [1]

3️⃣ Move disk 1 from C → B (placing it on top of disk 2)
A: [3] B: [2,1] C: []

4️⃣ Move largest disk (3) from A → C
A: [] B: [2,1] C: [3]

5️⃣ Move disk 1 from B → A
A: [1] B: [2] C: [3]

6️⃣ Move disk 2 from B → C
A: [1] B: [] C: [3,2]

7️⃣ Move disk 1 from A → C
A: [] B: [] C: [3,2,1] ✅ (All disks are now in place!)

 */

 import java.io.*;
import java.util.*;

public class Solution {
    static int count = 0;
    public static void SolveHonai(int n, char fromRod, char toRod, char auxRod)
    {
        if(n == 1)
        {
            System.out.println("Move disk 1 from "+ fromRod +" to "+ toRod);
            count++;
            return;
        }
        SolveHonai(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk "+ n + " from " + fromRod + " to " + toRod);
        count++;
        SolveHonai(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        SolveHonai(n, 'A', 'C', 'B');
        System.out.print("Total moves: "+count);
    }
}