import java.util.Scanner;
class Char
{
	public static void main(String[ ] arg)
	{
	 int i=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a character : ");
	 char ch=sc.next( ).charAt(0);	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("character "+ch+" is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("character "+ch+" is Consonant");
    else
		System.out.println("input is invalid");		
	}
}
