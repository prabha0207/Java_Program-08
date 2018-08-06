import java.io.*;
import java.util.Scanner;
class OddorEven
{
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number");
        Scanner n = new Scanner(System.in);
        x = n.nextInt();
        if(x%2==0)
        {
            System.out.println("The number is even");
        }
        else if(x<0)
        {
               System.out.println("The number is invalid");
        }
         else if(x%2!=0)
         {
             System.out.println("The number is odd");
       }
  }
}
