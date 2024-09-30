import java.util.*;
public class Factorial {
    public static int factorial(int num){
        int fact=1;
        int pro=1;
        if (num<=2)
            return fact;
        else{
        while(fact<=num){
            pro=pro*fact;
            fact++;
        }
        return pro;
        }
    }

    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int result=factorial(number);
        System.out.println("the factorial of "+number+" = "+ result);

    }
}
