import java.util.*;
import java.lang.Math;
public class BinaryToDecimal {
    public static int toDecimal(int binary){
        int decimal=0;
        int ld=0;
        int ind=0;

        for(int num=binary; num>0;num=num/10){
            ld=num%10;
            decimal=(int)(decimal+ ld*(Math.pow(2,ind)));
            ind++;
        }
        return decimal;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number");
        int binary=sc.nextInt();
        int result=toDecimal(binary);
        System.out.println("the decimal of " + binary+" is " + result);
    }
}

