import java.util.Scanner;
class Main
{
  public static int power(int exp, int base)
  {
    int result = 1;
    for (int i=1;i<=base;i++)
    {
          result = result*exp;
    }
    return result;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int exp = sc.nextInt();
      int base = sc.nextInt();
      int pow = power(exp,base);
      System.out.print(pow);
    }
}