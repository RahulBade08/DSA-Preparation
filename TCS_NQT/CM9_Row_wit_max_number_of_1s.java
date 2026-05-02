import java.io.*;

public class CM9_Row_wit_max_number_of_1s {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        int[][] matrix = new int[row][col];

        int maxCountRow = -1;
        int maxCount = 0;

        for(int i=0; i<row; i++){
            int count = 0;

            for(int j=0; j<col; j++){
                matrix[i][j] = Integer.parseInt(br.readLine());
                if(matrix[i][j] == 1) count++;
            }

            if(count>maxCount) {
                maxCount = count;
                maxCountRow = i + 1;
            }
        }
  
        System.out.println("Result : "+maxCountRow);
    } 
}
