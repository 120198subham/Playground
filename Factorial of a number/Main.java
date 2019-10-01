import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int factroial = 1;
      for(int i=1;i<=num;i++)
      {
        factroial = factroial * i;
      }
      System.out.println(factroial);
	}
}