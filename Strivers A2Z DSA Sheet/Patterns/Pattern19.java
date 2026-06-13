public class Pattern19 {
    public static void main(String[] args) {
        part1(5);
        part2(5);
    }

    static void part1(int n){
        for(int i=0; i<n; i++){
            //star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void part2(int n){
        for(int i=0; i<n; i++){
            //star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<(2*n-2)-(2*i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
