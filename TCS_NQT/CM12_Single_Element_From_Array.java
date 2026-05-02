import java.util.Scanner;

public class CM12_Single_Element_From_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] inputArr = sc.nextLine().split(" ");

        int single = 0;
        for(int i=0; i<n; i++){
            single ^= Integer.parseInt(inputArr[i]);
        }

        System.out.println(single);

        
    }
}
