public class Pattern7 {
    public static void main(String[] args) {
        p7_v2(5);
    }
    static void p7(int n, int m){
        
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=m; j++){
                
                for(int k=6-i; k<=4+i; k++){
                    if(j==k) System.out.print("*");
                    
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p7_v2(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
