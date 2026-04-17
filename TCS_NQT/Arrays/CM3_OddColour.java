// Approach - HashMap (Frequency count)
// Time Complexity - O(n)
// Space Complexity -O(n)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CM3_OddColour{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter :");
        String[] s = br.readLine().split(" ");

        char[] arr = new char[s.length];

        System.out.println("Array :");
        for(int i=0; i<s.length; i++){
            arr[i] = s[i].charAt(0);
        }

        System.out.println(Arrays.toString(arr));

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : arr){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        char ans = '\0';
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) % 2 == 1) {
                ans = arr[i];
                break;
            }
        }

        if(ans == '\0') System.out.println("All are even");
        else System.out.println(ans);
    }
}