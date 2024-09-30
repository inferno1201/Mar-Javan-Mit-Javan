import java.util.*;
public class DecimalToBinary {

    public static int toBinary(int decimal){

        int binary=0;
        int rem=decimal;
        while(decimal>0){
            rem=decimal%2;
            binary=(binary*10)+rem;
            decimal=decimal/2;
        }
        return binary;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int decimal=sc.nextInt();
        int result= toBinary(decimal);
        System.out.println("Binary of "+ decimal+" is "+ result);
    }
}

