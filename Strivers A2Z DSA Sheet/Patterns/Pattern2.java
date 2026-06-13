import java.io.*;

public class Pattern2 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            p2(n);
        }
        
    }


    static void p2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }                
    }
}
