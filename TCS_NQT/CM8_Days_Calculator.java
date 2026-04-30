/*
Problem Statement :
Given a starting day of the week (e.g., "mon", "tue", … "sun") and a number of days N, 
calculate how many Sundays occur within the next N days.

e.g.
Input : 
mon
13

Output : 
2

Approach : HashMap
Time complexity : O(1)
Space complexity : O(1)
*/

import java.util.*;
public class CM8_Days_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();
        int days = sc.nextInt();

        Map<String, Integer> gap = new HashMap<>();
        gap.put("mon", 6);
        gap.put("tue", 5);
        gap.put("wed", 4);
        gap.put("thu", 3);
        gap.put("fri", 2);
        gap.put("sat", 1);
        gap.put("sun", 0);

        int result = 0;
        if(days >= gap.get(day)){
            result = 1 + (days-gap.get(day)) / 7;
        }

        System.out.println(result);
    }
}
