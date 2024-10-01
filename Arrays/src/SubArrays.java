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
        int[] arr = {1, 2, 3, 4,5};
        printAllSubarrays(arr);
    }
}

