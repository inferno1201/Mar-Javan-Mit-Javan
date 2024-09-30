import java.lang.*;
public class MaxSubarraySumKADANE {
        public static int sumSubarrays(int[] arr) {  //use 2 loops only
            int n = arr.length;
            int csum=0,max=Integer.MIN_VALUE;

            for(int i=0; i< n;i++){

                csum=csum+arr[i];
                if(csum<0){           
                    csum=0;
                }
                max=Math.max(csum,max);
            }
            return max;
        }

        public static void main(String[] args) {
            int[] arr = {-10, -2, -3, -4, -3,-1,-2};
            int maximum=sumSubarrays(arr);
            System.out.println("maximum subarray sum is "+maximum);
        }
    }



