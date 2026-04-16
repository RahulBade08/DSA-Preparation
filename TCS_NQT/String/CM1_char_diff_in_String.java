import java.io.*;
class CM1_char_diff_in_String {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        // String s = sc.nextLine();

        String s = br.readLine();

        int starCount = 0;
        int hashCount  = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch== '*'){
                starCount++;
            } 
            else if(ch == '#'){
                hashCount++;
            }
        }

        System.out.println(starCount - hashCount);

        // sc.close();

        
    }
}