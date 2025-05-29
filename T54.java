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
After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL. */

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

  /*Insert a Node at the Tail of a Linked List */

  /*You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

Function Description

Complete the  function with the following parameters:

: a reference to the head of a list
: the data value for the node to insert
Returns

: reference to the head of the modified linked list
Input Format

The first line contains an integer , the number of elements in the linked list.
The next  lines contain an integer each, the value that needs to be inserted at tail.

Constraints

Sample Input

STDIN   Function
-----   --------
5       size of linked list n = 5
141     linked list data values 141..474
302
164
530
474
Sample Output

141
302
164
530
474
Explanation

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
After inserting 302, the list is 141 -> 302 -> NULL.
After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list. */

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
            if(head==null)
            {
                return newNode;
            }
     SinglyLinkedListNode current=head;
      while(current.next!=null)
      {
         current=current.next;
      }
     current.next=newNode;
     return head;
 }

 /*product of array except self. */

 /*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Input Format

n=4 Input: nums = [1,2,3,4]

Constraints

2 <= nums.length <= 105

Output Format

Output: [24,12,8,6]

Sample Input 0

5
-1 1 0 -3 3
Sample Output 0

0 0 9 0 0 */

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
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        int[] pre=new int[n];
        for(int i=0;i<n;i++)
        {
            pre[i]=prefix[i]*suffix[i];
        }
        for(int c:pre)
        {
            System.out.print(c+" ");
        }
    }
}

/*color cell */

/*You are given an infinitely large two-dimensional grid of uncolored unit cells. You need to perform the following process for n minutes:

At the first minute, color any one arbitrary unit cell blue. Every minute thereafter, color blue every uncolored cell that touches a blue cell (up, down, left, or right). Given an integer n, return the total number of colored cells at the end of n minutes.

Input Format

input should be a number

Constraints

1<=n<=100

Output Format

output should be a number

Sample Input 0

10
Sample Output 0

181 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans=1+4*(n*(n-1))/2;
        System.out.print(ans);
    }
}