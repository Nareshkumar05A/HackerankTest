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


/*Java Primality Test */

/*A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
Explanation

The only positive divisors of  are  and , so we print prime.

 */

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger num=new BigInteger(n);
        if(num.isProbablePrime(10))
        {
            System.out.print("prime");
        }
        else {
            System.out.print("not prime");
        }
        bufferedReader.close();
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
            boolean flag = true;
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == '(')
                {
                    stack.push(')');
                }
                else if(input.charAt(i) == '{')
                {
                    stack.push('}');
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

