import java.util.Scanner;

public class CM13_Sum_of_First_N_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        for(int i=2; count<n; i++){
            if(isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.println("Sum : "+sum);

    }

    static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i*i <= n; i++){
            if(n%i==0) return false;
        }

        return true;
    }

}
