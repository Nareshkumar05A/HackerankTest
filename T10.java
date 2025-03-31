/*Pattern Alphabet (Low Left Triangle) */

/*You need to generate a pattern where the first row contains one letter, the second row contains two letters, the third row contains three letters, and so on. The letters should be in increasing order starting from 'A'. The pattern follows this sequence:

Input Format

A single integer N (1 ≤ N ≤ 26) representing the number of rows in the pattern.

Constraints

1 ≤ N ≤ 26

Output Format

Print the pattern as described.

Sample Input 0

3
Sample Output 0

A  
BC  
DEF  
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char letter='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}

/*Red Light, Green Light */

/*Alex advises Ben to hide behind someone to avoid getting caught.

Ben follows Alex's advice and hides behind Chris, who saved his life earlier. Ben and Chris both have the same height K. Many other players noticed this trick and also started hiding behind Chris.

Now, there are N players standing in a straight line between Ben and Chris. The i-th player in this line has a height of H[i].

Ben wants to know the minimum number of players who need to be removed so that Chris becomes visible to him.

Input Format

The first line of each test case contains two space-separated integers

-->N and K, denoting the total number of players between Ben and Chris and the height of both of them respectively.

The second line of each test case contains

-->N space-separated integers, denoting the heights of the players between Ben and Chris.

Constraints

1≤T≤10

1≤N≤10

1≤K≤10

1≤H[i]≤10^6

Output Format

For each test case, output in a single line the minimum number of players who need to get shot so that Chris is visible in Ben's line of sight.

Sample Input 0

4 10
2 13 4 16
Sample Output 0

2 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
       
        int n=scan.nextInt();
         int h=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
        //System.out.print(Arrays.toString(arr));
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>h)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}

/*Sort array alternately 1 */

/*Given a sorted array of positive integers, rearrange the array alternately i.e first element should be a maximum value, at second position minimum value, at third position second max, at fourth position second min, and so on. Note : Try to solve in O(1) Space Complexity with O(n) Time Complexity

Input Format

7
1 2 3 4 5 6 7

Constraints

5<=n<=20

Output Format

7 1 6 2 5 3 4

Sample Input 0

7
1 2 3 4 5 6 7
Sample Output 0

7 1 6 2 5 3 4
Submissions: 129
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        
        int i=0,j=n-1;
        while(i<j)
        {
            System.out.print(arr[j]+" "+arr[i]+" ");
            i++;
            j--;
        }
        if(i==j)
        {
            System.out.print(arr[i]);
        }
    }
}

/*Concatenate Two Strings Lexically 4 */

/*Write a program to Concatenate Two Strings Lexically

Input Format

hello this is rajendran

Constraints

Input should be two strings

Output Format

hello is rajendran this

Sample Input 0

hi rajendran
how are you
Sample Output 0

are hi how rajendran you */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
         String[] words1=str1.split(" ");
        String[] words2=str2.split(" ");
        String[] merge=new String[words1.length+words2.length];
        System.arraycopy(words1,0,merge,0,words1.length);
        System.arraycopy(words2,0,merge,words1.length,words2.length);
        Arrays.sort(merge);
         String result=String.join(" ",merge);
        System.out.print(result);
    }
}

/*Swap and Flip */

/*Given a binary string S of length N, check if you can transform it to another binary string T (also of length N) by using either of the following operations as many times as needed :

1)Swap Operation:

 i)Pick indices (i,j) such that 1≤i<j≤N.

ii)Swap S[i] and S[j].
2)Flip Operation:

 i)Pick indices (i,j) such that 1≤i<j≤N.

ii)Flip both S[i] and S[j] (0 becomes 1, and 1 becomes 0).  
Input Format

The first line of each test case contains

--> N - the lengths of the string S and T The

second line contains

--> S - a binary string of size N

The third line contains

--> T - a binary string of size N */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String s=scan.nextLine();
        String t=scan.nextLine();
         int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}