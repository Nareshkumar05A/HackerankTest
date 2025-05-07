/*Pattern Diamond Numbered */

/*Write a program that takes an integer N as input and prints a diamond pattern of numbers. The pattern should consist of numbers increasing sequentially from 1 to the maximum width and then decreasing back to 1, with appropriate spaces to maintain the diamond shape.

Input Format

A single integer 𝑁 (1 ≤ N ≤ 100), representing the number of rows in the upper half of the diamond.

Constraints

1<=n<=10

Output Format

A diamond pattern where:

The first row has one number centered.

Each subsequent row contains an increasing sequence of odd-count numbers.

After reaching the maximum width at row N, the pattern mirrors itself in reverse. Spaces are used to align numbers properly.

Sample Input 0

4
Sample Output 0

      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3
      1 */

      import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
       for(int i=n-2;i>=0;i--)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*Insert a node at the head of a linked list */
/*Given a pointer to the head of a linked list, insert a new node before the head. The  value in the new node should point to  and the  value should be replaced with a given value. Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.

Function Description

Complete the function  with the following parameter(s):

: a reference to the head of a list
: the value to insert in the  field of the new node
Input Format

The first line contains an integer , the number of elements to be inserted at the head of the list.
The next  lines contain an integer each, the elements to be inserted, one per function call.

Constraints

Sample Input

STDIN   Function
-----   --------
5       n = 5
383     data items to insert 383 ... 321
484
392
975
321
Sample Output

321
975
392
484
383
Explanation

Intially the list in NULL. After inserting 383, the list is 383 -> NULL.
After inserting 484, the list is 484 -> 383 -> NULL.
After inserting 392, the list is 392 -> 484 -> 383 -> NULL.
After inserting 975, the list is 975 -> 392 -> 484 -> 383 -> NULL.
After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL.

Submissions: 133
Max Score: 15
Difficulty: Easy
Rate This Challenge:

    
More
 
1
import ↔;
8
​
9
public class Solution {
10
​
11
    static class SinglyLinkedListNo */

        // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
      newNode.next=llist;
    return newNode;

}

/*Print the Elements of a Linked List */

/*This exercise focuses on traversing a linked list. You are given a pointer to the  node of a linked list. The task is to print the  of each node, one per line. If the head pointer is , indicating the list is empty, nothing should be printed.

Function Description

Complete the  function with the following parameter(s):

: a reference to the head of the list
Print

For each node, print its  value on a new line (console.log in Javascript).
Input Format

The first line of input contains , the number of elements in the linked list.
The next  lines contain one element each, the  values for each node.

Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

Constraints

, where  is the  element of the linked list.
Sample Input

STDIN   Function
-----   --------
2       n = 2
16      first data value = 16
13      second data value = 13
Sample Output

16
13
Explanation

There are two elements in the linked list. They are represented as 16 -> 13 -> NULL. So, the  function should print 16 and 13 each on a new line. */

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current=head;
     while (current!=null) {
         System.out.println(current.data);
         current=current.next;
     }
 }

 /*The Maximum Subarray */

 /*We define subsequence as any subset of an array. We define a subarray as a contiguous subsequence in an array.

Given an array, find the maximum possible sum among:

all nonempty subarrays.
all nonempty subsequences.
Print the two values as space-separated integers on one line.

Note that empty subarrays/subsequences should not be considered.

Example

The maximum subarray sum is comprised of elements at inidices . Their sum is . The maximum subsequence sum is comprised of elements at indices  and their sum is .

Function Description

Complete the maxSubarray function in the editor below.

maxSubarray has the following parameter(s):

int arr[n]: an array of integers
Returns

int[2]: the maximum subarray and subsequence sums
Input Format

The first line of input contains a single integer , the number of test cases.

The first line of each test case contains a single integer .
The second line contains  space-separated integers  where .

Constraints

The subarray and subsequences you consider should have at least one element.

Sample Input 0

2
4
1 2 3 4
6
2 -1 2 3 4 -5
Sample Output 0

10 10
10 11
Explanation 0

In the first case: The maximum sum for both types of subsequences is just the sum of all the elements since they are all positive.

In the second case: The subarray  is the subarray with the maximum sum, and  is the subsequence with the maximum sum.

Sample Input 1

1
5
-2 -3 -1 -4 -6
Sample Output 1

-1 -1
Explanation 1

Since all of the numbers are negative, both the maximum subarray and maximum subsequence sums are made up of one element, . */

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
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
       Integer []arr1=arr.toArray(new Integer[0]);
        int ans=0;
        int n=arr1.length;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]>0) ans+=arr1[i];
        
        }
        int ans2=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr1[i];
            ans2=Math.max(sum,ans2);
            if(sum<0) sum=0;
        }
        List<Integer> list =  new ArrayList<>();
        if(ans2!=0) list.add(ans2);
        else 
        {
            Arrays.sort(arr1);
            list.add(arr1[arr1.length-1]);
        }
        if(ans!=0) list.add(ans);
        else 
        {
            Arrays.sort(arr1);
            list.add(arr1[arr1.length-1]);
        }
        return list;
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

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

