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

* * * * * * * * * * * 
  *               * 
    *           * 
      *       * 
        *   * 
          * 
        *   * 
      *       * 
    *           * 
  *               * 
* * * * * * * * * * *
Sample Input 1

5
Sample Output 1

* * * * * * * * * 
  *           * 
    *       * 
      *   * 
        * 
      *   * 
    *       * 
  *           * 
* * * * * * * * * 
Submissions: 69
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
 */

 import java.util.Scanner;

public class HollowHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalWidth = 2 * n - 1;
        printLineOfStars(totalWidth);
        for (int i = 1; i < n; i++) {
            int spacesBefore = i;
            int spacesBetween = totalWidth - 2 * spacesBefore - 2;

            printSpaces(spacesBefore);
            System.out.print("*");
            if (spacesBetween >= 0) {
                printSpaces(spacesBetween);
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            int spacesBefore = i;
            int spacesBetween = totalWidth - 2 * spacesBefore - 2;

            printSpaces(spacesBefore);
            System.out.print("*");
            if (spacesBetween >= 0) {
                printSpaces(spacesBetween);
                System.out.print(" *");
            }
            System.out.println();
        }
        printLineOfStars(totalWidth);
    }

    static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  "); 
        }
    }

    static void printLineOfStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
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

So, 101010 (binary) = 52 (octal)

Still facing issue have a look at this article link */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int decimal = 0;
        int i = 0;
        while(binary > 0)
        {
            int digit = binary % 10;
            decimal += digit * Math.pow(2,i);
            binary /= 10;
            i++;
        }
        int[] octal = new int[20];
        int h = 0;
        while(decimal > 0)
        {
            int digit = decimal % 8;
            octal[h++]= digit;
            decimal /= 8;
        }
        for(int j = h - 1; j >= 0; j--)
        {
            System.out.print(octal[j]);
        }
    }
}

/*Merge Sorted Array - 88 */

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2, respectively.

-> Merge nums2 into nums1 as one sorted array.

-> nums1 has a length of m + n, where the first m elements denote the initial elements, and the last n elements are set to 0 and should be ignored.

-> You must modify nums1 in-place to form the merged sorted array.

Input Format

First line: Two integers m and n

Second line: m+n integers representing nums1

Third line: n integers representing nums2

Constraints

0 ≤ m, n ≤ 200

1 ≤ nums1[i], nums2[i] ≤ 10⁹

nums1 and nums2 are sorted in non-decreasing order.

Output Format

Output the merged and sorted nums1.

Sample Input 0

3 3
1 2 3 0 0 0
2 5 6
Sample Output 0

1 2 2 3 5 6
Explanation 0

The arrays we are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = n + m;
        int[] arr = new int[k];
        int[] arr1 = new int[m];
        for(int i = 0; i < k; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < m; i++)
        {
            arr1[i] = scan.nextInt();            
        }
        int[] fullArr = new int[n + m];
        int s = 0;
        for(int i = 0; i < n; i++)
        {
            fullArr[s++] = arr[i];
        }
        for(int j = 0; j < m; j++)
        {
            fullArr[s++] = arr1[j];
        }
        Arrays.sort(fullArr);
        for(int num : fullArr)
        {
            System.out.print(num+" ");
        }
    }
}

/*Power of Four - 342 */

/*Given an integer n, return true if it is a power of four. Otherwise, return false.

Input Format

A single integer n.

Constraints

-2^31 <= n <= 2^31 - 1

Output Format

Print true or false.

Sample Input 0

16
Sample Output 0

true */

import java.io.*;
import java.util.*;

public class Solution {
        public static boolean PowerOfFour(int n)
        {
            if(n <= 0) return false;
            if((n & (n - 1)) != 0) return false;
            return (n & 0x55555555) != 0;

        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(PowerOfFour(n))
        {
            System.out.print("true");
        }
        else
        {
            
            System.out.print("false");
        }
    }
}