import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n;
      for(n = 0;n <= num;n=n+1)
      {
        if(n%2==1)
          System.out.println(n);
      }
	}
}