/*Pattern Hollow Diamond */

/*You are given an integer N. Your task is to print a hollow diamond pattern of height 2*N - 1

Input Format

A single integer N representing the number of rows in the upper half of the diamond

Constraints

1 ≤ N ≤ 100

Output Format

Print the hollow diamond pattern using asterisks (*) and spaces.

Each row must be printed on a new line.

There should be no trailing spaces

Sample Input 0

3
Sample Output 0

  *  
 * * 
*   *
 * * 
  *   */

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");   
            }
            System.out.print("*");
            if(i > 1)
            {
                for (int j = 1; j <= 2*(i - 1) - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--)
        {
             for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");   
            }
            System.out.print("*");
            if(i > 1)
            {
                for (int j = 1; j <= 2*(i - 1) - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*Disarium Number 12 */

/*You are given an integer N. A number is called a Disarium number if the sum of its digits powered with their respective positions is equal to the number itself. Your task is to determine whether the number is Disarium or not.

Input Format

A single integer N

Constraints

1≤N≤10^5

Output Format

Print 1 if the number is a Disarium number Print 0 otherwise

Sample Input 0

89
Sample Output 0

1
Explanation 0

8^1 + 9^2 = 8 + 81 = 89 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int num = 0;
        int i = 1;
        String str = String.valueOf(n);
        int k = str.length();
        while(n != 0)
        {
            int digit = n % 10;
            num += Math.pow(digit,k);
            n /= 10;
            k--;
        }
        //System.out.print(num);
        if(temp == num)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }
}

/*LCM And GCD 11 */

/*Given two integers a and b, your task is to compute and return their Least Common Multiple (LCM) and Greatest Common Divisor (GCD). Return the result in an array where the first element is the LCM and the second element is the GCD.

Input Format

A single line containing two space-separated integers: a and b.

Constraints

1≤a,b≤10^9

Output Format

Print the result as an array in the format: [LCM, GCD]

Sample Input 0

5 10
Sample Output 0

[10, 5] */

import java.io.*;
import java.util.*;

public class Solution {
   public static long Hcf(long num1, long num2)
   {
       return num2 == 0?num1:Hcf(num2, num1 % num2);
  }
    public static long GCD(long num1, long num2)
    {
        long h = 0;
        for(int i = 1; i <= num1 || i <= num2; i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
               h = i;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextInt();
        long num2 = scan.nextInt();
        long hcf = Hcf(num1, num2);
        long lcm = (num1 * num2) / hcf;
        long gcd = GCD(num1, num2);
        System.out.print("["+lcm+", "+gcd+"]");
    }
}

/*Permutation - 46 */

/*You are given a string S. Your task is to print all possible Permutation of the string in lexicographical order.

Input Format

A single string S of length n.

Constraints

1 ≤ n ≤ 8

The string consists of distinct lowercase English letters.

Output Format

Print all permutations of the string, one per line.

Permutations should be in lexicographical order.

Note : If you are still Facing challenges to solve this problem see the reference YTube link not now at home

Sample Input 0

abc
Sample Output 0

abc
acb
bac
bca
cab
cba */

import java.io.*;
import java.util.*;

public class Solution {
    public static void permutation(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
        }
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String r = str.substring(0,i)+str.substring(i+1);
            permutation(r, ans + ch);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        permutation(str,"");
    }
}

/*Subsets - 78 */

/*Given an array of distinct integers, return all possible subsets (the power set), in reverse order — that is, subsets with more elements should come first, and the empty subset should come last.

The solution set must not contain duplicate subsets, and you may return the elements inside each subset in any order.

Input Format

The first line contains a single integer n – the number of elements in the array.

The second line contains n space-separated integers – the elements of the array.

Constraints

1 <= n <= 10

-10 <= nums[i] <= 10

All elements in the array are distinct.

Output Format

Print all subsets (each on a new line) as space-separated integers.

Subsets can be printed in any order.

Elements in each subset can be in any order or sorted.

Sample Input 0

3
1 2 3
Sample Output 0

1 2 3 
1 2 
1 3 
1 
2 3 
2 
3 
Explanation 0

Print all subsets for the given array.

Facing challenge or difficulty to understand learn here

Enjoy the problem with more Test Cases in Leetcode. link */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void sub(int[] arr, int i, List<Integer>temp)
    {
        if(i == arr.length)
        {
            if(!temp.isEmpty())
            {
                for(int num : temp)
                {
                    System.out.print(num+" ");                    
                }
                System.out.println();
            }
            return;
        }
        temp.add(arr[i]);
        sub(arr,i+1, temp);
        temp.remove(temp.size()-1);
        sub(arr,i+1, temp);
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        sub(arr, 0, new ArrayList<Integer>());
    }
}