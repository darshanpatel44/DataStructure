import java.util.*;
import java.lang.Math;
class palindrome{

public static void main(String[]args){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter any number: ");

	int n=sc.nextInt();
	int r=0;
	int i=0;
	int num=0;
	int temp=n;
	
	Integer[]A=new Integer[1024];
	while(temp!=0)
	{
		r=temp%10;
		temp=temp/10;
		A[i]=r;
		i++;
	}
		
		
		for(int j=0;j<i;j++)
		{
			num=A[j]*((int)Math.pow(10,i-1-j))+num;
	
		}

	System.out.println();
		
		if(num==n)
	System.out.println("The number is palindrome");
	
		else 
		System.out.println("The number is not palindrome");

}
}
