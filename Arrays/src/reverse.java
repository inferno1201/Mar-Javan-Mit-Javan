
import java.util.Scanner;

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
        System.out.println("Enter length of array");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int array[]=new int[len];
        System.out.println("Enter the elements in array");
        for(int i=0;i<len;i++){
               array[i]=sc.nextInt();
        }

        reverseArray(array);
    }
}

