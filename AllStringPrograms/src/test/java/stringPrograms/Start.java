package stringPrograms;

import java.util.Scanner;

//program for string reverse
public class Start {
//Hiiiiiiiiiiiiiiiiiiiii	
	public static void main(String[] args) {
		
	char d;
	int counter=0;
	String str;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	str=s.next();
	System.out.println("Enter a letter");
	d=s.next().charAt(0);
	for(int i=str.length()-1;i>=0;i--)
	{
		char c=str.charAt(i);
		if(d==c)
		{
			counter++;
		}
	}
	System.out.print(counter);

		
	}

}
