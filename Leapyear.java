import java.util.Scanner;

public class Leapyear 

{

    public static void main(String args[])

    {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean X= false;
        if(year % 400 == 0)
	{
	X= true;
        }
	else if (year % 100 == 0)

        {
	X= false;
	}
	else if(year % 4 == 0)
	{
	X= true;
	}
	else

        {
          X= false;
          }

        if(X)

        {
          System.out.println("Year "+year+" is a Leap Year");
          }

        else

        {
	System.out.println("Year "+year+" is not a Leap Year");

        }

    }

}
