/* 
Use XOR to find odd occurring element
Works only when one odd exists 
TC - O(n)
SC - O(1)
*/

import java.util.*;

public class CM4_PrintOddCharacters {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:");
        String[] input = sc.nextLine().split(" ");


        char ans = 0;
        for(int i=0; i<input.length; i++){
            ans ^= input[i].charAt(0);
        }

        System.out.println(ans);

         
    }
}

