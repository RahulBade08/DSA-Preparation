public class Pattern22 {
    public static void main(String[] args) {
        p22(4);
        p22_v2(4);
    }

    static void p22(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                int num = n - Math.min(Math.min(left, right), Math.min(top, bottom));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    static void p22_v2(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                char c = (char)(('A'+n-1) - Math.min(Math.min(left, right), Math.min(top, bottom)));
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
