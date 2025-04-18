/*Pattern Hollow Diamond */

/*You are given an integer N. Your task is to print a hollow diamond pattern of height 2*N - 1

Input Format

A single integer N representing the number of rows in the upper half of the diamond

Constraints

1 ≤ N ≤ 100

Output Format

Print the hollow diamond pattern using asterisks (*) and spaces.

Each row must be printed on a new line.

There should be no trailing spaces

Sample Input 0

3
Sample Output 0

  *  
 * * 
*   *
 * * 
  *   
  */

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2*(i - 1) - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=N-1;i>=1;i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2*(i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
    }
}

/*Count Equal and Divisible Pairs in an Array - 2176 */

/*You are given a 0-indexed integer array nums and an integer k.

A pair of indices (i, j) is valid if:

i < j

nums[i] == nums[j]

(i * j) % k == 0

Return the number of valid pairs.

Input Format

Integer array nums of length n (1 <= n <= 100) Integer k (1 <= k <= 100)

Constraints

1 <= nums.length <= 100 1 <= nums[i] <= 100 1 <= k <= 100

Output Format

An integer representing the number of valid (i, j) pairs.

Sample Input 0

7
3 1 2 2 2 1 3
2
Sample Output 0

4
Explanation 0

Valid pairs are: (0,6), (1,5), (2,3), (2,4) */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
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

Only "aaab" and "baa" are consistent. */

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

/*Sum of Unique Elements -1748 */

/*You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Input Format

input should be an array

Constraints

1<=n<=100

Output Format

output should be an number

Sample Input 0

4
1 2 3 2
Sample Output 0

4 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        System.out.println(sum);
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
3 
Explanation 0

Print all subsets for the given array.

 */

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