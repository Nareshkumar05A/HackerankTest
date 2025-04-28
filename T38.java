/*Pattern Hollow Hour Glass */

/*Given an integer n, print a hollow hourglass pattern using asterisks (*).

The hollow hourglass consists of two parts: an inverted pyramid and a normal pyramid, with a hollow space in the middle. The asterisks form the boundary, and the inside is hollow.

Input Format

A single integer n, the number of rows for the upper half of the hourglass.

Constraints

1 ≤ n ≤ 50

Output Format

Print the hollow hourglass pattern using *

Sample Input 0

6
Sample Output 0

* * * * * * * * * * 
  *           *     
    *       *       
      *   *         
        *           
      *   *         
    *       *       
  *           *     
* * * * * * * * * * 
Sample Input 1

5
Sample Output 1

* * * * * * * * * 
  *         *     
    *     *       
      *   *       
        *         
      *   *       
    *     *       
  *         *     
* * * * * * * * * 
 */

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;
 
 public class Solution {
 
     public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
         int row=scan.nextInt();
         for(int i=1;i<=row;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 if((i+j)%2==0)
                 {
                     System.out.print("1"+" ");
                 }else
                 {
                     System.out.print("0"+" ");
                 }
             }
             System.out.println();
         }
     }
 }

 /*Height sum */

 /*Ved and Varun are members of Shaastra’s CnL team and want to watch a movie from outside the OAT gate. They can stand on stacked chairs to increase their height.

Ved has a height of 𝐾 and Varun has a height of P.There are N chairs available, each with a height A[i]. The tallest chair is given to Ved. The remaining chairs are given to Varun, who can stack them as needed.

Input Format

For each test case:

first line --> Three integers: 𝑁,𝐾,𝑃(Number of chairs, Ved’s height, Varun’s height).

A second line --> list of N integers A[i] — the heights of the chairs.

Constraints

1<=n<=100 i<=k,p,A[i]<=100

Output Format

For each test case, print "Ved", "Varun", or "Equal" based on who has the greater combined height.

Sample Input 0

2 4 2
1 3
Sample Output 0

Ved
Explanation 0

N = 2 (There are 2 chairs).

K = 4 (Ved's height is 4).

P = 2 (Varun's height is 2).

Chairs = [1, 3].

Step 1: Assign Chairs

 i)The tallest chair is 3, so it is given to Ved.

ii)The remaining chair (1) is given to Varun.
Step 2: Calculate Heights

 i)Ved's total height = K + tallest chair

   → 4+3=7.

ii)Varun's total height = P + sum of remaining chairs

   → 2+1=3.
Step 3: Compare Heights

 i)Ved's height (7) is greater than Varun's height (3) Since Ved has a better view, the output is: "Ved"
Sample Input 1

3 2 4
1 1 4
Sample Output 1

Equal */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int V=scan.nextInt();
        int A=scan.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int MaxValue=arr[arr.length-1];
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
               count+=arr[i];
        }
        int varun=A+count;
        int ved=V+MaxValue;
        if(ved<varun)
        {
            System.out.println("Varun");
        }else if(ved>varun)
        {
            System.out.println("Ved");
        }
        else
        {
            System.out.println("Equal");
        }
        
    }
}