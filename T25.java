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

/* Rising temperature 1*/

/*Given an array of integers temperatures represents the daily temperatures, print an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Input Format

8
73 74 75 71 69 72 76 73

Constraints

solve it brute force then try to solve in O(n) using stack .

Output Format

1 1 4 2 1 1 0 0

Sample Input 0

8
73 74 75 71 69 72 76 73
Sample Output 0

1 1 4 2 1 1 0 0 */

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
        int[] answer=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                 int index=stack.pop();
                answer[index]=i-index;
            }
            stack.push(i);
        }
        for(int c:answer)
        {
            System.out.print(c+" ");
        }
    }
}

/*candies-Zoho question */

/*There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy. Children with a higher rating get more candies than their neighbors. Return the minimum number of candies you need to have to distribute the candies to the children.

Input Format

3
1 0 2

Constraints

NULL

Output Format

5

Sample Input 0

3
1 0 2
Sample Output 0

5
Explanation 0

You can allocate to the first, second and third child with 2, 1, 2 candies respectively. */

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
        int[] left=new int[n];
        Arrays.fill(left,1);
        
        for (int i=1;i<n;i++) 
        { 
            if(arr[i]>arr[i-1]) 
            {
                left[i]=left[i-1]+1;
            }
        }
        int total=left[n-1];
        int right=1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                right++;
            }
            else
            {
                right=1;
            }
            total+=Math.max(left[i],right);
        }
        
        System.out.print(total);
    }
}