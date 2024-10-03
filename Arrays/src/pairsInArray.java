import java.util.Scanner;

public class pairsInArray {

    public static void pairs(int arr[]){

        for(int i=0; i < arr.length; i++) {
            {
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
                System.out.println();
            }
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
        pairs(array);
    }
}
