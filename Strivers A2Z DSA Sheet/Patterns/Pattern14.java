public class Pattern14 {
    public static void main(String[] args) {
        p14(5);
    }
    static void p14(int n){
        for(int i=0; i<n; i++){
            for(char c='A'; c<='A'+i; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
