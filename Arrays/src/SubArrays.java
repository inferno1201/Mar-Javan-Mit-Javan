import java.util.Scanner;

public class SubArrays {
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        // Iterate over all possible starting points
        for (int start = 0; start < n; start++) {
            // Iterate over all possible ending points
            for (int end = start; end < n; end++) {
                // Print the subarray between start and end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Move to the next line after each subarray
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int array[]=new int[len];
        System.out.println("Enter the elements in array");
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        printAllSubarrays(array);
    }
}

