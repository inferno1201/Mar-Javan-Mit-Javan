import java.util.Scanner;

public class Binomial_Coefficient{
    public static int factorial(int num){
        int fact=1;
        int pro=1;
        if (num<2)               //binomial fact= n!/ ( r! * (n-r)! )
            return fact;
        else{
            while(fact<=num){
                pro=pro*fact;
                fact++;
            }
            return pro;
        }
    }

    public static int binomial(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact= factorial((n-r));
        return (n_fact/(r_fact*nmr_fact));
    }

    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter r");
        int r=sc.nextInt();
        int result=binomial(n,r);
        System.out.println("the binomial coefficient= "+ result);

    }
}
