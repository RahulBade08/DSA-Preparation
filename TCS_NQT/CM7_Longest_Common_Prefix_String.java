/*
Problem Statement :
Given an array of strings, find the longest common prefix among all strings.
If there is no common prefix, return an empty string "".

Example:
Input: ["flower", "flow", "flight"]
Output: "fl"

Approach : Horizontal Scanning

Time Complexity: O(N × M)
Space Complexity: O(M)

Where:
N = number of strings
M = length of smallest string
*/

import java.io.*;

public class CM7_Longest_Common_Prefix_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        String result = arr[0];

        for(int i=1; i<arr.length; i++){
            result = longestPrefix(arr[i], result);
        }

        System.out.println(result);
    }

    static String longestPrefix(String a, String b){
        int n = Math.min(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(a.charAt(i) == b.charAt(i)){
                sb.append(a.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
