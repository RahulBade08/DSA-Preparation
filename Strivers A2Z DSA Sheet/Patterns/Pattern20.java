public class Pattern20 {
    public static void main(String [] args){
        part1(5);
        part2(5);

        p20_v2(5);
    }

    static void part1(int n){
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<(2*n-2)-(2*i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void part2(int n){
        for(int i=1; i<n; i++){
            //stars
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<(2*i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void p20_v2(int n){
        int spaces = (2*n)-2;
        for(int i=1; i<=2*n; i++){
            int stars = i;
            if(i>n) stars = 2*n - i;
            //stars
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }

            System.out.println();

            if(i<n) spaces -= 2;
            else spaces += 2;
        }
    }
    
}
