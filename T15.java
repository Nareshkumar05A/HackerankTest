/*Search Element 5 */

/*Write a program to find out the key in the given array.

Input Format

10 3 4 5 6 7 8 9 10 11 13 10

Constraints

input should be the array

Output Format

7

Sample Input 0

6
1 2 3 5 3 6
3
Sample Output 0

4 */

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
        int target=scan.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                System.out.print(i);
                break;
            }
        }
    }
}

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
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=scan.nextInt();
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
                            System.out.print(matrix[i][j]+" ");
                        }
                    }
                }
            }
            else
            {
                for(int h=0;h<n;h++)
                {
                    for(int f=n-1;f>=0;f--)
                    {
                        if(h+f==k)
                        {
                              System.out.print(matrix[h][f]+" ");
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

[abc, acb, bac, bca, cab, cba]
Submissions: 37
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
 */

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
            char ch=str.charAt(i);
            String r=str.substring(0,i)+str.substring(i+1);
            permutation(r,ans+ch,result);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        List<String>result=new ArrayList<>();
        permutation(str,"",result);
        System.out.print(result);
    }
}

/* Rising temperature 1*/

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
        int[] answer=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                 int index=stack.pop();
                answer[index]=i-index;
            }
            stack.push(i);
        }
        for(int c:answer)
        {
            System.out.print(c+" ");
        }
    }
}

/*candies-Zoho question */

/*There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy. Children with a higher rating get more candies than their neighbors. Return the minimum number of candies you need to have to distribute the candies to the children.

Input Format

3
1 0 2

Constraints

NULL

Output Format

5

Sample Input 0

3
1 0 2
Sample Output 0

5
Explanation 0

You can allocate to the first, second and third child with 2, 1, 2 candies respectively. */

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
        int[] left=new int[n];
        Arrays.fill(left,1);
        
        for (int i=1;i<n;i++) 
        { 
            if(arr[i]>arr[i-1]) 
            {
                left[i]=left[i-1]+1;
            }
        }
        int total=left[n-1];
        int right=1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                right++;
            }
            else
            {
                right=1;
            }
            total+=Math.max(left[i],right);
        }
        
        System.out.print(total);
    }
}