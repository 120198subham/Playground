import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n;
      for(n = 1;n <= num;n = n+1)
        System.out.println(2*n-1);
	}
}