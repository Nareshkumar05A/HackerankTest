/*Pattern Squared (Numbered) */

/*Need to write a program to print the pattern.

Input Format

4

Constraints

2<=n<=8 The given n should be even

Output Format

4444 4334 4334 4444

Sample Input 0

6
Sample Output 0

666666
655556
654456
654456
655556
666666 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int min = Math.min(i, j);
                min = Math.min(min, n - i - 1);
                min = Math.min(min, n - j - 1);
                System.out.print(Math.abs(min - n));
            }
            System.out.println();
        }
    }
}

/*Check if Array is Sorted and Rotated - 1752 */

/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of times (including possibly 0 times). Otherwise, return false.

An array A is a rotation of a sorted array if it can be obtained by rotating a sorted array B some number of positions (including 0). For example:

[3, 4, 5, 1, 2] is a rotation of [1, 2, 3, 4, 5].

Input Format

The first line contains an integer n – the size of the array.

The second line contains n space-separated integers – the array elements.

Constraints

1 <= n <= 100

-100 <= nums[i] <= 100

All elements may or may not be unique.

Output Format

Print true if the array is sorted and rotated; otherwise, print false.

Sample Input 0

5
3 4 5 1 2
Sample Output 0

true
Explanation 0

Enjoy the problem with more TestCases in LeetCode link

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = scan.nextInt();
        }
        int count=0;
        if(nums[0]<nums[nums.length-1])
        {
            count++;
        }
        for(int i=0;i<nums.length-1;i++)
        {
         if((nums[i]>nums[i+1]))
         {
           count++;
         }
           
        }
        if(count>1)
           {
                System.out.print("false");
           }
            else
            {
                System.out.print("true");
            }
    }
}

/*Goal Parser Interpretation - 1678 */

/*A command is given as a string command. The command string consists of the letters "G", "()", and/or "(al)" in some order. The goal is to interpret this command string and return a new string where:

"G" is interpreted as "G".

"()" is interpreted as "o".

"(al)" is interpreted as "al".

You need to return the final interpreted string.

Input Format

A string command representing the command.

Constraints

1 <= command.length <= 100 command consists of "G", "()", and/or "(al)" in some order.

Output Format

A string that is the result of interpreting the command.

Sample Input 0

G()(al)
Sample Output 0

Goal */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder string = new StringBuilder();
       for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G') {
                string.append('G');
            }
            else if (str.charAt(i) == '(') 
            {
                if (str.charAt(i + 1) == ')') 
                {
                    string.append('o');
                    i++; 
                } 
                else 
                {
                    string.append("al");
                    i += 3; 
                }
            }
        }

        System.out.print(string.toString());
    }
}


/*Subarray Sums Divisible by K - 974 */

/*Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum is divisible by k.

Input Format

The first line contains two integers n and k – the size of the array and the divisor.

The second line contains n space-separated integers – the array elements.

Constraints

1 <= n <= 3 * 10^4

-10^4 <= nums[i] <= 10^4

1 <= k <= 10^4

Output Format

Print a single integer – the number of subarrays whose sum is divisible by k.

Sample Input 0

6 5  
4 5 0 -2 -3 1
Sample Output 0

7
Explanation 0

There are 7 subarrays with a sum divisible by k = 5: [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}