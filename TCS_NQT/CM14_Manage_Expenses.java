import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CM14_Manage_Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = Integer.parseInt(sc.nextLine());
        

        LinkedHashMap<String, Integer> expenses = new LinkedHashMap<>();
        int total_expenses = 0;
        while(true){
            String e_type = sc.nextLine();
            if(e_type.equals("done")) break;

            int e_amount = Integer.parseInt(sc.nextLine());

            total_expenses += e_amount;

            expenses.put(e_type, expenses.getOrDefault(e_type, 0)+e_amount);
        }

        int total_savings = income - total_expenses;

        System.out.println(income);
        System.out.println(total_expenses);
        System.out.println(total_savings);

        for(Map.Entry<String, Integer> entry : expenses.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
}
