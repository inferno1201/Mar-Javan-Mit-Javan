public class MaxSubarraySumPrefixSum {
    public static int sumSubarrays(int[] arr) {  //use 2 loops only
        int n = arr.length;
        int sum=0,max=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){   //prefix sum array
              prefix[i]= i==0 ? arr[i] : prefix[i-1]+arr[i];
        }

        for (int start = 0; start < n; start++) {
            sum=0;
            for (int end = start; end < n; end++) {
                sum= (start== 0) ? prefix[end] : prefix[end]-prefix[start-1];
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



