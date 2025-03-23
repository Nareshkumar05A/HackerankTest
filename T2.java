/*Replace 0's with 1 and 1's with 0's 2 */

/*Need to write a program to replace 0's with 1's and also need to replace the 1's with 0's in the given number.

example:- for the string "101010"

1 → 0 Result so far: "0"

0 → 1 Result so far: "01"

1 → 0 Result so far: "010"

0 → 1 Result so far: "0101"

1 → 0 Result so far: "01010"

0 → 1 Final result: "010101"

Input Format

1100110

Constraints

Input should be the string

Output Format

0011001

Sample Input 0

101010
Sample Output 0

010101
Sample Input 1

11111
Sample Output 1

00000
Sample Input 2

00000
Sample Output 2

11111 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
         StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray())
        {
            if(ch == '1')
            {
                sb.append('0');
            }
            else 
            {
               sb.append('1');
            }
        }
        System.out.print(sb.toString());
    }
}

/*Pattern Lower Right triangle(Left) */

/*Print the following Pattern.

Input Format

The first line of the input contains the integer n.

Constraints

1≤N≤1000 (N is the number of rows)()

Output Format

Print the pattern

Sample Input 0

5
Sample Output 0

1  
1  2  
1  2  3  
1  2  3  4  
1  2  3  4  5  
 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}

/*Delete a Node */

/*This challenge is part of a tutorial track by MyCodeSchool and is accompanied by a video lesson.

Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.

Example



After removing the node at position , .

Function Description

Complete the deleteNode function in the editor below.

deleteNode has the following parameters:
- SinglyLinkedListNode pointer llist: a reference to the head node in the list
- int position: the position of the node to remove

Returns
- SinglyLinkedListNode pointer: a reference to the head of the modified list

Input Format

The first line of input contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the node data values in order.
The last line contains an integer,position , the position of the node to delete.
 */

 class Result {

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
        if (llist == null) 
           {  
                return null;  
           }  
           if (position == 0)
           {  
                return llist.next;  
           }  
            SinglyLinkedListNode current = llist;  
         for (int i = 0; current != null && i < position - 1; i++) 
         {  
                  current = current.next;  
           }  
           if (current == null || current.next == null)
           {  
                return llist;  
            }  
           current.next = current.next.next;  
          return llist;  
    }

}

/*Move all Balls */

/*You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.

Input Format

The first line of the input contains a string where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball

Constraints

n == boxes.length 1 <= n <= 2000 boxes[i] is either '0' or '1'.

Output Format

Output the Minimum number of operations to move the ball.

Sample Input 0

110
Sample Output 0

1 1 3
Explanation 0

Input: boxes = "110" Output: [1,1,3] Explanation: The answer for each box is as follows: 1) First box: you will have to move one ball from the second box to the first box in one operation. 2) Second box: you will have to move one ball from the first box to the second box in one operation. 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        int count = 0;
        int move = 0;
        int n=str.length();
        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]+=move;
            if(str.charAt(i)== '1')
            {
                count++;
            }
            move += count;
        }
        count = 0;
        move = 0;
        for(int i=n-1;i>=0;i--)
        {
            result[i] += move;
            if(str.charAt(i) == '1')
            {
                count++;
            }
            move+=count;
        }
        for(int ch : result)
        {
            System.out.print(ch+" ");
        }
    }
}

/*Partition Array 1 */

/*You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

Every element less than pivot appears before every element greater than pivot. Every element equal to pivot appears in between the elements less than and greater than pivot. The relative order of the elements less than pivot and the elements greater than pivot is maintained. More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj. Return nums after the rearrangement.

Input Format

The First line of the input contains the size of the array N. The second line of the input contains N space separated integers. And the third line of the input contains a integer pivot element.

Constraints

1 <= nums.length <= 105 -106 <= nums[i] <= 106 pivot equals to an element of nums.

Output Format

Output the new array partitioned according to the pivot element.

Sample Input 0

6
9 12 5 10 14 10
10
Sample Output 0

9 5 10 10 12 14
Explanation 0

5, 9 (less than 10) 10, 10 (equal to 10) 12, 14 (greater than 10)

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        int pivot = scan.nextInt();
        int[] result = new int[n];
        
        int index = 0;
        for(int num : arr)
        {
            if(num < pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num == pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num > pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : result)
        {
            System.out.print(num+" ");
        }
        
    }
}
