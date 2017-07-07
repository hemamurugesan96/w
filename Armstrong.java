import java.io.*;
import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a,b=0,c; 
c=n;
while(c!=0)
{
a=n%10;
b=b+a*a*a;
c=c/10;
}
if(b==n)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}
