public class Pattern8_1 {
    public static void main(String[] args) {
        part1(3);
        part2(3);
        part3(3);
    }
    

    static void part1(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void part2(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=0; j<1; j++){
                if(i%2 != 0){
                    System.out.print(" ");
                }
            }

            //stars
            for(int j=i%2; j<3; j++){
                System.out.print("*");
                
            }

            //space
            for(int j=0; j<3; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=i%2; j<3; j++){
                System.out.print("*");
                
            }

            //space
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void part3(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<2+i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<2*n-1-2*i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<2+i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
