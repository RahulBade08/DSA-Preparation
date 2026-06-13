public class pattern8 {
    public static void main(String[] args) {
        p8(5);
        p8_v2(5);
    }
    

    static void p8(int n){
        for(int i=n-1; i>=0; i--){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void p8_v2(int n){
        for(int i=0; i<=n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //stars8
            for(int j=0; j<2*n-1-2*i; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
