import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n,count = 0;
      for(n = 0;n <= num;n = n+1)
      {
        count = count+n;
      }
      System.out.println(count);
	}
}