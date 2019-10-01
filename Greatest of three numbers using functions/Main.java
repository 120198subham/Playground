import java.util.Scanner;
class Main{
  public static int large(int a, int b, int c)
  {
    int res,temp; 
    if(a>b)
    {
      temp = a;
    }
    else
    {
      temp = b;
    }
    if(temp > c)
    {
      res = temp;
    }
    else
    {
      res = c;
    }
    return res;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int l = large(n1,n2,n3);
      System.out.print(l);
	}
}