public class Pattern15 {
    public static void main(String[] args) {
        p15(5);
    }
    static void p15(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<'A'+(n-i); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
