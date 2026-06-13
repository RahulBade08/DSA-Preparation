public class Pattern17 {
    public static void main(String[] args) {
        p17(4);
    }
    static void p17(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //chars 1
            char c = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(c);
                c++;
            }

            //chars 2
            for(int j=1; j<i; j++){
                System.out.print((char)(c-2));
                c--;
            }

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }
}
