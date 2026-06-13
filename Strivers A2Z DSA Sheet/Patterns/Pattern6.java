public class Pattern6 {
    public static void main(String[] args) {
        p6(5);
    }
    public static void p6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
