import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      for(int i=1;i<=input;i=i+1)
      {
        if(input%i==0)
          System.out.println(i);
      }
	}
}