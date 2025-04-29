/*Pattern Staircase with Stars */
 
/*Given an integer n, print a staircase pattern where for each i-th row: The number of * printed is equal to 2*i stars, separated by spaces.

Input Format

A single integer n — the number of rows to print.

Constraints

1 ≤ n ≤ 100

Output Format

Print the pattern with stars (*) separated by a space, according to the logic given.

Sample Input 0

6
Sample Output 0

* *
* *
* * * *
* * * *
* * * * * *
* * * * * * */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            int stars = ((i + 1) / 2) * 2;
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*Convertion Binary to Octal */

/*You are given a binary number as a string. Your task is to convert it to its octal representation and print the result.

Input Format

A single line containing a binary number B as a string.

Constraints

1 ≤ Length of B ≤ 30

B contains only characters 0 and 1

Output Format

Print the octal equivalent of the given binary number.

Sample Input 0

101010
Sample Output 0

52
Explanation 0

Step 1: Start from the right and group the binary digits in sets of 3:

101010 → 101 010

Step 2: Convert each 3-bit group into decimal (which gives one octal digit):

010 → 2

101 → 5

Step 3: Combine the octal digits in the same order:

So, 101010 (binary) = 52 (octal) */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int decimal = 0;
        int n = 0;
        while(binary > 0)
        {
            int digit = binary%10;  
            decimal += digit * Math.pow(2, n);  
            binary = binary/10;  
            n++;
        }
        int[] octal = new int[20];
        int i = 0;
        while(decimal > 0)
        {
            int r = decimal % 8;
            octal[i++] = r;
            decimal /= 8;
        }
        for(int j = i - 1; j >= 0; j--)
        {
            System.out.print(octal[j]);
        }
    }
}

/*Power of Two - 231 */

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two if there exists an integer x such that n == 2^x.

Input Format

A single integer n.

Constraints

-2^31 <= n <= 2^31 - 1

Output Format

Return true or false.

Sample Input 0

16
Sample Output 0

true */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.print("false");
            return;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                System.out.print("false");
                return;
            }
            n /= 2;
        }

        System.out.print("true");
    }
}

/*Count Primes - 204 */

/*Given an integer n, return the number of prime numbers that are strictly less than n.

Input Format

A single integer n.

Constraints

0 <= n <= 5 * 10⁶

Output Format

Print a single integer: count of prime numbers less than n.

Sample Input 0

10
Sample Output 0

4
Explanation 0

The primes from 1 to 10 are 2, 3, 5, 7. So the total number of primes upto to n(exclusive) is 4. */

import java.io.*;
import java.util.*;

public class Solution {

     public static int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(countPrimes(n));
    }
}