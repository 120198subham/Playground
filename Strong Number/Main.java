import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int cpynum = num;
      int sum = 0;
      while(num > 0)
      {
        int rmdr = num % 10;
        int fact = 1;
        for(int count = 1; count <= rmdr;count++)
        {
          fact = fact*count;
        }
        sum = sum + fact;
        num = num / 10;
      }
      if(cpynum == sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      }
	}
