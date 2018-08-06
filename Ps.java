import java.io*;
class Ps
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number);
n=s.nextInt();
if(n>0)
{
System.out.prinln("The given number is "+n" is positive");
}
else if(n<0)
{
System.out.prinln("The given number is "+n" is negative");
}
else
{
System.out.prinln("The given number is "+n" is zero");
}
}
}
