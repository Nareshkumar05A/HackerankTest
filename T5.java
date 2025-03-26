/*Pattern Pyramid (Odd) */
/*
Given an integer n, print a pyramid pattern of asterisks (*) with n rows.

Each row should contain an increasing number of * with spaces for alignment to form a centered pyramid.

Input Format

A single integer n representing the number of rows in the pyramid.

Constraints

1≤n≤100 (1 ≤ n ≤ 100)

Output Format

Print a pyramid pattern of n rows.

Sample Input 0

5
Sample Output 0

        *    
      * * *  
    * * * * *  
  * * * * * * *  
* * * * * * * * *  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n -i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j < 2 * i - 1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*Find the Duplicate Number - 287 */

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Leetcode link:-

 [find duplicate number](https://leetcode.com/problems/find-the-duplicate-number/description/)
Input Format

input should be an array

Constraints

1 <= n <= 10^5

Output Format

output should be an number

Sample Input 0

5
1 3 2 4 3
Sample Output 0

3
 */

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
       Arrays.sort(arr);
        
        int num = 0;
       for(int i=0;i<n-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                num = arr[i];
            }
           
         
        }
        if(num != 0)
        {
            System.out.print(num);
        }
        else
        {
            System.out.print(-1);
        }
    }
}

/*Next greater element 45 */

/*Given an array of distinct integers, find the next greater element for each element in the array. The next greater element of an element x is the first greater element that appears to its right in the array. If no greater element exists, return -1.

LEETCODE LINK:-

       [NEXT GREATER ELEMENT](https://leetcode.com/problems/next-greater-element-i/description/)
Input Format

input should be an array

Constraints

1<=n<=100

Output Format

output should be a array

Sample Input 0

4
3 8 10 5
Sample Output 0

5 10 -1 -1 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner p = new Scanner(System.in);
        int n =  p.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = p.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int ans  = Integer.MAX_VALUE;;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    ans  = Math.min(ans,arr[j]);
                }
            }
            if(ans!=Integer.MAX_VALUE) System.out.print(ans+" ");
            else System.out.print("-1"+" ");
        }
            
        
    }
}

/*Missing number - 268 */

/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

LEETOCE LINK:-

   [MISSING NUMBER](https://leetcode.com/problems/missing-number/)
Input Format

input should be a array

Constraints

1<=n<=100

Output Format

output should be an number

Sample Input 0

4
3 1 0 2
Sample Output 0

4 */

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
         int xor1=0;
        int xor2=0;
        for(int i=1;i<=arr.length;i++)
        {
            xor1^=i;
        }
        for(int num:arr)
        {
            xor2^=num;
        }
        System.out.print(xor1^xor2);
    }
}

/*Java Stack */

/*In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true */

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character>stack = new Stack<>();
            boolean flag = true;
            for(int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == '{')
                {
                    stack.push('}');
                }
                else if(input.charAt(i) == '(')
                {
                    stack.push(')');
                }
                else if(input.charAt(i) == '[')
                {
                    stack.push(']');
                }
                else if(stack.isEmpty() || stack.pop() != input.charAt(i))
                {
                    flag = false;
                    break;
                }
            }
            if(!stack.isEmpty())
            {
                flag = false;
            }
            System.out.println(flag);
		}
		
	}
}


