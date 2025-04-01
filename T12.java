/*Happy or Sad 1 */

/*Given N students standing in a row, each student i has an distinct achievement score A[i] provided in an array A=[A1,A2,…,An] The array A consists of distinct integers from 1 to N.

A student i (1≤i≤N ) will be happy if their achievement score A[i]is greater than the achievement scores of all the students standing before them in the array.

The task is to print whether a student is happy or not.

Input Format

Each test case consists of two lines of input.

The first line of each test case contains

 -->N — the number of students.
The second line of each test case contains

 -->N space-separated integers A1,A2,…,AN denoting the achievement scores of the students.
Constraints

1<=N,A[i]<=100

Output Format

For each test case, print a single line containing N integers. Print i'th integer as 1 if the i'th student is happy, otherwise print 0.

Sample Input 0

5
3 1 2 4 5
Sample Output 0

1 0 0 1 1 */

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
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            if(arr[j]>max)
            {
                System.out.print("1"+" ");
                max=arr[j];
            }else
            {
                System.out.print("0"+" ");
            }
        }
    }
}

/*Move 1's first then 0 4 */

/*Given an array consisting of only 0s and 1s, rearrange the array such that all the 1s appear before all the 0s. The relative order of the 1s and the 0s in their respective groups must be preserved.

first line in the input denote the length of the array second line in the input denote the actual array

Input Format

1 0 1 0

Constraints

Consider the input is a String

Output Format

1100

Sample Input 0

5
1 1 0 0 0
Sample Output 0

1 1 0 0 0  */

import java.io.*;
import java.util.*;

public class Solution {
    public static int[] rearrange(int[] arr)
    {
        List<Integer>one=new ArrayList<>();
        List<Integer>zero=new ArrayList<>();
        
        for(int num:arr)
        {
            if(num==1)
            {
                one.add(num);
            }
            else
            {
                zero.add(num);
            }
        }
        one.addAll(zero);
        int[] result=new int[arr.length];
        for (int i=0;i<result.length;i++) {
            result[i]=one.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
       int[] arrange= rearrange(arr);
        for(int m:arrange)
        {
            System.out.print(m+" ");
        }
    }
}

/*Flatland Space Stations */

/*Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively and each has a road of  length connecting it to the next city. It is not a circular route, so the first city doesn't connect with the last city. Determine the maximum distance from any city to its nearest space station.

Example


There are  cities and city  has a space station. They occur consecutively along a route. City  is  unit away and city  is  units away. City  is  units from its nearest space station as one is located there. The maximum distance is .

Function Description

Complete the flatlandSpaceStations function in the editor below.

flatlandSpaceStations has the following parameter(s):

int n: the number of cities
int c[m]: the indices of cities with a space station
Returns
- int: the maximum distance any city is from a space station

Input Format

The first line consists of two space-separated integers,  and .
The second line contains  space-separated integers, the indices of each city that has a space-station. These values are unordered and distinct.

Constraints

There will be at least  city with a space station.
No city has more than one space station.
Output Format

Sample Input 0

STDIN   Function
-----   --------
5 2     n = 5, c[] size m = 2
0 4     c = [0, 4]
Sample Output 0

2
Explanation 0

This sample corresponds to following graphic:

hreasy(5).png

The distance to the nearest space station for each city is listed below:

 has distance , as it contains a space station.
 has distance  to the space station in .
 has distance  to the space stations in  and .
 has distance  to the space station in .
 has distance , as it contains a space station.
We then take .

Sample Input 1

6 6
0 1 2 4 3 5
Sample Output 1

0
Explanation 1

In this sample,  so every city has space station and we print  as our answer.

Submissions: 33
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More
 
 */

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int  flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c); 
        int min = c[0];
        
        for (int i=1;i<c.length;i++) {
            int d=(c[i]-c[i-1])/2;
            min=Math.max(min,d);
        }
        int last=(n-1)-c[c.length-1];
        min=Math.max(min,last);
        
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*Decimal to octal conversion. 1 4 */

/*convert Decimal to octal.

Input Format

67

Constraints

Nil

Output Format

103

Sample Input 0

13
Sample Output 0

15
Submissions: 116
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
1 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int decimal=scan.nextInt();
        int i=0;
        int[] octal=new int[20];
        while(decimal>0)
        {
            int digit=decimal%8;
            octal[i++]=digit;
            decimal/=8;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(octal[j]);
        }
    }
}