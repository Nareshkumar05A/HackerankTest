/*Max Product of Array - 1464 */

/*Given an integer array nums, return the maximum product of two distinct elements in the array such that:nums[i] - 1) * (nums[j] - 1) where i ≠ j.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

2 <= nums.length <= 500 1 <= nums[i] <= 10^3

Output Format

Print a single integer, the maximum product of two distinct elements in the array using the given formula.

Sample Input 0

4  
3 4 5 2  
Sample Output 0

12
Explanation 0

If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)(nums[2]-1) = (4-1)(5-1) = 3*4 = 12. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length == 0)
        {
            System.out.print(0);
            return;
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int cot = (arr[i]-1) * (arr[i+1]-1);
            ans = Math.max(cot,ans);
        }
       System.out.print(ans);
    }
}

/*Pattern Upper Right Triangle(left) */

/*
Given an integer N, print the upper right triangle pattern of numbers. The first row should contain N numbers in increasing order from 1 to N, the second row should start from the second number and continue until N, and so on, until the last row contains only N.

Input Format

A single integer N, representing the number of rows in the pattern.

Constraints

1≤N≤100

Output Format

Print N lines of numbers forming an upper right triangle.

Sample Input 0

5
Sample Output 0

1 2 3 4 5  
2 3 4 5  
3 4 5  
4 5  
5  
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*Find Indices of Stable Mountains - 3285 */

/*There are n mountains in a row, and each mountain has a height. You are given an integer array height where height[i] represents the height of mountain i, and an integer threshold.

A mountain is called stable if the mountain just before it (if it exists) has a height strictly greater than threshold. Note that mountain 0 is not stable.

Return an array containing the indices of all stable mountains in any order.

Input Format

The First line of the input contains the size of the array N. The second line of the input contains N space separated integers. And the third line have the threshold give 5 test cases

Constraints

2 <= n == height.length <= 100 1 <= height[i] <= 100 1 <= threshold <= 100

Output Format

Output the indices of the stable mountains.

Sample Input 0

5
1 2 3 4 5
2
Sample Output 0

3 4
Explanation 0

Input: height = [1,2,3,4,5], threshold = 2

Output: [3,4]

Explanation:

Mountain 3 is stable because height[2] == 3 is greater than threshold == 2. Mountain 4 is stable because height[3] == 4 is greater than threshold == 2. */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int threshold = scan.nextInt();
        for(int i=1;i<n;i++)
        {
            if(arr[i-1] > threshold)
            {
                System.out.print(i+" ");
            }
        }
    }
}

/*Single Number - 136 */

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 3 * 104 -3 * 104 <= nums[i] <= 3 * 104 Each element in the array appears twice except for one element which appears only once.

Output Format

Print a single integer, the unique number that appears only once in the array.

Sample Input 0

5  
2 2 1 3 3  
Sample Output 0

1
Explanation 0

In the given array 1 appears only once so the answer is 1.

Enjoy the Problem on leetcode with more Test Cases link

 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int single = 0;
        for(int num : arr)
        {
            single ^= num;
        }
        System.out.print(single);
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

    public static int pivot(int[] arr,int n)
    {
        int totalSum = 0;
        int leftSum = 0;
        for(int num : arr)
        {
            totalSum += num;
        }
        for(int i=0;i<n;i++)
        {
            if(leftSum == totalSum - leftSum - arr[i])
            {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print(pivot(arr,n));
    }
}