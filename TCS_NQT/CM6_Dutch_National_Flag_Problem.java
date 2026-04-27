/*
Problem Statement :
Airport security officials have confiscated several items from passengers. 
Each item has a risk level represented as an integer value (0, 1, or 2). 
All items are stored in an array of size N.

The task is to sort the array based on risk levels such that:
All 0s (low risk) come first
Followed by 1s (medium risk)
Followed by 2s (high risk)

🔢 Input:
N → number of items
Array of N integers where each value is 0, 1, or 2

🎯 Output:
Sorted array based on risk levels
*/

/*
Approach : Dutch National Flag Algorithm
Time Complexity : O(n)
Space Complexity : O(1);
*/

import java.util.*;

public class CM6_Dutch_National_Flag_Problem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++; 
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        for(int value : arr){
            System.out.print(value + " ");
        }

        sc.close();
    }
}
