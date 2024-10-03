import java.util.*;
public class searchBinary {

    public static int binary(int arr[],int key) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to searched in array");
        int key=sc.nextInt();
        System.out.println("Enter length of array");
        int len=sc.nextInt();
        int array[]=new int[len];
        System.out.println("Enter the elements in array");
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }

        int index= binary(array,key);
        if (index == -1)
            System.out.println("not in array");
        else
            System.out.println("found at index "+index);
    }

}

