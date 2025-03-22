/*Partition Array 1 */

/*You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

Every element less than pivot appears before every element greater than pivot. Every element equal to pivot appears in between the elements less than and greater than pivot. The relative order of the elements less than pivot and the elements greater than pivot is maintained. More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj. Return nums after the rearrangement.

Input Format

The First line of the input contains the size of the array N. The second line of the input contains N space separated integers. And the third line of the input contains a integer pivot element.

Constraints

1 <= nums.length <= 105 -106 <= nums[i] <= 106 pivot equals to an element of nums.

Output Format

Output the new array partitioned according to the pivot element.

Sample Input 0

6
9 12 5 10 14 10
10
Sample Output 0

9 5 10 10 12 14
Explanation 0

5, 9 (less than 10) 10, 10 (equal to 10) 12, 14 (greater than 10)

 */

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
        
        int pivot = scan.nextInt();
        int[] result = new int[n];
        
        int index = 0;
        for(int num : arr)
        {
            if(num < pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num == pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num > pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : result)
        {
            System.out.print(num+" ");
        }
        
    }
}


/*Pattern Lower Right Triangle(Right) */

/*Print the following Pattern.

Input Format

The first line of the input contains the integer n.

Constraints

1≤N≤1000 (N is the number of rows)

Output Format

Print the pattern

Sample Input 0

5
Sample Output 0

        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
Explanation 0

Print the pattern accordingly.

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


/* 42 Trapping rain water 50 */

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

6
Explanation 0

video reference YTube link

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] height = new int[n];
        
        for(int i=0;i<n;i++)
        {
            height[i]=scan.nextInt();
        }
        int[] pre = new int[n];
        int[] suf = new int[n];
        
        int max = height[0];
        for(int i=0;i<n;i++)
        {
            if(height[i] >= max)
            {
                max = height[i];
            }
            pre[i] = max;
        }
        
        max = height[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(height[i] > max)
            {
                max = height[i];
            }
            suf[i] = max;
        }
        
        int result = 0;
        for(int i=0;i<height.length;i++)
        {
            int ans = Math.min(pre[i],suf[i]);
            result += Math.abs(ans - height[i]);
        }
        
        System.out.print(result);
    }
}


/*Find Stable Mountain's Place */

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

Mountain 3 is stable because height[2] == 3 is greater than threshold == 2. Mountain 4 is stable because height[3] == 4 is greater than threshold == 2.

 */

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