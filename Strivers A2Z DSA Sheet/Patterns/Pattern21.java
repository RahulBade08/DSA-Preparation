public class Pattern21 {
    public static void main(String[] args) {
        p21(4);
        p21_v2(4);
    }

    static void p21(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<=n-2; i++){
            //stars
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=n-2; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    static void p21_v2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
