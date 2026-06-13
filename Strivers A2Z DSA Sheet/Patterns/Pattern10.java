public class Pattern10 {
    public static void main(String[] args) {
        p10(5);

        //version 2
        part1(5);
        part2(4);
    }
    static void p10(int n){
        for(int i=1; i<2*n; i++){
            int star = i;
            if(i>5) star = 2*n-i;
            
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void part1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void part2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
