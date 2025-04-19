/*power of four 4 */

/*Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4^x.

Input Format

input is a number

Constraints

1<=n<=100000

Output Format

true or false

Sample Input 0

16
Sample Output 0

true */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n/=4;
        }
        return true;
    }
}


/*color cell */

/*You are given an infinitely large two-dimensional grid of uncolored unit cells. You need to perform the following process for n minutes:

At the first minute, color any one arbitrary unit cell blue. Every minute thereafter, color blue every uncolored cell that touches a blue cell (up, down, left, or right). Given an integer n, return the total number of colored cells at the end of n minutes.

image

Input Format

input should be a number

Constraints

1<=n<=100

Output Format

output should be a number

Sample Input 0

10
Sample Output 0

181 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans=1+4*(n*(n-1))/2;
        System.out.print(ans);
    }
}

/*Fold matrix */

/*Given an N x M matrix, fold it vertically at the middle and sum the overlapping elements. Then, fold it horizontally at the middle and sum the overlapping elements again. Return the final folded matrix.

If N or M is odd, the extra row/column without a pair should be ignored during folding.

Input Format

The first line contains two integers N and M (dimensions of the matrix). The next N lines contain M integers each, representing the matrix.

Constraints

2≤N,M≤100

Output Format

Print the final folded matrix after applying both vertical and horizontal folds.

Sample Input 0

4
1  2  3  4
5  6  7  8
9 10 11 12
13 14 15 16
Sample Output 0

34 34
34 34
Explanation 0

Vertical Fold:

   (1+4)  (2+3)  →  5   5
   (5+8)  (6+7)  →  13 13
   (9+12) (10+11) →  21 21
   (13+16) (14+15) →  29 29
New matrix:

   5  5  0 0
   13 13 0 0
   21 21 0 0
   29 29 0 0
Horizontal Fold:

   (5+29)   (5+29)   →  34 34
   (13+21)  (13+21)  →  34 34
Result matrix:

   34 34 0 0
   34 34 0 0
   0  0  0 0
   0  0  0 0
Output should be:

 34 34
 34 34
Sample Input 1

6
1  2  3  4  5  6
7  8  9 10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30
31 32 33 34 35 36
Sample Output 1

74 74 74
74 74 74
74 74 74 */


import java.util.*;
public class MatrixFold {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=scan.nextInt();
            }
        }
       
        int[][] result=new int[n/2][n/2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
                {
                    mat[i][j]+=mat[i][n-j-1];
                }
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n/2;j++)
                {
                    mat[i][j]+=mat[n-i-1][j];
                }
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n/2;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            System.out.println();
        }
    }
}
