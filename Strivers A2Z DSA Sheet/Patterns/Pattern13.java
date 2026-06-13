public class Pattern13 {
    public static void main(String[] args) {
       p13(5); 
    }
    static void p13(int n){
        int a = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
