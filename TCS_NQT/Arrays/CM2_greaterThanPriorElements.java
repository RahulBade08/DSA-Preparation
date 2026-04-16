import java.io.*;

class CM2_greaterThanPriorElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number of elements in the array:");
        int n = Integer.parseInt(br.readLine());
    
        System.out.println("Enter the elements of the array:");
        String[] inputArr = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        
        int count = 1;
        int maxElement = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxElement){
                count++;
                maxElement = arr[i];
            }
        }

        System.out.println("Result : "+count);
    }
}