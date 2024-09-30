import java.util.*;
public class Pattern_advanced {

    //hollow_rhombus
    public static void hollow_rhombus(int rows){
        for (int i=1; i<=rows; i++) {

            for ( int j=1; j<=(rows-i); j++) { //for spaces
                System.out.print(" ");
            }
            //for hollow rectangle
            for(int j=1 ; j<=rows ; j++) {
                if(i==1 || j==1 || i==rows || j ==rows) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //RHOMBUS
    public static void rhombus(int rows){
        for(int i=1; i<=rows; i++){       // for number of rows

            for(int j=1; j <= rows-i; j++){  //for spaces
                System.out.print(" ");
            }
            for ( int j=1; j<=rows; j++ ){  //for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void butterfly(int rows){ //for upper half
        //upper half
        for (int i=1; i<=rows; i++) {

            for (int j=1; j<=i; j++){     //for spaces
                System.out.print("*");
            }

            for (int j=1; j<= (2*(rows-i)); j++){     //for spaces
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){     //for spaces
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=rows; i>=1; i--) {   //for lower half

            for (int j=1; j<=i; j++){     //for spaces
                System.out.print("*");
            }

            for (int j=1; j<= (2*(rows-i)); j++){     //for spaces
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){     //for spaces
                System.out.print("*");
            }
            System.out.println();
        }
    }

   public static void triangle_01(int row){ // 01 triangle
       for (int i=1;i<=row;i++){
           for(int j=1;j<=i;j++){
               if((i+j)%2==0)
                   System.out.print(1);
               else
                   System.out.print(0);
           }
           System.out.println();
       }
   }
    public static void floyd(int row){ //floyd triangle
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void inverted_half_py_with_nos(int row){
        for(int i=0;i<row;i++){
            for(int j=1;j<= row-i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void in_pyramid(int row){   /* inverted pyramid  */
        for(int r=1;r<=row;r++){
            for(int space=1;space<=(row-r);space++){
                System.out.print(" ");
            }
                for(int star=1;star<=r;star++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }


    public static void hollow(int row,int col){ //to print a hollow rectangle
         for(int r=1;r<=row;r++){
             for(int c=1;c<=col;c++){
                 if(r==1 || r==row ||c==1||c==col)
                    System.out.print("*");
                 else
                    System.out.print(" ");
             }
             System.out.println();
         }
    }

    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number of rows");
     int row=sc.nextInt();
     System.out.println("enter number of columns");
     int col=sc.nextInt();
        // hollow(row,col);
        //in_pyramid(row);
        // inverted_half_py_with_nos( row);
        //floyd( row);
        //triangle_01(row);
       // butterfly(row);
        //rhombus(row);
        hollow_rhombus(row);
    }
}
