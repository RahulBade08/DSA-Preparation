public class Pattern12 {
    public static void main(String[] args) {
        p12(4);
    }
    static void p12(int n){
        for(int i=1; i<=n; i++){
            //num
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            //space
            for(int j=1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }
            //num
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
