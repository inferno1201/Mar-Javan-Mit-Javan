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
        int arr[] = {5,10,15,20,25,30,35};

        int index= binary(arr,key);
        if (index == -1)
            System.out.println("not in array");
        else
            System.out.println("found at index "+index);
    }

}

