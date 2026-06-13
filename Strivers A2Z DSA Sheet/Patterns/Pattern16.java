public class Pattern16 {
    public static void main(String[] args) {
        p16(5);
    }
    static void p16(int n){
        char c = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}
