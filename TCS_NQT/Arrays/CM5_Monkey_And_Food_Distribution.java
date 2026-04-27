/*
There are n monkeys sitting on the branches of a tree. A group of travelers offers them m bananas and p peanuts. Each monkey can eat either k bananas or j peanuts at a time.

Monkeys come down from the tree one at a time to eat. After eating, a monkey does not return to the tree until all others have finished eating.

A monkey will eat k bananas if available, otherwise it will eat j peanuts.
If the remaining bananas are less than k and peanuts are less than j, the last monkey will eat whatever is left.

🔢 Input:
n → Total number of monkeys
m → Total number of bananas
p → Total number of peanuts
k → Number of bananas a monkey can eat
j → Number of peanuts a monkey can eat

🎯 Output:
Return the number of monkeys remaining on the tree after the feeding process.
*/
/*
Time complexity = O(1)
Space Complexity = O(1) 
*/


import java.io.*;


public class CM5_Monkey_And_Food_Distribution {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Total no. of monkeys :");
        int n = Integer.parseInt(br.readLine());

        System.out.println("No. of eatable Bananas by a single monkey :");
        int k = Integer.parseInt(br.readLine());
        
        System.out.println("No. of eatable Peanuts by a single monkey :");
        int j = Integer.parseInt(br.readLine());

        System.out.println("Total no. of Bananas :");
        int m = Integer.parseInt(br.readLine());

        System.out.println("Total no. of Peanuts :");
        int p = Integer.parseInt(br.readLine());

        int eatBananas = m/k;
        int eatPeanuts = p/j;

        int extra = 0;
        if(m % k != 0 || p % j != 0) extra = 1;

        int totalEating = eatBananas + eatPeanuts + extra;

        int remaining = n - totalEating;

        if(remaining < 0) remaining = 0;

        System.out.println("Result : "+ remaining);

    }
}
