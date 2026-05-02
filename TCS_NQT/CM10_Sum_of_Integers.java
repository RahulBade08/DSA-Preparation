import java.util.Scanner;
public class CM10_Sum_of_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();  
        
        if(a>=b || a<0 || b>=10000){
            System.out.print("Invalid Input");
        }
        else{
            int sum = 0;
            for(int i=a; i<=b; i++){
                sum += i;
            }

            System.out.println("Result : "+sum);
            sc.close();
        }
    }
}
