/*Find Gcd 9 */

/*For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Input Format

input should be two Strings

Constraints

1<=n<=100

Output Format

output should be an string

Sample Input 0

ABCABCABC
ABCABC
Sample Output 0

ABC
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        int num1=str1.length();
        int num2=str2.length();
        int hcf=0;
          for (int i=1;i<=num1||i<=num2;i++)
                {
                  if (num1%i==0&&num2%i==0)
                       {
                             hcf=i;
                     }
               }
             String res=str1.substring(0,hcf);
             System.out.print(res);
    
    }
}

/*Upper triangular and lower triangular sum */

/*Given an N × N square matrix, compute the sum of elements in the upper triangular and lower triangular parts separately.

The upper triangular matrix consists of all elements where(including the diagonal).

The lower triangular matrix consists of all elements where (including the diagonal).

Input Format

The first line contains an integer N representing the size of the square matrix.

The next N lines contain N space-separated integers representing the matrix elements.

Constraints

1<=n<=100

Output Format

Print two space-separated integers:

The sum of the upper triangular elements.

The sum of the lower triangular elements.

Sample Input 0

3
1 2 3
4 5 6
7 8 9
Sample Output 0

26 34
Explanation 0

Upper Triangular Elements :

 {1, 2, 3, 5, 6, 9} → Sum = 1 + 2 + 3 + 5 + 6 + 9 = 26
Lower Triangular Elements :

 {1, 4, 5, 7, 8, 9} → Sum = 1 + 4 + 5 + 7 + 8 + 9 = 34 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=scan.nextInt();
            }
        }
        int LowerSum=0,UpperSum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)
                {
                    LowerSum+=matrix[i][j];
                }
                if(i>=j)
                {
                    UpperSum+=matrix[i][j];
                }
            }
        }
        System.out.print( LowerSum+" "+UpperSum);
    }
}