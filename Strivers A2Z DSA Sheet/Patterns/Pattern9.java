public class Pattern9 {
    public static void main(String[] args) {
        part1(5);
        part2(5);
        
    }

    static void part1(int n){
        for(int i=0; i<n;i++){
        //space
        for(int j=0; j<n-1-i; j++){
            System.out.print(" ");
        }

        //stars
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }

        //space
        for(int j=0; j<n-1-i; j++){
            System.out.print(" ");
        }

        System.out.println();
        }
    }

    static void part2(int n){
        for(int i=0; i<n;i++){
        //space
        for(int j=0; j<i; j++){
            System.out.print(" ");
        }

        //stars
        for(int j=0; j<2*n-1-2*i; j++){
            System.out.print("*");
        }

        //space
        for(int j=0; j<=i; j++){
            System.out.print(" ");
        }

        System.out.println();
        }
    }
}