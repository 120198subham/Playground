import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    int square = a*a;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int aa = square(a);
      System.out.print(aa);
	} 
}