import java.util.Scanner;
import java.util.Arrays;
public class deom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean flag = true;
        for(int i : arr){
            if(i < 100) flag = false;
        }

        if(!flag) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("n :" + n);
        System.out.println("array :" + Arrays.toString(arr));
        System.out.println("target :" + target);
    }
}
