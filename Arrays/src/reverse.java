import java.io.*;
public class reverse {

    public static void reverseArray(int arr[]){
           int first=0, last= arr.length-1;
           int temp=0;
           while(first<last){
               temp=arr[first];
               arr[first]=arr[last];
               arr[last]=temp;

               first++;
               last--;
           }
           for(int i=0;i<arr.length-1;i++){
               System.out.print(arr[i]+" ");
           }
    }
    public static void main(String args[]){
        reverseArray(array);
    }
}

