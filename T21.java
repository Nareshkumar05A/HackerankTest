/*Strong Number Check 3 */

/*A Strong Number is a number whose sum of the factorial of its digits is equal to the original number.

For example, 145 is a Strong Number because: 1! + 4! + 5! = 1 + 24 + 120 = 145

You need to write a program to check whether a given number is a Strong Number or not.

Input Format

A single integer N

Constraints

1≤N≤10^5

Output Format

Print "YES" if the number is a Strong Number. Otherwise, print "NO"

Sample Input 0

145
Sample Output 0

YES
Explanation 0

1! + 4! + 5! = 1 + 24 + 120 = 145, so it is a Strong Number. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int original=num;
        if(num==0)
        {
            System.out.print("NO");
            return;
            
        }
        int sum=0;
        while(num!=0)
        {
            int fact=1;
            int digit=num%10;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
       
        if(original==sum)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}

/*Pattern X filled */

/*Print the given pattern

Input Format

A single integer N (1 ≤ N ≤ 100)

Constraints

1 ≤ N ≤ 100

Output Format

Print the pattern as described.

Sample Input 0

3
Sample Output 0

1         1
1 2     2 1
1 2 3 3 2 1
1 2     2 1
1         1
Explanation 0

Analyse and print the pattern accordingly */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=0;j<2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}

/*Binary to Octal 4 2 */

/*This program takes a binary number as input and converts to octal.

Input Format

1010111100

Constraints

Input should be binary number

Output Format

1274

Sample Input 0

10010110
Sample Output 0

226 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int binary=scan.nextInt();
        int decimal=0;
        int n=0;
        while(binary>0)
        {
            int temp=binary%10;
            decimal+=temp*Math.pow(2,n);
            binary/=10;
            n++;
        }
        int[] octal=new int[20];
        int i=0;
        while(decimal>0)
        {
            int r=decimal%8;
            octal[i++]=r;
            decimal/=8;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(octal[j]);
        }
    }
}