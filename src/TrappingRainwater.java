public class TrappingRainwater {

    public static int storedWater(int arr[]){
        int n=arr.length;
       int store=0;
        for(int i= 0;i<n ;i++ ){

            if(i==0 || i==n-1)
                continue;
            int left=0 ,right=0;
            for(int j=0; j<i ; j++){
                left= Math.max(arr[j],left);
            }
            for(int k=i;k<n;k++){
                right=Math.max(arr[k],right);
            }

            if(arr[i]<Math.min(left,right))
               store=store+( Math.min(left,right) - arr[i]);
        }
        return store;
    }


    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int amount=storedWater(arr);
        System.out.println("water trapped is "+ amount);
    }
}
