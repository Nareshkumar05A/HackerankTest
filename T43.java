/*Diagonal check. */

/*You are given an m x n matrix. A Toeplitz matrix is a matrix in which every diagonal from the top-left to the bottom-right has the same elements.

Write a function that returns true if the given matrix is a Toeplitz matrix; otherwise, return false.

Input Format

n=3 m=4 matrix = [ [1, 2, 3, 4], [5, 1, 2, 3], [9, 5, 1, 2] ]

Constraints

1>=n,m<=100;

Output Format

true

Sample Input 0

4 5
7 8 9 10 11
4 7 8 9 10
1 4 7 8 9
0 1 4 7 8
Sample Output 0

true
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int m=p.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=p.nextInt();
            }
        }
        boolean flag=true;
                for(int j=0;j<n;j++)
                {
                   if(diagonal(arr,0,j,n,m)==false)
                   {
                       System.out.println("false");
                       flag=false;
                       break;
                   }
                }
        if(flag)
        {
            System.out.println("true");
        }
           
    }
    public static boolean diagonal(int[][]arr,int i,int j,int n,int m)
    {
        int val=arr[i][j];
        while(i<n&&j<m)
        {
            if(arr[i][j]!=val)
            {
                return false;
            }
            i++;
            j++;
            
        }
        return true;
    }
        
        
}

/*Array Of N Elements */

/*Create an array of  integers, where the value of  is passed as an argument to the pre-filled function in your editor. This challenge uses a custom checker, so you can create any array of  integers. For example, if , you could return , , or any other array of equal length.

Note: Code stubs are provided for almost every language in which you must either fill in a blank (i.e., ____) or write your code in the area specified by comments.

Method Signature Number Of Parameters: 1
Parameters: [n]
Returns: List or Vector
Input Format

A single integer, .

Constraints

The members returned by the list/vector/array must be integers.
Output Format

The function must return an array, list, or vector of  integers. Stub code in the editor prints this to stdout as a space, comma, or semicolon-separated list (depending on your submission language).

Note: Your output need not match the Expected Output exactly; the size of your printed list is confirmed by a custom checker, which determines whether or not you passed each test case.

Sample Input 0

10
Sample Output 0

[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Sample Input 1

3
Sample Output 1

[1, 2, 3]
*/


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           list.add(i);
        }
        
        System.out.print(list);
    }
}

/*odd sum possible */

/*You are given two binary strings A and B, each of length N. Your task is to make your score odd which is initially 0 by choosing N elements such that:

For each index i(1≤i≤N), you will select either A[i] or B[i]

If the character you select is equal to "1", add 1 to the score. If the character is "0", add nothing.

Your goal is to determine whether it is possible to make the score an odd number. If it is possible, print YES, otherwise print NO.

Input Format

For each test case:

The first line contains an integer

 -->N, the length of the strings A and B.
The second line contains

 -->N characters representing the binary string A.
The third line contains

 -->N characters representing the binary string B.
Constraints

1<=N<=100

Output Format

For each test case, output on a new line "YES" if it is possible to make score an odd number and "NO" otherwise.

Sample Input 0

3
110
101
Sample Output 0

YES
Explanation 0

Given Input:

A=110

B=101

Analysis:

 At index 1:

       Both A[0] and B[0] are 1, so you can pick 1 and add it to the score.

 At index 2:

       A[1]=1, so you can pick 1 (adding 1 to the score).

 At index 3:

       B[2]=1, so you can pick 1 (adding 1 to the score).
Total Score:

  You picked 1 at all three indices, so the total score is 3 (which is odd).
Since it's possible to make the score odd, the answer is YES.

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str1=scan.next();
        String str2=scan.next();
        int sum=0;
        for(int i=0;i<n;i++)
        {
                if(str1.charAt(i)=='1'||str2.charAt(i)=='1')
                {
                    sum++;
                }
        }
            
        
        if(sum%2==0)
        {
            System.out.print("NO");
        }else
        {
            System.out.print("YES");
        }
        
    }
}

/*Special array 3 */

/*An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

Note:-

Parity refers to the property of a number being either even or odd.

     -->A number has even parity if it is divisible by 2 (e.g., 2, 4, 6, 8).

     -->A number has odd parity if it is not divisible by 2 (e.g., 1, 3, 5, 7).
Input Format

The first line contains an integer N (1 ≤ N ≤ 100), representing the length of the array.

The second line contains N space-separated integers representing the array elements.

Constraints

1 ≤ N ≤ 100

Output Format

Return true if nums is a special array, otherwise, return false.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

true
Sample Input 1

1
4
Sample Output 1

false
 */

 import java.io.*;
import java.util.*;

public class Solution {

    
    public static boolean special(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            if((nums[i]%2)==(nums[i+1]%2)) {
                return false; 
 
            }
        }
        return true; 
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
          nums[i]=scan.nextInt();
        }
        if(nums.length==1)
        {
            System.out.print("false");
            
        }else{
       
               System.out.print(special(nums));  
        }
        }
    }


