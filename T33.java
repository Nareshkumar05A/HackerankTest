/*Pattern Hollow Pyramid */

/*Given an integer N, print a hollow pyramid pattern of height N using asterisks (*).

Input Format

A single integer N representing the number of rows.

Constraints

1 ≤ N ≤ 100

Output Format

Print a hollow pyramid of height N with asterisks.

Use spaces for the hollow part inside.

Each row must be printed on a new line.

No trailing spaces.

Sample Input 0

5
Sample Output 0

    *    
   * *   
  *   *  
 *     * 
*********
Submissions: 156
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 */

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
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        
        }
    }



/*Count of Two-Wheelers and Four-Wheelers */

/*An automobile company manufactures both two-wheelers (TW) and four-wheelers (FW). You are given:

Total number of vehicles V (two-wheelers + four-wheelers)

Total number of wheels W

Your task is to calculate how many two-wheelers and four-wheelers the company should produce.

Input Format

First line: Integer V → total number of vehicles

Second line: Integer W → total number of wheels

Constraints

0 ≤ V ≤ 1000

0 ≤ W ≤ 5000

The number of wheels should be even

Each two-wheeler has 2 wheels

Each four-wheeler has 4 wheels

A valid solution must exist (i.e., no fractional vehicles)

Output Format

Print the number of two-wheelers and four-wheelers in this format:

TW=x FW=y

Sample Input 0

200
540
Sample Output 0

TW=130 FW=70
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int w = scan.nextInt();
        int FN = (4 * v - w) / 2;
        int NF = Math.abs(FN - v);
        System.out.print("TW="+FN+" "+"FW="+NF);
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

Print all subsets for the given array. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sub(arr,0,new ArrayList<Integer>());
    }
    public static void sub(int arr[], int i, List<Integer> temp)
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
}

/*Convertion Decimal to Binary */

/*You are given a decimal number. Your task is to convert it to its binary equivalent.

Input Format

A single integer N, the decimal number.

Constraints

0 ≤ N ≤ 10⁶

Output Format

Print the binary equivalent of the decimal number.

Sample Input 0

5
Sample Output 0

101
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
        
       String binary = Integer.toBinaryString(n);
        System.out.print(binary);
        
    }
}