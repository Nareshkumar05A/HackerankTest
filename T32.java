/*Pattern X String */

/*Write a program to print the X to the given string

Input Format

Look at the sample test case

Constraints

Input should be a string

Output Format

Look at the sample test case

Sample Input 0

VENKAT
Sample Output 0

V    T
 E  A
  NK
  NK
 E  A
V    T */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len =str.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i){
                    System.out.print(str.charAt(i));
                }
                else if(j==len-1-i){
                    System.out.print(str.charAt(len-1-i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*Subsets - 78 */

/*Given an array of distinct integers, return all possible subsets (the power set), in reverse order — that is, subsets with more elements should come first, and the empty subset should come last.

The solution set must not contain duplicate subsets, and you may return the elements inside each subset in any order.

Input Format

The first line contains a single integer n – the number of elements in the array.

The second line contains n space-separated integers – the elements of the array.

Constraints

1 <= n <= 10

-10 <= nums[i] <= 10

All elements in the array are distinct.

Output Format

Print all subsets (each on a new line) as space-separated integers.

Subsets can be printed in any order.

Elements in each subset can be in any order or sorted.

Sample Input 0

3
1 2 3
Sample Output 0

1 2 3 
1 2 
1 3 
1 
2 3 
2 
3  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sub(arr,0,new ArrayList<Integer>());
    }
    public static void sub(int arr[], int i, List<Integer> temp)
    {
        if(i == arr.length)
        {
            if(!temp.isEmpty())
            {
                for(int num : temp)
                {
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            return;
        }
        temp.add(arr[i]);
        sub(arr,i+1, temp);
        temp.remove(temp.size()-1);
        sub(arr,i+1, temp);
    }
}

/*Permutation of a Given string 1 5 */

/*Write a program to print all permutations of a given string. Note here for the input ABC the output should be as follows:

Input Format

ABC

Constraints

input should be a string

Output Format

ABC ACB BAC BCA CBA CAB

Sample Input 0

ABC
Sample Output 0

ABC ACB BAC BCA CBA CAB */

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = new ArrayList<>();
        permute(str.toCharArray(), 0, result);
       
        for (String permutation : result) {
            System.out.print(permutation + " ");
        }
    }
    public static void permute(char[] str, int index, List<String> result) {
        if (index == str.length - 1) {
            result.add(new String(str)); 
        } else {
            for (int i = index; i < str.length; i++) {
                swap(str, index, i);
                permute(str, index + 1, result);
                swap(str, index, i); 
            }
        }
    }
    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}


/*Count the Number of Consistent Strings - 1684 */

/*You are given a string allowed consisting of distinct characters, and an array of strings words. A string is consistent if all characters in the string appear in the allowed string.

Return the number of consistent strings in the array words.

Input Format

A string allowed consisting of distinct lowercase English letters. An array words of strings, where each word contains only lowercase English letters.

Constraints

1 <= allowed.length <= 26 1 <= words.length <= 10^4 1 <= words[i].length <= 10 All characters in allowed and words[i] are lowercase English letters. allowed contains distinct characters.

Output Format

An integer representing the number of consistent strings.

Sample Input 0

ab
5
ad bd aaab baa badab
Sample Output 0

2
Explanation 0

Only "aaab" and "baa" are consistent.

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String allowed = in.nextLine();
        int n = in.nextInt();
        in.nextLine();  
        String line = in.nextLine();  
        String[] words = line.split(" "); 

        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/* Tree: Height of a Binary Tree*/

/*The height of a binary tree is the number of edges between the tree's root and its furthest leaf. For example, the following binary tree is of height :

image
Function Description

Complete the getHeight or height function in the editor. It must return the height of a binary tree as an integer.

getHeight or height has the following parameter(s):

root: a reference to the root of a binary tree.
Note -The Height of binary tree with single node is taken as zero.

Input Format

The first line contains an integer , the number of nodes in the tree.
Next line contains  space separated integer where th integer denotes node[i].data.

Note: Node values are inserted into a binary search tree before a reference to the tree's root node is passed to your function. In a binary search tree, all nodes on the left branch of a node are less than the node value. All values on the right branch are greater than the node value.

Constraints



Output Format

Your function should return a single integer denoting the height of the binary tree.

Sample Input

image

Sample Output

3
Explanation

The longest root-to-leaf path is shown below:

image

There are  nodes in this path that are connected by  edges, meaning our binary tree's .

 */

 	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
        // Write your code here.
      if(root == null)
      {
          return -1;
      }
      else
      {
          int h = height(root.left);
          int l = height(root.right);
          return Math.max(h, l) + 1;
              
      }
      
  }