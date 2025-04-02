/*POWER OF TWO 10 */

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Input Format

input should be a number

Constraints

1<=n<=10000

Output Format

output should be true of false

Sample Input 0

16
Sample Output 0

true
Sample Input 1

1024
Sample Output 1

true */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int num=1;
        boolean flag=true;
        while(num<=n)
        {
            if(num==n)
            {
              System.out.println("true");
              flag=false;
              break;
            }
            num=num*2;
        }
        if(flag) System.out.println("false");
    }
}


/*Handshake */

/*At the annual meeting of Board of Directors of Acme Inc. If everyone attending shakes hands exactly one time with every other attendee, how many handshakes are there?

Example

There are  attendees, ,  and .  shakes hands with  and , and  shakes hands with . Now they have all shaken hands after  handshakes.

Function Description

Complete the handshakes function in the editor below.

handshakes has the following parameter:

int n: the number of attendees
Returns

int: the number of handshakes
Input Format
The first line contains the number of test cases .
Each of the following  lines contains an integer, .

Constraints



Sample Input

2
1
2
Sample Output

0
1
Explanation

Case 1 : The lonely board member shakes no hands, hence 0.
Case 2 : There are 2 board members, so 1 handshake takes place. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'handshake' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int handshake(int n) {
    // Write your code here
           return n*(n-1)/2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.handshake(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}



/*Reverse a number */

/*Given a positive integer N, reverse its digits to produce a new number. Your task is to write a program that takes this integer and returns the reversed number.

For example, if the input number is 12345, the reversed number would be 54321.

You must also handle cases where there are trailing zeros in the original number. For instance, if the input is 1200, the reversed number should be 21, since leading zeros in the reversed result are not considered.

Note :- if the number is too larger then prefer to use long

Input Format

A single integer N, representing the number to reverse.

Constraints

1≤N≤10^9

(The input number will always be a positive integer.)

Output Format

A single integer, which is the reversed version of N.

Sample Input 0

100
Sample Output 0

1
Sample Input 1

1221
Sample Output 1

1221
Sample Input 2

987654321
Sample Output 2

123456789 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        long n=Integer.parseInt(str);
        long rev=0;
       while(n!=0)
       {
           long digit=n%10;
           rev=rev*10+digit;
           n/=10;
       }
        System.out.print(rev);
    }
}

/*permutation 27 */

/*Given a string s, return all possible Permutation of the string. The permutations should not contain duplicates if the input has unique characters. If the input has duplicate characters, ensure that permutations are not repeated.

Input Format

input should be a string

Constraints

1<=n<=100

Output Format

output should be a array

Note : If you are still Facing challenges to solve this problem see the reference YTube link not now at home

Sample Input 0

abc
Sample Output 0

[abc, acb, bac, bca, cab, cba] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        List<String>ans=new ArrayList<>();
        List<String>ans1=method(str,"",ans);
        Collections.sort(ans1);
        System.out.println(ans.toString().replace("[", "[").replace("]", "]").replace(", ", "\", \"").replace("[", "[\"").replace("]", "\"]"));
    }
    public static List<String> method(String up,String p,List<String> ans)
    {
        if(up.isEmpty()) 
        {
            ans.add(p);
            return ans;
        }
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            method(up.substring(1),f+c+s,ans);
        }
        return ans;
        
    }
}