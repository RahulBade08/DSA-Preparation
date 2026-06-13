public class Pattern18 {
    public static void main(String [] args){
        p18(5);
        p18_v2(5);
    }

    static void p18(int n){
        for(int i=0; i<n; i++){
            char c = (char)('A'+(n-1-i));
            for(int j=0; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    static void p18_v2(int n){
        for(int i=0; i<n; i++){
            for(char c=(char)('E'-i); c<='E'; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
