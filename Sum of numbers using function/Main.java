import java.util.Scanner;
class Main
{
  public static int sum(int a)
  {
    int sum =0;
    for(int i=0;i<=a;i++)
    {
      sum = sum + i;
    }
    return sum;
  }
	public static void main (String[] args)
  {
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int sum1 = sum(a);
      System.out.print(sum1);
  }
}