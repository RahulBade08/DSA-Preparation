import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CM15_Character_Frequency_Analysis {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        findCharacters(input);
        sc.close();
    }

    static void findCharacters(String s){
        if(s == null || s.length() == 0){
            System.out.println("Invalid Input");
            return;
        } 

        Map<Character, Integer> freq = new LinkedHashMap<>();

        //Calc. freq + store first index
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            freq.put(c, freq.getOrDefault(c, 0)+1);

        }

        // first non - repeating character
        char first_non_repeated = '\0';
        boolean hasNonRepeated = false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(freq.get(c) == 1){
                first_non_repeated = c;
                hasNonRepeated = true;
                break;
            }
        }

        //high frequency character
        char maxFreqChar = '\0';
        int maxFreq = 0;

        for(int f : freq.values()){
            maxFreq = Math.max(f, maxFreq);
        }


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(freq.get(c) == maxFreq){
                maxFreqChar = c;
                break;
            }
        }

        // first repeating character
        char first_repeated = '\0';
        boolean hasRepeat = false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(freq.get(c) > 1){
                first_repeated = c;
                hasRepeat = true;
                break;
            }
        }

        // Output
        if(!hasNonRepeated){
            System.out.print("None");
            if(hasRepeat) System.out.println(" "+first_repeated);
            System.out.println();
        }
        else{
            System.out.println(first_non_repeated);
            System.out.println(maxFreqChar);
        }
        
    } 
}
