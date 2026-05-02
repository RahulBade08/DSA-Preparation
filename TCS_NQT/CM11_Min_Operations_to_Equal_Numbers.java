import java.util.*;

public class CM11_Min_Operations_to_Equal_Numbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t>0){
        int p=sc.nextInt(), q=sc.nextInt(), r=sc.nextInt();

        int result = minOperations(p, q, r);

        System.out.println(result);
        
        t--;
    }
    }

    static int minOperations(int p, int q, int r) {
        if(p==q & q==r) return 0;

        int[] arr = {p, q, r};
        Arrays.sort(arr);

        int step = 0;
        while(true){
            arr[0] += 1;
            arr[1] += 1;
            arr[2] -= 1;
            step++;
    
            if(arr[0]==arr[1] && arr[1]==arr[2]) return step;    
            
            Arrays.sort(arr);

            if((arr[0] == arr[1] && arr[1]+1 == arr[2]) || (arr[0]+1 == arr[1] && arr[1] == arr[2])) return -1;
        }
    }
}
