import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 0,a;
      while(num > 0)
      {
        a = num % 10;
        sum = sum + a;
        num = num / 10;
      }
      System.out.println(sum);
	}
}