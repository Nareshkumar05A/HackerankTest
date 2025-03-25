/*Move Zeros - 283 */

/*Given an integer array nums, move all 0's to the end of the array while maintaining the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1

Output Format

Print the modified array after moving all zeroes to the end.

Sample Input 0

5  
0 1 0 3 12  
Sample Output 0

1 3 12 0 0  
Explanation 0

All non-zero elements are shifted to the left, and all zeroes are moved to the right while keeping the relative order. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = scan.nextInt();
        }
        int j = 0;
        for(int i=0;i<n;i++)
        {
            if(input[i] != 0)
            {
                  int temp = input[i];
                  input[i] = input[j];
                  input[j] = temp;
                j++;
            }
        }
        for(int num : input)
        {
            System.out.print(num+" ");
        }
    } 
}

/*Pattern Upper Right Triangle(right) */

/*Given an integer N, print an upper right triangle pattern using the number sequence 1 to N in each row. The pattern should be right-aligned, with the first row containing N numbers, the second row containing N-1 numbers, and so on, until the last row contains only one number.

Input Format

A single integer N, representing the number of rows in the pattern.

Constraints

1≤N≤100

Output Format

Print N lines of numbers forming a right-aligned upper triangle.

Sample Input 0

5
Sample Output 0

1 2 3 4 5  
  2 3 4 5  
    3 4 5  
      4 5  
        5   */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*Find Pivot Index - 724 */

/*Given an array of integers nums, find the pivot index.

The pivot index is the index where the sum of all elements to the left is equal to the sum of all elements to the right.

If no such index exists, return -1. If there are multiple pivot indexes, return the leftmost pivot index.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 104 -1000 <= nums[i] <= 1000

Output Format

Print a single integer, the pivot index. If no pivot index is found, print -1.

Sample Input 0

6  
1 7 3 6 5 6 
Sample Output 0

3
Explanation 0

The sum of elements left of index 3 (1 + 7 + 3 = 11) is equal to the sum of elements right of index 3 (5 + 6 = 11). So, pivot index = 3. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = scan.nextInt();
        }
        int totalSum = 0, leftSum = 0;
        for(int num : input)
        {
            totalSum += num;
        }
        for(int i=0;i<n;i++)
        {
            if(leftSum == totalSum - leftSum - input[i])
            {
                System.out.print(i);
                return;
            }
            leftSum += input[i];
        }
        System.out.print(-1);
    }
}

/*Transform Array by Parity - 3467 */

/*You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:

Replace each even number with 0.

Replace each odd number with 1.

Sort the modified array in non-decreasing order.

Return the resulting array after performing these operations.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 100 1 <= nums[i] <= 1000

Output Format

Print the transformed array as a single line of space-separated integers.

Sample Input 0

4
4 3 2 1
Sample Output 0

0 0 1 1
Explanation 0

Replace even numbers (4 and 2) with 0 and odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].

After sorting in non-decreasing order, nums = [0, 0, 1, 1]. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = scan.nextInt();
            input[i] = (input[i]%2==0) ? 0 : 1;
        }
        Arrays.sort(input);
        for(int num : input)
        {
            System.out.print(num+" ");
        }
    }
}

/*Largest Odd Number in String - 1903 */

/*Given a string num representing a large integer, return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists. A substring is a contiguous sequence of characters within a string. Return "-1" if there is no odd number.

Input Format

A single line containing the string num.

Constraints

1 <= num.length <= 105 num only consists of digits and does not contain any leading zeros.

Output Format

Print the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

Sample Input 0

52
Sample Output 0

5
Explanation 0

The non-empty substrings are "5", "2", and "52". Among these, "5" is the largest odd number. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int ans = 0;
        for(int i=0;i<str.length();i++) 
        {
            int val = 0;
            for(int j=i;j<str.length();j++)
            {
                int rem = Character.getNumericValue(str.charAt(j)); 
                val = val * 10 + rem; 
                if(val % 2 != 0)
                {
                    ans = Math.max(val,ans);
                }
            }
        }
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("-1");
        } 
    }
}

