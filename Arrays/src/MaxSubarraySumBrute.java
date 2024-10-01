public class MaxSubarraySumBrute {
        public static int sumSubarrays(int[] arr) {  //use 2 loops only
            int n = arr.length;
            int sum=0,max=Integer.MIN_VALUE;

            for (int start = 0; start < n; start++) {
                sum=0;
                for (int end = start; end < n; end++) {
                        sum=sum+arr[end];
                        if(sum>max){
                         max=sum;
                    }
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] arr = {-1, 2, -3, 4, 3,-1,2};
            int maximum=sumSubarrays(arr);
            System.out.println("maximum subarray sum is "+maximum);
        }
    }



