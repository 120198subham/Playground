import java.util.Scanner;
public class Main{
   public static int gcd(int a, int b, int c)
  {
    int res,temp,result=0; 
    if(a<b)
    {
      temp = a;
    }
    else
    {
      temp = b;
    }
    if(temp < c)
    {
      res = temp;
    }
    else
    {
      res = c;
    }
     for(int i = res;i<=res;i--)
     if((a%res==0) && (b % res ==0) && (c % res ==0))
     {
       result = res;
     }
     return result;
   }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int res = gcd(n1,n2,n3);
      System.out.print(res);
   	}
}