/*Snake Printing 2 */

/*print a following pattren using array matrix.

Input Format

3 3 1 6 7 2 5 8 3 4 9

Constraints

Input should be a matrix

Output Format

1 6 2 3 5 7 8 4 9

Sample Input 0

4
4
1 2 3 4
5 6 7 8
1 2 3 4
5 6 7 8
Sample Output 0

1 2 5 1 6 3 4 7 2 5 6 3 8 4 7 8 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=scan.nextInt();
            }
        }
        int k=0;
        while(k<n+m-1)
        {
            if(k%2==0)
            {
                for(int i=n-1;i>=0;i--)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i+j==k)
                        {
                            System.out.print(mat[i][j]+" ");
                        }
                    }
                }
            }
            else
            {
                for(int s=0;s<n;s++)
                {
                    for(int a=n-1;a>=0;a--)
                    {
                        if(s+a==k)
                        {
                            System.out.print(mat[s][a]+" ");
                        }
                    }
                }
            }
            k++;
        }
    }
}

/*permutation 27 */

/*Given a string s, return all possible Permutation of the string. The permutations should not contain duplicates if the input has unique characters. If the input has duplicate characters, ensure that permutations are not repeated.

Input Format

input should be a string

Constraints

1<=n<=100

Output Format

output should be a array

Note : If you are still Facing challenges to solve this problem see the reference YTube link not now at home

Sample Input 0

abc
Sample Output 0

[abc, acb, bac, bca, cab, cba] */

import java.io.*;
import java.util.*;

public class Solution {
    public static void permutation(String str,String ans,List<String>result)
    {
        if(str.length()==0)
        {
            result.add(ans);
        }
        for(int i=0;i<str.length();i++)
        {
            char a=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            permutation(res,ans+a,result);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        List<String>result = new ArrayList<String>();
        permutation(str,"",result);
        System.out.print(result);
    }
}

/*Spiral Matrix II 1 */

/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Input Format

Input: n = 3

Constraints

1100.

Output Format

Output: [[1,2,3],[8,9,4],[7,6,5]]

Sample Input 0

5
Sample Output 0

1 2 3 4 5  
16 17 18 19 6  
15 24 25 20 7  
14 23 22 21 8  
13 12 11 10 9   */

import java.io.*;import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] matrix=new int[n][n];
        int count=1,cls=0,rs=0,re=n-1,cle=n-1;
        while (cls<=cle&&rs<=re)
        {
            for (int i=cls;i<=cle;i++) 
            {
                matrix[rs][i]=count++;
            }
            rs++;
            for (int i=rs;i<=re;i++)
            {
                matrix[i][cle]=count++;
            }
            cle--;
            if (rs<=re)
            {
                for (int i=cle;i>=cls;i--)
                {
                    matrix[re][i]=count++;
                }
                re--;
            }
            if (cls<=cle) {
                for (int i=re;i>=rs;i--)
                {
                    matrix[i][cls]=count++;
                }
                cls++;
            }
        }
        for (int i = 0; i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


/*Max count between positive and negative */

/*Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.

Input Format

The first line of the input contains the size of the array N. The second line has N space separated integers array nums.

Constraints

1 <= nums.length <= 2000.

-2000 <= nums[i] <= 2000.

nums is sorted in a non-decreasing order.

Can you solve the problem in O(log(n)) time complexity?

Output Format

Print the Maximum between the positive and negative count of an array.

Sample Input 0

8  
-4 -3 -2 -1 1 2 3 4  
Sample Output 0

4
Explanation 0

Negative count = 4 (-4, -3, -2, -1) Positive count = 4 (1, 2, 3, 4) Maximum = 4 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int P=0,N=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            else if(arr[i]>0)
            {
                P++;
            }
            else
            {
                N++;
            }
        }
        int Max=Math.max(P,N);
        System.out.print(Max);
    }
}

/*Rising temperature 1 */

/*Given an array of integers temperatures represents the daily temperatures, print an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Input Format

8
73 74 75 71 69 72 76 73

Constraints

solve it brute force then try to solve in O(n) using stack .

Output Format

1 1 4 2 1 1 0 0

Sample Input 0

8
73 74 75 71 69 72 76 73
Sample Output 0

1 1 4 2 1 1 0 0 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int[] result=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        for(int ch:result)
        {
            System.out.print(ch+" ");
        }
    }
}