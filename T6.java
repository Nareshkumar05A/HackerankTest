/*Multiplication Table */

/*Write a program that takes an integer n as input and returns a multiplication table from 1 to 10 for that number as an array.

Input Format

A single integer n.

Constraints

1 ≤ n ≤ 1000 (The number should be positive and within a reasonable range.)

Output Format

An array containing 10 integers, where the i-th element represents n * i (for 1 ≤ i ≤ 10).

Sample Input 0

5
Sample Output 0

[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
Explanation 0

Multiplication table for 5: 5×1=5, 5×2=10, ..., 5×10=50

Enjoy the Problem with more Test Cases in GFG. link

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[10];
        int ind = 0;
        for(int i = 1; i <= 10; i++)
        {
            arr[ind++] = i * n;
        }
        System.out.print(Arrays.toString(arr));
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

/*Convert Date to Binary - 3280 */

/*You are given a date in the format "DD-MM-YYYY". Convert the date into its binary representation without using any built-in functions for integer-to-binary conversion.

Each part of the date should be converted to binary as follows:

Day (DD): Represented in 5 bits (since max 31 → 11111).

Month (MM): Represented in 4 bits (since max 12 → 1100).

Year (YYYY): Full binary representation.

Input Format

A single string date in the format "DD-MM-YYYY".

Constraints

01 <= DD <= 31

01 <= MM <= 12

1900 <= YYYY <= 2100

Output Format

A string representing the binary conversion of the date in "DD-MM-YYYY" format.

Sample Input 0

25-03-2025
Sample Output 0

11001-11-11111101001
Explanation 0

25 → 11001

3 → 11

2025 → 11111101001 */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static String FindBinary(String string)
    {
        int num = Integer.parseInt(string);
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String strs = scan.next();
        StringBuilder result = new StringBuilder();
        String[] str = strs.split("-");
        for(int i = 0; i < str.length; i++)
        {
           result.append(FindBinary(str[i]));
           if(i < str.length - 1)
           {
               result.append("-");
           }
        }
        System.out.print(result.toString());
    }
}

/*Prime Pairs With Target Sum -2761 */

/*You are given an integer n. We say that two integers x and y form a prime number pair if:

1 <= x <= y <= n

x + y == n

x and y are prime numbers

Return the 2D sorted list of prime number pairs [xi, yi]. The list should be sorted in increasing order of xi. If there are no prime number pairs at all, return an empty array.

Note: A prime number is a natural number greater than 1 with only two factors, itself and 1. 
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

[]
*/

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

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            int ans = Integer.MAX_VALUE;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] < arr[j])
                {
                    ans = Math.min(ans, arr[j]);
                }
            }
            if(ans != Integer.MAX_VALUE) 
            {
                System.out.print(ans+" ");
            }
            else 
            {
                System.out.print("-1"+" ");
            }
        }
        
    }
}